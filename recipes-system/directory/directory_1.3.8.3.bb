SUMMARY     = "Platform-agnostic library for filesystem operations"
DESCRIPTION = "This library provides a basic set of operations for \
manipulating files and directories in a portable way."

HOMEPAGE          = "https://github.com/haskell/directory"
BUGTRACKER        = "https://github.com/haskell/directory/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base filepath time unix"

inherit ghc-system-package
