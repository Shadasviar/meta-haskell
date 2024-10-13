SUMMARY     = "GHC primitives"
DESCRIPTION = "This package contains the primitive types and operations \
supplied by GHC. It is an internal package, only for the use of GHC \
developers. GHC users should not use it! If you do use it then expect \
breaking changes at any time without warning. You should prefer to import \
GHC.Exts from the base package instead."

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER        = "https://gitlab.haskell.org/ghc/ghc/issues/new"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-system-package
