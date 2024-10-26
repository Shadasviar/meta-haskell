SUMMARY     = "Portable temporary file and directory support"
DESCRIPTION = "Functions for creating temporary files and directories."

HOMEPAGE    = "https://github.com/feuerbach/temporary"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "system"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "8c442993694b5ffca823ce864af95bd2841fb5264ee511c61cf48cc71d879890"

DEPENDS += "directory random transformers"
