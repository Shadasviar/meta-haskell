require cabal.inc

BOOTSTRAP_DIR           = "${S}/bootstrap"
BOOTSTRAP_PLAN_FILENAME = "linux"
CABAL_CONFIG_FILE       = "${D}${sysconfdir}/cabal.conf"

inherit cabal-bootstrap native

do_configure() {
}

do_compile() {
}

do_install() {
  install -d ${D}/bin
  cp -r ${S}/_build/bin ${D}/

  install -d ${D}${sysconfdir}
  echo "active-repositories: none" > ${CABAL_CONFIG_FILE}
}
