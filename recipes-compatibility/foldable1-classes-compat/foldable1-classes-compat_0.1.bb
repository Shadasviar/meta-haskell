SUMMARY     = "Compatibility package for the Foldable1 and Bifoldable1 type classes"
DESCRIPTION = "A compatibility package for the Foldable1 and Bifoldable1 type \
classes, which were introduced in base-4.18.0.0 (GHC 9.6.1)."

HOMEPAGE          = "https://github.com/haskell-compat/foldable1-classes-compat"
BUGTRACKER        = "https://github.com/haskell-compat/foldable1-classes-compat/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell-compat/foldable1-classes-compat.git;protocol=https;branch=master"
SRCREV  = "415a164c653afe8ced3ed174e0a3ea77b40cbaa3"
S       = "${WORKDIR}/git"

DEPENDS += "base-orphans bifunctor-classes-compat generic-deriving tagged"
