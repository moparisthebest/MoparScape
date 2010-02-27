import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk
{
    private long position;
    private long size;
    private RandomAccessFile raw_file;
    private File fs_file;

    public final long getLength() throws IOException
    {
        return raw_file.length();
    }

    public final File getFile()
    {
        return fs_file;
    }

    public final void seekTo(long l) throws IOException
    {
        raw_file.seek(l);
        position = l;
    }

    public final void close() throws IOException
    {
        if (raw_file != null)
        {
            raw_file.close();
            raw_file = null;
        }
    }

    public final void write(int i, byte[] is, int len) throws IOException
    {
        if ((long) len + position > size)
        {
            raw_file.seek(size + 1L);
            raw_file.write(1);
            throw new EOFException();
        }
        raw_file.write(is, i, len);
        position += (long) len;
    }

    public final int read(int len, int off, byte[] data) throws IOException
    {
        int amt = raw_file.read(data, off, len);
        position += (long) amt;
        return amt;
    }

    FileOnDisk(File file, String type, long l) throws IOException
    {
        if (l == -1L)
            l = 9223372036854775807L;
        if (file.length() >= l)
            file.delete();
        raw_file = new RandomAccessFile(file, type);
        fs_file = file;
        size = l;
        position = 0L;
        int i = raw_file.read();
        if (i != -1 && !type.equals("r"))
        {
            raw_file.seek(0L);
            raw_file.write(i);
        }
        raw_file.seek(0L);
    }

    protected final void finalize() throws Throwable
    {
        if (raw_file != null)
        {
            System.out.println("Warning! fileondisk " + fs_file + " not closed correctly using close(). Auto-closing instead. ");
            close();
        }
    }
}
