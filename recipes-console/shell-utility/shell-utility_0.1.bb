SUMMARY     = "Utility functions for writing command-line programs"
DESCRIPTION = "Utility functions for writing command-line programs including \
parsing of numbers with restrictions and enumerations for command-line \
arguments, verbosity controlled output, escaping shell arguments, \
exit with message."

HOMEPAGE    = "http://hub.darcs.net/thielema/shell-utility"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "console"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "b1867af59978e44e2a0bea52896c30ace4aed227cf30e9eb67bbcfbd15d825d8"
