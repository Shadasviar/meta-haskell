SUMMARY     = "An either-or-both data type"
DESCRIPTION = "This package provides a data type These a b which can hold a \
value of either type or values of each type. This is usually thought of as \
an inclusive or type (contrasting Either a b as exclusive or) or as an \
outer join type (contrasting (a, b) as inner join)."

require these.inc

DEPENDS += "assoc binary foldable1-classes-compat hashable"
