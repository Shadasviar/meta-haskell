SUMMARY     = "Semigroupoids: Category sans id"
DESCRIPTION = "Provides a wide array of (semi)groupoids and operations for \
working with them. A Semigroupoid is a Category without the requirement of \
identity arrows for every object in the category. A Category is any \
Semigroupoid for which the Yoneda lemma holds."

HOMEPAGE          = "https://github.com/ekmett/semigroupoids"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

inherit ghc-package

SRC_URI = "git://github.com/ekmett/semigroupoids.git;protocol=https;branch=master"
SRCREV  = "27525ac22da269f8a9ea45af53f3a4e81a309752"
S       = "${WORKDIR}/git"

DEPENDS += "base-orphans bifunctors containers contravariant unordered-containers"
