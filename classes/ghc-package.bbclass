inherit ghc-info

GHC_TOOLCHAIN_PATH    ?= "${RECIPE_SYSROOT_NATIVE}${bindir_native}"
GHC_TOOLCHAIN_PREFIX  ?= "${TARGET_ARCH}-${TARGET_OS}"
GHC                   ?= "${GHC_TOOLCHAIN_PATH}/${GHC_TOOLCHAIN_PREFIX}-ghc"
GHC_PKG               ?= "${GHC}-pkg"
HSC2HS                ?= "${GHC_TOOLCHAIN_PATH}/${GHC_TOOLCHAIN_PREFIX}-hsc2hs"

HS_PN   ?= "${BPN}"
SRC_URI = "https://hackage.haskell.org/package/${HS_PN}-${PV}/${HS_PN}-${PV}.tar.gz"
S       = "${WORKDIR}/${HS_PN}-${PV}"

DEPENDS += "ghc-cross-${TARGET_ARCH} ghc-base"

SETUP_FILE ?= "${S}/Setup"

INSANE_SKIP:${PN} += "already-stripped"

PACKAGES              = "${PN}-staticdev ${PN} ${PN}-doc ${PN}-dev"
FILES:${PN}-staticdev = "${libdir}/*/*/*.a"
FILES:${PN}           = "${libdir}"
FILES:${PN}-doc       = "/share"

do_configure() {
  ${GHC} -threaded -dynamic --make ${SETUP_FILE}
  ${SETUP_FILE} configure \
      --bindir=${D}${bindir} \
      --libdir=${D}${libdir} \
      --sysconfdir=${D}${datadir} \
      --package-db=${PACKAGE_DB} \
      --prefix=${D} \
      --with-compiler=${GHC} \
      --with-hc-pkg=${GHC_PKG} \
      --with-hsc2hs=${HSC2HS} \
      --enable-shared \
      --disable-static \
      --enable-executable-dynamic \
      --extra-lib-dirs=${GHC_LIBDIR}
}

do_compile() {
  ${SETUP_FILE} build -v
}

do_install() {
  ${SETUP_FILE} install
  ${SETUP_FILE} register
}
