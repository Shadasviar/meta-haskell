SUMMARY     = "The Glorious Glasgow Haskell Compiler"
DESCRIPTION = "GHC is a state-of-the-art, open source compiler and interactive \
environment for the functional language Haskell."

HOMEPAGE          = "https://www.haskell.org/ghc/"
BUGTRACKER        = "https://gitlab.haskell.org/ghc/ghc/-/wikis/report-a-bug"
SECTION           = "devtools"

inherit license-bsd3

SRC_URI = "gitsm://gitlab.haskell.org/ghc/ghc.git;protocol=https;branch=${BPN}-${@base_version(d)}"
SRCREV  = "c6e5b18825363b4a89d262de6d41a7844fab188d"
S       = "${WORKDIR}/git"

DEPENDS = "autoconf-native automake-native"

def base_version(d):
  return '.'.join(d.getVar('PV').split('.')[:2])
