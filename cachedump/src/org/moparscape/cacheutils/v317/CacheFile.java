package org.moparscape.cacheutils.v317;


import java.io.RandomAccessFile;

public class CacheFile {

    public CacheFile(byte abyte0[], RandomAccessFile randomaccessfile) {
        DataFile = randomaccessfile;
        NumberOfFiles = abyte0.length / 6;
        FileStart = new int[NumberOfFiles];
        FileLength = new int[NumberOfFiles];
        ByteStream bytestream = new ByteStream(abyte0);
        for (int i = 0; i < NumberOfFiles; i++) {
            FileLength[i] = bytestream.read3Bytes();
            FileStart[i] = bytestream.read3Bytes();
        }

    }

    private byte[] ReadBlock(int i) {
        try {
            byte abyte0[];
            abyte0 = new byte[520];
            DataFile.seek(i * 520);
            DataFile.readFully(abyte0);
            return abyte0;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public ByteStream GetFile(int i) {
        if (FileStart[i] <= 0)
            return null;
        byte abyte0[] = new byte[FileLength[i]];
        int j = FileStart[i];
        int k = 0;
        do {
            byte abyte1[] = ReadBlock(j);
            if (abyte1 == null)
                return null;
            j = ((abyte1[4] & 0xff) << 16) + ((abyte1[5] & 0xff) << 8) + (abyte1[6] & 0xff);
            if (FileLength[i] - k - 8 > 512)
                System.arraycopy(abyte1, 8, abyte0, k, 512);
            else {
                System.arraycopy(abyte1, 8, abyte0, k, FileLength[i] - k - 8);
                return new ByteStream(abyte0);
            }
            k += 512;
        } while (true);
    }
    public RandomAccessFile DataFile;
    public int NumberOfFiles;
    public int FileLength[];
    public int FileStart[];
}
 
