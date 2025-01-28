# Haskell Yocto meta layer #

This layer provides a Haskell language support for Yocto.

## How to use ##

If package is provided by ghc, you can inherit `ghc-system-package` class.

For usual packages use `ghc-package` class that builds package using `Setup.hs`
file. If project does not have setup file, you can also inherit `ghc-setup-missing`
class that will add fefault setup file to project.

## Dependencies ##


## Host tools ##

This layer requires `ghc`, `ghc-pkg`, `cabal`, `alex` and `happy` packages
installed on the host. Before building ghc, ensure you have an actual cabal
repository by running `cabal update` before building Yocto project.
