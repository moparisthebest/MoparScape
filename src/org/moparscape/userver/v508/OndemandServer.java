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

package org.moparscape.userver.v508;

import org.moparscape.userver.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URLConnection;

/**
 * On demand server for use with 508 version client.
 */
public class OndemandServer extends Server {

    public static final String odsPath = "508/%d%s/%d";
    public static final int clientVersion = 508;
    // some (crappy) filesystems can't handle more than this many files in any given folder, so we have to handle it (suffer)
    public static final int maxFilesInFolder = 33005;

    public byte[] buffer = new byte[1024];
    public int len;

    public OndemandServer(String defaultLocation) {
        this(defaultLocation, 0);
    }

    public OndemandServer(String defaultLocation, int port) {
        super(defaultLocation, port);
    }

    public OndemandServer(String defaultLocation, String customLocation) {
        this(defaultLocation, 0, customLocation);
    }

    public OndemandServer(String defaultLocation, int port, String customLocation) {
        super(defaultLocation, port, customLocation);
    }

    public void handleConnection(Socket s) throws IOException {
        try {
            //System.out.println("ods: new connection to update server");

            boolean identify = false;
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            DataInputStream in = new DataInputStream(s.getInputStream());
            //s.setSoTimeout(0);
            if (in == null)
                return;
            while (!s.isClosed()) {
                //System.out.println("in loop");
                byte dataType = 0;
                int version = 0;
                if (!identify) {
                    //s.setSoTimeout(100);
                    //System.out.println("HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    dataType = in.readByte();
                    //System.out.println("ANDNOW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    //s.setSoTimeout(0);
                    version = in.readInt();
                    //System.out.println("dataType:" + dataType + " version:" + version);
                }
                if (dataType == 15 && version == clientVersion) {
                    //System.out.println("new client connected to update server");
                    out.writeByte(0);
                    identify = true;
                    in.skip(4);
                } else {
                    int type = in.read();
                    //System.out.println("type:" + type);
                    //               if (type != 0 && type != 1 && type != 3)
                    //                   System.exit(-433);
                    //int hash = ((in.get()& 0xff) << 16) + ((in.get()& 0xff) << 8) + (in.get()& 0xff);
                    if (type == 0 || type == 1) {
                        //int index = in.read() & 0xff;
                        //int id = in.readShort();
                        int uid = (in.readUnsignedByte() << 16) + (in.readUnsignedByte() << 8) + in.readUnsignedByte();
                        int index = uid >> 16;
                        int id = uid & 0xFFFF;
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
                        //System.out.println(String.format(odsPath, index, id >= maxFilesInFolder ? "/a" : "", id));

                        URLConnection url = getHttpURLConnection(String.format(odsPath, index, id >= maxFilesInFolder ? "/a" : "", id));
                        // if url is null, custom and default cannot be reached, continue
                        if (url == null) {
                            // unless we want the update keys and may not be connected to the internet
                            // so we server them up if it is that which we are requesting
                            if (index == 255 && id == 255) {
                                System.out.println("UpdateServer: Update Keys do not exist on server, serving generic ones.");
                                int[] UPDATE_KEYS = {
                                        0xff, 0x00, 0xff, 0x00, 0x00, 0x00, 0x00, 0xd8,
                                        0x84, 0xa1, 0xa1, 0x2b, 0x00, 0x00, 0x00, 0xba,
                                        0x58, 0x64, 0xe8, 0x14, 0x00, 0x00, 0x00, 0x7b,
                                        0xcc, 0xa0, 0x7e, 0x23, 0x00, 0x00, 0x00, 0x48,
                                        0x20, 0x0e, 0xe3, 0x6e, 0x00, 0x00, 0x01, 0x88,
                                        0xec, 0x0d, 0x58, 0xed, 0x00, 0x00, 0x00, 0x71,
                                        0xb9, 0x4c, 0xc0, 0x50, 0x00, 0x00, 0x01, 0x8b,
                                        0x5b, 0x61, 0x79, 0x20, 0x00, 0x00, 0x00, 0x0c,
                                        0x0c, 0x69, 0xb1, 0xc8, 0x00, 0x00, 0x02, 0x31,
                                        0xc8, 0x56, 0x67, 0x52, 0x00, 0x00, 0x00, 0x69,
                                        0x78, 0x17, 0x7b, 0xe2, 0x00, 0x00, 0x00, 0xc3,
                                        0x29, 0x76, 0x27, 0x6a, 0x00, 0x00, 0x00, 0x05,
                                        0x44, 0xe7, 0x75, 0xcb, 0x00, 0x00, 0x00, 0x08,
                                        0x7d, 0x21, 0x80, 0xd5, 0x00, 0x00, 0x01, 0x58,
                                        0xeb, 0x7d, 0x49, 0x8e, 0x00, 0x00, 0x00, 0x0c,
                                        0xf4, 0xdf, 0xd6, 0x4d, 0x00, 0x00, 0x00, 0x18,
                                        0xec, 0x33, 0x31, 0x7e, 0x00, 0x00, 0x00, 0x01,
                                        0xf7, 0x7a, 0x09, 0xe3, 0x00, 0x00, 0x00, 0xd7,
                                        0xe6, 0xa7, 0xa5, 0x18, 0x00, 0x00, 0x00, 0x45,
                                        0xb5, 0x0a, 0xe0, 0x64, 0x00, 0x00, 0x00, 0x75,
                                        0xba, 0xf2, 0xa2, 0xb9, 0x00, 0x00, 0x00, 0x5f,
                                        0x31, 0xff, 0xfd, 0x16, 0x00, 0x00, 0x01, 0x48,
                                        0x03, 0xf5, 0x55, 0xab, 0x00, 0x00, 0x00, 0x1e,
                                        0x85, 0x03, 0x5e, 0xa7, 0x00, 0x00, 0x00, 0x23,
                                        0x4e, 0x81, 0xae, 0x7d, 0x00, 0x00, 0x00, 0x18,
                                        0x67, 0x07, 0x33, 0xe3, 0x00, 0x00, 0x00, 0x14,
                                        0xab, 0x81, 0x05, 0xac, 0x00, 0x00, 0x00, 0x03,
                                        0x24, 0x75, 0x85, 0x14, 0x00, 0x00, 0x00, 0x36
                                };
                                for (int i : UPDATE_KEYS)
                                    out.writeByte(i);
                                out.flush();
                            }
                            continue;
                        }

                        //int size = url.getContentLength();
                        // if size == -1 it doesn't exist
                        // however this cannot be counted on as a 404 will still send html
                        //System.out.println("size: " + size);
                        //System.out.println("opening stream");
                        InputStream data1 = url.getInputStream();
                        //System.out.println("InputStream Open!");

                        // buffer and len are static
                        while ((len = data1.read(buffer)) >= 0) {
                            //System.out.println("len read:"+len);
                            out.write(buffer, 0, len);
                        }
                        //System.out.println("Data Written! len:"+len);
                        out.flush();
                        data1.close();
                    }

                }
            }
        } catch (IOException e) {
            // since we know there is a problem with this, I don't want it clogging up debug, so we are going to ignore it
            // if we wanted to rethrow it to handleException, we could do so like this:
            
            //throw e;
        }
    }
}
