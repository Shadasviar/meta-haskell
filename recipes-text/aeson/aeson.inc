
HOMEPAGE          = "https://github.com/haskell/aeson"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell/aeson.git;protocol=https;branch=master"
SRCREV  = "c93d60d82388c184a9cf240f016a728c9d0e758f"
S       = "${WORKDIR}/git/${BPN}"
