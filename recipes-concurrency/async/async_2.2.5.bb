SUMMARY     = "Run IO operations asynchronously and wait for their results"
DESCRIPTION = "This package provides a higher-level interface over threads, \
in which an Async a is a concurrent thread that will eventually deliver a \
value of type a. The package provides ways to create Async computations, \
wait for their results, and cancel them."

HOMEPAGE    = "https://github.com/simonmar/async"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "concurrency"

inherit ghc-package license-bsd3

SRC_URI = "git://github.com/simonmar/async.git;protocol=https;branch=master"
SRCREV  = "9429183c96e2d0d615a5f5accd54cf15477eb042"
S       = "${WORKDIR}/git"

DEPENDS += "hashable stm"
