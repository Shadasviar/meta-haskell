SUMMARY     = "A simple terminal UI library"
DESCRIPTION = "vty is terminal GUI library in the niche of ncurses. It is \
intended to be easy to use and to provide good support for common terminal types."

HOMEPAGE    = "https://github.com/jtdaugherty/vty"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "6f1f48b260b4de0a0506e70faf4d41b8c1757ff429a95ba6b6b76cf76c73987b"

DEPENDS += "blaze-builder directory microlens-mtl parsec utf8-string vector"
