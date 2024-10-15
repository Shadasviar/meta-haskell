SUMMARY     = "Process libraries"
DESCRIPTION = "This package contains libraries for dealing with system \
processes. The typed-process package is a more recent take on a process \
API, which uses this package internally. It features better binary support, \
easier concurrency, and a more composable API."

HOMEPAGE          = "https://github.com/haskell/process.git"
BUGTRACKER        = "https://github.com/haskell/process/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base deepseq directory filepath unix"

inherit ghc-system-package
