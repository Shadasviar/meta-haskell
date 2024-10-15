SUMMARY     = "A Haskell 98 logically uninhabited data type"
DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to \
indicate that a given term should not exist."

HOMEPAGE          = "http://github.com/ekmett/void"
BUGTRACKER        = "http://github.com/ekmett/void/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "53af758ddc37dc63981671e503438d02c6f64a2d8744e9bec557a894431f7317"

DEPENDS += "ghc-prim hashable template-haskell"
