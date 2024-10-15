SUMMARY     = "Align and Zip type-classes from the common Semialign ancestor"
DESCRIPTION = "The major use of These of this is provided by the align \
member of Semialign class, representing a generalized notion of zipping with \
padding that combines structures without truncating to the size of the \
smaller input. It turns out that zip operation fits well the Semialign \
class, forming lattice-like structure."

require these.inc

DEPENDS += "semigroupoids these vector indexed-traversable-instances"
