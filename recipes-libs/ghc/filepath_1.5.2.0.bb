SUMMARY     = "Library for manipulating FilePaths in a cross platform way"
DESCRIPTION = "This package provides functionality for manipulating FilePath \
values, and is shipped with GHC."

HOMEPAGE          = "https://github.com/haskell/filepath/blob/master/README.md"
BUGTRACKER        = "https://github.com/haskell/filepath/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base bytestring deepseq os-string template-haskell"

inherit ghc-system-package
