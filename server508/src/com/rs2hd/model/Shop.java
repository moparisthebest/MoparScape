package com.rs2hd.model;

/**
 * Represents a shop.
 * @author Graham
 *
 */
public class Shop {
	
	public static final int SIZE = 500;
	private String name;
	private boolean isGeneralStore;
	private Container<Item> stock   = new Container<Item>(SIZE, false);
	private transient Container<ShopItem> mainStock;
	private transient Container<ShopItem> playerStock;
	private transient boolean isUpdateRequired;
	
	public Shop() {
	}
	
	public void refresh(Player player) {
		player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
		if(player.getShopConfiguration().isInMainStock()) {
			player.getActionSender().sendItems(-1, 64285, 17, mainStock.asItemContainer());
		} else {
			player.getActionSender().sendItems(-1, 64285, 17, playerStock.asItemContainer());
		}
	}
	
	public Object readResolve() {
		isUpdateRequired = false;
		mainStock   = new Container<ShopItem>(SIZE, false);
		playerStock = new Container<ShopItem>(SIZE, true);
		int idx = 0;
		for(Item i : stock.getItems()) {
			mainStock.set(idx++, new ShopItem(i.getId(), 1));
		}
		if(!isGeneralStore) {
			for(Item i : stock.getItems()) {
				playerStock.set(idx++, new ShopItem(i.getId(), 0));
			}
		}
		return this;
	}
	
	public void updateAmounts() {
		
	}
	
	public boolean isUpdateRequired() {
		return this.isUpdateRequired;
	}
	
	public void setUpdateRequired(boolean b) {
		this.isUpdateRequired = b;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isGeneralStore() {
		return isGeneralStore;
	}
	
	public Container<ShopItem> getMainStock() {
		return mainStock;
	}
	
	public Container<ShopItem> getPlayerStock() {
		return playerStock;
	}

}
