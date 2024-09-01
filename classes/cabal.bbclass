inherit ghc-native

DEPENDS += "cabal-native"

export CABAL_CONFIG   = "${sysconfdir}/cabal.config"
export CABAL_DIR      = "${D}${sysconfdir}/.cabal"
export CABAL_BUILDDIR = "${D}${libdir}/cabal"

do_compile() {
    ${RECIPE_SYSROOT_NATIVE}/${bindir_native}/cabal build
}

do_install() {
    ${RECIPE_SYSROOT_NATIVE}/${bindir_native}/cabal install
}
