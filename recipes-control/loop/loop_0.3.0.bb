SUMMARY     = "Fast loops (for when GHC can't optimize forM_)"
DESCRIPTION = "This package provides a convenient and fast alternative to the \
common `forM_ [1..n]` idiom, which in many cases GHC cannot fuse to \
efficient code."

HOMEPAGE          = "https://github.com/nh2/loop"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "control"
LICENSE           = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit ghc-package ghc-setup-missing

SRC_URI[sha256sum] = "92962010bdab28cc0092dd3fe42819d6f215c717dd10d9349626d92a0d0b3ecf"
