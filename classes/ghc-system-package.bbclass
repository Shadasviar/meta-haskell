DEPENDS     += "ghc-cross-${TARGET_ARCH}"
GHC_PN      ?= "${PN}"
SUFFIX      ?= "-inplace"
DIR_SUFFIX  ?= "${SUFFIX}"

inherit ghc-info

PACKAGES = "${PN}-staticdev ${PN} ${PN}-dbg ${PN}-dev"

FILES:${PN}-staticdev = "${libdir}/*/*.a"
FILES:${PN}-dbg       = "${libdir}/.debug"
FILES:${PN}-dev       = "${libdir}/libHS${GHC_PN}-${PV}${DIR_SUFFIX}"
FILES:${PN}           = "${libdir}"

INSANE_SKIP:${PN} += "already-stripped"

do_install() {
  install -d "${D}${libdir}"
  cp "${GHC_LIBDIR}/libHS${GHC_PN}-${PV}${SUFFIX}-ghc${GHC_VERSION}.so" "${D}${libdir}/"
  cp -rf "${GHC_LIBDIR}/${GHC_PN}-${PV}${DIR_SUFFIX}" "${D}${libdir}/"
}
