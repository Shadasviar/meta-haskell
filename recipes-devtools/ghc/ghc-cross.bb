BPN = "ghc"

require ghc-bootstrap.inc

PV = "${GHC_VERSION}"

DEPENDS += "llvm-native gcc-cross-${TARGET_ARCH}"

INHIBIT_DEFAULT_DEPS      = "1"
PN                        = "ghc-cross-${TARGET_ARCH}"
TARGET_ARCH[vardepvalue]  = "${TARGET_ARCH}"
PROVIDES                  = "virtual/${TARGET_PREFIX}ghc"

inherit cross
