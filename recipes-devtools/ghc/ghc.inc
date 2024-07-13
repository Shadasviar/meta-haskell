SUMMARY     = "The Glorious Glasgow Haskell Compiler"
DESCRIPTION = "GHC is a state-of-the-art, open source compiler and interactive \
environment for the functional language Haskell."

HOMEPAGE          = "https://www.haskell.org/ghc/"
BUGTRACKER        = "https://gitlab.haskell.org/ghc/ghc/-/wikis/report-a-bug"
SECTION           = "devtools"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "gitsm://gitlab.haskell.org/ghc/ghc.git;protocol=https;branch=${BPN}-${@base_version(d)}"
SRCREV  = "934a8bb930390d5db1e5613ddfeafc8c80dd9b96"
S       = "${WORKDIR}/git"

DEPENDS = "autoconf-native automake-native"

def base_version(d):
  return '.'.join(d.getVar('PV').split('.')[:2])
