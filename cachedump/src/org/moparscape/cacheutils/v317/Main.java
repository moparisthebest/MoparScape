package org.moparscape.cacheutils.v317;

import java.io.*;

public class Main {

    public static final String folderName = "/home/mopar/htdocs/317/ondemand/";
    public static final String cacheToDumpFolder = "./cachedump/complete317/";
    //public static final String cacheToDumpFolder = "/home/mopar/.moparscape/cache317/";
    public static PrintStream log;

    public Main() {
        try {
            RandomAccessFile cache_dat = new RandomAccessFile(cacheToDumpFolder + "main_file_cache.dat", "rw");
            int numCacheIndex = 5;
            RandomAccessFile[] cache_idx = new RandomAccessFile[numCacheIndex];
            CacheIndex[] cacheIndexes = new CacheIndex[numCacheIndex];
            for (int j = 0; j < numCacheIndex; j++) {

                cache_idx[j] = new RandomAccessFile(cacheToDumpFolder + "main_file_cache.idx" + j, "rw");
                cacheIndexes[j] = new CacheIndex(cache_dat, cache_idx[j], j + 1);

            }

            File dump = new File(folderName);
            if (dump.exists())
                if (!deleteDir(dump))
                    System.out.println("can't delete directory");
            if (!dump.mkdir()) {
                System.out.println("can't create directory: " + dump.getPath());
                return;
            }

            log = new PrintStream(new FileOutputStream(folderName + "dumplog.txt"));

            for (int index = 0; index < numCacheIndex; index++) {
                for (int id = 0; id < cacheIndexes[index].fileCount(); id++) {
                    try {

                        byte[] data = cacheIndexes[index].read(id);

                        if (data == null) {
                            println("no data for: " + index + "," + id);
                            //continue;
                            data = new byte[]{0};
                        } else {
                            println("data for: " + index + "," + id);
                        }

                        long hash = (((cacheIndexes[index].indexID - 1) << 16) + id);
                        File file = new File(folderName + hash);
                        if (file.exists()) {
                            println("oh shit, collision!!!!!!");
                            return;
                        }
                        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
                        out.write(data);


                        out.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success)
                    return false;
            }
        }

        // The directory is now empty so delete it
        return dir.delete();
    }

    public static void println(String s) throws Exception {
        //System.out.println(s);
        log.println(s);
    }

    public static void main(String args[]) throws Exception {
        long startTime = System.currentTimeMillis();
        new Main();
        println("execution time: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        log.close();

    }
}
