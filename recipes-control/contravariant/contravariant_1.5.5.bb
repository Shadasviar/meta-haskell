SUMMARY     = "Contravariant functors"
DESCRIPTION = "Contravariant functors"

HOMEPAGE          = "http://github.com/ekmett/contravariant/"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "062fd66580d7aad0b5ba93e644ffa7feee69276ef50f20d4ed9f1deb7642dffa"

DEPENDS += "state-var tagged transformers-compat void"
