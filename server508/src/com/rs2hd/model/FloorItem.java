package com.rs2hd.model;

/**
 * Represents an item on the floor.
 * @author Graham
 *
 */
public class FloorItem extends Item {
	
	private Location location;
	private Player player;
	private long droppedAt;
	private boolean destroyed = false;
	private boolean spawn = false;

	private FloorItem(Player player, Location location, int id, int amount) {
		super(id, amount);
		this.player = player;
		this.location = location;
		this.droppedAt = System.currentTimeMillis();
	}
	
	public FloorItem(Spawn s) {
		super(s.getItem().getId(), s.getItem().getAmount());
		this.location = s.getLocation();
		this.spawn = true;
		this.player = null;
	}
	
	public FloorItem(Location location, int id, int amount) {
		super(id, amount);
		this.location = location;
		this.player = null;
	}

	public boolean isSpawn() {
		return spawn;
	}

	public long getDroppedAt() {
		return droppedAt;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public static FloorItem createPlayerDroppedItem(Player player, Item item) {
		return new FloorItem(player, player.getLocation(), item.getId(), item.getAmount());
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setDestroyed(boolean b) {
		this.destroyed = b;
	}
	
	public boolean isDestroyed() {
		return this.destroyed;
	}

	public static FloorItem createSpawnItem(Spawn s) {
		return new FloorItem(s);
	}

	public static FloorItem createGlobalDroppedItem(Location location, Item item) {
		return new FloorItem(location, item.getId(), item.getAmount());
	}

	public static FloorItem createPlayerDroppedItemAt(Player player, Location location, Item item) {
		return new FloorItem(player, location, item.getId(), item.getAmount());
	}

	public void incrementAmount(int amount) {
		this.setAmount(this.getAmount()+amount);
	}

	public void resetDroppedAt() {
		this.droppedAt = System.currentTimeMillis();
	}

}
