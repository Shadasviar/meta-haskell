require ghc.inc

BPN = "ghc"

SYSROOT_DIRS_NATIVE    += "${prefix}/bin ${prefix}/lib"

DEPENDS += "xz-native make-native"

inherit ghc-info cross

PV = "${GHC_VERSION}"

INHIBIT_DEFAULT_DEPS      = "1"
PN                        = "ghc-cross-${TARGET_ARCH}"
TARGET_ARCH[vardepvalue]  = "${TARGET_ARCH}"
PROVIDES                  = "virtual/${TARGET_PREFIX}ghc"
TARGET_VENDOR             = "-unknown"

do_configure() {
  ./boot
  ./configure --prefix=${prefix} --target=${TARGET_SYS}
}

do_compile() {
  hadrian/build binary-dist-dir \
      --flavour=perf \
      --docs=no-sphinx \
      -j${BB_NUMBER_THREADS}
}

do_install() {
  cd _build/bindist/${BP}-${TARGET_SYS}
  ./configure --prefix=${prefix}
  DESTDIR=${D} ${MAKE} install
  install -d ${PACKAGE_DB}
}

do_compile[network] = "1"
