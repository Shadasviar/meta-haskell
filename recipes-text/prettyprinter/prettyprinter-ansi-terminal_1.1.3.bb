SUMMARY     = "ANSI terminal backend for the prettyprinter package"
DESCRIPTION = "ANSI terminal backend for the prettyprinter package"

require prettyprinter.inc

SRC_URI[sha256sum] = "813739308ad6050620578994effe21058a170a341716acf52573fae42b5b1db3"

DEPENDS += "ansi-terminal prettyprinter text"
