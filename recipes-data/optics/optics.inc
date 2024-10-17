HOMEPAGE          = "https://github.com/well-typed/optics"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/well-typed/optics;protocol=https;branch=master"
SRCREV  = "1aa8a58a9d528acffdeac4a92d5b437175879a39"
S       = "${WORKDIR}/git/${BPN}"
