package com.rs2hd.model;

public class Bounds {
	
	private Location topLeft;
	private Location bottomRight;
	
	public Bounds(Location tl, Location br) {
		this.topLeft = tl;
		this.bottomRight = br;
	}
	
	public Location getTopLeft() {
		return topLeft;
	}
	
	public Location getBottomRight() {
		return bottomRight;
	}

}
