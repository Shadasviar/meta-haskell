SUMMARY     = "Automatic generation of record lenses for microlens"
DESCRIPTION = "This package lets you automatically generate lenses for data \
types; code was extracted from the lens package, and therefore generated \
lenses are fully compatible with ones generated by lens (and can be used \
both from lens and microlens)."

require microlens.inc

SRC_URI[sha256sum] = "0fceb3271297ad29a2bfa3e62953debbb44dba513c439a363acf625f954e45c9"

DEPENDS += "microlens th-abstraction transformers"