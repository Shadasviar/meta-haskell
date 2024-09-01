require ghc.inc

BOOTSTRAP_DIR           = "${S}/hadrian/bootstrap"
BOOTSTRAP_PLAN_FILENAME = "plan-bootstrap"
GHC_VERSION_SEPARATOR   = "_"

DEPENDS += "xz-native make-native"

inherit cabal-bootstrap

GHC_TARGET_ARCH ?= "${TARGET_ARCH}-${TARGET_OS}"

do_configure() {
  ./boot
  ./configure --prefix=${prefix} --target=${GHC_TARGET_ARCH}
}

do_compile() {
  _build/bin/hadrian binary-dist-dir --flavour=perf --docs=no-sphinx -j${BB_NUMBER_THREADS}
}

do_install() {
  cd _build/bindist/${BP}-${GHC_TARGET_ARCH}
  ./configure --prefix=${prefix}
  DESTDIR=${D} ${MAKE} install
}
