SUMMARY     = "Basic GHC libraries"
DESCRIPTION = "This package contains the implementation of GHC's standard \
libraries and is not intended for use by end-users. . Users should \
instead use either the base or ghc-experimental packages"

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER        = "https://github.com/haskell/core-libraries-committee/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-prim ghc-bignum"

inherit ghc-system-package
