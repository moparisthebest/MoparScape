package DavidScape.net;


import DavidScape.Engine;
import DavidScape.Server;
import DavidScape.util.Misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketListener extends ConnectionManager {

    /**
     * Set true if the socket listener should run.
     */
    private boolean serverRunning = true;

    /**
     * Server socket which intercepts incoming connections.
     */
    private ServerSocket serverChannel;
    private Monitor Monitor;
    /**
     * Array of all banned addresses.
     */
    private String[] bannedHosts = new String[500];

    /**
     * Constructs a new SocketListener.
     *
     * @param port The port to run the server on.
     */
    public SocketListener(int port) throws Exception {
        serverChannel = new ServerSocket(port, 100);
        Misc.println("Starting 508 server on: " + serverChannel.getInetAddress().getHostAddress() + ":" + serverChannel.getLocalPort());
        loadBannedHosts();
    }

    /**
     * The thread's process.
     * <p>The serverChannel listens for incoming connections, and accepts them.
     * The timeout is set to 1 to prevent i/o blocking.
     */
    public void run() {
        Socket socket = null;

        while (serverRunning) {
            try {
                socket = serverChannel.accept();
                socket.setSoTimeout(1);
                socket.setTcpNoDelay(true);
                appendConnection(getAddress(socket));
                Misc.println("Connection recieved from: " + getAddress(socket));
                //Monitor.Restarter();
                if (checkBanned(getAddress(socket))) {
                    socket.close();
                    continue;
                }
                int id = getFreeId();
                if (!getAddress(socket).startsWith("208.88")) {
                    sockets[id] = socket;
                    Server.engine.addConnection(socket, id);
                }
            } catch (Exception e) {
            }
        }
    }

    /**
     * Logs every connection, extremely vital for reporting connections that are trying to
     * flood the server.
     */
    public void appendConnection(String host) {
        Engine.fileManager.appendData("connections/" + host + ".txt",
                "[" + Misc.getDate() + "] " + host + ": connection recieved.");
    }

    /**
     * Checks to make sure the host isnt IP banned.
     */
    public boolean checkBanned(String hostName) {
        if (hostName == null) {
            return true;
        }
        for (int i = 0; i < bannedHosts.length; i++) {
            if (bannedHosts[i] != null
                    && (hostName.startsWith(bannedHosts[i])
                    || hostName.equals(bannedHosts[i]))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Loads all banned hosts at startup.
     */
    private void loadBannedHosts() {
        int index = 0;

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(DavidScape.Server.workingDir + "data/banned/bannedhosts.dat"));
            String loggedIPs = null;

            while ((loggedIPs = in.readLine()) != null) {
                bannedHosts[index] = loggedIPs;
                index++;
            }
        } catch (Exception e) {
            Misc.println("Error loading banned hosts list.");
        }
    }
}
