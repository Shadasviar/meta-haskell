SUMMARY     = "Library for manipulating Operating system strings"
DESCRIPTION = "This package provides functionality for manipulating OsString \
values, and is shipped with GHC."

HOMEPAGE          = "https://github.com/haskell/os-string/blob/master/README.md"
BUGTRACKER        = "https://github.com/haskell/os-string/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base bytestring deepseq exceptions template-haskell"

inherit ghc-system-package
