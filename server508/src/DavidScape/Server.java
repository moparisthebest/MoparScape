package DavidScape;


import DavidScape.ClanChat.ClanMain;
import DavidScape.ClanChat.SaveChats;
import DavidScape.net.SocketListener;
import DavidScape.players.PlayerSave;
import DavidScape.util.Misc;
import DavidScape.world.mapdata.MapData;

import java.io.BufferedReader;
import java.io.FileReader;

public class Server {

    /**
     * The engine used to update almost everything, such as players, items, and NPCs.
     */
    public static ClanMain ClanMain = new ClanMain();
    public static SaveChats SaveChats;
    public static Engine engine;
    /**
     * Listens for incoming connections and accepts them.
     */
    public static SocketListener socketListener;

    /**
     * Save character files.
     */
    private static PlayerSave playerSave;

    /**
     * Banned accounts list.
     */
    public static String[] bannedUsers = new String[1000];

    public static String workingDir = "./";

    /**
     * Main method for running the server.
     * <p>While specifying port 0 will select a random open port, it is not suggested as
     * you will not be informed on what port was selected. If you pick a port already
     * in use, the server will shut down.
     *
     * @param args The port to run the server on, or 0 for a random port.
     */
    public static MapData mapData = null;

    public static void main(String[] args) {
        if(args.length == 1)
            workingDir = args[0];
        try {
            socketListener = new SocketListener(43594);
        } catch (Exception e) {

            /*
             * If this happens then the specified port is most likely already in use.
             */
            e.printStackTrace();
            return;
        }
        mapData = new MapData();
        mapData.loadRegions();
        loadBannedUsers();
        engine = new Engine();
        socketListener.run();
        ClanMain.loadChats();
        SaveChats = new SaveChats();
    }

    /**
     * Loads all banned users at startup.
     */
    public static void loadBannedUsers() {
        int index = 0;

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(DavidScape.Server.workingDir + "data/banned/bannedusers.dat"));
            String loggedUser = null;

            while ((loggedUser = in.readLine()) != null) {
                bannedUsers[index] = loggedUser;
                index++;
            }
        } catch (Exception e) {
            Misc.println("Error loading banned users list.");
        }
    }
}
