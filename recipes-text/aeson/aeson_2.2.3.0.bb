SUMMARY     = "Fast JSON parsing and encoding"
DESCRIPTION = "A JSON parsing and encoding library optimized for ease of use \
and high performance. To get started, see the documentation for the \
Data.Aeson module below. (A note on naming: in Greek mythology, Aeson was \
the father of Jason.)"

require aeson.inc

S = "${WORKDIR}/git"

DEPENDS += "\
  character-ps \
  data-fix \
  dlist \
  exceptions \
  generically \
  network-uri \
  quick-check \
  scientific \
  semialign \
  strict \
  text-iso8601 \
  text-short \
  uuid-types \
  witherable \
"
