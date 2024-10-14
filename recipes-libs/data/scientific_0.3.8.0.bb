SUMMARY     = "Numbers represented using scientific notation"
DESCRIPTION = "Data.Scientific provides the number type Scientific. \
Scientific numbers are arbitrary precision and space efficient. They are \
represented using scientific notation. The implementation uses a coefficient \
c :: Integer and a base-10 exponent e :: Int. A scientific number corresponds \
to the Fractional number: fromInteger c * 10 ^^ e."

HOMEPAGE          = "https://github.com/basvandijk/scientific"
BUGTRACKER        = "https://github.com/basvandijk/scientific/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/basvandijk/scientific.git;protocol=https;branch=${BPN}-0.3"
SRCREV  = "c194ce0c8eff93a9a80482e660c63d0733c7b4cc"
S       = "${WORKDIR}/git"

DEPENDS += "hashable integer-logarithms primitive text bytestring-builder"
