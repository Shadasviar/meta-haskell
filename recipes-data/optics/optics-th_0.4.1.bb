SUMMARY     = "Optics construction using TemplateHaskell"
DESCRIPTION = "This package is part of the optics package family. It \
provides machinery to construct optics using TemplateHaskell. See the \
template-haskell-optics package for optics to work with \
template-haskell types."

require optics.inc

inherit ghc-setup-missing

DEPENDS += "containers mtl optics-core template-haskell th-abstraction"
