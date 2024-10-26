SUMMARY     = "Random-number generation monad"
DESCRIPTION = "Support for computations which consume random values"

HOMEPAGE    = "https://github.com/byorgey/MonadRandom"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"
HS_PN       = "MonadRandom"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "8893ff5194d105800a4c32b303b02950cadac94d48a040d1be18507257376527"

DEPENDS += "primitive random transformers-compat"
