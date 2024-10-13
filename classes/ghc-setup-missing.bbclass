do_configure:prepend() {
  echo "import Distribution.Simple" > ${S}/Setup.hs
  echo "main = defaultMain" >> ${S}/Setup.hs
}

