SUMMARY     = "Difference lists"
DESCRIPTION = "List-like types supporting O(1) append and snoc operations"

HOMEPAGE          = "https://github.com/spl/dlist"
BUGTRACKER        = "https://github.com/spl/dlist/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/spl/dlist.git;protocol=https;branch=main"
SRCREV  = "8ce1a1332e84f177d5303fcd429a0aead8c928d9"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq"
