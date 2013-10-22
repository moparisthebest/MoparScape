package mudclient;

import java.applet.Applet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class link {

    public static final void addFile(String fileName, byte fileData[]) {
        link.fileName[currentFile] = fileName;
        link.fileData[currentFile] = fileData;
        currentFile++;
    }
    
    public static final boolean loadFile(String fileName) {
        try {
            File f = new File(Config.CONF_DIR, fileName);
            if(f.exists()) {
                FileInputStream fis = new FileInputStream(f);
                byte buf[] = new byte[fis.available()];
                fis.read(buf);
                addFile(fileName, buf);
                return true;
            }
            return false;
        } catch(IOException ioe) {
            ioe.printStackTrace();
            return false;
        }
    }

    public static final byte[] getFile(String fileName) {
        for(int i = 0; i < currentFile; i++)
            if(link.fileName[i].equals(fileName))
                return fileData[i];
        if(loadFile(fileName))
            return getFile(fileName);
        else
            return null;
    }

    public static final Socket getSocket(int port) {
        for(link.port = port; link.port != 0;)
            try {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

        return socket;
    }

    public static final void thread(Runnable runnable) {
        for(thread = runnable; thread != null;)
            try {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

    }

    public static final String getAddress(String ip) {
        for(iplookup = ip; iplookup != null;)
            try {
                Thread.sleep(100L);
            }
            catch(Exception _ex) { }

        return address;
    }

    public link() {
    }

    public static Applet gameApplet;
    public static int uid;
    static int port;
    static Socket socket;
    static Runnable thread = null;
    static String iplookup = null;
    static String address;
    static int currentFile;
    private static String fileName[] = new String[50];
    private static byte fileData[][] = new byte[50][];

}
