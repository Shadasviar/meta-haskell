SUMMARY     = "Memory-efficient representation of Unicode text strings"
DESCRIPTION = "This package provides the ShortText type which is suitable \
for keeping many short strings in memory. This is similiar to how \
ShortByteString relates to ByteString. The main difference between Text and \
ShortText is that ShortText doesn't support zero-copy slicing (thereby \
saving 2 words), and, compared to text-1.*, that it uses UTF-8 instead of \
UTF-16 internally. Consequently, the memory footprint of a (boxed) \
ShortText value is 4 words (2 words when unboxed) plus the length of the \
UTF-8 encoded payload."

HOMEPAGE          = "https://github.com/hvr/text-short"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package ghc-setup-missing

SRC_URI = "git://github.com/haskell-hvr/text-short.git;protocol=https;branch=master"
SRCREV  = "0375e10e9893293c8c021b92af9c605cb21d3fab"
S       = "${WORKDIR}/git"

DEPENDS += "binary bytestring hashable template-haskell text"
