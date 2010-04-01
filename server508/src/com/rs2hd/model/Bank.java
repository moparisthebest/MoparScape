package com.rs2hd.model;

/**
 * Manages the player bank.
 * @author Graham
 *
 */
public class Bank {
	
	public static final int SIZE = 800;

	private Container<Item> bank = new Container<Item>(SIZE, false);
	
	private transient Player player;
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void openBank() {
		player.getActionSender().sendConfig2(563, 4194304);
		player.getActionSender().sendConfig2(1248, -2013265920);
		player.getActionSender().sendBankOptions();
		refresh();
		player.getActionSender().sendInterface(762);
		player.getActionSender().sendInventoryInterface(763);
	}
	
	public void refresh() {
		player.getActionSender().sendItems(-1, 64207, 95, bank);
		player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
		player.getActionSender().sendItems(149, 0, 93, player.getInventory().getContainer());
	}

	public Container<Item> getContainer() {
		return bank;
	}

	public int getFreeSlots() {
		return bank.getFreeSlots();
	}

	public void bankItem(int slot, int amount) {
		if(slot < 0 || slot > Inventory.SIZE || amount <= 0) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null) {
			return;
		}
		if(amount > player.getInventory().getContainer().getNumberOf(item)) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
		if(player.getInventory().getContainer().contains(item)) {
			if(bank.containsOne(item)) {
				for(int i = 0; i < SIZE; i++) {
					Item bankItem = bank.get(i);
					if(bankItem == null) {
						continue;
					}
					if(bankItem.getId() == item.getId()) {
						bank.set(i, new Item(item.getId(), bankItem.getAmount() + item.getAmount()));
						player.getInventory().getContainer().remove(item);
						break;
					}
				}
			} else {
				if(getFreeSlots() <= 0) {
					player.getActionSender().sendMessage("Not enough space in your bank.");
				} else {
					bank.add(item);
					player.getInventory().getContainer().remove(item);
				}
			}
		}
		refresh();
	}

	public void withdrawItem(int slot, int amount) {
		if(slot < 0 || slot > Bank.SIZE || amount <= 0) {
			return;
		}
		Item item = bank.get(slot);
		if(item == null) {
			return;
		}
		if(amount > item.getAmount()) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
		if(bank.contains(item)) {
			if(player.getInventory().getFreeSlots() <= 0) {
				player.getActionSender().sendMessage("Not enough space in your inventory.");
			} else {
				player.getInventory().getContainer().add(item);
				bank.remove(item);
				bank.shift();
			}
		}
		refresh();
	}

}
