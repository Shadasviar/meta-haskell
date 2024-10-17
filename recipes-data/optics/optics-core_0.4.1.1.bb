SUMMARY     = "Optics as an abstract interface: core definitions"
DESCRIPTION = "This package makes it possible to define and use Lenses, \
Traversals, Prisms and other optics, using an abstract interface. This \
variant provides core definitions with a minimal dependency footprint. See \
the optics package (and its dependencies) for documentation and the \
batteries-included variant."

require optics.inc

DEPENDS += "containers indexed-profunctors indexed-traversable transformers"
