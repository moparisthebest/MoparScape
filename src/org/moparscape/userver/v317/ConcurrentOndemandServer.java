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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLConnection;

/**
 * Concurrent on demand server for use with 317 version client.
 */
public class ConcurrentOndemandServer extends Server {

    public static final String odsPath = "317/ondemand/";
    // 10 seems to be the correct number
    public static final int concurrentRequests = 10;

    public int[] requests = new int[concurrentRequests*2];

    public ConcurrentOndemandServer(String defaultLocation) {
        this(defaultLocation, 0);
    }

    public ConcurrentOndemandServer(String defaultLocation, int port) {
        super(defaultLocation, port);
    }

    public ConcurrentOndemandServer(String defaultLocation, String customLocation) {
        this(defaultLocation, 0, customLocation);
    }

    public ConcurrentOndemandServer(String defaultLocation, int port, String customLocation) {
        super(defaultLocation, port, customLocation);
    }

    public void handleConnection(Socket s) throws IOException {

        boolean identify = false;
        OutputStream out = s.getOutputStream();
        InputStream in = s.getInputStream();
        if (in == null)
            return;
        while (!s.isClosed()) {
            int dataType = 0;
            if (!identify)
                dataType = in.read();
            if (dataType == 15) {
                // System.out.println("new client connected to update server");
                for (int j = 0; j < 8; j++)
                    out.write(0);
                identify = true;
            } else {
                int id;

                for (int x = 0; x < concurrentRequests; ++x) {
                    dataType = in.read();
                    id = (in.read() << 8) + in.read();

                    int status = in.read();
                    // status of 10 means give priority to these files
                    // but since we serve them up in order of request
                    // just ignore it, for now at least
                    if (status == 10)
                        System.out.println("ods: status is 10!");
                    //long hash = (long) ((dataType << 16) + id);
                    requests[x] = dataType;
                    requests[x+concurrentRequests] = id;
                    //System.out.println(String.format("request%d: %d,%d hash:%d", x, dataType, id, (long) ((dataType << 16) + id)));
                }

                // serve the requests
                for (int x = 0; x < concurrentRequests; ++x) {

                    dataType = requests[x];
                    id = requests[x+concurrentRequests];

                    long hash = ((dataType << 16) + id);

                    URLConnection url = getHttpURLConnection(odsPath + hash);
                    // if url is null, custom and default cannot be reached, continue
                    if (url == null) {
                        System.out.println("no data for hash: " + hash);
                        continue;
                    }

                    int size = url.getContentLength();
                    // if size == -1 it doesn't exist
                    // however this cannot be counted on as a 404 will still send html
                    // System.out.println(size);
                    InputStream data = url.getInputStream();

                    byte[] ioBuffer = new byte[6];
                    ioBuffer[0] = (byte) dataType;
                    ioBuffer[1] = (byte) (id >> 8);
                    ioBuffer[2] = (byte) id;
                    ioBuffer[3] = (byte) (size >> 8);
                    ioBuffer[4] = (byte) size;
                    byte partCounter = 0;
                    ioBuffer[5] = partCounter++;
                    // write it the first time
                    // System.out.println("ods: write header: "+ioBuffer[5]);
                    out.write(ioBuffer);

                    // due to the nature of the if statement
                    // the byte buffer cannot exceed a length of 500
                    // originally 256
                    byte[] buffer = new byte[500];
                    int lenRead = 0;
                    int lenWritten = 0;
                    int toWrite = 0;
                    while ((lenRead = data.read(buffer)) >= 0)
                        if ((lenWritten + lenRead) <= 500) {
                            lenWritten += lenRead;
                            // System.out.println("ods: write lenRead: "+lenRead+" lenWritten: "+lenWritten);
                            out.write(buffer, 0, lenRead);
                            out.flush();
                            if (lenWritten == 500) {
                                lenWritten = 0;
                                // System.out.println("ods: write lenWritten == 500 header");
                                ioBuffer[5] = partCounter++;
                                // System.out.println("ods: write header: "+ioBuffer[5]);
                                out.write(ioBuffer);
                            }
                        } else {
                            toWrite = 500 - lenWritten;
                            // System.out.println("ods: write toWrite: "+toWrite+" lenWritten: "+lenWritten);
                            out.write(buffer, 0, toWrite);
                            lenRead -= toWrite;
                            //                System.out.println("ods: write else header");
                            ioBuffer[5] = partCounter++;
                            // System.out.println("ods: write header: "+ioBuffer[5]);
                            out.write(ioBuffer);
                            // System.out.println("ods: write toWrite: "+toWrite+" lenRead: "+lenRead);
                            out.write(buffer, toWrite, lenRead);
                            out.flush();
                            lenWritten = lenRead;
                        }
                    data.close();

                }

            }
        }
    }
}
