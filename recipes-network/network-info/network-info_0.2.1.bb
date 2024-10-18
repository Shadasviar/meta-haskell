SUMMARY     = "Access the local computer's basic network configuration"
DESCRIPTION = "This library provides simple read-only access to the local \
computer's networking configuration. It is currently capable of getting a \
list of all the network interfaces and their respective IPv4, IPv6 and MAC \
addresses. network-info has been tested and is known to work on Ubuntu, \
FreeBSD, NetBSD, Mac OS and Windows."

HOMEPAGE          = "http://github.com/jacobstanley/network-info"
BUGTRACKER        = "${HOMEPAGE}/issues"
SECTION           = "network"
LICENSE           = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

inherit ghc-package

SRC_URI[sha256sum] = "9b2d88312fc8280351d5003200cc07decbb865f85d3aa7b1094b238bd6a8b404"
