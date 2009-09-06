/**
 * Class:Test
 * User: Silabsoft 
 * Date: Jul 9, 2009
 * Time: 12:29:38 AM
 */
package org.moparscape.cacheutils.v508;

import java.io.File;
import java.io.FileOutputStream;

public class Test {

    public Test() {
        try {
            CacheFileSet cache = new CacheFileSet("/home/mopar/projects/moparscapes/userver508/cache508/rs3/");
            File dump = new File("./dump508");
            if (dump.exists())
                if (!deleteDir(dump))
                    System.out.println("can't delete directory");
            if (!dump.mkdir()) {
                System.out.println("can't create directory: " + dump.getPath());
                return;
            }

            for (int index = 0; index <= 255 && index >= 0; ++index)
                for (short id = 0; id <= Short.MAX_VALUE && id >= 0; ++id) {

                    byte[] data = cache.read(index, id);

                    if (data == null) {
                        System.out.println("no data for: " + index + "," + id);
                        id = Short.MAX_VALUE;
                        continue;
                    }

                    //System.out.println("data for: " + index + "," + id);

                    long hash = (long) ((index << 16) + id);
                    File file = new File("./dump508/" + hash);
                    if (file.exists()) {
                        System.out.println("oh shit, collision!!!!!!");
                        return;
                    }
                    FileOutputStream fos = new FileOutputStream(file);
                    fos.write(data);
                    fos.close();
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

    public static void main(String args[]) {
        new Test();
    }
}
