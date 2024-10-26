SUMMARY     = "Use Accessor to access state in transformers State monad"
DESCRIPTION = "Use Accessor to access state in transformers State monad"

HOMEPAGE    = "http://www.haskell.org/haskellwiki/Record_access"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "data"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "03f9944ba12a6d2646410be7a7ed9fb8f02697842fd6d0643c94c4d6605b28d4"

DEPENDS += "data-accessor"
