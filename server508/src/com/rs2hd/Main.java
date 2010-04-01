package com.rs2hd;

import com.rs2hd.util.log.Logger;

/**
 * Generic main class which starts the server.
 * @author Graham
 *
 */
public class Main {
	
	/**
	 * Logger instance.
	 */
	private static Logger logger = Logger.getInstance();

    public static String workingDir = null;
	
	/**
	 * Entry point of the program.
	 * 
	 * Sets everything rolling.
	 * @param args
	 */
	public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("To run server508 you must at least set a working directory with the command line.");
            return;
        }
        workingDir = args[0];
        
		new Thread(new Runnable() {
			@Override
			public void run() {
				Server s = null;
				try {
					s = new Server();
				} catch (Exception e) {
					logger.error(e.toString());
					logger.stackTrace(e);
					return;
				}
				s.go();
				
			}
		}, "GameEngine").start();
		
	}

}
