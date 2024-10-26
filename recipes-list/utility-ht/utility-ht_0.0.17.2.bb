SUMMARY     = "Various small helper functions for Lists, Maybes, Tuples, Functions"
DESCRIPTION = "Various small helper functions for Lists, Maybes, Tuples, \
Functions. Some of these functions are improved implementations of standard \
functions. They have the same name as their standard counterparts. Others \
are equivalent to functions from the base package, but if you import them \
from this utility package then you can write code that runs on older GHC \
versions or other compilers like Hugs and JHC."

HOMEPAGE    = "http://code.haskell.org/~thielema/utility"
BUGTRACKER  = "${HOMEPAGE}"
SECTION     = "libs"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "0a8ec081956d18f8ca84f58aacf39a5ab1a7dc08302e2ce28b4ac3768bb0372c"
