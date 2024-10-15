SUMMARY     = "Singleton Tuple"
DESCRIPTION = "This package is a compatibility package for a singleton data type."

HOMEPAGE          = "https://github.com/phadej/OneTuple.git"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

HS_PN  = "OneTuple"
SRC_URI[sha256sum] = "174da8a0f4004d17b08182cb25b0e045fce5de1fdeae84e9d75fdea2867aab55"

DEPENDS += "foldable1-classes-compat hashable template-haskell"
