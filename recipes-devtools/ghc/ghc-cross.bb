require ghc.inc

BPN = "ghc"

BOOTSTRAP_DIR           = "${S}/hadrian/bootstrap"
BOOTSTRAP_PLAN_FILENAME = "plan-bootstrap"
GHC_VERSION_SEPARATOR   = "_"
SYSROOT_DIRS_NATIVE    += "${prefix}/bin ${prefix}/lib"

DEPENDS += "xz-native make-native"

inherit cabal-bootstrap ghc-info cross

PV = "${GHC_VERSION}"

DEPENDS += "clang-native"

INHIBIT_DEFAULT_DEPS      = "1"
PN                        = "ghc-cross-${TARGET_ARCH}"
TARGET_ARCH[vardepvalue]  = "${TARGET_ARCH}"
PROVIDES                  = "virtual/${TARGET_PREFIX}ghc"
TOOLCHAIN                 = "clang"
TARGET_VENDOR             = "-unknown"

do_configure() {
  ./boot
  ./configure --prefix=${prefix} --target=${TARGET_SYS}
}

do_compile() {
  _build/bin/hadrian binary-dist-dir \
      --flavour=perf+llvm \
      --docs=no-sphinx \
      -j${BB_NUMBER_THREADS}
}

do_install() {
  cd _build/bindist/${BP}-${TARGET_SYS}
  ./configure --prefix=${prefix}
  DESTDIR=${D} ${MAKE} install
  install -d ${PACKAGE_DB}
}
