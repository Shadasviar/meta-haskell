SUMMARY     = "Natural numbers"
DESCRIPTION = "Natural numbers"

HOMEPAGE          = "http://github.com/ekmett/nats"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "numeric"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "b9d2d85d8612f9b06f8c9bfd1acecd848e03ab82cfb53afe1d93f5086b6e80ec"

DEPENDS += "binary hashable template-haskell"
