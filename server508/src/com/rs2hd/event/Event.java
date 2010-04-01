package com.rs2hd.event;

/**
 * Abstract event class.
 * @author Graham
 *
 */
public abstract class Event {
	
	/**
	 * How many ms the event should wait between each cycle.
	 */
	private int tick;
	
	/**
	 * How long it was since the event was last run.
	 */
	private long lastRun;
	
	/**
	 * If the event has been stopped.
	 */
	private boolean isStopped;
	
	/**
	 * Create an event with the specified tick time.
	 * @param tick
	 */
	public Event(int tick) {
		this.tick = tick;
		this.lastRun = System.currentTimeMillis();
	}
	
	/**
	 * Gets the current tick.
	 * @return
	 */
	public int getTick() {
		return tick;
	}
	
	/**
	 * Sets the event tick.
	 * @param tick
	 */
	public void setTick(int tick) {
		this.tick = tick;
	}
	
	/**
	 * Checks if the event is ready to execute.
	 * @return
	 */
	public boolean isReady() {
		if(isStopped) {
			return false;
		}
		return (System.currentTimeMillis()-lastRun) > tick;
	}
	
	/**
	 * Checks if the event has been stopped.
	 * @return
	 */
	public boolean isStopped() {
		return isStopped;
	}
	
	/**
	 * Stops the current event.
	 */
	public void stop() {
		isStopped = true;
	}
	
	/**
	 * Runs the event.
	 */
	public void run() {
		this.lastRun = System.currentTimeMillis();
		execute();
	}
	
	/**
	 * Subclasses of the event class can put their own code here.
	 */
	public abstract void execute();

}
