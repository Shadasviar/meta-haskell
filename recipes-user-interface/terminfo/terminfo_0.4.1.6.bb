SUMMARY     = "Haskell bindings to the terminfo library"
DESCRIPTION = "This package defines a class, Hashable, for types that can \
types and a way to combine hash values."

HOMEPAGE    = "https://github.com/judah/terminfo"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"

inherit ghc-package ghc-setup-missing license-bsd3

SRC_URI = "git://github.com/haskell/terminfo.git;protocol=https;branch=master"
SRCREV  = "5b43c14f6843973d8704fb60486e6c458fc0ac8c"
S       = "${WORKDIR}/git"

DEPENDS         += "autoconf-native automake-native ncurses"
RDEPENDS:${PN}   = "ncurses-terminfo"
