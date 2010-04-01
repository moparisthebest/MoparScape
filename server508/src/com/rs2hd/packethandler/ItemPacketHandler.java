package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.Bank;
import com.rs2hd.model.Equipment;
import com.rs2hd.model.Inventory;
import com.rs2hd.model.Item;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.log.Logger;

/**
 * Handles all packets to do with items.
 * @author Graham
 *
 */
public class ItemPacketHandler implements PacketHandler {
	
	private Logger logger = Logger.getInstance();

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 167:
			/*
			 * Switch items.
			 */
			switchItems(player, session, packet);
			break;
		case 179:
			/*
			 * Transfer items between two interfaces.
			 */
			switchItems2(player, session, packet);
			break;
		case 3:
			/*
			 * Equip.
			 */
			equip(player, session, packet);
			break;
		case 203:
			/*
			 * Item option 1.
			 */
			itemOption1(player, session, packet);
			break;
		case 152:
			/*
			 * Item option 2.
			 */
			itemOption2(player, session, packet);
			break;
		case 220:
			/*
			 * Item select.
			 */
			itemSelect(player, session, packet);
			break;
		case 186:
			/*
			 * Item operate.
			 */
			itemOperate(player, session, packet);
			break;
		case 211:
			/*
			 * Drop item.
			 */
			drop(player, session, packet);
			break;
		case 201:
			/*
			 * Take item.
			 */
			take(player, session, packet);
			break;
		case 40:
			/*
			 * Item on item.
			 */
			itemOnItem(player, session, packet);
			break;
		case 224:
			/*
			 * Item on object.
			 */
			itemOnObject(player, session, packet);
			break;
		case 131:
			/*
			 * Item on player.
			 */
			itemOnPlayer(player, session, packet);
			break;
		case 12:
			/*
			 * Item on npc.
			 */
			itemOnNPC(player, session, packet);
			break;
		}
	}
	
	private void itemOnPlayer(Player player, IoSession session, Packet packet) {
		packet.readInt();// junk
		int playerId = packet.readShort()    & 0xFFFF;
		int slot     = packet.readLEShortA() & 0xFFFF;
		int id       = packet.readShortA()   & 0xFFFF;
		if(playerId < 0 || playerId >= Constants.PLAYER_CAP) {
			return;
		}
		Player other = World.getInstance().getPlayerList().get(playerId);
		if(other == null) {
			return;
		}
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null || item.getId() != id) {
			return;
		}
		ScriptManager.getInstance().call("item_on_player_"+id, player, slot, other);
	}

	private void itemOnNPC(Player player, IoSession session, Packet packet) {
		packet.readInt(); // junk
		int npcId = packet.readShort()    & 0xFFFF;
		int slot  = packet.readLEShortA() & 0xFFFF;
		int id    = packet.readShortA()   & 0xFFFF;
		if(npcId < 0 || npcId >= Constants.NPC_CAP) {
			return;
		}
		NPC npc = World.getInstance().getNpcList().get(npcId);
		if(npc == null) {
			return;
		}
		if(slot < 0 || slot >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null || item.getId() != id) {
			return;
		}
		ScriptManager.getInstance().call("item_on_npc_"+id, player, slot, npc);
	}

	private void itemOnObject(Player player, IoSession session, Packet packet) {
		int y       = packet.readLEShort();
		int itemId  = packet.readShort() & 0xFFFF;
		packet.readShort(); // junk
		packet.readShort(); // junk
		packet.readShort(); // junk
		int objectId = packet.readShortA() & 0xFFFF;
		int x        = packet.readShort()   & 0xFFFF;
		// TODO can probably get this from the packet
		int slot = player.getInventory().lookupSlot(itemId);
		if(slot == -1) {
			return;
		}
		ScriptManager.getInstance().call("item_on_object_"+itemId+"_"+objectId, player, slot, x, y);
	}

	private void itemOnItem(Player player, IoSession session, Packet packet) {
		int usedWith = packet.readLEShort();
		int itemUsed = packet.readShortA();
		int slot = player.getInventory().lookupSlot(itemUsed);
		if(slot == -1) {
			return;
		}
		int withSlot = player.getInventory().lookupSlot(usedWith);
		if(withSlot == -1) {
			return;
		}
		ScriptManager.getInstance().call("item_on_item_"+itemUsed+"_"+usedWith, player, slot, withSlot);
	}

	private void itemOperate(Player player, IoSession session, Packet packet) {
		int interfaceSet = packet.readInt();
		int interfaceId  = interfaceSet >> 16;
		int id   = packet.readShortA() & 0xFFFF;
		int slot = packet.readLEShortA() & 0xFFFF;
		if(interfaceId == 7168) {
			if(slot < 0 || slot >= Equipment.SIZE || player.getEquipment().getContainer().get(slot) == null) {
				return;
			}
			if(player.getEquipment().getContainer().get(slot).getId() != id) {
				return;
			}
			ScriptManager.getInstance().call("item_operate_"+id, player, slot);
		} else {
			logger.debug("Unhandled item operate, interface: " + interfaceId + ".");
		}
	}

	private void itemSelect(Player player, IoSession session, Packet packet) {
		int interfaceSet = packet.readLEInt();
		int interfaceId  = interfaceSet >> 16;
		int id   = packet.readLEShort() & 0xFFFF;
		int slot = packet.readShortA() & 0xFFFF;
		if(interfaceId == 149) {
			if(slot < 0 || slot >= Inventory.SIZE || player.getInventory().getContainer().get(slot) == null) {
				return;
			}
			if(player.getInventory().getContainer().get(slot).getId() != id) {
				return;
			}
			ScriptManager.getInstance().call("item_select_"+id, player, slot);
		} else {
			logger.debug("Unhandled item select, interface: " + interfaceId + ".");
		}
	}

	private void itemOption2(Player player, IoSession session, Packet packet) {
		int slot = packet.readLEShortA() & 0xFFFF;
		int id   = packet.readShortA()   & 0xFFFF;
		int interfaceSet = packet.readInt();
		int interfaceId  = interfaceSet >> 16;
		if(interfaceId == 149) {
			if(slot < 0 || slot >= Inventory.SIZE || player.getInventory().getContainer().get(slot) == null) {
				return;
			}
			if(player.getInventory().getContainer().get(slot).getId() != id) {
				return;
			}
			ScriptManager.getInstance().call("item_option_2_"+id, player, slot);
		} else {
			logger.debug("Unhandled item option 2, interface: " + interfaceId + ".");
		}
	}

	private void take(final Player player, IoSession session, Packet packet) {
		int y  = packet.readShortA() & 0xFFFF;
		int x  = packet.readShort()  & 0xFFFF;
		final int id = packet.readLEShortA() & 0xFFFF;
		final Location l = Location.location(x, y, player.getLocation().getZ());
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, l) {
			@Override
			public void run() {
				if(player.getLocation().withinInteractionDistance(l)) {
					if(World.getInstance().getItemManager().groundItemExists(l, id)) {
						int itemAmount = World.getInstance().getItemManager().getItemAmount(l, id);
						assert itemAmount != -1;
						if(player.getInventory().hasRoomFor(id, itemAmount)) {
							World.getInstance().getItemManager().destroyGroundItem(l, id);
							player.getInventory().addItem(id, itemAmount);
						}
					}
				}
			}
		});
	}

	private void drop(Player player, IoSession session, Packet packet) {
		packet.readInt();
		int slot = packet.readLEShortA() & 0xFFFF;
		@SuppressWarnings("unused")
		int id   = packet.readLEShort()  & 0xFFFF;
		if(slot < 0 || slot >= Inventory.SIZE || player.getInventory().getContainer().get(slot) == null) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		player.getInventory().getContainer().set(slot, null);
		player.getInventory().refresh();
		World.getInstance().getItemManager().createGroundItem(player, item);
	}

	private void switchItems2(Player player, IoSession session, Packet packet) {
		int interface1    = packet.readInt() >> 16;
		packet.readInt();
		int fromId        = packet.readShort()   & 0xFFFF;
		int toId          = packet.readLEShort() & 0xFFFF;
		switch(interface1) {
		case 762:
			/*
			 * Bank.
			 */
			if(fromId < 0 || fromId >= Bank.SIZE || toId < 0 || toId >= Bank.SIZE) {
				break;
			}
			Item temp  = player.getBank().getContainer().get(fromId);
			Item temp2 = player.getBank().getContainer().get(toId);
			player.getBank().getContainer().set(fromId, temp2);
			player.getBank().getContainer().set(toId, temp);
			player.getBank().refresh();
			break;
		case 763:
			/*
			 * Inventory.
			 */
			if(fromId < 0 || fromId >= Inventory.SIZE || toId < 0 || toId >= Inventory.SIZE) {
				break;
			}
			temp  = player.getInventory().getContainer().get(fromId);
			temp2 = player.getInventory().getContainer().get(toId);
			player.getInventory().getContainer().set(fromId, temp2);
			player.getInventory().getContainer().set(toId, temp);
			player.getBank().refresh();
			break;
		}
	}

	private void itemOption1(Player player, IoSession session, Packet packet) {
		int slot = packet.readLEShortA();
		int interfaceId = packet.readShort();
		packet.readShort();
		int itemId = packet.readShort();
		if(slot < 0 || itemId < 0) {
			return;
		}
		switch(interfaceId) {
		case 387:
			/*
			 * Unequip item.
			 */
			if(slot < Equipment.SIZE && player.getEquipment().get(slot) != null) {
				if(!player.getInventory().addItem(player.getEquipment().get(slot).getDefinition().getId(), player.getEquipment().get(slot).getAmount())) {
					break;
				}
				player.getEquipment().set(slot, null);
			}
			break;
		case 149:
			if(slot < 0 || slot >= Inventory.SIZE || player.getInventory().getContainer().get(slot) == null) {
				return;
			}
			if(player.getInventory().getContainer().get(slot).getId() != itemId) {
				return;
			}
			ScriptManager.getInstance().call("item_option_1_"+itemId, player, slot);
			break;
		default:
			logger.debug("Unhandled item option 1, interface: " + interfaceId + ".");
			break;
		}
	}

	private void equip(Player player, IoSession session, Packet packet) {
		packet.readInt();
		int wearId = packet.readLEShort();
		int index  = packet.readByte() & 0xFF;
		packet.readByte();
		if(index < 0 || index >= Inventory.SIZE) {
			return;
		}
		Item item = player.getInventory().getContainer().get(index);
		if(item == null) {
			return;
		}
		if(Equipment.isTwoHanded(item.getDefinition()) && player.getInventory().getFreeSlots() < 1 && player.getEquipment().get(5) != null) {
			player.getActionSender().sendMessage("Not enough free space in your inventory.");
			return;
		}
		if(item.getDefinition().getId() == wearId) {
			int targetSlot = Equipment.getItemType(wearId);
			if(targetSlot == -1) {
				return;
			}
			player.getInventory().deleteItem(item.getDefinition().getId(), item.getAmount());
			if(targetSlot == 3) {
				if(Equipment.isTwoHanded(ItemDefinition.forId(wearId)) && player.getEquipment().get(5) != null) {
					if(!player.getInventory().addItem(player.getEquipment().get(5).getDefinition().getId(), player.getEquipment().get(5).getAmount())) {
						player.getInventory().addItem(wearId, item.getAmount());
						return;
					}
					player.getEquipment().set(5, null);
				}
			} else if(targetSlot == 5) {
				if(Equipment.isTwoHanded(ItemDefinition.forId(wearId)) && player.getEquipment().get(3) != null) {
					if(!player.getInventory().addItem(player.getEquipment().get(3).getDefinition().getId(), player.getEquipment().get(3).getAmount())) {
						player.getInventory().addItem(wearId, item.getAmount());
						return;
					}
					player.getEquipment().set(3, null);
				}
			}
			if(player.getEquipment().get(targetSlot) != null && (wearId != player.getEquipment().get(targetSlot).getDefinition().getId() || !item.getDefinition().isStackable())) {
				player.getInventory().addItem(player.getEquipment().get(targetSlot).getDefinition().getId(), player.getEquipment().get(targetSlot).getAmount());
				player.getEquipment().set(targetSlot, null);
			}
			int oldAmt = 0;
			if(player.getEquipment().get(targetSlot) != null) {
				oldAmt = player.getEquipment().get(targetSlot).getAmount();
			}
			Item item2 = new Item(wearId, oldAmt+item.getAmount());
			player.getEquipment().set(targetSlot, item2);
			
		}
	}

	private void switchItems(Player player, IoSession session, Packet packet) {
		int toId = packet.readLEShortA();
		packet.readByte();
		int fromId = packet.readLEShortA();
		packet.readShort();
		int interfaceId = packet.readByte() & 0xFF;
		packet.readByte();
		
		switch(interfaceId) {
		case 149:
			/*
			 * Switch items in inventory.
			 */
			if(fromId < 0 || fromId >= Inventory.SIZE || toId < 0 || toId >= Inventory.SIZE) {
				break;
			}
			Item temp  = player.getInventory().getContainer().get(fromId);
			Item temp2 = player.getInventory().getContainer().get(toId);
			player.getInventory().getContainer().set(fromId, temp2);
			player.getInventory().getContainer().set(toId, temp);
			break;
		default:
			logger.debug("Unhandled switch items, interface: " + interfaceId + ".");
			break;
		}
	}

}
