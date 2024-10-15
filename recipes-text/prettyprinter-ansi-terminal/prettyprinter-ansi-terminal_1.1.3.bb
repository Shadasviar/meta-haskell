SUMMARY     = "ANSI terminal backend for the prettyprinter package"
DESCRIPTION = "ANSI terminal backend for the prettyprinter package"

HOMEPAGE          = "http://github.com/quchen/prettyprinter"
BUGTRACKER        = "http://github.com/quchen/prettyprinter/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

inherit ghc-package

SRC_URI[sha256sum] = "813739308ad6050620578994effe21058a170a341716acf52573fae42b5b1db3"

DEPENDS += "ansi-terminal prettyprinter text"
