SUMMARY     = "Utilities for compatibility with van Laarhoven optics"
DESCRIPTION = "This package is part of the optics package family. It provides \
utilities for converting between the Optic type defined by optics and the \
van Laarhoven representations of optics that require definitions outside \
of base (in particular isomorphisms and prisms)."

require optics.inc

DEPENDS += "indexed-profunctors optics-core profunctors"
