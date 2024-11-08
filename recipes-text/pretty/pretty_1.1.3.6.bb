SUMMARY     = "Pretty-printing library"
DESCRIPTION = "This package contains a pretty-printing library, a set of \
API's that provides a way to easily print out text in a consistent format \
of your choosing. This is useful for compilers and related tools."

HOMEPAGE          = "http://github.com/haskell/pretty"
BUGTRACKER        = "http://github.com/haskell/pretty/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "deepseq"

inherit ghc-system-package
