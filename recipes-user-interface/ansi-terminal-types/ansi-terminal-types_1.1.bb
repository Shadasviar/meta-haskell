SUMMARY     = "Types and functions used to represent SGR aspects"
DESCRIPTION = "The 'ANSI' standards refer to the visual style of displaying \
characters as their 'graphic rendition'. The 'ANSI' codes to establish the \
graphic rendition for subsequent text are referred to as SELECT GRAPHIC \
RENDITION (SGR). This package exposes modules that export types and functions \
used to represent SGR aspects."

HOMEPAGE          = "https://github.com/UnkindPartition/ansi-terminal"
BUGTRACKER        = "https://github.com/UnkindPartition/ansi-terminal/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI[sha256sum] = "f2e5333eb78da5f4dd330fca0c81a59276cc150c625647cd20f57b7f297a5d25"

DEPENDS += "colour"
