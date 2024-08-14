GHC_VERSION           ?= "${@ghc_version(d)}"
GHC_VERSION_SEPARATOR ?= "."
HC                     = "/usr/bin/ghc"

INHIBIT_DEFAULT_DEPS   = "1"
INSANE_SKIP:${PN}     += "already-stripped"

def ghc_version(d):
  import os
  ver_str = os.popen(d.getVar('HC') + ' -V').read()
  return ver_str.split()[-1].replace('.', d.getVar('GHC_VERSION_SEPARATOR'))

do_bootstrap() {
  install -d ${B}
  cd ${B}
  ${BOOTSTRAP_DIR}/bootstrap.py -w ${HC} -d ${BOOTSTRAP_DIR}/${BOOTSTRAP_PLAN_FILENAME}-${GHC_VERSION}.json
}

do_bootstrap[network] = "1"

addtask do_bootstrap after do_unpack before do_configure
