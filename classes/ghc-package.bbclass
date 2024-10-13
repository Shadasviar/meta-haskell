inherit ghc-info

GHC ?= "${RECIPE_SYSROOT_NATIVE}${bindir_native}/${TARGET_ARCH}-${TARGET_OS}-ghc"

SRC_URI = "https://hackage.haskell.org/package/${BPN}-${PV}/${BPN}-${PV}.tar.gz"

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
      --with-hc-pkg=${GHC}-pkg \
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
