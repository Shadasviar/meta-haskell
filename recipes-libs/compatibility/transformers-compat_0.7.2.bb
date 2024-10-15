SUMMARY     = "A small compatibility shim for the transformers library"
DESCRIPTION = "This package includes backported versions of types that were \
added to transformers in transformers 0.3, 0.4, and 0.5 for users who need \
strict transformers 0.2 or 0.3 compatibility to run on old versions of the \
platform, but also need those types. Those users should be able to just \
depend on transformers >= 0.2 and transformers-compat >= 0.3."

HOMEPAGE          = "http://github.com/ekmett/transformers-compat/"
BUGTRACKER        = "http://github.com/ekmett/transformers-compat/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "b62c7304c9f3cbc9463d0739aa85cb9489f217ea092b9d625d417514fbcc9d6a"

DEPENDS += "generic-deriving mtl transformers"
