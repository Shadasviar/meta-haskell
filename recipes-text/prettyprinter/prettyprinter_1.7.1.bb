SUMMARY     = "A modern, easy to use, well-documented, extensible pretty-printer"
DESCRIPTION = "A modern, easy to use, well-documented, extensible pretty-printer"

require prettyprinter.inc

SRC_URI[sha256sum] = "5e6ea6903114fa118fcc359633dfb7ecddecb92c06c853d02a77b72b251f0b45"

DEPENDS += "ghc-prim template-haskell void"
