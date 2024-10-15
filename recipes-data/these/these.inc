HOMEPAGE          = "https://github.com/haskellari/these"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/haskellari/these;protocol=https;branch=master"
SRCREV  = "027bb0ab7ef8a7a4ddd25a633b4486d04d6b8f99"
S       = "${WORKDIR}/git/${BPN}"
