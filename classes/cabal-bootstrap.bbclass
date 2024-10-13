GHC = "/usr/bin/ghc"

HOST_GHC_VERSION      ?= "${@ghc_version(d)}"
GHC_VERSION_SEPARATOR ?= "."
INHIBIT_DEFAULT_DEPS   = "1"
INSANE_SKIP:${PN}     += "already-stripped"

def ghc_version(d):
  import os
  ver_str = os.popen(d.getVar('GHC') + ' -V').read()
  return ver_str.split()[-1].replace('.', d.getVar('GHC_VERSION_SEPARATOR'))

do_bootstrap() {
  install -d ${B}
  cd ${B}
  ${BOOTSTRAP_DIR}/bootstrap.py -w ${GHC} -d ${BOOTSTRAP_DIR}/${BOOTSTRAP_PLAN_FILENAME}-${HOST_GHC_VERSION}.json
}

do_bootstrap[network] = "1"

addtask do_bootstrap after do_unpack before do_configure
