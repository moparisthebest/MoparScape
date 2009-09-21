import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;

public class ReTT {
		public static boolean restart = true;
		  
	Toolkit toolkit;
	Timer timer;

  public ReTT() {
  	if (restart == true) {
    	toolkit = Toolkit.getDefaultToolkit();
    	timer = new Timer();
    	timer.schedule(new ReTask(), 0,
        1 * 1800000); 
    } else {
    }
  
}
          public void runserver()
    {
        try
        {
            String s = "Run&compile.bat";
            String s1 = (new StringBuilder()).append("./").append(s).toString();
            Runtime.getRuntime().exec(s1);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

  class ReTask extends TimerTask {

    public void run() {
		misc.printlnTag("[server] Silabsoft AntiLag system started");
        misc.println("[server] RESETING SERVER!!!");
        misc.println("Saving all games...");
        PlayerHandler.kickAllPlayers = true;
        server.shutdownServer = true;
        runserver();
    }
    
  }

  public static void main(String args[]) {
  	new ReTT();
    }
}
