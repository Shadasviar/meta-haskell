SUMMARY     = "More instances of FunctorWithIndex, FoldableWithIndex, TraversableWithIndex"
DESCRIPTION = "This package provides extra instances for type-classes in the \
indexed-traversable package. The intention is to keep this package minimal; \
it provides instances that formely existed in lens or optics-extra. We \
recommend putting other instances directly into their defining packages. The \
indexed-traversable package is light, having only GHC boot libraries as its \
dependencies."

HOMEPAGE          = "https://github.com/haskellari/indexed-traversable"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

inherit ghc-package ghc-setup-missing

SRC_URI[sha256sum] = "3c2bb62fba141d6696177070d63b88bc56b194bc60f6b73d2263b0244e2fc7c1"

DEPENDS += "indexed-traversable tagged unordered-containers vector one-tuple"
