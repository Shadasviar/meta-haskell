SUMMARY     = "A tiny lens library with no dependencies"
DESCRIPTION = "This library is an extract from lens (with no dependencies). \
It's not a toy lenses library, unsuitable for “real world”, but merely a \
small one. It is compatible with lens, and should have same performance. \
It also has better documentation."

require microlens.inc

SRC_URI[sha256sum] = "0a54abee8ff4f6aeb4bea0783409a3dbd28a4e7a892bac916b0fb6a71382d7fc"

DEPENDS += "transformers"
