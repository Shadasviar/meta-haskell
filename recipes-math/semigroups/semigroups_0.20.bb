SUMMARY     = "Anything that associates"
DESCRIPTION = "In mathematics, a semigroup is an algebraic structure \
consisting of a set together with an associative binary operation. A \
semigroup generalizes a monoid in that there might not exist an identity \
element. It also (originally) generalized a group (a monoid with all \
inverses) to a type where every element did not have to have an inverse, \
thus the name semigroup."

HOMEPAGE          = "http://github.com/ekmett/semigroups"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "math"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "902d2e33c96b40a89de5957f2a9e097197afcc35e257e45b32ebe770993673e1"

DEPENDS += "bytestring-builder nats tagged transformers-compat unordered-containers"
