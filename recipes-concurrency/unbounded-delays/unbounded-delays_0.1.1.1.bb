SUMMARY     = "Unbounded thread delays and timeouts"
DESCRIPTION = "The threadDelay and timeout functions from the base library \
use the bounded Int type for specifying the delay or timeout period. This \
packages provides alternatives which use the unbounded Integer type."

HOMEPAGE          = "https://github.com/basvandijk/unbounded-delays"
BUGTRACKER        = "https://github.com/basvandijk/unbounded-delays/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "59ad7e53bfe32ffbf0e703b31490d41d14c70e4745ed49e8adf592ed68dd6185"
