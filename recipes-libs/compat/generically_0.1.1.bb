SUMMARY     = "Generically newtype to use with DerivingVia"
DESCRIPTION = "This is a compatibility package as Generically and \
Generically1 newtypes are available since base-4.17 in GHC.Generics."

HOMEPAGE          = "https://github.com/haskell-compat/generically"
BUGTRACKER        = "https://github.com/haskell-compat/generically/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/haskell-compat/generically.git;protocol=https;branch=master"
SRCREV  = "18c406ad8a6badf3ac81e0ff6503373ec6e7cc5a"
S       = "${WORKDIR}/git"

DEPENDS += "base-orphans"
