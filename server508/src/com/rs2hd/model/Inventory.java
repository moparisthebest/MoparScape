package com.rs2hd.model;

/**
 * Manages the player inventory.
 * @author Graham
 *
 */
public class Inventory {
	
	public static final int SIZE = 28;

	private Container<Item> inventory = new Container<Item>(SIZE, false);
	
	private transient Player player;
	
	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean addItem(int item, int amount) {
		if(item < 0 || item >= 13404) {
			return false;
		}
		boolean b = inventory.add(new Item(item, amount));
		if(!b) {
			player.getActionSender().sendMessage("Not enough space in your inventory.");
			return false;
		}
		refresh();
		return true;
	}
	
	public boolean contains(int item, int amount) {
		return inventory.contains(new Item(item, amount));
	}
	
	public boolean contains(int item) {
		return inventory.containsOne(new Item(item));
	}
	
	public void deleteItem(int item, int amount) {
		inventory.remove(new Item(item, amount));
		refresh();
	}
	
	public void deleteAll(int item) {
		inventory.removeAll(new Item(item));
		refresh();
	}

	public void refresh() {
		player.getActionSender().sendItems(149, 0, 93, inventory);
	}

	public Container<Item> getContainer() {
		return inventory;
	}

	public int getFreeSlots() {
		return inventory.getFreeSlots();
	}

	public boolean hasRoomFor(int id, int itemAmount) {
		if(ItemDefinition.forId(id).isStackable()) {
			return getFreeSlots() >= 1 || contains(id);
		} else {
			return getFreeSlots() >= itemAmount;
		}
	}

	public int numberOf(int id) {
		return inventory.getNumberOf(new Item(id, 1));
	}

	public Item lookup(int id) {
		return inventory.lookup(id);
	}
	
	public int lookupSlot(int id) {
		return inventory.lookupSlot(id);
	}

}
