/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moparscape.userver;

import org.moparscape.MainPanel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

/**
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
            Server.handleException(e);
        }
        super.start();
    }

    public int getPort() {
        return port;
    }

    public void run() {
        thisThread = this;
        while (isRunning)
            try {
                handleConnection(sSock.accept());
            } catch (IOException e) {
                Server.handleException(e);
            }
    }

    public void stopServer() {
        isRunning = false;
        try {
            thisThread.interrupt();
            sSock.close();
        } catch (Exception e) {
            Server.handleException(e);
        }

    }

    public HttpURLConnection getHttpURLConnection(String request) {
        HttpURLConnection ret;
        String urlStr = customLocation + request;
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

    public static void handleException(Exception e) {
        if (MainPanel.debug()) {
            System.err.print("Server error: ");
            e.printStackTrace();
        }
    }

    protected abstract void handleConnection(Socket s) throws IOException;
}
