SUMMARY     = "Type definitions for Universally Unique Identifiers"
DESCRIPTION = "This library contains type definitions for Universally Unique \
Identifiers (UUID) (as specified in RFC 4122) and basic conversion \
functions. See also the 'uuid' package providing a high-level API for \
managing the different UUID versions."

require uuid.inc

DEPENDS += "binary hashable random template-haskell text"

