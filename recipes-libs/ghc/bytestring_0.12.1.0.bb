SUMMARY     = "Fast, compact, strict and lazy byte strings with a list interface"
DESCRIPTION = "An efficient compact, immutable byte string type (both strict \
and lazy) suitable for binary or 8-bit character data."

HOMEPAGE          = "https://github.com/haskell/bytestring"
BUGTRACKER        = "https://github.com/haskell/bytestring/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base ghc-prim deepseq template-haskell"

inherit ghc-system-package
