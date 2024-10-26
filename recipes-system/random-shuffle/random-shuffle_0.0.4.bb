SUMMARY     = "Random shuffle implementation"
DESCRIPTION = "Random shuffle implementation, on immutable lists. Based on \
`perfect shuffle' implementation by Oleg Kiselyov, available on \
http://okmij.org/ftp/Haskell/perfect-shuffle.txt"

HOMEPAGE    = "https://okmij.org/ftp/Haskell/perfect-shuffle.txt"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "system"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "52704411f040fd0bf2361dad162e35dc13caa6535b2e4908d3513c00a95d0615"

DEPENDS += "monad-random"
