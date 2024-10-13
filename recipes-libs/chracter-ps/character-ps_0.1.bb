SUMMARY     = "Pattern synonyms for ASCII characters for Word8, Word16 etc"
DESCRIPTION = "Pattern synonyms for ASCII characters for Word8, Word16 etc"

HOMEPAGE          = "https://github.com/phadej/character-ps"
BUGTRACKER        = "https://github.com/phadej/character-ps/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI[sha256sum] = "22de71fde38b236d3e9168a832b5e1e75d1fb4f4028667bdf747b3b4c8c1529c"

inherit ghc-package ghc-setup-missing
