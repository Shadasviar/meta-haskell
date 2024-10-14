SUMMARY     = "Support library for Template Haskell"
DESCRIPTION = "This package provides modules containing facilities for \
manipulating Haskell source code using Template Haskell."

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc.git"
BUGTRACKER        = "https://gitlab.haskell.org/ghc/ghc/issues/new"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base ghc-boot-th ghc-prim pretty"

inherit ghc-system-package
