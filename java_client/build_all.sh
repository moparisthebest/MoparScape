#!/bin/bash
# all working at revision 5346
options="cflags=-DTORRENT_USE_I2P=0 -DBOOST_NO_EXCEPTIONS=1 -DTORRENT_DISABLE_GEO_IP=1"
ssl_options="cflags=-DTORRENT_USE_I2P=0 -UBOOST_NO_EXCEPTIONS -DTORRENT_DISABLE_GEO_IP=1"


if [ "$1" == "win" ]; then
	echo "building windows then pushing to killer3"
	bjam gcc-win32 "$options" link=static boost=source target-os=windows encryption=tommath variant=release geoip=off logging=none threadapi=win32 iconv=off deprecated-functions=off java_client
	i586-mingw32msvc-strip bin/gcc-mingw-win32/release/boost-source/deprecated-functions-off/iconv-off/link-static/target-os-windows/threadapi-win32/threading-multi/java_client.exe
	scp bin/gcc-mingw-win32/release/boost-source/deprecated-functions-off/iconv-off/link-static/target-os-windows/threadapi-win32/threading-multi/java_client.exe mopar@killer3:/home/mopar/java_client/java_client.win32.exe
	exit 0
fi
if [ "$1" == "clean" ]; then
	echo "cleaning previous builds"
	rm -rf ./bin/ /home/mopar/biggerdaddy/libtorrent/libtorrent-rasterbar-trunk/trunk/bin /home/mopar/biggerdaddy/libtorrent/boost_1_46_0/bin.v2/
fi
# build human client
#bjam gcc-32 "$options" boost=source target-os=linux encryption=tommath variant=release geoip=off logging=none deprecated-functions=off java_client_human
bjam gcc-64 "$options" boost=source target-os=linux encryption=tommath variant=release geoip=off logging=none deprecated-functions=off java_client_human
#exit 0

bjam gcc-32 "$options" boost=source target-os=linux encryption=tommath variant=release geoip=off logging=none deprecated-functions=off java_client
#cp ./bin/gcc-mingw-32/release/boost-source/deprecated-functions-off/link-static/threading-multi/java_client ~/IdeaProjects/MoparScape4/java_client/dist/java_client.linux.x86; exit 0
bjam gcc-win32 "$options" link=static boost=source target-os=windows encryption=tommath variant=release geoip=off logging=none threadapi=win32 iconv=off deprecated-functions=off java_client
bjam boost=source "$ssl_options" target-os=darwin encryption=tommath variant=release geoip=off logging=none architecture=x86 --toolset=darwin deprecated-functions=off java_client
bjam boost=source "$ssl_options" target-os=darwin encryption=tommath variant=release geoip=off logging=none architecture=power --toolset=darwin deprecated-functions=off java_client
#openssl
#bjam gcc-32 "$ssl_options" boost=source target-os=linux encryption=openssl variant=release geoip=off logging=none deprecated-functions=off java_client
#bjam gcc-win32 "$ssl_options" link=static boost=source target-os=windows encryption=openssl variant=release geoip=off logging=none threadapi=win32 iconv=off deprecated-functions=off java_client
#bjam boost=source "$ssl_options" target-os=darwin encryption=openssl variant=release geoip=off logging=none architecture=x86 --toolset=darwin deprecated-functions=off java_client
#bjam boost=source "$ssl_options" target-os=darwin encryption=openssl variant=release geoip=off logging=none architecture=power --toolset=darwin deprecated-functions=off java_client

#i2p: -rwxr-xr-x 1 mopar mopar 4176456 2011-03-01 02:47 bin/gcc-mingw-32/release/boost-source/encryption-openssl/link-static/threading-multi/java_client
#non: -rwxr-xr-x 1 mopar mopar 4073992 2011-03-01 02:56 bin/gcc-mingw-32/release/boost-source/encryption-openssl/link-static/threading-multi/java_client
list_binaries(){
	find bin | egrep "java_client(\.exe)?$"
}
rm -rf dist
mkdir dist

mkdir dist/tommath
cp "$(list_binaries | grep gcc-mingw-32 | grep -v openssl)" ./dist/tommath/java_client.linux.x86
cp "$(list_binaries | grep gcc-mingw-win32 | grep -v openssl)" ./dist/tommath/java_client.win32.exe
cp "$(list_binaries | grep architecture-x86 | grep -v openssl)" ./dist/tommath/java_client.osx.i386
cp "$(list_binaries | grep architecture-power | grep -v openssl)" ./dist/tommath/java_client.osx.ppc

mkdir dist/openssl
cp "$(list_binaries | grep gcc-mingw-32 | grep openssl)" ./dist/openssl/java_client.linux.x86
cp "$(list_binaries | grep gcc-mingw-win32 | grep openssl)" ./dist/openssl/java_client.win32.exe
cp "$(list_binaries | grep architecture-x86 | grep openssl)" ./dist/openssl/java_client.osx.i386
cp "$(list_binaries | grep architecture-power | grep openssl)" ./dist/openssl/java_client.osx.ppc

strip dist/*/*.linux.*
i686-apple-darwin9-strip dist/*/*.osx.*
i586-mingw32msvc-strip dist/*/*.win32.*

ls -lah dist/*

tar czf dist/java_client.tar.gz dist/*
tar cf dist/tommath/java_client.tommath.tar dist/tommath/*
tar cf dist/openssl/java_client.openssl.tar dist/openssl/*

for f in dist/*/*
do
	gzip --rsyncable -c $f > $f.gz
done

exit 0;

rsync --stats --progress -a -e "ssh -p 3888" dist/tommath/*.gz mopar@69.65.42.216:/home/mopar/htdocs/moparscape.org/libs/

ls -lah dist/*

java -cp ../out/production/MoparScape4/ org.moparscape.res.ChecksumInfo $(ls dist/*/* | egrep -v "(tar|gz)")
# then update the CRCs in our program
sed -i "s/{.*}/{$(java -cp ../out/production/MoparScape4/ org.moparscape.res.ChecksumInfo -c $(ls dist/tommath/* | egrep -v "(tar|gz)") | sed -e 's/\(\/\|\\\|&\)/\\&/g')}/" ../src/org/moparscape/res/impl/BTDownloaderCRCs.java