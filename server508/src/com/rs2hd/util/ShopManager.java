package com.rs2hd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import com.rs2hd.event.Event;
import com.rs2hd.model.Inventory;
import com.rs2hd.model.Item;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Player;
import com.rs2hd.model.Shop;
import com.rs2hd.model.ShopConfiguration;
import com.rs2hd.model.ShopItem;
import com.rs2hd.model.World;
import com.rs2hd.util.log.Logger;

public class ShopManager {
	
	private static final int CURRENCY = 995;
	
	private Map<Integer, Shop> shops;
	
	@SuppressWarnings("unchecked")
	public ShopManager() throws FileNotFoundException {
		Logger.getInstance().debug("Loading shops...");
		shops = (Map<Integer, Shop>) XStreamUtil.getXStream().fromXML(new FileInputStream(com.rs2hd.Main.workingDir+"data/shops.xml"));
		World.getInstance().registerEvent(new Event(60000) {
			@Override
			public void execute() {
				updateAmounts();
			}
		});
		Logger.getInstance().debug("Loaded " + shops.size() + " shops.");
	}
	
	public void tick(Player player) {
		if(player.getShopConfiguration().isShopping()) {
			Shop shop = player.getShopConfiguration().getCurrentShop();
			if(shop.isUpdateRequired()) {
				shop.refresh(player);
			}
		}
	}
	
	private void updateAmounts() {
		for(Shop s : shops.values()) {
			s.updateAmounts();
		}
	}
	
	public int getShopToInvPrice(Player player, int id) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return -1;
		}
		ItemDefinition def = ItemDefinition.forId(id);
		Shop shop = cfg.getCurrentShop();
		if(shop.isGeneralStore()) {
			if(cfg.isInMainStock()) {
				return def.getPrice().getMaximumPrice() > 0 ? def.getPrice().getMaximumPrice() : 1;
			} else {
				return def.getPrice().getNormalPrice() > 0 ? def.getPrice().getNormalPrice() : 1;
			}
		} else {
			if(cfg.isInMainStock()) {
				return def.getPrice().getNormalPrice() > 0 ? def.getPrice().getNormalPrice() : 1;
			} else {
				return def.getPrice().getMinimumPrice() > 0 ? def.getPrice().getMinimumPrice() : 1;
			}
		}
	}
	
	public int getInvToShopPrice(Player player, int id) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return -1;
		}
		ItemDefinition def = ItemDefinition.forId(id);
		Shop shop = cfg.getCurrentShop();
		if(shop.isGeneralStore()) {
			//if(cfg.isInMainStock()) {
			//	return def.getPrice().getMinimumPrice();
			//} else {
				return def.getPrice().getNormalPrice();
			//}
		} else {
			//if(cfg.isInMainStock()) {
			//	return def.getPrice().getNormalPrice();
			//} else {
				return def.getPrice().getMaximumPrice();
			//}
		}
	}

	public void openShop(Player player, int id) {
		Shop shop = shops.get(id);
		player.getShopConfiguration().setCurrentShop(shop);
		player.getShopConfiguration().setIsInMainStock(true);
		player.getActionSender().sendConfig2(118, 17);
		// TODO get it working correctly
		//player.getActionSender().sendShopLoadMainStock(800);
		player.getActionSender().sendShopOptions();
		shop.refresh(player);
		player.getActionSender().sendString(shop.getName(), 620, 22);
		player.getActionSender().sendShopTab(player.getShopConfiguration().isInMainStock(), shop.isGeneralStore());
		player.getActionSender().sendInterface(620);
		player.getActionSender().sendInventoryInterface(621);	
	}

	public void getValueShop(Player player, int slot) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = null;
		if(cfg.isInMainStock()) {
			shopItem = shop.getMainStock().get(slot);
		} else {
			shopItem = shop.getPlayerStock().get(slot);
		}
		if(shopItem == null) {
			return;
		}
		int price = getShopToInvPrice(player, shopItem.getId());
		player.getActionSender().sendMessage(shopItem.getDefinition().getName() + ": currently worth " + price + " coins.");
	}

	public void buy(Player player, int slot, int amount) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = null;
		if(cfg.isInMainStock()) {
			shopItem = shop.getMainStock().get(slot);
		} else {
			shopItem = shop.getPlayerStock().get(slot);
		}
		if(shopItem == null) {
			return;
		}
		int price = getShopToInvPrice(player, shopItem.getId());
		int totalPrice = price*amount;
		if(cfg.isInMainStock()) {
			if(player.getInventory().contains(CURRENCY, totalPrice)) {
				if(player.getInventory().hasRoomFor(shopItem.getId(), amount)) {
					player.getInventory().deleteItem(CURRENCY, totalPrice);
					player.getInventory().addItem(shopItem.getId(), amount);
				} else {
					player.getActionSender().sendMessage("Not enough room in your inventory.");
				}
			} else {
				player.getActionSender().sendMessage("Not enough coins.");
			}
		} else {
			int shopAmt = shop.getPlayerStock().getNumberOf(shopItem);
			if(amount > shopAmt) {
				amount = shopAmt;
			}
			ShopItem add = new ShopItem(shopItem.getId(), amount);
			if(shop.getPlayerStock().contains(add)) {
				if(player.getInventory().contains(CURRENCY, totalPrice)) {
					if(player.getInventory().hasRoomFor(add.getId(), add.getAmount())) {
						player.getInventory().deleteItem(CURRENCY, totalPrice);
						player.getInventory().addItem(add.getId(), add.getAmount());
						shop.getPlayerStock().remove(add);
						if(!shop.isGeneralStore() && shop.getMainStock().containsOne(add) && !shop.getPlayerStock().containsOne(add)) {
							shop.getPlayerStock().set(shop.getPlayerStock().getFreeSlot(), new ShopItem(add.getId(), 0));
						}
						shop.refresh(player);
						shop.setUpdateRequired(true);
					} else {
						player.getActionSender().sendMessage("Not enough room in your inventory.");
					}
				} else {
					player.getActionSender().sendMessage("Not enough coins.");
				}
			} else {
				player.getActionSender().sendMessage("Shop does not have enough stock.");
			}
		}
	}

	public void examineShop(Player player, int slot) {
		ShopConfiguration cfg = player.getShopConfiguration();
		if(!cfg.isShopping()) {
			return;
		}
		Shop shop = cfg.getCurrentShop();
		if(slot < 0 || slot >= Shop.SIZE) {
			return;
		}
		Item shopItem = null;
		if(cfg.isInMainStock()) {
			shopItem = shop.getMainStock().get(slot);
		} else {
			shopItem = shop.getPlayerStock().get(slot);
		}
		if(shopItem == null) {
			return;
		}
		player.getActionSender().sendMessage(shopItem.getDefinition().getExamine());
	}

	public void getValueInventory(Player player, int slot) {
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null) {
			return;
		}
		int price = getInvToShopPrice(player, item.getId());
		player.getActionSender().sendMessage(item.getDefinition().getName() + ": shop will buy for " + price + " coins.");
	}

	public void sell(Player player, int slot, int amount) {
		ShopConfiguration cfg = player.getShopConfiguration();
		Shop shop = cfg.getCurrentShop();
		if(!cfg.isShopping()) {
			return;
		}
		if(cfg.isInMainStock()) {
			cfg.setIsInMainStock(false);
			player.getActionSender().sendShopTab(player.getShopConfiguration().isInMainStock(), player.getShopConfiguration().getCurrentShop().isGeneralStore());
			shop.refresh(player);
		}
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null) {
			return;
		}
		int price = getInvToShopPrice(player, item.getId());
		int invAmt = player.getInventory().numberOf(item.getId());
		if(amount > invAmt) {
			amount = invAmt;
		}
		/*if(cfg.isInMainStock()) {
			if(shop.getMainStock().containsOne(new ShopItem(item.getId(), 1)) && item.getId() != CURRENCY) {
				Item rem = new Item(item.getId(), amount);
				if(player.getInventory().getContainer().contains(rem)) {
					if(player.getInventory().hasRoomFor(CURRENCY, (price*amount))) {
						player.getInventory().addItem(CURRENCY, (price*amount));
						player.getInventory().deleteItem(rem.getId(), rem.getAmount());
					} else {
						player.getActionSender().sendMessage("Not enough room.");
					}
				} else {
					player.getActionSender().sendMessage("You do not have enough of the required item.");
				}
			} else {
				player.getActionSender().sendMessage("The shop will not buy that item.");
			}
		} else */{
			if((shop.getMainStock().containsOne(new ShopItem(item.getId(), 1)) || shop.isGeneralStore()) && item.getId() != CURRENCY) {
				if(player.getInventory().hasRoomFor(CURRENCY, (price*amount))) {
					ShopItem add = new ShopItem(item.getId(), amount);
					if(shop.getPlayerStock().freeSlots() >= 1 || shop.getPlayerStock().containsOne(add)) {
						//shop.getPlayerStock().set(shop.getPlayerStock().getFreeSlot(), add);
						shop.getPlayerStock().add(add);
						player.getInventory().deleteItem(item.getId(), amount);
						player.getInventory().addItem(CURRENCY, (price*amount));
						shop.setUpdateRequired(true);
						shop.refresh(player);
					} else {
						player.getActionSender().sendMessage("The shop does not have enough room at the moment.");
					}
				} else {
					player.getActionSender().sendMessage("Not enough room in your inventory.");
				}
			} else {
				player.getActionSender().sendMessage("The shop will not buy that item.");
			}
		}
	}

	public void examineInventory(Player player, int slot, int amount) {
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null) {
			return;
		}
		player.getActionSender().sendMessage(item.getDefinition().getExamine());
	}

}
