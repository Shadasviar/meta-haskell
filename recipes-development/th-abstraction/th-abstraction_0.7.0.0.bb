SUMMARY     = "Nicer interface for reified information about data types"
DESCRIPTION = "This package normalizes variations in the interface for \
inspecting datatype information via Template Haskell so that packages \
and support a single, easier to use informational datatype while \
supporting many versions of Template Haskell."

HOMEPAGE          = "https://github.com/glguy/th-abstraction"
BUGTRACKER        = "https://github.com/glguy/th-abstraction/issues"
SECTION           = "libs"
LICENSE           = "ISC"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=f3b90e78ea0cffb20bf5cca7947a896d"

SRC_URI[sha256sum] = "b2854c612f2fa4adfa1ecbb4089a2211fd9cb3210aec17ba4a455ae486b22721"

DEPENDS += "containers template-haskell"

inherit ghc-package
