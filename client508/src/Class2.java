/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class2 {
    public long aLong69;
    public long aLong70;
    public RandomAccessFile aRandomAccessFile71;
    public File aFile72;

    public long method172(int i) throws IOException {
        if (i != -1)
            aFile72 = null;
        return aRandomAccessFile71.length();
    }

    public File method173(int i) {
        if (i != 0)
            aLong69 = 11L;
        return aFile72;
    }

    public void method174(boolean bool, long l) throws IOException {
        if (bool != false)
            method173(46);
        aRandomAccessFile71.seek(l);
        aLong69 = l;
    }

    public void method175(int i) throws IOException {
        if (i != -8143)
            aRandomAccessFile71 = null;
        if (aRandomAccessFile71 != null) {
            aRandomAccessFile71.close();
            aRandomAccessFile71 = null;
        }
    }

    public void method176(int i, byte[] is, int i_0_, int i_1_)
            throws IOException {
        if (i_0_ == 18405) {
            if ((long) i_1_ + aLong69 > aLong70) {
                aRandomAccessFile71.seek(aLong70 + 1L);
                aRandomAccessFile71.write(1);
                throw new EOFException();
            }
            aRandomAccessFile71.write(is, i, i_1_);
            aLong69 += (long) i_1_;
        }
    }

    public int method177(int i, int i_2_, int i_3_, byte[] is)
            throws IOException {
        int i_4_ = aRandomAccessFile71.read(is, i_3_, i);
        if (i_4_ > i_2_)
            aLong69 += (long) i_4_;
        return i_4_;
    }

    public Class2(File file, String string, long l) throws IOException {
        if (l == -1L)
            l = 9223372036854775807L;
        if ((file.length() ^ 0xffffffffffffffffL) <= (l ^ 0xffffffffffffffffL))
            file.delete();
        aRandomAccessFile71 = new RandomAccessFile(file, string);
        aFile72 = file;
        aLong70 = l;
        aLong69 = 0L;
        int i = aRandomAccessFile71.read();
        if (i != -1 && !string.equals("r")) {
            aRandomAccessFile71.seek(0L);
            aRandomAccessFile71.write(i);
        }
        aRandomAccessFile71.seek(0L);
    }

    public void finalize() throws Throwable {
        if (aRandomAccessFile71 != null) {
            System.out.println
                    ("Warning! fileondisk " + aFile72
                            + " not closed correctly using close(). Auto-closing instead. ");
            method175(-8143);
        }
    }
}
