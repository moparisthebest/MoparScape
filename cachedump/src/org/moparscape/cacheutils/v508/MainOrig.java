package org.moparscape.cacheutils.v508;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MainOrig {

    public static final String folderName = "/home/mopar/htdocs/508/";
    public static PrintStream log;

    public MainOrig() {
        try {
            CacheFileSet cache = new CacheFileSet("./cachedump/complete508/");
            File dump = new File(folderName);

            if (dump.exists())
                if (!deleteDir(dump))
                    System.out.println("can't delete directory");
            if (!dump.mkdir()) {
                System.out.println("can't create directory: " + dump.getPath());
                return;
            }

            log = new PrintStream(new FileOutputStream(folderName + "dumplog.txt"));

            dumpUpdatekeys();

            // client requests the following, but I don't have them... ?
            // testDump(cache, 0, 5632);
            // testDump(cache, 0, 2560);

            for (int index = 0; index <= 255 && index >= 0; ++index)
                for (short id = 0; id <= Short.MAX_VALUE && id >= 0; ++id)
                    dumpFile(cache, index, id);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void testDump(CacheFileSet cache, int index, int id) throws Exception {
        boolean success = !dumpFile(cache, index, (short) id);
        println("testDump: " + index + "," + id + " success: " + success);
    }

    public boolean dumpFile(CacheFileSet cache, int index, short id) throws Exception {
        byte[] data = cache.read(index, id);

        if (data == null)
            // println("no data for: " + index + "," + id);
            return true;

        println("data for: " + index + "," + id);

        long hash = (long) ((index << 16) + id);
        File file = new File(folderName + hash);
        if (file.exists()) {
            println("oh shit, collision!!!!!!");
            System.exit(1);
        }
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        out.writeByte(index);
        out.writeShort(id);

        int c = 3;
        for (int i = 0; i < data.length; i++) {

            if (c == 512) {
                out.writeByte(255);
                c = 1;
            }
            out.writeByte(data[i]);

            c++;
        }

        out.close();

        return false;
    }

    public void dumpUpdatekeys() throws Exception {
        int index = 255;
        short id = 255;
        long hash = (long) ((index << 16) + id);
        File file = new File(folderName + hash);
        if (file.exists()) {
            println("oh shit, collision (with update keys)!!!!!!");
            System.exit(1);
        }
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));

        int[] UPDATE_KEYS = {
            0xff, 0x00, 0xff, 0x00, 0x00, 0x00, 0x00, 0xd8,
            0x84, 0xa1, 0xa1, 0x2b, 0x00, 0x00, 0x00, 0xba,
            0x58, 0x64, 0xe8, 0x14, 0x00, 0x00, 0x00, 0x7b,
            0xcc, 0xa0, 0x7e, 0x23, 0x00, 0x00, 0x00, 0x48,
            0x20, 0x0e, 0xe3, 0x6e, 0x00, 0x00, 0x01, 0x88,
            0xec, 0x0d, 0x58, 0xed, 0x00, 0x00, 0x00, 0x71,
            0xb9, 0x4c, 0xc0, 0x50, 0x00, 0x00, 0x01, 0x8b,
            0x5b, 0x61, 0x79, 0x20, 0x00, 0x00, 0x00, 0x0c,
            0x0c, 0x69, 0xb1, 0xc8, 0x00, 0x00, 0x02, 0x31,
            0xc8, 0x56, 0x67, 0x52, 0x00, 0x00, 0x00, 0x69,
            0x78, 0x17, 0x7b, 0xe2, 0x00, 0x00, 0x00, 0xc3,
            0x29, 0x76, 0x27, 0x6a, 0x00, 0x00, 0x00, 0x05,
            0x44, 0xe7, 0x75, 0xcb, 0x00, 0x00, 0x00, 0x08,
            0x7d, 0x21, 0x80, 0xd5, 0x00, 0x00, 0x01, 0x58,
            0xeb, 0x7d, 0x49, 0x8e, 0x00, 0x00, 0x00, 0x0c,
            0xf4, 0xdf, 0xd6, 0x4d, 0x00, 0x00, 0x00, 0x18,
            0xec, 0x33, 0x31, 0x7e, 0x00, 0x00, 0x00, 0x01,
            0xf7, 0x7a, 0x09, 0xe3, 0x00, 0x00, 0x00, 0xd7,
            0xe6, 0xa7, 0xa5, 0x18, 0x00, 0x00, 0x00, 0x45,
            0xb5, 0x0a, 0xe0, 0x64, 0x00, 0x00, 0x00, 0x75,
            0xba, 0xf2, 0xa2, 0xb9, 0x00, 0x00, 0x00, 0x5f,
            0x31, 0xff, 0xfd, 0x16, 0x00, 0x00, 0x01, 0x48,
            0x03, 0xf5, 0x55, 0xab, 0x00, 0x00, 0x00, 0x1e,
            0x85, 0x03, 0x5e, 0xa7, 0x00, 0x00, 0x00, 0x23,
            0x4e, 0x81, 0xae, 0x7d, 0x00, 0x00, 0x00, 0x18,
            0x67, 0x07, 0x33, 0xe3, 0x00, 0x00, 0x00, 0x14,
            0xab, 0x81, 0x05, 0xac, 0x00, 0x00, 0x00, 0x03,
            0x24, 0x75, 0x85, 0x14, 0x00, 0x00, 0x00, 0x36
        };

        for (int i : UPDATE_KEYS)
            out.writeByte(i);

        out.close();
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
        new MainOrig();
        println("execution time: " + ((System.currentTimeMillis() - startTime) / 1000) + "s");
        log.close();

    }
}