SUMMARY     = "GHC BigNum library"
DESCRIPTION = "This package provides the low-level implementation of the \
standard BigNat, Natural and Integer types."

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER        = "https://github.com/haskell/core-libraries-committee/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-prim gmp"

inherit ghc-system-package
