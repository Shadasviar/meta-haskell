require ghc.inc

BOOTSTRAP_DIR           = "${S}/hadrian/bootstrap"
HC                      = "/usr/bin/ghc"
BOOTSTRAP_PLAN_FILENAME = "plan-bootstrap"
GHC_VERSION_SEPARATOR   = "_"

DEPENDS += "xz-native make-native"

inherit cabal-bootstrap native

do_configure() {
  ./boot
  ./configure --prefix=${prefix}
}

do_compile() {
  _build/bin/hadrian binary-dist-dir --flavour=quick --docs=no-sphinx -j${BB_NUMBER_THREADS}
}

do_install() {
  cd _build/bindist/${BP}-${HOST_ARCH}-unknown-linux
  ./configure --prefix=${prefix}
  DESTDIR=${D} ${MAKE} install
}
