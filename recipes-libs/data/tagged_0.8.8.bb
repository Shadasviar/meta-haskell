SUMMARY     = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"
DESCRIPTION = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"

HOMEPAGE          = "http://github.com/ekmett/tagged"
BUGTRACKER        = "http://github.com/ekmett/tagged/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/ekmett/tagged;protocol=https;branch=master"
SRCREV  = "47dd22648b0b94c1aaa134857d8f817fc953cd57"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq ghc-prim template-haskell transformers"
