/*
 * Copyright (C) 2010  moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com , I read it but don't usually respond.
 */

package org.moparscape.userver.v317;

import org.moparscape.userver.Server;

import java.io.*;
import java.net.Socket;
import java.net.URLConnection;
import java.util.StringTokenizer;

/**
 * Jaggrab server for client 317.
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
            // unless we want the CRC and may not be connected to the internet
            // so we server it up if it is that which we are requesting
            if (file.equals("crc-317")) {
                System.out.println("UpdateServer: CRC does not exist on server, serving generic one.");
                
                byte[] crc = new byte[]{0, 0, 0, 0, -107, 9, -20, -27, 45, -32, 105, 81, -7, 104, -39,
                                        107, -28, -60, -76, -52, -73, -79, 92, -7, 105, 102, 28,
                                       -102, -20, -93, 86, 90, 61, 51, 96, 30, -16, 30, 75, -30};
                out.write(crc);
                out.flush();
            }
            out.close();
            return;
        }

        InputStream in = url.getInputStream();

/*      // this is a crude way to output the crc byte array, leaving it here in case its needed it later
        if (file.startsWith("crc")) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) >= 0)
                baos.write(buffer, 0, len);
            baos.flush();
            in.close();
            out.close();
            for(byte b : baos.toByteArray())
                System.out.print(b+", ");
            System.exit(0);
        }
*/
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        out.flush();
        in.close();
        out.close();
    }
}
