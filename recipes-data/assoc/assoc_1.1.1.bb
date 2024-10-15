SUMMARY     = "Symmetric and Semigroupy Bifunctors"
DESCRIPTION = "Provides generalisations of swap :: (a,b) -> (b,a) and assoc \
:: ((a,b),c) -> (a,(b,c)) to Bifunctors supporting similar operations \
(e.g. Either, These)."

HOMEPAGE          = "https://github.com/phadej/assoc.git"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI[sha256sum] = "231149b7fef09f5dd95af51228615e3b296dbd0faadeca053e0644a4b13b0ff6"
