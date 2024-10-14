SUMMARY     = "Time library"
DESCRIPTION = "This package provides the old time library. For new projects, \
the newer time library is recommended."

HOMEPAGE          = "https://github.com/haskell/old-time.git"
BUGTRACKER        = "https://github.com/haskell/old-time/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "1e22eb7f7b924a676f52e317917b3b5eeceee11c74ef4bc609c0bcec624c166f"

DEPENDS += "old-locale"
