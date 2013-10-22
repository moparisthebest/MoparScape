/*
 * Copyright (C) 2009-2013 moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com.
 */

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
