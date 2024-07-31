require cabal.inc

BOOTSTRAP_DIR           = "${S}/bootstrap"
HC                      = "/usr/bin/ghc"
BOOTSTRAP_PLAN_FILENAME = "linux"

INHIBIT_DEFAULT_DEPS   = "1"
INSANE_SKIP:${PN}     += "already-stripped"

inherit cabal-bootstrap native

do_configure() {
}

do_compile() {
}

do_install() {
  install -d ${D}/bin
  cp -r ${S}/_build/bin ${D}/
}
