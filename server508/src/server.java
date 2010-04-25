/**
 * Starts rs2hd for moparscape.
 */
public class server implements org.moparscape.iface.ServerInterface {

    public void startServer(String workingDirectory) {
        System.setProperty("python.home", workingDirectory + "libs/cachedir/");
        com.rs2hd.Main.main(new String[]{workingDirectory});
    }

}
