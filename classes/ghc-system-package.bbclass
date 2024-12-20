DEPENDS += "ghc-cross-${TARGET_ARCH}"
GHC_PN  ?= "${PN}"

inherit ghc-info

PACKAGES = "${PN}-staticdev ${PN} ${PN}-dev ${PN}-dbg"

FILES:${PN}-staticdev = "${libdir}/${GHC_TARGET_NAME}/${GHC_PN}-${PV}-inplace/*.a"
FILES:${PN}-dbg       = "${libdir}/${GHC_TARGET_NAME}/.debug"
FILES:${PN}           = "${libdir}"

INSANE_SKIP:${PN} += "already-stripped"

do_install() {
  install -d "${D}${libdir}/${GHC_TARGET_NAME}"
  cp "${GHC_LIBDIR}/libHS${GHC_PN}-${PV}-inplace-ghc${GHC_VERSION}.so" "${D}${libdir}/${GHC_TARGET_NAME}/"
  cp -rf "${GHC_LIBDIR}/${GHC_PN}-${PV}-inplace" "${D}${libdir}/${GHC_TARGET_NAME}/"
}
