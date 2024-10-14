SUMMARY     = "Fast Splittable PRNG"
DESCRIPTION = "Pure Haskell implementation of SplitMix described in Guy L. \
Steele, Jr., Doug Lea, and Christine H. Flood. 2014. Fast splittable \
pseudorandom number generators. In Proceedings of the 2014 ACM \
International Conference on Object Oriented Programming Systems Languages \
& Applications (OOPSLA '14). ACM, New York, NY, USA, 453-472. \
DOI: https://doi.org/10.1145/2660193.2660195"

HOMEPAGE          = "https://github.com/haskellari/splitmix.git"
BUGTRACKER        = "https://github.com/haskellari/splitmix/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskellari/splitmix.git;protocol=https;branch=master"
SRCREV  = "33872e2c44e2b903c5d0a57eb9df3ffa6f465829"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq time"
