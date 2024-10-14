SUMMARY     = "Generic programming library for generalised deriving"
DESCRIPTION = "This package provides functionality for generalising the \
deriving mechanism in Haskell to arbitrary classes."

HOMEPAGE          = "https://github.com/dreixel/generic-deriving"
BUGTRACKER        = "https://github.com/dreixel/generic-deriving/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/dreixel/generic-deriving;protocol=https;branch=master"
SRCREV  = "eaf4185fcf284175f6568484f5922a09d5a44b6f"
S       = "${WORKDIR}/git"

DEPENDS += "th-abstraction"
