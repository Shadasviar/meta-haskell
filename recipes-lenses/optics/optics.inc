HOMEPAGE          = "https://github.com/well-typed/optics"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "lenses"

inherit ghc-package license-bsd3

SRC_URI = "git://github.com/well-typed/optics;protocol=https;branch=master"
SRCREV  = "1aa8a58a9d528acffdeac4a92d5b437175879a39"
S       = "${WORKDIR}/git/${BPN}"
