SUMMARY     = "Backwards-compatible orphan instances for base"
DESCRIPTION = "base-orphans defines orphan instances that mimic instances \
available in later versions of base to a wider (older) range of compilers. \
base-orphans does not export anything except the orphan instances themselves"

HOMEPAGE          = "https://github.com/haskell-compat/base-orphans#readme"
BUGTRACKER        = "https://github.com/haskell-compat/base-orphans/issues"
SECTION           = "libs"
LICENSE           = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[sha256sum] = "6211900916955b84687c61b5e4fa98ce110e511a96086b7a93f06dd63c97ba93"

DEPENDS += "ghc-prim"

inherit ghc-package
