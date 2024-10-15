SUMMARY     = "URI manipulation"
DESCRIPTION = "This package provides facilities for parsing and unparsing \
URIs, and creating and resolving relative URI references, closely following \
the URI spec, IETF RFC 3986."

HOMEPAGE          = "https://github.com/haskell/network-uri"
BUGTRACKER        = "https://github.com/haskell/network-uri/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/haskell/network-uri.git;protocol=https;branch=master"
SRCREV  = "56ba757ab1690f8116285822f339346dc19bd63d"
S       = "${WORKDIR}/git"

DEPENDS += "deepseq parsec template-haskell th-compat"
