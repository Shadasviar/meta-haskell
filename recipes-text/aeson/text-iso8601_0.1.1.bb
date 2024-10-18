SUMMARY     = "Converting time to and from ISO 8601 text"
DESCRIPTION = "Converting time to and from IS0 8601 text. \
Specifically the RFC3339 profile."

require aeson.inc

inherit ghc-setup-missing

DEPENDS += "integer-conversion text time time-compat"
