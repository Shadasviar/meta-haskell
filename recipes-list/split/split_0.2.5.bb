SUMMARY     = "Combinator library for splitting lists"
DESCRIPTION = "A collection of various methods for splitting lists into \
parts, akin to the split function found in several mainstream languages. \
Here is its tale: Once upon a time the standard Data.List module held no \
function for splitting a list into parts according to a delimiter. Many a \
brave lambda-knight strove to add such a function, but their striving was \
in vain, for Lo, the Supreme Council fell to bickering amongst themselves \
what was to be the essential nature of the One True Function which could \
cleave a list in twain (or thrain, or any required number of parts). And \
thus came to pass the split package, comprising divers functions for \
splitting a list asunder, each according to its nature. And the Supreme \
Council had no longer any grounds for argument, for the favored method of \
each was contained therein. To get started, see the Data.List.Split module."

HOMEPAGE    = "https://github.com/byorgey/split"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "libs"

inherit ghc-package license-bsd3

SRC_URI[sha256sum] = "52da404e8397c1ab238354c8d4fd9a7e9c5cac8849cc2ce2e45facc85e74a913"
