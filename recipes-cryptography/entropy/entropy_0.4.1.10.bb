SUMMARY     = "A platform independent entropy source"
DESCRIPTION = "A mostly platform independent method to obtain \
cryptographically strong entropy (RDRAND, urandom, CryptAPI, and patches \
welcome) Users looking for cryptographically strong (number-theoretically \
sound) PRNGs should see the DRBG package too."

HOMEPAGE          = "https://github.com/TomMD/entropy"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI[sha256sum] = "85ac1d53f1d1c095aedd23fdb20c8e3ada04a7fd8aa6d7e6445ae6a59a277de5"

DEPENDS += "bytestring unix"
