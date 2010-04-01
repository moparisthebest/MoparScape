package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.content.Emotes;
import com.rs2hd.content.Wilderness;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.util.log.Logger;

/**
 * Action button handler.
 * @author Graham
 *
 */
public class ActionButtonPacketHandler implements PacketHandler {
	
	private Logger logger = Logger.getInstance();

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		int interfaceId = packet.readShort() & 0xFFFF;
		int buttonId    = packet.readShort() & 0xFFFF;
		int buttonId2   = 0;
		if(packet.getLength() >= 6) {
			buttonId2 = packet.readShort() & 0xFFFF;
		}
		if(buttonId2 == 65535) {
			buttonId2 = 0;
		}
		switch(interfaceId) {
		/*
		 * Standard weapon interfaces.
		 */
		case 92:
			handleWeaponInterfaceButton(player, buttonId);
			break;
		/*
		 * Specials.
		 */
		case 84:
			if(buttonId == 8) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 76:
			if(buttonId == 8) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 75:
			if(buttonId == 10) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 88:
			if(buttonId == 10) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 78:
			if(buttonId == 10) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 79:
			if(buttonId == 8) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 77:
			if(buttonId == 11) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 93:
			if(buttonId == 8) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 81:
			if(buttonId == 10) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 82:
			if(buttonId == 10) {
				player.getSpecials().setActive(!player.getSpecials().isActive());
			} else {
				handleWeaponInterfaceButton(player, buttonId);
			}
			break;
		case 153:
			/*
			 * Noob death.
			 */
			if(buttonId == 89) {
				player.getSettings().setHideDeathInterface(true);
				player.getActionSender().sendCloseInterface();
			} else {
				logger.debug("Unhandled button id: 153, " + buttonId + ".");
			}
			break;
		case 382:
			/*
			 * Wilderness warning screen.
			 */
			switch(buttonId) {
			case 18:
				Wilderness.handleJump(player);
				break;
			default:
				logger.debug("Unhandled button id: 382, " + buttonId + ".");
				break;
			}
			break;
		case 387:
			/*
			 * Equipment tab.
			 */
			switch(buttonId) {
			case 55:
				player.getActionSender().sendInterface(667);
				player.getActionSender().sendInventoryInterface(670);
				player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
				player.getActionSender().sendItems(-1, 64208, 94, player.getEquipment().getContainer());
				break;
			default:
				logger.debug("Unhandled button id: 387, " + buttonId + ".");
				break;
			}
			break;
		case 182:
			/*
			 * Logout.
			 */
			player.getActionSender().sendLogout();
			break;
		case 746:
		case 548:
			switch(buttonId) {
			case 60:
				/*
				 * Show world map.
				 */
				// TODO make it work well
				// player.getActionSender().sendWindowPane(755);
				break;
			default:
				logger.debug("Unhandled button id: 548, " + buttonId + ".");
			}
			break;
		case 750:
		case 261:
			switch(buttonId) {
			case 1:
				/*
				 * Toggle run.
				 */
				if(!player.getWalkingQueue().isRunToggled()) {
					player.getWalkingQueue().setRunToggled(true);
					player.getActionSender().sendConfig(173, 1);
				} else {
					player.getWalkingQueue().setRunToggled(false);
					player.getActionSender().sendConfig(173, 0);
				}
				break;
			case 14:
				/*
				 * Settings screen.
				 */
				player.getActionSender().sendInterface(742);
				break;
			case 16:
				/*
				 * Settings screen.
				 */
				player.getActionSender().sendInterface(743);
				break;
			case 2:
				/*
				 * Chat effects config.
				 */
				if(!player.getSettings().isChatEffectsEnabled()) {
					player.getSettings().setChatEffectsEnabled(true);
					player.getActionSender().sendConfig(171, 0);
				} else {
					player.getSettings().setChatEffectsEnabled(false);
					player.getActionSender().sendConfig(171, 1);
				}
				break;
			case 3:
				/*
				 * Split private chat config.
				 */
				if(!player.getSettings().isPrivateChatSplit()) {
					player.getSettings().setPrivateChatSplit(true);
					player.getActionSender().sendConfig(287, 1);
				} else {
					player.getSettings().setPrivateChatSplit(false);
					player.getActionSender().sendConfig(287, 0);
				}
				break;
			case 4:
				/*
				 * Mouse button config.
				 */
				if(!player.getSettings().isMouseTwoButtons()) {
					player.getSettings().setMouseTwoButtons(true);
					player.getActionSender().sendConfig(170, 0);
				} else {
					player.getSettings().setMouseTwoButtons(false);
					player.getActionSender().sendConfig(170, 1);
				}
				break;
			case 5:
				/*
				 * Accept aid config.
				 */
				if(!player.getSettings().isAcceptAidEnabled()) {
					player.getSettings().setAcceptAidEnabled(true);
					player.getActionSender().sendConfig(427, 1);
				} else {
					player.getSettings().setAcceptAidEnabled(false);
					player.getActionSender().sendConfig(427, 0);
				}
				break;
			default:
				logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + ".");
				break;
			}
			break;
		case 755:
			switch(buttonId) {
			case 9:
				/*
				 * Close world map.
				 */
				// TODO make it work well.
				// player.getActionSender().sendWindowPane(548);
				// player.getSession().write(new StaticPacketBuilder().setId(173).toPacket());
				break;
			default:
				logger.debug("Unhandled button id: 755, " + buttonId + ".");
				break;
			}
			break;
		case 378:
			/*
			 * Welcome screen
			 */
			switch(buttonId) {
			case 140:
				/*
				 * Close the welcome screen.
				 */
				player.getActionSender().sendWindowPane(548);
				break;
			default:
				logger.debug("Unhandled button id: 378, " + buttonId + ".");
			}
			break;
		case 464:
			/*
			 * Emote tab.
			 */
			if(!Emotes.emote(player, buttonId)) {
				logger.debug("Unhandled button id: 464, " + buttonId + ".");
			}
			break;
		case 320:
			/*
			 * Skills tab.
			 */
			boolean lvlup = false;
			int skillMenu = -1;
			switch(buttonId) {
			case 125: //Attack
				skillMenu = 1;
				if(player.getTemporaryAttribute("leveledUp[0]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 1);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 10);
				}
		        break;
		    case 126: //Strength
				skillMenu = 2;
				if(player.getTemporaryAttribute("leveledUp[2]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 2);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 20);
				}
		        break;
		    case 127: //Defence
				skillMenu = 5;
				if(player.getTemporaryAttribute("leveledUp[1]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 5);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 40);
				}
		        break;
		    case 128: //Ranged
				skillMenu = 3;
				if(player.getTemporaryAttribute("leveledUp[4]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 3);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 30);
				}
		        break;
		    case 129: //Prayer
				if(player.getTemporaryAttribute("leveledUp[5]") != Boolean.TRUE) {
					skillMenu = 7;
					player.getActionSender().sendConfig(965, 7);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 60);
				}
		        break;
		    case 130: //Magic
				if(player.getTemporaryAttribute("leveledUp[6]") != Boolean.TRUE) {
					skillMenu = 4;
					player.getActionSender().sendConfig(965, 4);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 33);
				}
		        break;
		    case 131: //Runecrafting
				if(player.getTemporaryAttribute("leveledUp[20]") != Boolean.TRUE) {
					skillMenu = 12;
					player.getActionSender().sendConfig(965, 12);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 100);
				}
		        break;
		    case 132: //Construction
				skillMenu = 22;
				if(player.getTemporaryAttribute("leveledUp[21]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 22);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 698);
				}
		        break;
		    case 133: //Hitpoints
				skillMenu = 6;
				if(player.getTemporaryAttribute("leveledUp[3]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 6);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 50);
				}
		        break;
		    case 134: //Agility
				skillMenu = 8;
				if(player.getTemporaryAttribute("leveledUp[16]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 8);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 65);
				}
		        break;
		    case 135: //Herblore
				skillMenu = 9;
				if(player.getTemporaryAttribute("leveledUp[15]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 9);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 75);
				}
		        break;
		    case 136: //Thieving
				skillMenu = 10;
				if(player.getTemporaryAttribute("leveledUp[17]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 10);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 80);
				}
		        break;
		    case 137: //Crafting
				skillMenu = 11;
				if(player.getTemporaryAttribute("leveledUp[12]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 11);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 90);
				}
		        break;
		    case 138: //Fletching
				skillMenu = 19;
				if(player.getTemporaryAttribute("leveledUp[9]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 19);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 665);
				}
		        break;
		    case 139: //Slayer
				skillMenu = 20;
				if(player.getTemporaryAttribute("leveledUp[18]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 20);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 673);
				}
		        break;
		    case 140: //Hunter
				skillMenu = 23;
				if(player.getTemporaryAttribute("leveledUp[22]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 23);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 689);
				}
		        break;
		    case 141: //Mining
				skillMenu = 13;
				if(player.getTemporaryAttribute("leveledUp[14]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 13);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 110);
				}
		        break;
		    case 142: //Smithing
				skillMenu = 14;
				if(player.getTemporaryAttribute("leveledUp[13]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 14);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 115);
				}
		        break;
		    case 143: //Fishing
				skillMenu = 15;
				if(player.getTemporaryAttribute("leveledUp[10]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 15);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 120);
				}
		        break;
		    case 144: //Cooking
				skillMenu = 16;
				if(player.getTemporaryAttribute("leveledUp[7]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 16);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 641);
				}
		        break;
		    case 145: //Firemaking
				skillMenu = 17;
				if(player.getTemporaryAttribute("leveledUp[11]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 17);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 649);
				}
		        break;
		    case 146: //Woodcutting
				skillMenu = 18;
				if(player.getTemporaryAttribute("leveledUp[8]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 18);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 660);
				}
		        break;
		    case 147: //Farming
				skillMenu = 21;
				if(player.getTemporaryAttribute("leveledUp[19]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 21);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 681);
				}
		        break;
		    case 148: //Summoning
				skillMenu = 24;
				if(player.getTemporaryAttribute("leveledUp[23]") != Boolean.TRUE) {
					player.getActionSender().sendConfig(965, 24);
				} else {
					lvlup = true;
					player.getActionSender().sendConfig(1230, 705);
				}
		        break;
			}
			if(lvlup) {
				player.getActionSender().sendInterface(741);
			} else {
				player.getActionSender().sendInterface(499);
			}
			for(int i = 0; i < 25; i++) {
				player.removeTemporaryAttribute("leveledUp["+i+"]");
			}
			if(skillMenu != -1) {
				player.setTemporaryAttribute("skillMenu", skillMenu);
			}
			break;
		case 499:
			/*
			 * Skill information.
			 */
			skillMenu = -1;
			if(player.getTemporaryAttribute("skillMenu") != null) {
				skillMenu = (Integer) player.getTemporaryAttribute("skillMenu");
			}
			switch(buttonId) {
			case 10:
				player.getActionSender().sendConfig(965, skillMenu);
				break;
			case 11:
				player.getActionSender().sendConfig(965, 1024 + skillMenu);
				break;
			case 12:
				player.getActionSender().sendConfig(965, 2048 + skillMenu);
				break;
			case 13:
				player.getActionSender().sendConfig(965, 3072 + skillMenu);
				break;
			case 14:
				player.getActionSender().sendConfig(965, 4096 + skillMenu);
				break;
			case 15:
				player.getActionSender().sendConfig(965, 5120 + skillMenu);
				break;
			case 16:
				player.getActionSender().sendConfig(965, 6144 + skillMenu);
				break;
			case 17:
				player.getActionSender().sendConfig(965, 7168 + skillMenu);
				break;
			case 18:
				player.getActionSender().sendConfig(965, 8192 + skillMenu);
				break;
			case 19:
				player.getActionSender().sendConfig(965, 9216 + skillMenu);
				break;
			case 20:
				player.getActionSender().sendConfig(965, 10240 + skillMenu);
				break;
			case 21:
				player.getActionSender().sendConfig(965, 11264 + skillMenu);
				break;
			case 22:
				player.getActionSender().sendConfig(965, 12288 + skillMenu);
				break;
			case 23:
				player.getActionSender().sendConfig(965, 13312 + skillMenu);
				break;
			}
		case 763:
			/*
			 * Inventory interface with banking.
			 */
			if(buttonId == 0) {
				switch(packet.getId()) {
				case 233:
					player.getBank().bankItem(buttonId2, 1);
					break;
				case 21:
					player.getBank().bankItem(buttonId2, 5);
					break;
				case 169:
					player.getBank().bankItem(buttonId2, 10);
					break;
				case 232:
					player.getBank().bankItem(buttonId2, -100);
					break;
				}
			}
			break;
		case 762:
			/*
			 * Bank interface.
			 */
			if(buttonId == 73) {
				switch(packet.getId()) {
				case 233:
					player.getBank().withdrawItem(buttonId2, 1);
					break;
				case 21:
					player.getBank().withdrawItem(buttonId2, 5);
					break;
				case 169:
					player.getBank().withdrawItem(buttonId2, 10);
					break;
				case 232:
					player.getBank().withdrawItem(buttonId2, -100);
					break;
				}
			}
			break;
		case 620:
			/*
			 * Shop interface.
			 */
			if(buttonId == 26) {
				if(player.getShopConfiguration().isShopping()) {
					player.getShopConfiguration().setIsInMainStock(false);
					player.getActionSender().sendShopTab(player.getShopConfiguration().isInMainStock(), player.getShopConfiguration().getCurrentShop().isGeneralStore());
					player.getShopConfiguration().getCurrentShop().refresh(player);
				}
			} else if(buttonId == 25) {
				if(player.getShopConfiguration().isShopping()) {
					player.getShopConfiguration().setIsInMainStock(true);
					player.getActionSender().sendShopTab(player.getShopConfiguration().isInMainStock(), player.getShopConfiguration().getCurrentShop().isGeneralStore());
					player.getShopConfiguration().getCurrentShop().refresh(player);
				}
			} else if(buttonId == 24) {
				switch(packet.getId()) {
				case 233:
					/*
					 * Value.
					 */
					World.getInstance().getShopManager().getValueShop(player, buttonId2);
					break;
				case 21:
					/*
					 * Buy 1.
					 */
					World.getInstance().getShopManager().buy(player, buttonId2, 1);
					break;
				case 169:
					/*
					 * Buy 5.
					 */
					World.getInstance().getShopManager().buy(player, buttonId2, 5);
					break;
				case 214:
					/*
					 * Buy 10.
					 */
					World.getInstance().getShopManager().buy(player, buttonId2, 10);
					break;
				case 173:
					/*
					 * Buy 50.
					 */
					World.getInstance().getShopManager().buy(player, buttonId2, 50);
					break;
				case 90:
					/*
					 * Examine.
					 */
					World.getInstance().getShopManager().examineShop(player, buttonId2);
					break;
				}
			} else {
				logger.debug("Unhandled button id: 620, " + buttonId + ".");
			}
			break;
		case 621:
			/*
			 * Shop inventory interface.
			 */
			if(buttonId == 0) {
				switch(packet.getId()) {
				case 233:
					/*
					 * Value.
					 */
					World.getInstance().getShopManager().getValueInventory(player, buttonId2);
					break;
				case 21:
					/*
					 * Sell 1.
					 */
					World.getInstance().getShopManager().sell(player, buttonId2, 1);
					break;
				case 169:
					/*
					 * Sell 5.
					 */
					World.getInstance().getShopManager().sell(player, buttonId2, 5);
					break;
				case 214:
					/*
					 * Sell 10.
					 */
					World.getInstance().getShopManager().sell(player, buttonId2, 10);
					break;
				case 173:
					/*
					 * Sell 50.
					 */
					World.getInstance().getShopManager().sell(player, buttonId2, 50);
					break;
				case 232:
					/*
					 * Examine.
					 */
					World.getInstance().getShopManager().examineInventory(player, buttonId2, 1);
					break;
				}
			} else {
				logger.debug("Unhandled button id: 621, " + buttonId + ".");
			}
			break;
		default:
			logger.debug("Unhandled button id: " + interfaceId + ", " + buttonId + ".");
		}
	}

	private void handleWeaponInterfaceButton(Player player, int buttonId) {
		switch(buttonId) {
		case 2:
			player.setAttackStyle(1);
			break;
		case 3:
			player.setAttackStyle(2);
			break;
		case 4:
			player.setAttackStyle(4);
			break;
		case 5:
			player.setAttackStyle(3);
			break;
		case 24:
		case 25:
		case 26:
		case 27:
			player.getSettings().setAutoRetaliate(!player.getSettings().isAutoRetaliate());
			player.getSettings().refresh();
			break;
		}
	}
	
}
