SUMMARY     = "locale library"
DESCRIPTION = "This package provides the ability to adapt to locale \
conventions such as date and time formats."

HOMEPAGE          = "https://github.com/haskell/old-locale.git"
BUGTRACKER        = "https://github.com/haskell/old-locale/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell/old-locale.git;protocol=https;branch=master"
SRCREV  = "15fea2d49e781f0d81538cccef5017b89f6bb6db"
S       = "${WORKDIR}/git"
