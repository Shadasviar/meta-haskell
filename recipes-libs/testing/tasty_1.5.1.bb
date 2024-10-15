SUMMARY     = "Modern and extensible testing framework"
DESCRIPTION = "Tasty is a modern testing framework for Haskell. It lets you \
combine your unit tests, golden tests, QuickCheck/SmallCheck properties, and \
any other types of tests into a single test suite."

HOMEPAGE          = "https://github.com/UnkindPartition/tasty"
BUGTRACKER        = "https://github.com/UnkindPartition/tasty/issues"
SECTION           = "libs"
LICENSE           = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit ghc-package

SRC_URI = "git://github.com/UnkindPartition/tasty.git;protocol=https;branch=master"
SRCREV  = "39b563a697835bbb8b6637056928f334253fd59a"
S       = "${WORKDIR}/git/core"

DEPENDS += "optparse-applicative containers stm tagged time unbounded-delays unix"
