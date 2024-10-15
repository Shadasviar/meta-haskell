SUMMARY     = "A modern, easy to use, well-documented, extensible pretty-printer"
DESCRIPTION = "A modern, easy to use, well-documented, extensible pretty-printer"

HOMEPAGE          = "http://github.com/quchen/prettyprinter"
BUGTRACKER        = "http://github.com/quchen/prettyprinter/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

inherit ghc-package

SRC_URI[sha256sum] = "5e6ea6903114fa118fcc359633dfb7ecddecb92c06c853d02a77b72b251f0b45"

DEPENDS += "ghc-prim template-haskell void"
