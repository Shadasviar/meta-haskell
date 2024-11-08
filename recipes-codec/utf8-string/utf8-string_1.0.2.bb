SUMMARY     = "Support for reading and writing UTF8 Strings"
DESCRIPTION = "A UTF8 layer for Strings. The utf8-string package provides \
operations for encoding UTF8 strings to Word8 lists and back, and for \
reading and writing UTF8 without truncation."

HOMEPAGE    = "https://github.com/glguy/utf8-string/"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "codec"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "ee48deada7600370728c4156cb002441de770d0121ae33a68139a9ed9c19b09a"

DEPENDS += "bytestring"
