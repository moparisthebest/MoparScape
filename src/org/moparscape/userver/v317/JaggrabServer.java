package org.moparscape.userver.v317;

import org.moparscape.userver.Server;

import java.io.*;
import java.net.Socket;
import java.net.URLConnection;
import java.util.StringTokenizer;

/**
 * Class:JaggrabServer
 * User: Silabsoft
 * Date: Jul 6, 2009
 * Time: 12:37:28 PM
 */
public class JaggrabServer extends Server {

    public static final String jagPath = "317/jag/";

    public JaggrabServer(String defaultLocation) {
        this(defaultLocation, 0);
    }

    public JaggrabServer(String defaultLocation, int port) {
        super(defaultLocation, port);
    }

    public JaggrabServer(String defaultLocation, String customLocation) {
        this(defaultLocation, 0, customLocation);
    }

    public JaggrabServer(String defaultLocation, int port, String customLocation) {
        super(defaultLocation, port, customLocation);
    }

    // TODO: if no internet connection, use a default CRC so it may continue
    public void handleConnection(Socket s) {
        try {
            InputStream is = s.getInputStream();
            if (is == null)
                return;
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringTokenizer st = new StringTokenizer(in.readLine());
            if ((st.hasMoreTokens()) && (st.nextToken().equals("JAGGRAB")))
                if (st.hasMoreTokens()) {
                    String request = st.nextToken();
                    // System.out.println("jag request: " + request);
                    if (request.startsWith("/title"))
                        servefile(s, "title");
                    else if (request.startsWith("/crc"))
                        servefile(s, "crc-317");
                    else if (request.startsWith("/config"))
                        servefile(s, "config");
                    else if (request.startsWith("/interface"))
                        servefile(s, "interface");
                    else if (request.startsWith("/media"))
                        servefile(s, "media");
                    else if (request.startsWith("/textures"))
                        servefile(s, "textures");
                    else if (request.startsWith("/wordenc"))
                        servefile(s, "wordenc");
                    else if (request.startsWith("/sounds"))
                        servefile(s, "sounds");
                    else if (request.startsWith("/versionlist"))
                        servefile(s, "versionlist");
                    else {
                        System.out.println("BAD request");
                        in.close();
                        s.close();
                        return;
                    }
                } else {
                    System.out.println("BAD request");
                    in.close();
                    s.close();
                    return;
                }
            else {
                System.out.println("BAD request");
                in.close();
                s.close();
                return;
            }
            in.close();
            s.close();
        } catch (IOException e) {
            handleException(e);
            try {
                s.close();
            } catch (Throwable t) {
            }
        }
    }

    public void servefile(Socket connection, String file) throws IOException {
        OutputStream out = connection.getOutputStream();
        //InputStream in = new URL(customLocation + "jag/" + file).openStream();
        URLConnection url = getHttpURLConnection(jagPath + file);
        // if url is null, custom and default cannot be reached, return
        if (url == null) {
            out.close();
            return;
        }

        InputStream in = url.getInputStream();

        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        out.flush();
        in.close();
        out.close();
    }
}
