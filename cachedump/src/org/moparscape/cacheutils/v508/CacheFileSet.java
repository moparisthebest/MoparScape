/**
 * Class:CacheFileSet
 * User: Silabsoft 
 * Date: Jul 9, 2009
 * Time: 12:25:23 AM
 */
package org.moparscape.cacheutils.v508;

import java.io.*;

public class CacheFileSet {

    private RandomAccessFile cacheData;
    private RandomAccessFile[] cacheIndex = new RandomAccessFile[27];
    private RandomAccessFile crcTable;
    private CacheFile[] cache = new CacheFile[256];

    public CacheFileSet(String d) throws IOException {
        try {
            cacheData = new RandomAccessFile(new FileOnDisk(new File(d + "main_file_cache.dat2"), "rw", 104857600L), 5200, 0);
            for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > -28; i_66_++) {
                cacheIndex[i_66_] = new RandomAccessFile(new FileOnDisk(new File(d + "main_file_cache.idx" + i_66_), "rw", 1048576L), 6000, 0);
                cache[i_66_] = new CacheFile(i_66_, cacheData, cacheIndex[i_66_], 1000000);
            }
            crcTable = new RandomAccessFile((new FileOnDisk(new File(d + "main_file_cache.idx255"), "rw", 1048576L)), 6000, 0);
            cache[255] = new CacheFile(255, cacheData, crcTable, 500000);

        } catch (Exception _ex) {
            _ex.printStackTrace();
        }
    }

    public byte[] read(int index, int id) {
        if (cache[index] == null)
            return null;
        return cache[index].read(id);
    }
}
