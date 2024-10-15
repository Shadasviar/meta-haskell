SUMMARY     = "Comonads"
DESCRIPTION = "This package provides comonads, the categorical dual of monads. \
The typeclass provides three methods: extract, duplicate, and extend."

HOMEPAGE          = "https://github.com/ekmett/comonad"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI += " file://0001-Fix-dependencies-versions.patch"
SRC_URI[sha256sum] = "ef6cdf2cc292cc43ee6aa96c581b235fdea8ab44a0bffb24dc79ae2b2ef33d13"

DEPENDS += "containers distributive indexed-traversable transformers-compat"
