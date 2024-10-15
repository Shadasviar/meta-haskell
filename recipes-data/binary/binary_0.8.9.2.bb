SUMMARY     = "Binary serialisation for Haskell values using lazy ByteStrings"
DESCRIPTION = "Efficient, pure binary serialisation using lazy ByteStrings. \
Haskell values may be encoded to and from binary formats, written to disk \
as binary, or sent over the network. The format used can be automatically \
generated, or you can choose to implement a custom format if needed. \
Serialisation speeds of over 1 G/sec have been observed, so this library \
should be suitable for high performance scenarios."

HOMEPAGE          = "https://github.com/kolmodin/binary"
BUGTRACKER        = "https://github.com/haskell/binary/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base ghc-prim array bytestring containers"

inherit ghc-system-package
