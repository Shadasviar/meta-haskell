require cabal.inc

BOOTSTRAP_DIR           = "${S}/bootstrap"
BOOTSTRAP_PLAN_FILENAME = "linux"
INSTALL_BIN_DIR         = "${D}${prefix}/bin"
INSTALL_CONFIG_DIR      = "${D}${sysconfdir}"
CABAL_CONFIG_FILE       = "${INSTALL_CONFIG_DIR}/cabal.conf"

inherit cabal-bootstrap native

do_configure() {
}

do_compile() {
}

do_install() {
  install -d ${INSTALL_BIN_DIR}
  cp -r ${S}/_build/bin ${D}${prefix}/

  install -d ${INSTALL_CONFIG_DIR}
  echo "active-repositories: none" > ${CABAL_CONFIG_FILE}
  echo "shared: True" >> ${CABAL_CONFIG_FILE}
}
