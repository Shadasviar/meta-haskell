SUMMARY     = "Efficient hashing-based container types"
DESCRIPTION = "Efficient hashing-based container types. The containers have \
been optimized for performance critical use, both in terms of large data \
quantities and high speed."

HOMEPAGE          = "https://github.com/haskell-unordered-containers/unordered-containers"
BUGTRACKER        = "https://github.com/haskell-unordered-containers/unordered-containers/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI = "git://github.com/Shadasviar/unordered-containers.git;protocol=https;branch=support-ghc-9.10.1"
SRCREV  = "509d6b3b35edab1a832efea700fab5805eb529a7"
S       = "${WORKDIR}/git"

DEPENDS += "hashable template-haskell"
