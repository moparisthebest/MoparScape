/**
 * Created by IntelliJ IDEA.
 * User: Jonny
 * Date: Aug 31, 2008
 * Time: 1:40:37 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.*;
public class log  {
    private static FileWriter fstream;
    private static BufferedWriter LOG_WRITER;

    public static void Log(String type, String message) throws IOException
    {
	if(fstream == null){
		fstream = new FileWriter("log.txt");
		LOG_WRITER = new BufferedWriter(fstream);
	}
        LOG_WRITER.write("[" + type + "] " + message);
        //System.out = new PrintStream("log.txt");
        System.out.println(message);
    }
}
