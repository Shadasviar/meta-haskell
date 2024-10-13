GHC_VERSION        ?= "9.10.1"
GHC_TOOLCHAIN_NAME ?= "${TARGET_ARCH}-${TARGET_OS}-ghc-${GHC_VERSION}"
GHC_LIBDIR         ?= "${RECIPE_SYSROOT_NATIVE}${libdir_native}/${GHC_TOOLCHAIN_NAME}/lib/${GHC_TOOLCHAIN_NAME}"
PACKAGE_DB         ?= "${TMPDIR}/haskell-packages"
