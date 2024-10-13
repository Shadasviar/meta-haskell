SUMMARY     = "Deep evaluation of data structures"
DESCRIPTION = "This package provides methods for fully evaluating data \
structures (deep evaluation). Deep evaluation is often used for adding \
strictness to a program, e.g. in order to force pending exceptions, remove \
space leaks, or force lazy I/O to happen. It is also useful in parallel \
programs, to ensure pending work does not migrate to the wrong thread."

HOMEPAGE          = "https://github.com/haskell/deepseq.git"
BUGTRACKER        = "https://github.com/haskell/deepseq/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base ghc-prim array"

inherit ghc-system-package
