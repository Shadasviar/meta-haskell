inherit ghc-info linuxloader

GHC_TOOLCHAIN_PATH    ?= "${RECIPE_SYSROOT_NATIVE}${bindir_native}"
GHC                   ?= "${GHC_TOOLCHAIN_PATH}/${GHC_TARGET_SYS}-ghc"
GHC_PKG               ?= "${GHC}-pkg"
HSC2HS                ?= "${GHC_TOOLCHAIN_PATH}/${GHC_TARGET_SYS}-hsc2hs"
HS_LINUXLOADER        ?= "${@get_linuxloader(d)}"

HS_PN   ?= "${BPN}"
SRC_URI = "https://hackage.haskell.org/package/${HS_PN}-${PV}/${HS_PN}-${PV}.tar.gz"
S       = "${WORKDIR}/${HS_PN}-${PV}"

DEPENDS += "ghc-cross-${TARGET_ARCH} ghc-base patchelf-native"

SETUP_FILE ?= "${S}/Setup"

INSANE_SKIP:${PN} += "already-stripped"

PACKAGES              = "${PN}-staticdev ${PN} ${PN}-doc ${PN}-dev"
FILES:${PN}-dev       = "${libdir}/*/*/*.hi ${libdir}/*/*/*.dyn_hi ${libdir}/*/*/*.o"
FILES:${PN}-staticdev = "${libdir}/*/*/*.a"
FILES:${PN}           = "${libdir} ${bindir}"
FILES:${PN}-doc       = "${datadir}"

EXTRA_GHC_OPTIONS ?= ""

do_compile[progress] = "outof:\s+\[(\d+) of (\d+)\]"

do_configure() {
  ${GHC} -threaded -dynamic --make ${SETUP_FILE}
  ${SETUP_FILE} configure \
      --bindir=${D}${bindir} \
      --libdir=${D}${libdir} \
      --dynlibdir=${D}${libdir} \
      --datadir=${D}${datadir} \
      --sysconfdir=${D}${datadir} \
      --package-db=${PACKAGE_DB} \
      --prefix=${D} \
      --with-compiler=${GHC} \
      --with-hc-pkg=${GHC_PKG} \
      --with-hsc2hs=${HSC2HS} \
      --enable-shared \
      --enable-executable-dynamic \
      --extra-lib-dirs=${GHC_LIBDIR} \
      --ghc-options="-j +RTS -A32M" \
      ${EXTRA_GHC_OPTIONS}
}

do_compile() {
  ${SETUP_FILE} build
}

do_install() {
  ${SETUP_FILE} install
  ${SETUP_FILE} register

  if [ -d ${D}${bindir} ]; then
    find ${D}${bindir} -mindepth 1 -executable -exec patchelf --set-interpreter ${HS_LINUXLOADER} {} \;
  fi
}
