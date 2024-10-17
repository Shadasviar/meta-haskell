HOMEPAGE          = "https://github.com/haskell-strict/strict"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskellari/strict.git;protocol=https;branch=master"
SRCREV  = "fdded17dbfab2521fc7baf176bc1ffb55f8bca67"
S       = "${WORKDIR}/git/${BPN}"
