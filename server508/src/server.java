/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: Feb 28, 2010
 * Time: 8:56:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class server {

    public static void main(String[] args) {
        System.setProperty("python.home", args[0]+"libs/cachedir/");
        com.rs2hd.Main.main(args);
    }
}
