SUMMARY     = "Primitive memory-related operations"
DESCRIPTION = "This package provides various primitive memory-related operations."

HOMEPAGE          = "https://github.com/haskell/primitive"
BUGTRACKER        = "https://github.com/haskell/primitive/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/haskell/primitive.git;protocol=https;branch=master"
SRCREV  = "efde5a7aaef17bc2e3f8f15a522bb64f9146a587"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq template-haskell transformers"
