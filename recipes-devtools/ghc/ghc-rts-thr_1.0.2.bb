SUMMARY     = "GHC RTS library"
DESCRIPTION = "${SUMMARY}"

HOMEPAGE    = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER  = "https://github.com/haskell/core-libraries-committee/issues"
SECTION     = "libs"

GHC_PN      = "rts"
SUFFIX      = "_thr"
DIR_SUFFIX  = ""

inherit ghc-system-package license-bsd3
