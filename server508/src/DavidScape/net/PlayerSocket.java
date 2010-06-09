package DavidScape.net;


import DavidScape.players.Player;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class PlayerSocket {

    /**
     * The Player this class belongs to.
     */
    public Player player;

    /**
     * The SocketChannel used for recieving and sending bytes.
     */
    public Socket socket;

    /**
     * InputStream for accepting bytes.
     */
    public InputStream input;

    /**
     * OutputStream for sending bytes.
     */
    public OutputStream output;

    /**
     * Constructs a new PlayerSocket.
     *
     * @param p The Player which the frame should be created for.
     * @param s The socket this PlayerSocket belongs to.
     */
    public PlayerSocket(Player p, Socket s) {
        player = p;
        socket = s;
        try {
            input = socket.getInputStream();
            output = socket.getOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads one byte from the socket.
     *
     * @return Returns a single byte from the buffer, or -1 if an error occurs.
     */
    public int read() throws Exception {
        if (input == null || input.available() < 1) {
            return -1;
        }
        int i = 0;
        try {
            i = input.read();
        }
        catch (Exception e) {
            player.frames.logout(player);
            return -1;

        }
        return i;
    }

    /**
     * Reads a given number of bytes from the socket.
     *
     * @param read The number of bytes to read from the buffer.
     * @return Returns the number of bytes that were successfully read.
     */
    public int read(int read) throws Exception {
        if (input == null) {
            return -1;
        }
        int i = 0;
        try {
            i = input.read(player.stream.inBuffer, 0, read);
        }
        catch (Exception e) {
            player.frames.logout(player);
            return -1;
        }
        return i;
    }

    /**
     * Get the number of available bytes.
     *
     * @return Returns the number of bytes available to be read.
     */
    public int avail() throws Exception {
        if (input == null) {
            return 0;
        }
        return input.available();
    }

    /**
     * Writes a byte to the remote host.
     *
     * @param b Writes one byte to the buffer.
     */
    public void write(byte b) throws Exception {
        if (socket == null) {
            return;
        }
        try {
            output.write(b);
        }
        catch (Exception e) {
            player.frames.logout(player);
        }
    }

    /**
     * Writes bytes to the remote host.
     *
     * @param array     Array to write bytes from.
     * @param startPos  The position in the array to start writing at.
     * @param finishPos The last position of the array to stop writing at.
     */
    public void write(byte[] array, int startPos, int finishPos) throws Exception {
        if (socket == null) {
            return;
        }
        try {
            output.write(array, startPos, finishPos);
        }
        catch (Exception e) {
            player.frames.logout(player);
        }
    }

    /**
     * Flush the outstream.
     */
    public void flush() throws Exception {
        if (socket == null) {
            return;
        }
        try {
            output.flush();
        }
        catch (Exception e) {
            player.frames.logout(player);
        }
    }
}
