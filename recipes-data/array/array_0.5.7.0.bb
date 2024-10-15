SUMMARY     = "Mutable and immutable arrays"
DESCRIPTION = "In addition to providing the Data.Array module as specified \
in the Haskell 2010 Language Report, this package also defines the classes \
IArray of immutable arrays and MArray of arrays mutable within appropriate \
monads, as well as some instances of these classes."

HOMEPAGE          = "https://github.com/haskell/array.git"
BUGTRACKER        = "https://github.com/haskell/array/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base"

inherit ghc-system-package
