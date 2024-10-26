SUMMARY     = "Utilities for accessing and manipulating fields of records"
DESCRIPTION = "With this package you can define record field accessors \
which allow setting, getting and modifying values easily. The package \
clearly demonstrates the power of the functional approach: You can combine \
accessors of a record and sub-records, to make the access look like the \
fields of the sub-record belong to the main record."

HOMEPAGE    = "http://www.haskell.org/haskellwiki/Record_access"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "data"

inherit ghc-package license-bsd3

SRC_URI += " file://0001-Fix-dependencies-versions.patch"
SRC_URI[sha256sum] = "06a3c790a27e107aaa4d11556866e874d1e4edc814bd4928bc6ff61f3b0d5791"

DEPENDS += "containers transformers"
