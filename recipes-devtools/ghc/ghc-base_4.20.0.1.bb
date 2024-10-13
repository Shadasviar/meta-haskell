SUMMARY     = "Core data structures and operations"
DESCRIPTION = "Haskell's base library provides, among other things, core types\
(e.g. Data.Bool and Data.Int), data structures (e.g. Data.List, Data.Tuple \
and Data.Maybe), the Control.Exception mechanism, and the System.IO & \
Control.Concurrent operations. The Prelude module, which is imported by \
default, exposes a curated set of types and functions from other modules."

HOMEPAGE          = "https://gitlab.haskell.org/ghc/ghc"
BUGTRACKER        = "https://github.com/haskell/core-libraries-committee/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-prim ghc-internal"

GHC_PN = "base"

inherit ghc-system-package
