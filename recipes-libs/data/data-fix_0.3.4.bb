SUMMARY     = "Fixpoint data types"
DESCRIPTION = "Fixpoint types and recursion schemes. If you define your AST \
as fixpoint type, you get fold and unfold operations for free."

HOMEPAGE          = "https://github.com/spell-music/data-fix"
BUGTRACKER        = "https://github.com/spell-music/data-fix/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI[sha256sum] = "8df052d18c047ab9e9200536a8799b5af3997ebecbbb091a7384b6be8416ab37"

DEPENDS += "deepseq hashable"

inherit ghc-package
