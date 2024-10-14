SUMMARY     = "Automatic testing of Haskell programs"
DESCRIPTION = "QuickCheck is a library for random testing of program \
properties. The programmer provides a specification of the program, in \
the form of properties which functions should satisfy, and QuickCheck then \
tests that the properties hold in a large number of randomly generated \
cases. Specifications are expressed in Haskell, using combinators provided \
by QuickCheck. QuickCheck provides combinators to define properties, \
observe the distribution of test data, and define test data generators."

HOMEPAGE          = "https://github.com/nick8325/quickcheck"
BUGTRACKER        = "https://github.com/nick8325/quickcheck/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

HS_PN   = "QuickCheck"
SRC_URI = "https://hackage.haskell.org/package/${HS_PN}-${PV}/${HS_PN}-${PV}.tar.gz"
SRC_URI[sha256sum] = "a3b2216ddbaf481dbc82414b6120f8b726d969db3f0b51f20a7a45425ef36e7f"
S = "${WORKDIR}/${HS_PN}-${PV}"

DEPENDS += "containers deepseq old-time random template-haskell transformers"
