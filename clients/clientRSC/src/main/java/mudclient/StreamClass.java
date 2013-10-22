package mudclient;

import java.io.*;
import java.net.Socket;

public class StreamClass extends PacketConstruction
    implements Runnable {

    public StreamClass(Socket socket, GameApplet a1)
        throws IOException {
        socketClosing = false;
        socketClosed = true;
        this.socket = socket;
        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();
        socketClosed = false;
        a1.startThread(this);
    }

    public void closeStream() {
        super.closeStream();
        socketClosing = true;
        try {
            if(inputStream != null)
                inputStream.close();
            if(outputStream != null)
                outputStream.close();
            if(socket != null)
                socket.close();
        }
        catch(IOException _ex) {
            System.out.println("Error closing stream");
        }
        socketClosed = true;
        synchronized(this) {
            notify();
        }
        buffer = null;
    }

    public int read()
        throws IOException {
        if(socketClosing)
            return 0;
        else
            return inputStream.read();
    }

    public int available()
        throws IOException {
        if(socketClosing)
            return 0;
        else
            return inputStream.available();
    }

    public void readInputStream(int arg0, int arg1, byte arg2[])
        throws IOException {
        if(socketClosing)
            return;
        int i = 0;
        int j;
        for(; i < arg0; i += j)
            if((j = inputStream.read(arg2, i + arg1, arg0 - i)) <= 0)
                throw new IOException("EOF");

    }

    public void writeToBuffer(byte arg0[], int arg1, int arg2)
        throws IOException {
        if(socketClosing)
            return;
        if(buffer == null)
            buffer = new byte[5000];
        synchronized(this) {
            for(int i = 0; i < arg2; i++) {
                buffer[offset] = arg0[i + arg1];
                offset = (offset + 1) % 5000;
                if(offset == (dataWritten + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            notify();
        }
    }

    public void run() {
        while(!socketClosed)  {
            int i;
            int j;
            synchronized(this) {
                if(offset == dataWritten)
                    try {
                        wait();
                    }
                    catch(InterruptedException _ex) { }
                if(socketClosed)
                    return;
                j = dataWritten;
                if(offset >= dataWritten)
                    i = offset - dataWritten;
                else
                    i = 5000 - dataWritten;
            }
            if(i > 0) {
                try {
                    outputStream.write(buffer, j, i);
                }
                catch(IOException ioexception) {
                    super.error = true;
                    super.errorText = "Twriter:" + ioexception;
                }
                dataWritten = (dataWritten + i) % 5000;
                try {
                    if(offset == dataWritten)
                        outputStream.flush();
                }
                catch(IOException ioexception1) {
                    super.error = true;
                    super.errorText = "Twriter:" + ioexception1;
                }
            }
        }
    }

    private InputStream inputStream;
    private OutputStream outputStream;
    private Socket socket;
    private boolean socketClosing;
    private byte buffer[];
    private int dataWritten;
    private int offset;
    private boolean socketClosed;
}
