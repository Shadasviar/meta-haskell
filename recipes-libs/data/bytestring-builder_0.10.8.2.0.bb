SUMMARY     = "he new bytestring builder, packaged outside of GHC"
DESCRIPTION = "This is the bytestring builder that is debuting in \
bytestring-0.10.4.0, which should be shipping with GHC 7.8, probably late \
in 2013. This builder has several nice simplifications and improvements, \
and more out-of-box functionality than the older blaze-builder."

HOMEPAGE          = "http://github.com/lpsmith/bytestring-builder"
BUGTRACKER        = "http://github.com/lpsmith/bytestring-builder/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "27faef6db27c5be5a3715fd68b93725853e0e668849eaf92ce7c33cef9cb2c3f"

DEPENDS += "bytestring"
