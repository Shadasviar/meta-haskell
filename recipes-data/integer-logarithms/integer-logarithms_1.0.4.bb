SUMMARY     = "Integer logarithms"
DESCRIPTION = "Math.NumberTheory.Logarithms and \
Math.NumberTheory.Powers.Integer from the arithmoi package. Also provides \
GHC.Integer.Logarithms.Compat and Math.NumberTheory.Power.Natural \
modules, as well as some additional functions in migrated modules."

HOMEPAGE          = "https://github.com/haskellari/integer-logarithms"
BUGTRACKER        = "https://github.com/haskellari/integer-logarithms/issues"
SECTION           = "libs"
LICENSE           = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit ghc-package

SRC_URI = "git://github.com/haskellari/integer-logarithms.git;protocol=https;branch=master"
SRCREV  = "6ef28651f45f48dbfc7bdeebaca2be35a48dfb1e"
S       = "${WORKDIR}/git"

DEPENDS += "array ghc-bignum ghc-prim"
