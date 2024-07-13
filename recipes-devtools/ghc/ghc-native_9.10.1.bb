require ghc.inc

BOOTSTRAP_DIR = "${S}/hadrian/bootstrap"
HC            = "/usr/bin/ghc"

INHIBIT_DEFAULT_DEPS      = "1"

DEPENDS += "xz-native make-native"

inherit cabal-bootstrap native

do_configure() {
  ./boot
  ./configure
}

do_compile() {
  _build/bin/hadrian binary-dist-dir --flavour=quick --docs=no-sphinx -j${BB_NUMBER_THREADS}
}

do_install() {
  cd _build/bindist/${BP}-${HOST_ARCH}-unknown-linux
  ./configure
  make install DESTDIR=${D}
}
