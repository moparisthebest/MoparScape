
import java.net.ServerSocket;
import java.net.URL;
import java.net.Socket;
import java.io.*;
import java.util.StringTokenizer;
import java.net.URLConnection;
import java.net.HttpURLConnection;

/**
 * Class:OndemandServer
 * User: Silabsoft
 * Date: Jul 6, 2009
 * Time: 2:22:11 PM
 */
public class OndemandServerTest {

    public static void main(String[] args) throws Exception {

        boolean onebyte = false;

        String outFile = onebyte ? "./testwriteone.txt" : "./testwritemy.txt";

        OutputStream out = new FileOutputStream(outFile);
        String urlStr = "file:///home/mopar/projects/moparscapes/MoparScape4/testfile.txt";
        System.out.println("urlStr " + urlStr);
        URLConnection url = new URL(urlStr).openConnection();
        int size = url.getContentLength();
        System.out.println(size);
        InputStream data = url.getInputStream();

        int dataType = 0, id = 0;
        byte[] ioBuffer = new byte[6];
        ioBuffer[0] = (byte) dataType;
        ioBuffer[1] = (byte) (id >> 8);
        ioBuffer[2] = (byte) id;
        ioBuffer[3] = (byte) (size >> 8);
        ioBuffer[4] = (byte) size;
        byte partCounter = 0;
        ioBuffer[5] = partCounter++;
        // write it the first time
        System.out.println("ods: write header: "+ioBuffer[5]);
        //out.write(ioBuffer);

        if (onebyte) {
            byte[] buffer = new byte[1];
            int lenRead = 0;
            int lenWritten = 0;
            while ((lenRead = data.read(buffer)) >= 0) {
                lenWritten += lenRead;
                out.write(buffer, 0, lenRead);
                if (lenWritten == 500) {
                    lenWritten = 0;
                    ioBuffer[5] = partCounter++;
                    System.out.println("ods: write header: "+ioBuffer[5]);
                    out.write(ioBuffer);
                }
            }
        } else {

            // due to the nature of the if statement
            // the byte buffer cannot exceed a length of 500
            // originally 256
            byte[] buffer = new byte[900];
            int lenRead = 0;
            int lenWritten = 0;
            int totalWritten = 0;
            while ((lenRead = data.read(buffer)) >= 0) {
                if ((lenWritten + lenRead) <= 500) {
                    lenWritten += lenRead;
//                            System.out.println("ods: write lenRead: "+lenRead+" lenWritten: "+lenWritten);
                    totalWritten += lenRead;
                    out.write(buffer, 0, lenRead);
                    out.flush();
                    if (lenWritten == 500) {
                        lenWritten = 0;
                        System.out.println("ods: write lenWritten == 500 header");
                        ioBuffer[5] = partCounter++;
                        System.out.println("ods: write header: "+ioBuffer[5]);
                        out.write(ioBuffer);
                    }
                } else {
                    int toWrite = 500 - lenWritten;
                    System.out.println("ods: write toWrite: "+toWrite+" lenWritten: "+lenWritten);
                    totalWritten += toWrite;
                    out.write(buffer, 0, toWrite);
                    lenRead -= toWrite;
//                            System.out.println("ods: write else header");
                    ioBuffer[5] = partCounter++;
                    System.out.println("ods: write header: "+ioBuffer[5]);
                    out.write(ioBuffer);
                    System.out.println("ods: write toWrite: "+toWrite+" lenRead: "+lenRead);
                    totalWritten += lenRead;
                    out.write(buffer, toWrite, lenRead);
                    out.flush();
                    lenWritten = lenRead;
                }
            }

            System.out.println("totalWritten: " + totalWritten);
        }

    }

}
