SUMMARY     = "Conversion from strings to Integer"
DESCRIPTION = "The naive foldl' (acc d -> acc * 10 + d) 0 is expensive \
(quadratic!) for large Integers. This package provides sub-quadratic \
implementation."

HOMEPAGE          = "https://github.com/phadej/integer-conversion"
BUGTRACKER        = "https://github.com/phadej/integer-conversion/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI[sha256sum] = "c18164a048073310f6353ebc64c9037b52a4b8299963ce05e027bcf60e22155a"

DEPENDS += "primitive text"

inherit ghc-package ghc-setup-missing
