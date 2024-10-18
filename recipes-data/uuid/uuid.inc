HOMEPAGE          = "https://github.com/haskell-hvr/uuid"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell-hvr/uuid.git;protocol=https;branch=master"
SRCREV  = "68d7fe25ad8d6ca398130f0f7eb94d0b922f3389"
S       = "${WORKDIR}/git/${BPN}"
