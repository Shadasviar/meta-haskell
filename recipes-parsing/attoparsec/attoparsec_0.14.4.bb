SUMMARY     = "Fast combinator parsing for bytestrings and text"
DESCRIPTION = "A fast parser combinator library, aimed particularly at \
dealing efficiently with network protocols and complicated text/binary \
file formats."

HOMEPAGE          = "https://github.com/haskell/attoparsec"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell/attoparsec.git;protocol=https;branch=master"
SRCREV  = "5a853a3234080d20308aef1d945e16fc737a5eb3"
S       = "${WORKDIR}/git"

DEPENDS += "containers scientific transformers"
