inherit ghc-info

GHC ?= "${RECIPE_SYSROOT_NATIVE}${bindir_native}/${TARGET_ARCH}-${TARGET_OS}-ghc"

DEPENDS += "ghc-cross-${TARGET_ARCH}"

SETUP_FILE ?= "${S}/Setup"

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
