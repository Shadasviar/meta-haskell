SUMMARY     = "Bifunctors"
DESCRIPTION = "Bifunctors"

HOMEPAGE          = "https://github.com/ekmett/bifunctors/"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "1086a9285061eed0c2c5d3cb65aa223defd52fca6d0515bb69ddf2dbc3d9697a"

DEPENDS += "assoc comonad foldable1-classes-compat th-abstraction transformers"
