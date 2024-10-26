# Haskell Yocto meta layer #

This layer provides a Haskell language support for Yocto.

## How to use ##

If package is provided by ghc, you can inherit `ghc-system-package` class.

For usual packages use `ghc-package` class that builds package using `Setup.hs`
file. If project does not have setup file, you can also inherit `ghc-setup-missing`
class that will add fefault setup file to project.

## Dependencies ##

This layer requires a `meta-clang` layer. https://github.com/kraj/meta-clang
