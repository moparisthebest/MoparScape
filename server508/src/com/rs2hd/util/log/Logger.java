package com.rs2hd.util.log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Logging utility class
 * @author Graham
 *
 */
public class Logger {
	
	/**
	 * The cached date.
	 */
	private static Date date = new Date();
	
	/**
	 * The date format string.
	 */
	private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	/**
	 * The cached formatted date.
	 */
	private static String dateText = dateFormat.format(date);
	
	/**
	 * When the date was last updated.
	 */
	private static long lastUpdatedDate = 0;
	
	/**
	 * Different debug levels.
	 * 
	 * There are 4:
	 * 		DEBUG	- used only for debugging, not reccomended in release servers
	 * 		INFO	- used for informative purposes
	 * 		WARNING	- reports problems that won't be dangerous to the runtime of the server, but
	 * 					should still be looked at
	 * 		ERROR	- reports serious problems that can effect the runtime of the server 
	 * @author Graham
	 *
	 */
	private static enum Level {
		DEBUG,
		INFO,
		WARNING,
		ERROR
	}
	
	/**
	 * Creates an instance of the logger.
	 */
	private Logger() {
	}
	
	/**
	 * Used to send log messages to their appropriate locations (i.e. DEBUG/INFO go to stdout
	 * and WARNING/ERROR go to stderr).
	 * @param level
	 * @param message
	 */
	public void log(Level level, String message) {
		synchronized(getClass()) {
			if(level == Level.DEBUG || level == Level.INFO) {
				System.out.println(formatMessage(message));
			} else {
				System.err.println(formatMessage(message));
			}
		}
	}

	/**
	 * Formats a log message.
	 * @param message The unformatted message.
	 * @return The formatted message.
	 */
	private String formatMessage(String message) {
		if(message == null) {
			message = "";
		}
		if((lastUpdatedDate+500) < System.currentTimeMillis()) {
			lastUpdatedDate = System.currentTimeMillis();
			date = new Date();
			dateText = dateFormat.format(date);
		}
		message = message.replaceAll("\t", "    ");
		return "[" + dateText + "] ["+Thread.currentThread().getName()+"]: " + message;
	}

	/**
	 * Log a INFO-level message.
	 * @param message
	 */
	public void info(String message) {
		log(Level.INFO, message);
	}
	
	/**
	 * Log a DEBUG-level message.
	 * @param message
	 */
	public void debug(String message) {
		log(Level.DEBUG, message);
	}
	
	/**
	 * Log a WARNING-level message.
	 * @param message
	 */
	public void warning(String message) {
		log(Level.WARNING, message);
	}
	
	/**
	 * Log a ERROR-level message.
	 * @param message
	 */
	public void error(String message) {
		log(Level.ERROR, message);
	}

	/**
	 * Log a stack trace.
	 * @param throwable
	 */
	public void stackTrace(Throwable throwable) {
		synchronized(getClass()) {
			log(Level.ERROR, throwable.getMessage());
			for(StackTraceElement e : throwable.getStackTrace()) {
				log(Level.ERROR, e.toString());
			}
		}
	}
	
	private static Logger instance = null;

	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
}
