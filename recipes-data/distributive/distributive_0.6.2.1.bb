SUMMARY     = "Distributive functors -- Dual to Traversable"
DESCRIPTION = "Distributive functors -- Dual to Traversable"

HOMEPAGE          = "https://github.com/ekmett/distributive/"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI += " file://0001-Remove-upper-limit-of-transformers.patch"
SRC_URI[sha256sum]  = "d7351392e078f58caa46630a4b9c643e1e2e9dddee45848c5c8358e7b1316b91"

DEPENDS += "base-orphans tagged"
