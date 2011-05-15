#!/bin/sh
rm -rf ./bin/ ../libtorrent-rasterbar-trunk/trunk/bin ../boost_1_46_0/bin.v2/
bjam gcc-32 "cflags=-DTORRENT_USE_I2P=0  -DBOOST_NO_EXCEPTIONS=1" boost=source target-os=linux encryption=tommath variant=release geoip=off logging=none deprecated-functions=off java_client
bjam gcc-win32 "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=1" link=static boost=source target-os=windows encryption=tommath variant=release geoip=off logging=none threadapi=win32 iconv=off deprecated-functions=off java_client
bjam boost=source "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=0" target-os=darwin encryption=tommath variant=release geoip=off logging=none architecture=x86 --toolset=darwin deprecated-functions=off java_client
bjam boost=source "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=0" target-os=darwin encryption=tommath variant=release geoip=off logging=none architecture=power --toolset=darwin deprecated-functions=off java_client
mv ./bin ./bintom
bjam gcc-32 "cflags=-DTORRENT_USE_I2P=0  -DBOOST_NO_EXCEPTIONS=0" boost=source target-os=linux encryption=openssl variant=release geoip=off logging=none deprecated-functions=off java_client
bjam gcc-win32 "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=0" link=static boost=source target-os=windows encryption=openssl variant=release geoip=off logging=none threadapi=win32 iconv=off deprecated-functions=off java_client
bjam boost=source "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=0" target-os=darwin encryption=openssl variant=release geoip=off logging=none architecture=x86 --toolset=darwin deprecated-functions=off java_client
bjam boost=source "cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=0" target-os=darwin encryption=openssl variant=release geoip=off logging=none architecture=power --toolset=darwin deprecated-functions=off java_client
#i2p: -rwxr-xr-x 1 mopar mopar 4176456 2011-03-01 02:47 bin/gcc-mingw-32/release/boost-source/encryption-openssl/link-static/threading-multi/java_client
#non: -rwxr-xr-x 1 mopar mopar 4073992 2011-03-01 02:56 bin/gcc-mingw-32/release/boost-source/encryption-openssl/link-static/threading-multi/java_client
rm -rf dist
mkdir dist
cp bin/gcc-mingw-32/release/boost-source/encryption-tommath/link-static/threading-multi/java_client ./dist/java_client.linux.x86
cp bin/gcc-mingw-win32/release/boost-source/encryption-tommath/iconv-off/link-static/target-os-windows/threadapi-win32/threading-multi/java_client.exe ./dist/java_client.win32.exe
cp bin/darwin-4.0.1/release/architecture-power/boost-source/encryption-tommath/link-static/target-os-darwin/threading-multi/java_client ./dist/java_client.osx.ppc
cp bin/darwin-4.0.1/release/architecture-x86/boost-source/encryption-tommath/link-static/target-os-darwin/threading-multi/java_client ./dist/java_client.osx.i386
