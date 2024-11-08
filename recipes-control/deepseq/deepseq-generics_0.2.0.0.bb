SUMMARY     = "GHC.Generics-based Control.DeepSeq.rnf implementation"
DESCRIPTION = "This package provides a GHC.Generics-based \
Control.DeepSeq.Generics.genericRnf function which can be used for providing \
a rnf implementation. See the documentation for the genericRnf function in \
the Control.DeepSeq.Generics module to get started."

HOMEPAGE    = "https://github.com/haskell-hvr/deepseq-generics"
BUGTRACKER  = "${HOMEPAGE}/issues"
SECTION     = "control"

inherit ghc-package license-bsd3

SRC_URI = "git://github.com/haskell-hvr/deepseq-generics.git;protocol=https;branch=master"
SRCREV  = "7ea4164fc4cdbbab62ea9d862fc3d9840bfda1ab"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq"
