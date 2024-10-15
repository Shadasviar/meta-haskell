SUMMARY     = "Simple ANSI terminal support"
DESCRIPTION = "ANSI terminal support for Haskell: allows cursor movement, \
screen clearing, color output, showing or hiding the cursor, and changing the \
title. Works on UNIX and Windows."

HOMEPAGE          = "https://github.com/UnkindPartition/ansi-terminal"
BUGTRACKER        = "https://github.com/UnkindPartition/ansi-terminal/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "7e448fcdf8a5a97f3d30e5168f834641df9945fafa65f2e87d73ff9556a1bc4c"

DEPENDS += "ansi-terminal-types"
