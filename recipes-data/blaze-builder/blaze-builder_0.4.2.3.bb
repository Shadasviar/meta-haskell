SUMMARY     = "Efficient buffered output"
DESCRIPTION = "This library allows to efficiently serialize Haskell values \
to lazy bytestrings with a large average chunk size. The large average chunk \
size allows to make good use of cache prefetching in later processing steps \
(e.g. compression) and reduces the system call overhead when writing the \
resulting lazy bytestring to a file or sending it over the network."

HOMEPAGE    = "https://github.com/blaze-builder/blaze-builder"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "66291874236b7342adab033e3cddae414a23a2865dfb44095dfc4e0b9d46703b"

DEPENDS += "bytestring-builder semigroups text"
