SUMMARY     = "Resolve TSP problem using genetic programming"
DESCRIPTION = "CLI program that finds suboptimal exclusive routes for city \
map. This program works for any numer of routes."

HOMEPAGE    = "https://gitlab.com/Shadasviar/tsp-genetic"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "applications"

inherit ghc-package license-gpl3-only

SRC_URI = "git://gitlab.com/Shadasviar/tsp-genetic.git;protocol=https;branch=master"
SRCREV  = "7b1a85b6ddcb9bece0ae5111697df67ea318a204"
S       = "${WORKDIR}/git"

DEPENDS += "\
  async \
  deepseq-generics \
  haskell-gnuplot \
  matrix \
  optparse-applicative \
  random-shuffle \
  split \
  vty-unix \
"
