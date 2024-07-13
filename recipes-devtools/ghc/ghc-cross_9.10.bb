BPN = "ghc"

require ghc.inc

INHIBIT_DEFAULT_DEPS      = "1"
PN                        = "ghc-cross-${TARGET_ARCH}"
TARGET_ARCH[vardepvalue]  = "${TARGET_ARCH}"
PROVIDES                  = "virtual/${TARGET_PREFIX}ghc"
