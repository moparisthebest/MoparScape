/**
 * Starts rs2hd for moparscape.
 */
public class server implements org.moparscape.iface.ServerInterface {

    public void startServer(String workingDirectory) {
        DavidScape.Server.main(new String[]{workingDirectory});
    }

    public static void main(String[] args){
        if(args.length != 1){
            System.err.println("Fatal Error: Working directory must be first argument! (Try './')");
            return;
        }
        new server().startServer(args[0]);
    }

}
