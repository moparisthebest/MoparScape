package com.rs2hd.util;

import java.util.ArrayList;
import java.util.List;

import com.rs2hd.event.Event;
import com.rs2hd.model.FloorItem;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.Spawn;
import com.rs2hd.model.World;

/**
 * Manages floor items.
 * @author Graham
 *
 */
public class ItemManager {
	
	/**
	 * List of items.
	 */
	private List<FloorItem> items;
	
	/**
	 * Creates the ItemManager.
	 */
	public ItemManager() {
		items = new ArrayList<FloorItem>();
	}
	
	public void createGroundItem(Location location, Item item) {
		for(FloorItem fi : items) {
			if(fi.getPlayer() == null && !fi.isDestroyed() && !fi.isSpawn() && fi.getLocation().equals(location) && fi.getId() == item.getId()) {
				fi.incrementAmount(item.getAmount());
				fi.resetDroppedAt();
				refresh(fi);
				return;
			}
		}
		final FloorItem floor = FloorItem.createGlobalDroppedItem(location, item);
		items.add(floor);
		refresh(floor);
		World.getInstance().registerEvent(new Event(60000) {
			@Override
			public void execute() {
				long diff = System.currentTimeMillis() - floor.getDroppedAt();
				if(diff >= 60000) {
					items.remove(floor);
					floor.setDestroyed(true);
					refresh(floor);
					this.stop();
				} else {
					this.setTick((int) diff);
				}
			}
		});
	}
	
	public void createDropGroundItem(Player player, Location location, Item item) {
		for(FloorItem fi : items) {
			if(fi.getPlayer() == player && !fi.isDestroyed() && !fi.isSpawn() && fi.getLocation().equals(location) && fi.getId() == item.getId()) {
				fi.incrementAmount(item.getAmount());
				fi.resetDroppedAt();
				refresh(fi);
				return;
			}
		}
		final FloorItem floor = FloorItem.createPlayerDroppedItemAt(player, location, item);
		items.add(floor);
		refresh(floor);
		World.getInstance().registerEvent(new Event(60000) {
			@Override
			public void execute() {
				long diff = System.currentTimeMillis() - floor.getDroppedAt();
				if(diff >= 60000) {
					floor.setPlayer(null);
					refresh(floor);
					if(!floor.isDestroyed()) {
						World.getInstance().registerEvent(new Event(60000) {
							@Override
							public void execute() {
								long diff = System.currentTimeMillis() - floor.getDroppedAt();
								if(diff >= 60000) {
									items.remove(floor);
									floor.setDestroyed(true);
									refresh(floor);
									this.stop();
								} else {
									this.setTick((int) diff);
								}
							}
						});
					} else {
						if(items.contains(floor)) {
							items.remove(floor);
						}
					}
					this.stop();
				} else {
					this.setTick((int) diff);
				}
			}
		});
	}

	/**
	 * Called when a player drops an item onto the floor.
	 * @param player
	 * @param item
	 */
	public void createGroundItem(Player player, Item item) {
		final FloorItem floor = FloorItem.createPlayerDroppedItem(player, item);
		items.add(floor);
		refresh(floor);
		World.getInstance().registerEvent(new Event(60000) {
			@Override
			public void execute() {
				floor.setPlayer(null);
				refresh(floor);
				if(!floor.isDestroyed()) {
					World.getInstance().registerEvent(new Event(60000) {
						@Override
						public void execute() {
							items.remove(floor);
							refresh(floor);
							this.stop();
						}
					});
				} else {
					if(items.contains(floor)) {
						items.remove(floor);
					}
				}
				this.stop();
			}
		});
	}

	/**
	 * Refreshes a floor item.
	 * @param floor
	 */
	private void refresh(FloorItem floor) {
		if(floor.getDroppedAt() >= 60000*2) {
			for(Player p : World.getInstance().getPlayerList()) {
				if(p.getLocation().withinDistance(floor.getLocation())) {
					p.getActionSender().sendDestroyGroundItem(floor);
				}
			}
		}
		if(floor.isDestroyed()) {
			if(floor.getPlayer() == null) {
				for(Player p : World.getInstance().getPlayerList()) {
					if(p.getLocation().withinDistance(floor.getLocation())) {
						p.getActionSender().sendDestroyGroundItem(floor);
					}
				}
			} else {
				if(floor.getPlayer().isDisconnected()) {
					floor.setPlayer(null);
				} else {
					if(floor.getPlayer().getLocation().withinDistance(floor.getLocation())) {
						floor.getPlayer().getActionSender().sendDestroyGroundItem(floor);
					}
				}
			}
			return;
		}
		if(floor.getPlayer() == null) {
			for(Player p : World.getInstance().getPlayerList()) {
				if(p.getLocation().withinDistance(floor.getLocation())) {
					p.getActionSender().sendCreateGroundItem(floor);
				}
			}
		} else {
			if(floor.getPlayer().isDisconnected()) {
				floor.setPlayer(null);
			} else {
				if(floor.getPlayer().getLocation().withinDistance(floor.getLocation())) {
					floor.getPlayer().getActionSender().sendCreateGroundItem(floor);
				}
			}
		}
	}

	public boolean groundItemExists(Location l, int id) {
		for(FloorItem f : items) {
			if(f.getLocation().equals(l) && f.getId() == id && !f.isDestroyed()) {
				return true;
			}
		}
		return false;
	}

	public int getItemAmount(Location l, int id) {
		for(FloorItem f : items) {
			if(f.getLocation().equals(l) && f.getId() == id) {
				return f.getAmount();
			}
		}
		return -1;
	}

	public void destroyGroundItem(Location l, int id) {
		for(final FloorItem f : items) {
			if(f.getLocation().equals(l) && f.getId() == id) {
				f.setDestroyed(true);
				refresh(f);
				if(f.isSpawn()) {
					World.getInstance().registerEvent(new Event(60000) {
						@Override
						public void execute() {
							f.setDestroyed(false);
							refresh(f);
						}
					});
				}
			}
		}
	}

	public void createSpawn(Spawn s) {
		FloorItem f = FloorItem.createSpawnItem(s);
		items.add(f);
	}
	
	public void refresh(Player p) {
		for(FloorItem f : items) {
			if(p.getLocation().withinDistance(f.getLocation()) && !f.isDestroyed() && (p == f.getPlayer() || f.getPlayer() == null)) {
				p.getActionSender().sendCreateGroundItem(f);
			}
		}
	}

}
