SUMMARY     = "Backward- (and forward-)compatible Quote and Code types"
DESCRIPTION = "This package defines a Language.Haskell.TH.Syntax.Compat \
module, which backports the Quote and Code types to work across a wide \
range of template-haskell versions. The makeRelativeToProject utility is also \
backported. On recent versions of template-haskell (2.17.0.0 or later), this \
module simply reexports definitions from Language.Haskell.TH.Syntax. Refer \
to the Haddocks for Language.Haskell.TH.Syntax.Compat for examples of how \
to use this module."

HOMEPAGE          = "https://github.com/haskell-compat/th-compat"
BUGTRACKER        = "https://github.com/haskell-compat/th-compat/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell-compat/th-compat.git;protocol=https;branch=master"
SRCREV  = "eec1edb9e09eba14e7ba17be29a9674431c63c05"
S       = "${WORKDIR}/git"

DEPENDS += "directory filepath template-haskell transformers"
