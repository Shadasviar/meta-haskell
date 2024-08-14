require cabal.inc

BOOTSTRAP_DIR           = "${S}/bootstrap"
BOOTSTRAP_PLAN_FILENAME = "linux"
HC                      = "/usr/bin/ghc"

inherit cabal-bootstrap native

do_configure() {
}

do_compile() {
}

do_install() {
  install -d ${D}/bin
  cp -r ${S}/_build/bin ${D}/
}
