SUMMARY     = "filterable traversable"
DESCRIPTION = "A stronger variant of traverse which can remove elements and \
generalised mapMaybe, catMaybes, filter"

HOMEPAGE          = "https://github.com/fumieval/witherable"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/fumieval/witherable.git;protocol=https;branch=master"
SRCREV  = "379b1898ff9ae5f6b95c6154e6176d66acfcc1b3"
S       = "${WORKDIR}/git/${BPN}"

DEPENDS += "base-orphans hashable indexed-traversable-instances transformers vector"
