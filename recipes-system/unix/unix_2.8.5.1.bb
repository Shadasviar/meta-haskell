SUMMARY     = "POSIX functionality"
DESCRIPTION = "This package gives you access to the set of operating system \
services standardised by POSIX.1-2008 (or the IEEE Portable Operating \
System Interface for Computing Environments - IEEE Std. 1003.1)."

HOMEPAGE          = "https://github.com/haskell/unix"
BUGTRACKER        = "https://github.com/haskell/unix/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base bytestring filepath os-string time"

inherit ghc-system-package
