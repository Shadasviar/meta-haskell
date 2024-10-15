SUMMARY     = "Monadic parser combinators"
DESCRIPTION = "Parsec is designed from scratch as an industrial-strength \
parser library. It is simple, safe, well documented (on the package \
homepage), has extensive libraries, good error messages, and is fast. It \
is defined as a monad transformer that can be stacked on arbitrary \
monads, and it is also parametric in the input stream type."

HOMEPAGE          = "https://github.com/haskell/parsec"
BUGTRACKER        = "https://github.com/haskell/parsec/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base bytestring mtl text"

inherit ghc-system-package
