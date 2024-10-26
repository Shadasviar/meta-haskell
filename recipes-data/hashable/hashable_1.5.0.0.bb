SUMMARY     = "A class for types that can be converted to a hash value"
DESCRIPTION = "This package defines a class, Hashable, for types that can \
be converted to a hash value. This class exists for the benefit of \
hashing-based data structures. The package provides instances for basic \
types and a way to combine hash values."

HOMEPAGE    = "https://github.com/haskell-unordered-containers/hashable"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "e58b3a8e18da5f6cd7e937e5fd683e500bb1f8276b3768269759119ca0cddb6a"

DEPENDS += "ghc-bignum bytestring containers deepseq filepath os-string text"
