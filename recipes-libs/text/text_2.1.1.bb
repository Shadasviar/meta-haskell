SUMMARY     = "An efficient packed Unicode text type."
DESCRIPTION = "An efficient packed, immutable Unicode text type (both strict and lazy)."

HOMEPAGE          = "https://github.com/haskell/text"
BUGTRACKER        = "https://github.com/haskell/text/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

DEPENDS += "ghc-base ghc-prim array binary bytestring deepseq template-haskell"

inherit ghc-system-package
