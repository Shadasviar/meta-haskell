SUMMARY     = "Fast, pure and practical MD5 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the MD5 \
hash algorithm (including HMAC support) with performance close to the fastest \
implementations available in other languages. The implementation is made in \
C with a haskell FFI wrapper that hides the C implementation. NOTE: This \
package has been forked off cryptohash-0.11.7 because the cryptohash package \
has been deprecated and so this package continues to satisfy the need for a \
lightweight package providing the MD5 hash algorithm without any dependencies \
on packages other than base and bytestring. Consequently, this package can be \
used as a drop-in replacement for cryptohash's Crypto.Hash.MD5 module, \
though with a clearly smaller footprint."

require cryptohash.inc

SRCREV = "8fb2450984ce363dede2417f04fae652240db485"
