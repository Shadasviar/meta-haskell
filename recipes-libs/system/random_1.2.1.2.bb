SUMMARY     = "Pseudo-random number generation"
DESCRIPTION = "This package provides basic pseudo-random number generation, \
including the ability to split random number generators."

HOMEPAGE          = "https://github.com/haskell/random.git"
BUGTRACKER        = "https://github.com/haskell/random/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "790f4dc2d2327c453ff6aac7bf15399fd123d55e927935f68f84b5df42d9a4b4"

DEPENDS += "bytestring deepseq mtl splitmix transformers"
