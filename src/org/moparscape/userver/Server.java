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

package org.moparscape.userver;

import org.moparscape.Debug;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

/**
 * Server that needs implemented for clients used in moparscape.
 * @author mopar
 */
public abstract class Server extends Thread {

    protected int port;
    protected String defaultLocation;
    protected String customLocation;
    protected ServerSocket sSock;
    protected boolean isRunning;

    protected Thread thisThread;

    protected Server(String defaultLocation, int port, String customLocation) {
        // setting this to false eases error checking
        java.net.HttpURLConnection.setFollowRedirects(false);
        this.defaultLocation = defaultLocation;
        if (customLocation != null)
            this.customLocation = customLocation;
        else
            this.customLocation = defaultLocation;
        this.port = port;
    }

    protected Server(String defaultLocation, int port) {
        this(defaultLocation, port, null);
    }

    public void start() {
        try {
            sSock = new ServerSocket(port);
            //sSock.setSoTimeout(1000);
            port = sSock.getLocalPort();
            isRunning = true;
        } catch (IOException e) {
            System.out.println("Could not open Server on port " + port);
            handleException(e);
        }
        super.start();
    }

    public int getPort() {
        return port;
    }
 /*
    private synchronized int modThreadCount(int mod) {
        if(mod > 100){
            System.out.println("mod shouldn't be above 100!");
            System.exit(1);
        }
        threadCount += mod;
        return threadCount;
    }

    private int threadCount = 0;

    public void runu() {
        thisThread = this;
        while (isRunning)
            try {
                //handleConnection(sSock.accept());
                if (modThreadCount(0) < 100) {
                    (new Thread() {
                        public void run() {
                            modThreadCount(1);
                            //System.out.println("threadCount: " + modThreadCount(1));
                            try {
                                handleConnection(sSock.accept());
                            } catch (IOException e) {
                                handleException(e);
                            }
                            modThreadCount(-1);
                        }
                    }).start();
                } else {
                    Thread.sleep(500);
                }


            } catch (Exception e) {
                handleException(e);
            }
    }
 */
    public void run() {
        thisThread = this;
        while (isRunning)
            try {
                handleConnection(sSock.accept());
            } catch (IOException e) {
                handleException(e);
            }
    }

    public void stopServer() {
        isRunning = false;
        try {
            thisThread.interrupt();
            sSock.close();
        } catch (Exception e) {
            handleException(e);
        }

    }

    public HttpURLConnection getHttpURLConnection(String request) {
        HttpURLConnection ret;
        String urlStr = customLocation + request;
        //System.out.println("getHttpURLConnection urlStr: "+urlStr);
        try {
            ret = (HttpURLConnection) new URL(urlStr).openConnection();
            // if response code is not 200
            if (ret.getResponseCode() != HttpURLConnection.HTTP_OK)
                throw new IOException();
        } catch (Exception e) {
            System.out.println("UpdateServer: Error, " + urlStr + " does not exist.");
            // comparing strings like this is valid in this case
            // because they would be the same object
            if (defaultLocation == customLocation) {
                System.out.println("UpdateServer: No alternatives, continuing.");
                return null;
            } else
                try {
                    System.out.println("UpdateServer: Trying default as alternative.");
                    urlStr = defaultLocation + request;
                    ret = (HttpURLConnection) new URL(urlStr).openConnection();
                    // if response code is not 200
                    if (ret.getResponseCode() != HttpURLConnection.HTTP_OK)
                        throw new IOException();
                } catch (Exception e2) {
                    System.out.println("UpdateServer: Error, " + urlStr + " does not exist. (not connected to the internet?)");
                    System.out.println("UpdateServer: No more alternatives, continuing.");
                    return null;
                }
        }
        return ret;
    }

    public void handleException(Exception e) {
        if (Debug.debug()) {
            //String myName = this.getClass().getName();
            //if (myName.equals("org.moparscape.userver.v508.OndemandServer443"))  return;
            System.err.print("Server error: ");
            e.printStackTrace();
        }
    }

    protected abstract void handleConnection(Socket s) throws IOException;
}
