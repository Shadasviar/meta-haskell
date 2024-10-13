SUMMARY     = "Assorted concrete container types"
DESCRIPTION = "This package contains efficient general-purpose implementations \
of various immutable container types including sets, maps, sequences, trees, \
and graphs."

HOMEPAGE          = "http://github.com/haskell/containers.git"
BUGTRACKER        = "https://github.com/haskell/containers/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "array ghc-base deepseq template-haskell"

inherit ghc-system-package
