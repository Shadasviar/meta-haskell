SUMMARY     = "Cabal is the standard package system for Haskell software."
DESCRIPTION = "Cabal is the standard package system for Haskell software."

HOMEPAGE          = "https://www.haskell.org/cabal/"
BUGTRACKER        = "https://github.com/haskell/cabal"
SECTION           = "devtools"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "git://github.com/haskell/cabal.git;protocol=https;branch=master"
SRCREV  = "ee1fd5252120bfae43787b330d6c71c481ee65a8"
S       = "${WORKDIR}/git"
