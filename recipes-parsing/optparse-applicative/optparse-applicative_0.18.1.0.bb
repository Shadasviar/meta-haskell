SUMMARY     = "Utilities and combinators for parsing command line options"
DESCRIPTION = "optparse-applicative is a haskell library for parsing options \
on the command line, and providing a powerful applicative interface for \
composing them. optparse-applicative takes care of reading and validating \
the arguments passed to the command line, handling and reporting errors, \
generating a usage line, a comprehensive help screen, and enabling \
context-sensitive bash, zsh, and fish completions."

HOMEPAGE          = "https://github.com/pcapriotti/optparse-applicative"
BUGTRACKER        = "https://github.com/pcapriotti/optparse-applicative/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "63811ab4fd26e829b8868364325a88be3acc79819f5bb5005b2dd3b961ecc491"

DEPENDS += "prettyprinter-ansi-terminal process text transformers transformers-compat"
