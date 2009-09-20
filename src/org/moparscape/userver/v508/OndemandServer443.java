package org.moparscape.userver.v508;

import org.moparscape.userver.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URLConnection;

/**
 * Class:OndemandServer
 * User: Silabsoft
 * Date: Jul 6, 2009
 * Time: 2:22:11 PM
 */
public class OndemandServer443 extends Server {

    public static final String odsPath = "508/%d/%d";
    public static final int clientVersion = 508;

    public byte[] buffer = new byte[1024];
    public int len;

    public OndemandServer443(String defaultLocation) {
        this(defaultLocation, 0);
    }

    public OndemandServer443(String defaultLocation, int port) {
        super(defaultLocation, port);
    }

    public OndemandServer443(String defaultLocation, String customLocation) {
        this(defaultLocation, 0, customLocation);
    }

    public OndemandServer443(String defaultLocation, int port, String customLocation) {
        super(defaultLocation, port, customLocation);
    }

    public void handleConnection(Socket s) throws IOException {
        //System.out.println("ods: new connection to update server");

        // this is messed up, so we will read a byte, it will throw an exception, andf we will start over.
        s.getInputStream().skip(4);
        if(true)
            return;

        boolean identify = false;
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream());

        //s.setSoTimeout(0);
        if (in == null)
            return;
        while (!s.isClosed()) {
            //System.out.println("in loop");
            byte dataType = 15;
            int version = clientVersion;
//            if (!identify) {
//                //s.setSoTimeout(100);      //asus g1s bios 205
//                //System.out.println("HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                dataType = in.readByte();
//                //System.out.println("ANDNOW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                //s.setSoTimeout(0);
//                version = in.readInt();
//                //System.out.println("dataType:" + dataType + " version:" + version);
//            }
//            if (!identify && dataType == 15 && version == clientVersion) {
//                System.out.println("new client connected to update server");
//                out.writeByte(0);
//                identify = true;
//                in.skip(4);
//            } else {
            byte[] fromserv = new byte[1024];
            out.writeByte(0);
            int numread = in.read(fromserv);
            System.out.println("numread:"+numread);
                int type = in.read();
                System.out.println("type:" + type);
                if (type != 0 && type != 1 && type != 3)
                    System.exit(-433);
                //int hash = ((in.get()& 0xff) << 16) + ((in.get()& 0xff) << 8) + (in.get()& 0xff);
                if (type == 0 || type == 1) {
                    int index = in.read() & 0xff;
                    int id = in.readShort();
                    //System.out.println("index:" + index + " id:" + id);
//                    if (index == 255 && id == 255) {
//                        System.out.println("writing out update keys");
//                        for (int i : UPDATE_KEYS)
//                            out.writeByte(i);
//                        out.flush();
//                        continue;
//                    }

//                    byte[] data = cache.read(index, id);
//                    out.writeByte(index);
//                    out.writeShort(id);
//
//                    if (data == null) {
//                        System.out.println("oh shit");
//                        return;
//                    }
//                    int c = 3;
//                    for (int i = 0; i < data.length; i++) {
//
//                        if (c == 512) {
//                            out.writeByte(255);
//                            c = 1;
//                        }
//                        out.writeByte(data[i]);
//
//                        c++;
//                    }
//                    out.flush();
//
//                    if(true)
//                        continue;

                    //long hash = (long) ((index << 16) + id);
                    //System.out.println("request " + hash);
                    //System.out.println(String.format(odsPath, index, id));

                    URLConnection url = getHttpURLConnection(String.format(odsPath, index, id));
                    // if url is null, custom and default cannot be reached, continue
                    if (url == null)
                        continue;

                    //int size = url.getContentLength();
                    // if size == -1 it doesn't exist
                    // however this cannot be counted on as a 404 will still send html
                    //System.out.println("size: " + size);
                    InputStream data1 = url.getInputStream();

                    // buffer and len are static
                    while ((len = data1.read(buffer)) >= 0)
                        out.write(buffer, 0, len);
                    out.flush();
                    data1.close();
                }

//            }
        }
    }
}