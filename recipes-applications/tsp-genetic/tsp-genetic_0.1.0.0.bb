SUMMARY     = "Resolve TSP problem using genetic programming"
DESCRIPTION = "CLI program that finds suboptimal exclusive routes for city \
map. This program works for any numer of routes."

HOMEPAGE    = "https://gitlab.com/Shadasviar/tsp-genetic"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "applications"

inherit ghc-package license-gpl3-only

SRC_URI = "git://gitlab.com/Shadasviar/tsp-genetic.git;protocol=https;branch=master"
SRCREV  = "9eaafb8fe3632bb6764cd317149dba3c7a7cf397"
S       = "${WORKDIR}/git"

DEPENDS += "\
  async \
  deepseq-generics \
  haskell-gnuplot \
  matrix \
  optparse-applicative \
  random-shuffle \
  split \
  unix \
  ghc-rts-thr \
"

RDEPENDS:${PN}:append = " libffi numactl"
