package com.rs2hd.util.log;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Puts SLF4J logs through to our own system.
 * @author Graham
 *
 */
public class SLF4JAppender implements Appender {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();

	@Override
	public void addFilter(Filter arg0) {
		
	}

	@Override
	public void clearFilters() {
		
	}

	@Override
	public void close() {
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void doAppend(LoggingEvent arg0) {
		if(arg0.getLevel().isGreaterOrEqual(Priority.ERROR)) {
			logger.error(arg0.getMessage().toString());
			return;
		}
		if(arg0.getLevel().isGreaterOrEqual(Priority.WARN)) {
			logger.warning(arg0.getMessage().toString());
			return;
		}
	}

	@Override
	public ErrorHandler getErrorHandler() {
		return null;
	}

	@Override
	public Filter getFilter() {
		return null;
	}

	@Override
	public Layout getLayout() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

	@Override
	public void setErrorHandler(ErrorHandler arg0) {
		
	}

	@Override
	public void setLayout(Layout arg0) {
		
	}

	@Override
	public void setName(String arg0) {
	}

}
