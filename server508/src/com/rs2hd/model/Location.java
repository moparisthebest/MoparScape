package com.rs2hd.model;

/**
 * Represents a location in the world.
 * 
 * Immutable.
 * @author Graham
 *
 */
public class Location implements Cloneable {
	
	private int x, y, z;
	
	private Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public int getLocalX() {
		return x - 8 * (getRegionX() - 6);
	}
	
	public int getLocalY() {
		return y - 8 * (getRegionY() - 6);
	}
	
	public int getLocalX(Location loc) {
		return x - 8 * (loc.getRegionX() - 6);
	}
	
	public int getLocalY(Location loc) {
		return y - 8 * (loc.getRegionY() - 6);
	}
	
	public int getRegionX() {
		return (x >> 3);
	}
	
	public int getRegionY() {
		return (y >> 3);
	}
	
	public static Location location(int x, int y, int z) {
		return new Location(x, y, z);
	}
	
	@Override
	public int hashCode() {
		return z << 30 | x << 15 | y;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Location)) {
			return false;
		}
		Location loc = (Location) other;
		return loc.x == x && loc.y == y && loc.z == z;
	}
	
	@Override
	public String toString() {
		return "["+x+","+y+","+z+"]";
	}
	
	public boolean withinDistance(Location other, int dist) {
		if(other.z != z) {
			return false;
		}
		int deltaX = other.x - x, deltaY = other.y - y;
		return (deltaX <= (dist) && deltaX >= (0-dist-1) && deltaY <= (dist) && deltaY >= (0-dist-1));
	}
	
	public boolean withinDistance(Location other) {
		if(other.z != z) {
			return false;
		}
		int deltaX = other.x - x, deltaY = other.y - y;
		return deltaX <= 14 && deltaX >= -15 && deltaY <= 14 && deltaY >= -15;
	}

	public boolean withinInteractionDistance(Location l) {
		return withinDistance(l, 3);
	}

	public static int wildernessLevel(Location l) {
		int y = l.getY();
		if(y > 3520 && y < 4000) {
			return (((int)(Math.ceil((double)(y)-3520D)/8D)+1));
		}
		return 0;
	}

	public double getDistance(Location other) {
		int xdiff = this.getX() - other.getX();
		int ydiff = this.getY() - other.getY();
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
	}

}
