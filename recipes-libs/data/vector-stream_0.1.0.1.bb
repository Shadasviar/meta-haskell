SUMMARY     = "Efficient Streams"
DESCRIPTION = "Simple yet powerful monadic streams that are used as a \
backbone for vector package fusion functionality."

HOMEPAGE          = "https://github.com/haskell/vector"
BUGTRACKER        = "https://github.com/haskell/vector/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell/vector;protocol=https;branch=master"
SRCREV  = "332204615cee25568f6311daa3e5185cc79feac0"
S       = "${WORKDIR}/git/${BPN}"

DEPENDS += "ghc-prim"
