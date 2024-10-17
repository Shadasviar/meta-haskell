SUMMARY     = "Profunctors"
DESCRIPTION = "Profunctors"

HOMEPAGE          = "http://github.com/ekmett/profunctors"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI += " file://0001-Fix-dependencies-versions.patch"
SRC_URI[sha256sum] = "65955d7b50525a4a3bccdab1d982d2ae342897fd38140d5a94b5ef3800d8c92a"

DEPENDS += "base-orphans bifunctors comonad contravariant tagged"
