SUMMARY     = "A time library"
DESCRIPTION = "Time, clocks and calendars"

HOMEPAGE          = "https://github.com/haskell/time"
BUGTRACKER        = "https://github.com/haskell/time/issues"
SECTION           = "libs"
LICENSE           = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=cb641bc04cda31daea161b1bc15da69f"

DEPENDS += "ghc-base deepseq template-haskell"

inherit ghc-system-package
