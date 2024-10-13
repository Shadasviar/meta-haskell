SUMMARY     = "Shared functionality between GHC and the template-haskell library"
DESCRIPTION = "This library contains various bits shared between the ghc and \
template-haskell libraries."

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER        = "https://github.com/haskell/core-libraries-committee/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base"

PV = "${GHC_VERSION}"

inherit ghc-system-package
