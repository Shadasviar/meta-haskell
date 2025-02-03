SUMMARY     = "2D and 3D plots using gnuplot"
DESCRIPTION = "This is a wrapper to gnuplot which lets you create 2D and 3D plots."

HOMEPAGE    = "http://www.haskell.org/haskellwiki/Gnuplot"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "graphics"
HS_PN       = "gnuplot"

inherit ghc-package license-bsd3

SRC_URI += " file://0001-Fix-dependencies-versions.patch"
SRC_URI[sha256sum] = "a342e84c2201ff938e18803deb39596f470249effc5a3af5577795a807848abe"

DEPENDS += "\
  data-accessor-transformers \
  process \
  semigroups \
  shell-utility \
  temporary \
  utility-ht\
"

RDEPENDS:${PN} += "gnuplot"
