package DavidScape.net;


import DavidScape.players.Player;

import java.net.Socket;


public class ConnectionManager {

    /**
     * A socket array for connections.
     */
    public static Socket[] sockets = new Socket[2000];

    /**
     * Checks to see if a connection exists.
     * <p>The check is done by comparing socket addresses with one another.
     * This doesn't garentee if someone is already connected this will catch it,
     * but has a high possibility of doing so.
     *
     * @param socket The socket to use for comparison.
     * @return Returns whether or not a connection from that has already been made.
     */
    public boolean isConnected(Socket socket) {
        for (Socket s : sockets) {
            if (s == null) {
                continue;
            }
            if (!getAddress(s).equals(getAddress(socket))) {
                continue;
            }
            return true;
        }
        return false;
    }

    /**
     * Closes and removes a given socket.
     *
     * @param id The socket index to close.
     */
    public void removeSocket(int id) {
        if (sockets[id] == null) {
            return;
        }

        /*
         * Attempt to close the socket.
         */
        try {
            sockets[id].close();
        } catch (Exception e) {
        }
        sockets[id] = null;
    }

    /**
     * Get the sockets address.
     * <p>Returns the address of the socket, which is in the same format as
     * saved banned addresses.
     *
     * @param socket The socket to check the address for.
     * @return Returns the host address of the SocketChannel.
     */
    public String getAddress(Socket socket) {
        if (socket == null) {
            return "0.0.0.0";
        }
        return socket.getInetAddress().getHostAddress();
    }

    /**
     * Get the sockets name.
     *
     * @param socket The socket to check the name for.
     * @return Returns the host name of the SocketChannel.
     */
    public String getName(Socket socket) {
        if (socket == null) {
            return "0.0.0.0";
        }
        return socket.getInetAddress().getHostName();
    }

    /**
     * Get the sockets port.
     *
     * @param socket The socket to check the port for.
     * @return Returns the port of the SocketChannel.
     */
    public int getPort(Socket socket) {
        if (socket == null) {
            return 0;
        }
        return socket.getPort();
    }

    /**
     * Get a free socket.
     *
     * @return Returns an open socket index, or 0 if there are none.
     */
    public int getFreeId() {

        for (int i = 1; i < sockets.length; i++) {
            if (sockets[i] != null) {
                continue;
            }
            return i;
        }
        return 0;
    }

    /**
     * Write any pending bytes to the client.
     * <p>This takes all the bytes in the out buffer in the players
     * stream class and writes them to the players client.
     *
     * @param p The Player which the frame should be created for.
     */
    public void writeBuffer(Player p) {
        if (p == null || !p.online || p.disconnected[0]) {
            return;
        }
        try {
            if (p.stream.outOffset > 0) {
                p.socket.write(p.stream.outBuffer, 0, p.stream.outOffset);
            }
            p.stream.outOffset = 0;
            p.socket.flush();
        } catch (Exception e) {
            p.disconnected[0] = true;
        }
    }
}
