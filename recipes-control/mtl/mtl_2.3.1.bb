SUMMARY     = "Monad classes for transformers, using functional dependencies"
DESCRIPTION = "MTL is a collection of monad classes, extending the \
transformers package, using functional dependencies for generic lifting \
of monadic actions."

HOMEPAGE          = "http://github.com/haskell/mtl"
BUGTRACKER        = "http://github.com/haskell/mtl/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base transformers"

inherit ghc-system-package
