SUMMARY     = "FunctorWithIndex, FoldableWithIndex, TraversableWithIndex"
DESCRIPTION = "This package contains instances for types in GHC boot \
libraries. For some additional instances see indexed-traversable-instances."

HOMEPAGE          = "https://github.com/haskellari/indexed-traversable"
BUGTRACKER        = "https://github.com/haskellari/indexed-traversable"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

SRC_URI[sha256sum] = "58be09afdf3ad5a25c2aa0d2a7df80d602df09f4e76d3abf2b7cdb0e75d03b22"

DEPENDS += "array foldable1-classes-compat"

inherit ghc-package ghc-setup-missing
