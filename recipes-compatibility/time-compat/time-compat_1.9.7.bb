SUMMARY     = "Compatibility package for time"
DESCRIPTION = "This packages tries to compat as much of time features as possible."

HOMEPAGE          = "https://github.com/haskellari/time-compat"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/haskellari/time-compat.git;protocol=https;branch=master"
SRCREV  = "8d29802f2b506a1a4d2bb10f2e0f227da30fe9e2"
S       = "${WORKDIR}/git"

DEPENDS += "base-orphans hashable time"
