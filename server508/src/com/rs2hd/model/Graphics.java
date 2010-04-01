package com.rs2hd.model;

/**
 * Represents 'still graphics'.
 * @author Graham
 *
 */
public class Graphics {
	
	private int id, delay;
	
	public Graphics(int id, int delay) {
		this.id = id;
		this.delay = delay;
	}
	
	public int getId() {
		return id;
	}
	
	public int getDelay() {
		return delay;
	}
	
}
