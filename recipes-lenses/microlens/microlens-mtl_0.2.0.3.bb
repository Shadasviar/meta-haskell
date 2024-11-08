SUMMARY     = "microlens support for Reader/Writer/State from mtl"
DESCRIPTION = "This package contains functions (like view or +=) which work \
on MonadReader, MonadWriter, and MonadState from the mtl package."

require microlens.inc

SRC_URI[sha256sum] = "4d6b6af37179814fe47e11763ea61b423b698bc15869f94e82c6a5e9fd079fc6"

DEPENDS += "microlens mtl transformers-compat"
