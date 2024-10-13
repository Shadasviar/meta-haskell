SUMMARY     = "Extensible optionally-pure exceptions"
DESCRIPTION = "Extensible optionally-pure exceptions"

HOMEPAGE          = "http://github.com/ekmett/exceptions/"
BUGTRACKER        = "http://github.com/ekmett/exceptions/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base mtl stm template-haskell transformers deepseq"

inherit ghc-system-package
