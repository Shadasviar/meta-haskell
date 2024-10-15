SUMMARY     = "State variables"
DESCRIPTION = "This package contains state variables, which are references in \
the IO monad, like IORefs or parts of the OpenGL state."

HOMEPAGE          = "https://github.com/haskell-opengl/StateVar"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

HS_PN = "StateVar"
SRC_URI[sha256sum] = "5e4b39da395656a59827b0280508aafdc70335798b50e5d6fd52596026251825"

DEPENDS += "stm transformers"
