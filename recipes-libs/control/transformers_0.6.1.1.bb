SUMMARY     = "Concrete functor and monad transformers"
DESCRIPTION = "A portable library of functor and monad transformers."

HOMEPAGE          = "http://hub.darcs.net/ross/transformers"
BUGTRACKER        = "http://hub.darcs.net/ross/transformers/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base ghc-prim"

inherit ghc-system-package
