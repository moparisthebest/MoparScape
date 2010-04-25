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

package org.moparscape.cacheutils.v317;

/**
 * Created by Silabsoft
 * Date: Sep 14, 2008
 * Time: 11:05:10 AM
 */
import java.io.*;

public class CacheIndex {

    public CacheIndex(RandomAccessFile randomaccessfile, RandomAccessFile randomaccessfile1, int j) {
        indexID = j;
        dataFile = randomaccessfile;
        indexFile = randomaccessfile1;
    }

    public synchronized byte[] read(int i) {
        try {
            seekTo(indexFile, i * 6);
            int l;
            for (int j = 0; j < 6; j += l) {
                l = indexFile.read(buffer, j, 6 - j);
                if (l == -1)
                    return null;
            }

            int fileSize = ((buffer[0] & 0xff) << 16) + ((buffer[1] & 0xff) << 8) + (buffer[2] & 0xff);
            int offset = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);
            if (fileSize < 0 || fileSize > 0x7a120)
                return null;
            if (offset <= 0 || (long) offset > dataFile.length() / 520L)
                return null;
            byte data[] = new byte[fileSize];
            int readBytes = 0;
            for (int l1 = 0; readBytes < fileSize; l1++) {
                if (offset == 0)
                    return null;
                seekTo(dataFile, offset * 520);
                int k = 0;
                int left = fileSize - readBytes;
                if (left > 512)
                    left = 512;
                int j2;
                for (; k < left + 8; k += j2) {
                    j2 = dataFile.read(buffer, k, (left + 8) - k);
                    if (j2 == -1)
                        return null;
                }
                //Start of chunk header
                int fileNumber = ((buffer[0] & 0xff) << 8) + (buffer[1] & 0xff);
                int bufferChunkNumber = ((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff);
                int bufferChunkHash = ((buffer[4] & 0xff) << 16) + ((buffer[5] & 0xff) << 8) + (buffer[6] & 0xff);
                int indexNumber = buffer[7] & 0xff;
                //end of chunk header
                if (fileNumber != i || bufferChunkNumber != l1 || indexNumber != indexID)
                    return null;
                if (bufferChunkHash < 0 || (long) bufferChunkHash > dataFile.length() / 520L)
                    return null;
                for (int k3 = 0; k3 < left; k3++)
                    data[readBytes++] = buffer[k3 + 8];

                offset = bufferChunkHash;
            }

            return data;
        }
        catch (IOException _ex) {
            return null;
        }
    }

   public synchronized boolean write(int i, byte abyte0[], int j)
    {
        boolean flag = method235(true, j, i, abyte0);
        if(!flag)
            flag = method235(false, j, i, abyte0);
        return flag;
    }

    private synchronized boolean method235(boolean flag, int j, int k, byte abyte0[])
    {
        try
        {
            int l;
            if(flag)
            {
                seekTo(indexFile, j * 6);
                int k1;
                for(int i1 = 0; i1 < 6; i1 += k1)
                {
                    k1 = indexFile.read(buffer, i1, 6 - i1);
                    if(k1 == -1)
                        return false;
                }

                l = ((buffer[3] & 0xff) << 16) + ((buffer[4] & 0xff) << 8) + (buffer[5] & 0xff);
                if(l <= 0 || (long)l > dataFile.length() / 520L)
                    return false;
            } else
            {
                l = (int)((dataFile.length() + 519L) / 520L);
                if(l == 0)
                    l = 1;
            }
            buffer[0] = (byte)(k >> 16);
            buffer[1] = (byte)(k >> 8);
            buffer[2] = (byte)k;
            buffer[3] = (byte)(l >> 16);
            buffer[4] = (byte)(l >> 8);
            buffer[5] = (byte)l;
            seekTo(indexFile, j * 6);
            indexFile.write(buffer, 0, 6);
            int j1 = 0;
            for(int l1 = 0; j1 < k; l1++)
            {
                int i2 = 0;
                if(flag)
                {
                    seekTo(dataFile, l * 520);
                    int j2;
                    int l2;
                    for(j2 = 0; j2 < 8; j2 += l2)
                    {
                        l2 = dataFile.read(buffer, j2, 8 - j2);
                        if(l2 == -1)
                            break;
                    }

                    if(j2 == 8)
                    {
                        int i3 = ((buffer[0] & 0xff) << 8) + (buffer[1] & 0xff);
                        int j3 = ((buffer[2] & 0xff) << 8) + (buffer[3] & 0xff);
                        i2 = ((buffer[4] & 0xff) << 16) + ((buffer[5] & 0xff) << 8) + (buffer[6] & 0xff);
                        int k3 = buffer[7] & 0xff;
                        if(i3 != j || j3 != l1 || k3 != indexID)
                            return false;
                        if(i2 < 0 || (long)i2 > dataFile.length() / 520L)
                            return false;
                    }
                }
                if(i2 == 0)
                {
                    flag = false;
                    i2 = (int)((dataFile.length() + 519L) / 520L);
                    if(i2 == 0)
                        i2++;
                    if(i2 == l)
                        i2++;
                }
                if(k - j1 <= 512)
                    i2 = 0;
                buffer[0] = (byte)(j >> 8);
                buffer[1] = (byte)j;
                buffer[2] = (byte)(l1 >> 8);
                buffer[3] = (byte)l1;
                buffer[4] = (byte)(i2 >> 16);
                buffer[5] = (byte)(i2 >> 8);
                buffer[6] = (byte)i2;
                buffer[7] = (byte)indexID;
                seekTo(dataFile, l * 520);
                dataFile.write(buffer, 0, 8);
                int k2 = k - j1;
                if(k2 > 512)
                    k2 = 512;
                dataFile.write(abyte0, j1, k2);
                j1 += k2;
                l = i2;
            }

            return true;
        }
        catch(IOException _ex)
        {
            return false;
        }
    }

    private synchronized void seekTo(RandomAccessFile randomaccessfile, int j)
            throws IOException {
        if (j < 0 || j > 0x3c00000) {
            System.out.println("Badseek - pos:" + j + " len:" + randomaccessfile.length());
            j = 0x3c00000;
            try {
                Thread.sleep(1000L);
            }
            catch (Exception _ex) {
            }
        }
        randomaccessfile.seek(j);
    }

    public int fileCount() {
        try {
            return (int) (indexFile.length() / 6);
        } catch (Exception e) {
            return 0;
        }
    }


    public void saveFiles(){
        for(int i = 0; i < fileCount(); i++){
            try{

                byte[] data = read(i);
                if(data != null){
                   long hash = (((indexID-1) << 16)+i);
                FileOutputStream out = new FileOutputStream("ondemand/"+hash);
                out.write(data);
                }
                else{

                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    private static final byte[] buffer = new byte[520];
    private final RandomAccessFile dataFile;
    private final RandomAccessFile indexFile;
    public final int indexID;

}