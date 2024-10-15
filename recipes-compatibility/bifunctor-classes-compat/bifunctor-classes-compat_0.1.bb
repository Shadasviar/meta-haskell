SUMMARY     = "Compatibility package for the Bifunctor, Bifoldable, and Bitraversable classes"
DESCRIPTION = "Compatibility package for the Bifunctor, Bifoldable, and \
Bitraversable classes. See the bifunctors library for additional \
Bifunctor-related utilities."

HOMEPAGE          = "https://github.com/haskell-compat/bifunctor-classes-compat"
BUGTRACKER        = "https://github.com/haskell-compat/bifunctor-classes-compat/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI[sha256sum] = "37c96e38cb27d0babafd660071aa7a6b587ca94b56cbc55a711a00f3201ac72f"

DEPENDS += "base-orphans ghc-prim tagged transformers"

inherit ghc-package ghc-setup-missing
