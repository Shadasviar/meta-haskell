SUMMARY     = "Software Transactional Memory"
DESCRIPTION = "Software Transactional Memory, or STM, is an abstraction for \
concurrent communication. The main benefits of STM are composability and \
modularity. That is, using STM you can write concurrent abstractions that \
can be easily composed with any other abstraction built using STM, without \
exposing the details of how your abstraction ensures safety. This is \
typically not the case with other forms of concurrent communication, such \
as locks or MVars."

HOMEPAGE          = "https://wiki.haskell.org/Software_transactional_memory"
BUGTRACKER        = "https://github.com/haskell/stm/issues"
SECTION           = "libs"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "ghc-base array"

inherit ghc-system-package
