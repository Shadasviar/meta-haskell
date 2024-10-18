HOMEPAGE          = "https://github.com/haskell-hvr/${BPN}"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell-hvr/${BPN};protocol=https;branch=master"
S       = "${WORKDIR}/git"

DEPENDS += "bytestring"
