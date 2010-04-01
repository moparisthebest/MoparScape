package com.rs2hd.net;

import org.apache.mina.common.IoFuture;
import org.apache.mina.common.IoFutureListener;

import com.rs2hd.model.Bonuses;
import com.rs2hd.model.Container;
import com.rs2hd.model.Entity;
import com.rs2hd.model.FloorItem;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet.Size;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.script.ScriptManager;
import com.rs2hd.util.Misc;

/**
 * Outgoing packets that we send so the end user does not have to mess with the builders.
 * @author Graham
 *
 */
public class ActionSender {
	
	private Player player;
	
	public ActionSender(Player player) {
		this.player = player;
	}
	
	public void sendCreateObject(int objectId, int height, int objectX, int objectY, int face, int type) {
		// credits to lewii
		sendCoords(Location.location(objectX, objectY, player.getLocation().getZ()));
		int ot = ((type << 2) + (face & 3));
		player.getSession().write(new StaticPacketBuilder().setId(30)
		.addLEShort(objectId)
		.addByteA(0)
		.addByteC(ot).toPacket());
	}
		
	public void sendPlayerOption(String option, int slot, boolean top) {
		player.getSession().write(new StaticPacketBuilder().setId(252).setSize(Packet.Size.VariableByte)
		.addByteC(top ? 1 : 0)
		.addString(option)
		.addByteC(slot).toPacket());
	}
	
	public void sendQuestInterface(String title, String[] lines) {
		sendInterface(275);
		sendString(title, 275, 2);
		for(int i = 0; i < 300; i++) {
			sendString("", 275, (i+11));
		}
		for(int i = 0; i < lines.length; i++) {
			sendString(lines[i], 275, (i+11));
		}
	}
	
	public void sendSound(int sound, int volume, int delay) {
		player.getSession().write(new StaticPacketBuilder().setId(119).addShort(sound).addByte((byte) volume).addShort(delay).toPacket());
	}
	
	public void sendCloseInterface(int windowId, int position) {
		player.getSession().write(new StaticPacketBuilder().setId(246).addInt(windowId << 16 | position).toPacket());
	}
	
	public void sendInterfaceConfig(int interfaceId, int childId, boolean set) {
		player.getSession().write(new StaticPacketBuilder().setId(59).addByteC(set ? 1 : 0).addShort(childId).addShort(interfaceId).toPacket());
	}
	
	public void sendCloseInterface() {
		if(player.isHd()) {
			sendCloseInterface(746, 3);
			sendCloseInterface(746, 8);
		}
		sendCloseInterface(548, 8);
	}
	
	public void sendInterface(int id) {
		sendCloseInterface();
		if(player.isHd()) {
			sendInterface(0, 746, 3, id);
			sendInterface(0, 746, 8, id);
		}
		sendInterface(0, 548, 8, id);
	}
	
	public void sendSkillLevels() {
		for(int i = 0; i < Skills.SKILL_COUNT; i++) {
			sendSkillLevel(i);
		}
	}
	
	public void sendSkillLevel(int skill) {
		player.getSession().write(new StaticPacketBuilder().setId(217)
			.addByteC(player.getSkills().getLevel(skill))
			.addInt2((int) player.getSkills().getXp(skill))
			.addByteC(skill)
		.toPacket());
	}
	
	public void sendLogout() {
		player.getSession().write(new StaticPacketBuilder().setId(104).toPacket()).addListener(new IoFutureListener() {
			@Override
			public void operationComplete(IoFuture arg0) {
				arg0.getSession().close();
			}
		});
	}
	
	public void sendLogin() {
		sendMapRegion();
		sendWelcomeScreen();
		sendTab(6, 745);
		sendTab(11, 751); // Chat options
		sendTab(68, 752); // Chatbox
		sendTab(64, 748); // HP bar
		sendTab(65, 749); // Prayer bar
		sendTab(66, 750); // Energy bar
		sendTab(67, 747);
		sendConfig(1160, -1);
		sendTab(8, 137); // Playername on chat
		sendTab(73,  92); // Attack tab
		sendTab(74, 320); // Skill tab
		sendTab(75, 274); //  Quest tab
		sendTab(76, 149); // Inventory tab
		sendTab(77, 387); // Equipment tab
		sendTab(78, 271); // Prayer tab
		sendTab(79, 192); // Magic tab
		sendTab(81, 550); // Friend tab
		sendTab(82, 551); // Ignore tab
		sendTab(83, 589); // Clan tab
		sendTab(84, 261); // Setting tab
		sendTab(85, 464); // Emote tab
		sendTab(86, 187); // Music tab
		sendTab(87, 182); // Logout tab
		sendSkillLevels();
		sendEnergy();
		player.getFriends().refresh();
		player.getInventory().refresh();
		player.getEquipment().refresh();
		player.getSettings().refresh();
		player.getSpecials().refresh();
		player.updateWildernessState();
		sendPlayerOption("Trade with", 2, false);
		sendPlayerOption("Follow", 3, false);
		//sendMessage("Welcome to RuneScape.");
		ScriptManager.getInstance().call("login", player);
	}
	
	private void sendWelcomeScreen() {
		sendWindowPane(549);
		sendInterface(1, 549, 2, 378);
		sendInterface(1, 549, 3, 15);
		sendString("Welcome to "+World.getInstance().configuration().getName()+".", 378, 115);
		// TODO last connection
		sendString("You are connected from: " + player.getSession().getRemoteAddress(), 378, 116);
		sendString("0", 378, 39);
		sendString("0", 378, 96);
		sendString("0 unread messages", 378, 37);
		sendString(World.getInstance().configuration().getName()+" staff will NEVER email you. We use the Message Centre on the website instead.", 378, 38);
		sendString("0 days of member credit", 378, 94);
		sendString("You have 0 days of member credit remaining. Please click here to extend your credit.", 378, 93);
		sendString("You do not have a bank pin. Please visit a bank if you would like one.", 378, 62);
		sendString("You have not yet set any recovery questions.", 378, 56);
		sendString("Message of the Week", 15, 0);
		sendString("Remember to keep your account secure: set a bank PIN, set recover questions and NEVER give away your password.", 15, 4);
	}

	public void sendHdLogin() {
		sendInterface(1, 549, 0, 746);
		sendInterface(1, 746, 13, 748); //energy orb
		sendInterface(1, 746, 14, 749); //energy orb
		sendInterface(1, 746, 15, 750); //energy orb
		//sendInterface(1, 746, 16, 747); //summing orb
		sendInterface(1, 746, 18, 751); //things below chatbox 
		sendInterface(1, 752, 8, 137); //chatbox
		sendInterface(1, 746, 65, 752); //chatbox 752
		sendInterface(1, 549, 0, 746); // Main interface
		sendInterface(1, 746, 87, 92); // Attack tab
		sendInterface(1, 746, 88, 320); // Skill tab
		sendInterface(1, 746, 89, 274); // Quest tab
		sendInterface(1, 746, 90, 149); // Inventory tab
		sendInterface(1, 746, 91, 387); // Equipment tab
		sendInterface(1, 746, 92, 271); // Prayer tab
		sendInterface(1, 746, 93, 193); // Magic tab
		//sendInterface(1, 746, 94, 662); // Summoning tab
		sendInterface(1, 746, 95, 550); // Friend tab
		sendInterface(1, 746, 96, 551); // Ignore tab
		sendInterface(1, 746, 97, 589); // Clan tab
		sendInterface(1, 746, 98, 261); // Setting tab
		sendInterface(1, 746, 99, 464); // Emote tab
		sendInterface(1, 746, 100, 187); // Music tab
		sendInterface(1, 746, 101, 182); // Logout tab
		sendInterface(1, 752, 8, 137); // Chatbox 
		sendInterface(1, 746, 65, 752); // Chatbox 752
		sendInterface(1, 746, 18, 751); // Settings below chatbox
		sendInterface(1, 746, 13, 748); // HP orb
		sendInterface(1, 746, 14, 749); // Prayer orb
		sendInterface(1, 746, 15, 750); // Energy orb
		//sendInterface(1, 746, 12, 747); // Summoning orb
		player.getEquipment().refresh();
	}
	
	public void sendFriendsStatus(int i) {
		player.getSession().write(new StaticPacketBuilder().setId(115).addByte((byte) i).toPacket());
	}
	
	public void sendSentPrivateMessage(long name, String message) {
		byte[] bytes = new byte[message.length()];
		Misc.encryptPlayerChat(bytes, 0, 0, message.length(), message.getBytes());
		player.getSession().write(new StaticPacketBuilder().setId(89).setSize(Size.VariableByte)
		.addLong(name)
		.addByte((byte) message.length())
		.addBytes(bytes)
		.toPacket());
	}
	
	public void sendReceivedPrivateMessage(long name, int rights, String message) {
		int messageCounter = player.getFriends().getNextUniqueId();
		byte[] bytes = new byte[message.length()+1];
		bytes[0] = (byte) message.length();
		Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message.getBytes());
		player.getSession().write(new StaticPacketBuilder().setId(178).setSize(Size.VariableByte)
		.addLong(name)
		.addShort(1)
		.addBytes(new byte[] { (byte) ((messageCounter << 16) & 0xFF), (byte) ((messageCounter << 8) & 0xFF), (byte) (messageCounter & 0xFF)} )
		.addByte((byte) rights)
		.addBytes(bytes).toPacket());
	}
	
	public void sendFriend(long name, int world) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(154).setSize(Size.VariableByte)
		.addLong(name)
		.addShort(world)
		.addByte((byte) 1);
		if(world != 0) {
			if(world == player.getWorld()) {
				spb.addString("Online");
			} else {
				spb.addString("RuneScape " + world);
			}
		}
		player.getSession().write(spb.toPacket());
	}
	
	public void sendIgnores(long[] names) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(240).setSize(Size.VariableShort);
		for(long name : names) {
			spb.addLong(name);
		}
		player.getSession().write(spb.toPacket());
	}
	
	/*public void sendMapRegion2() {
		if(!validateMapRegion()) {
			player.getActionSender().sendMessage("This area of the world is unavailable, teleporting to spawn point...");
			player.setLocation(Entity.DEFAULT_LOCATION);
			sendMapRegion();
			return;
		}
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(173).setSize(Packet.Size.VariableShort);
		spb.addByteA(player.getLocation().getZ());
		spb.addShort(player.getLocation().getRegionY());
		spb.addShortA(player.getLocation().getLocalX());
		spb.initBitAccess();
		for(int height = 0; height < 4; height++) {
			for(int xCalc = (player.getLocation().getRegionX() - 6); xCalc <= (player.getLocation().getRegionX() + 6); xCalc++) {
				for(int yCalc = (player.getLocation().getRegionY() - 6); yCalc <= (player.getLocation().getRegionY() + 6); yCalc++) {
					if(height == player.getLocation().getZ()) {
						spb.addBits(1, 1);
						spb.addBits(26, (xCalc << 14) | (yCalc << 3));
					} else {
						spb.addBits(1, 0);
					}
				}
			}
		}
		spb.finishBitAccess();
		for(int xCalc = (player.getLocation().getRegionX() - 6) / 8; xCalc <= ((player.getLocation().getRegionX() + 6) / 8); xCalc++) {
			for(int yCalc = (player.getLocation().getRegionY() - 6) / 8; yCalc <= ((player.getLocation().getRegionY() + 6) / 8); yCalc++) {
				int region = yCalc + (xCalc << 8);
				int[] mapData = World.getInstance().getMapData(region);
				if(mapData == null) {
					mapData = new int[4];
					for(int i = 0; i < 4; i++) {
						mapData[i] = 0;
					}
				}
				spb.addInt(mapData[0]);
				spb.addInt(mapData[1]);
				spb.addInt(mapData[2]);
				spb.addInt(mapData[3]);
			}
		}
		spb.addShortA(player.getLocation().getLocalY());
		spb.addShortA(player.getLocation().getRegionX());
		player.getSession().write(spb.toPacket());
		player.getUpdateFlags().setLastRegion(player.getLocation());
		World.getInstance().getItemManager().refresh(player);
	}*/

	public void sendMapRegion() {
		if(!validateMapRegion()) {
			player.getActionSender().sendMessage("This area of the world is unavailable, teleporting to spawn point...");
			player.setLocation(Entity.DEFAULT_LOCATION);
		}
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(142).setSize(Packet.Size.VariableShort);
		boolean forceSend = true;
		if((((player.getLocation().getRegionX() / 8) == 48) || ((player.getLocation().getRegionX() / 8) == 49)) && ((player.getLocation().getRegionY() / 8) == 48)) {
			forceSend = false;
		}
		if(((player.getLocation().getRegionX() / 8) == 48) && ((player.getLocation().getRegionY() / 8) == 148)) {
			forceSend = false;
		}
		spb.addShortA(player.getLocation().getRegionX());
		spb.addLEShortA(player.getLocation().getLocalY());
		spb.addShortA(player.getLocation().getLocalX());
		for(int xCalc = (player.getLocation().getRegionX() - 6) / 8; xCalc <= ((player.getLocation().getRegionX() + 6) / 8); xCalc++) {
			for(int yCalc = (player.getLocation().getRegionY() - 6) / 8; yCalc <= ((player.getLocation().getRegionY() + 6) / 8); yCalc++) {
				int region = yCalc + (xCalc << 8); // 1786653352
				if(forceSend || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147) && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
					int[] mapData = World.getInstance().getMapData(region);
					if(mapData == null) {
						mapData = new int[4];
						for(int i = 0; i < 4; i++) {
							mapData[i] = 0;
						}
					}
					spb.addInt(mapData[0]);
					spb.addInt(mapData[1]);
					spb.addInt(mapData[2]);
					spb.addInt(mapData[3]);
				}
			}
		}
		spb.addByteC(player.getLocation().getZ());
		spb.addShort(player.getLocation().getRegionY());
		player.getSession().write(spb.toPacket());
		player.getUpdateFlags().setLastRegion(player.getLocation());
		World.getInstance().getItemManager().refresh(player);
	}
	
	private boolean validateMapRegion() {
		boolean hasMapData = true;
		boolean forceSend = true;
		if((((player.getLocation().getRegionX() / 8) == 48) || ((player.getLocation().getRegionX() / 8) == 49)) && ((player.getLocation().getRegionY() / 8) == 48)) {
			forceSend = false;
		}
		if(((player.getLocation().getRegionX() / 8) == 48) && ((player.getLocation().getRegionY() / 8) == 148)) {
			forceSend = false;
		}
		for(int xCalc = (player.getLocation().getRegionX() - 6) / 8; xCalc <= ((player.getLocation().getRegionX() + 6) / 8); xCalc++) {
			for(int yCalc = (player.getLocation().getRegionY() - 6) / 8; yCalc <= ((player.getLocation().getRegionY() + 6) / 8); yCalc++) {
				int region = yCalc + (xCalc << 8); // 1786653352
				if(forceSend || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147) && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
					int[] mapData = World.getInstance().getMapData(region);
					if(mapData == null) {
						hasMapData = false;
					}
				}
			}
		}
		return hasMapData;
	}

	public void sendWindowPane(int pane) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(239).addShort(pane).addByteA(0);
		player.getSession().write(spb.toPacket());
	}
	
	public void sendTab(int tabId, int childId) {
		sendInterface(1, childId == 137 ? 752 : 548, tabId, childId);
		if(player.isHd()) {
			sendInterface(1, childId == 137 ? 752 : 746, tabId, childId);
		}
	}
	
	public void sendInterface(int showId, int windowId, int interfaceId, int childId) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(93).addShort(childId).addByteA(showId).addShort(windowId).addShort(interfaceId);
		player.getSession().write(spb.toPacket());
	}
	
	public void sendConfig(int id, int value) {
		if(value < 128) {
			sendConfig1(id, value);
		} else {
			sendConfig2(id, value);
		}
	}
	
	public void sendConfig1(int id, int value) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(100).addShortA(id).addByteA(value);
		player.getSession().write(spb.toPacket());
	}
	
	public void sendConfig2(int id, int value) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(161).addShort(id).addInt1(value);
		player.getSession().write(spb.toPacket());
	}
	
	public void sendMessage(String message) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(218).setSize(Size.VariableByte).addString(message);
		player.getSession().write(spb.toPacket());
	}

	public void sendItems(int interfaceId, int childId, int type, Container<Item> inventory) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(255).setSize(Size.VariableShort);
		spb.addShort(interfaceId).addShort(childId).addShort(type).addShort(inventory.getSize());
		for(int i = 0; i < inventory.getSize(); i++) {
			Item item = inventory.get(i);
			int id, amt;
			if(item == null) {
				id = -1;
				amt = 0;
			} else {
				id = item.getDefinition().getId();
				amt = item.getAmount();
			}
			if(amt > 254) {
				spb.addByteS(255);
				spb.addInt2(amt);
			} else {
				spb.addByteS(amt);
			}
			spb.addLEShort(id+1);
		}
		player.getSession().write(spb.toPacket());
	}
	
	public void sendString(String string, int interfaceId, int childId) {
		int sSize = string.length() + 5;
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(179)
		.addByte((byte) (sSize / 256))
		.addByte((byte) (sSize % 256))
		.addString(string)
		.addShort(childId)
		.addShort(interfaceId);
		player.getSession().write(spb.toPacket());
	}

	public void sendChatboxInterface(int childId) {
		sendInterface(1, 752, 8, childId);
	}
	
	public void sendCloseChatboxInterface() {
		sendInterface(1, 752, 8, 137);
	}

	public void sendInventoryInterface(int childId) {
		if(player.isHd()) {
			sendInterface(0, 746, 71, childId);
		}
		sendInterface(0, 548, 71, childId);
	}

	public void sendBankOptions() {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(223)
		.addShort(496)
		.addLEShortA(0)
		.addLEShort(73)
		.addLEShort(762)
		.addLEShort(1278)
		.addLEShort(20);
		player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setId(223)
		.addShort(27)
		.addLEShortA(0)
		.addLEShort(0)
		.addLEShort(763)
		.addLEShort(1150)
		.addLEShort(18);
		player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setSize(Packet.Size.VariableShort).setId(152)
		.addString("")
		.addInt(1451);
		player.getSession().write(spb.toPacket());
	}
	
	public void sendShopTab(boolean isMainStock, boolean isGeneralStore) {
		// player.getActionSender().sendInterfaceConfig(620, 24, true); - main inv screen
		if(isMainStock) {
			player.getActionSender().sendInterfaceConfig(620, 23, false);
			player.getActionSender().sendInterfaceConfig(620, 29, false);
			player.getActionSender().sendInterfaceConfig(620, 25, true);
			player.getActionSender().sendInterfaceConfig(620, 27, true);
			player.getActionSender().sendInterfaceConfig(620, 26, false);
		} else {
			player.getActionSender().sendInterfaceConfig(620, 23, true);
			player.getActionSender().sendInterfaceConfig(620, 29, true);
			player.getActionSender().sendInterfaceConfig(620, 25, false);
			player.getActionSender().sendInterfaceConfig(620, 27, false);
			player.getActionSender().sendInterfaceConfig(620, 26, true);
		}
		if(isGeneralStore) {
			player.getActionSender().sendInterfaceConfig(620, 34, false);
		} else {
			player.getActionSender().sendInterfaceConfig(620, 34, true);
		}
	}
	
	public void sendShopOptions() {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(223)
		.addShort(10)
		.addLEShortA(0)
		.addLEShort(23)
		.addLEShort(620)
		.addLEShort(126)
		.addLEShort(0);
		//player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setId(152).setSize(Size.VariableShort)
		.addString("IviiiIsssssssss")
		.addString("null")
		.addString("null")
		.addString("null")
		.addString("Examine")
		.addString("Sell 50")
		.addString("Sell 10")
		.addString("Sell 5")
		.addString("Sell 1")
		.addString("Value")
		.addInt(-1)
		.addInt(0)
		.addInt(7)
		.addInt(4)
		.addInt(93)
		.addInt(40697856)
		.addInt(150);
		player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setId(223)
		.addShort(27)
		.addLEShortA(0)
		.addLEShort(0)
		.addLEShort(621)
		.addLEShort(126)
		.addLEShort(0);
		player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setId(152).setSize(Size.VariableShort)
		.addString("IviiiIsssssssss")
		.addString("null")
		.addString("null")
		.addString("null")
		.addString("null")
		.addString("Buy 50")
		.addString("Buy 10")
		.addString("Buy 5")
		.addString("Buy 1")
		.addString("Value")
		.addInt(-1)
		.addInt(0)
		.addInt(4)
		.addInt(10)
		.addInt(17)
		.addInt(40632344)
		.addInt(150);
		player.getSession().write(spb.toPacket());
		spb = new StaticPacketBuilder().setId(223)
		.addShort(39)
		.addLEShortA(0)
		.addLEShort(24)
		.addLEShort(620)
		.addLEShort(1086)
		.addLEShort(0);
		player.getSession().write(spb.toPacket());
	}

	public void sendEnergy() {
		player.getSession().write(new StaticPacketBuilder().setId(99).addByte((byte) player.getRunEnergy()).toPacket());
	}
	
	public void sendCoords(Location location) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(177);
		int regionX = player.getUpdateFlags().getLastRegion().getRegionX(), regionY = player.getUpdateFlags().getLastRegion().getRegionY();
		spb.addByte((byte) (location.getY()-((regionY-6)*8)));
		spb.addByteS((byte) (location.getX()-((regionX-6)*8)));
		player.getSession().write(spb.toPacket());
	}
	
	public void sendCoords(Location location, int xoff, int yoff) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(177);
		int regionX = player.getUpdateFlags().getLastRegion().getRegionX(), regionY = player.getUpdateFlags().getLastRegion().getRegionY();
		spb.addByte((byte) ((location.getY()-((regionY-6)*8))+yoff));
		spb.addByteS((byte) ((location.getX()-((regionX-6)*8))+xoff));
		player.getSession().write(spb.toPacket());
	}
	
	public void sendDestroyGroundItem(FloorItem item) {
		sendCoords(item.getLocation());
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(201);
		spb.addByte((byte) 0);
		spb.addShort(item.getId());
		player.getSession().write(spb.toPacket());
	}
	
	public void sendCreateGroundItem(FloorItem item) {
		sendCoords(item.getLocation());
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(25);
		spb.addLEShortA(item.getAmount());
		spb.addByte((byte) 0);
		spb.addLEShortA(item.getId());
		player.getSession().write(spb.toPacket());
	}

	public void sendBonus(int[] bonuses) {
		int id = 35;
		for(int i = 0; i < (bonuses.length-1); i++) {
			sendString((Bonuses.BONUS_NAMES[i] + ": " + (bonuses[i] > 0 ? "+" : "") + bonuses[i]), 667, id++);
			if(id == 45) {
				sendString((Bonuses.BONUS_NAMES[12] + ": " + (bonuses[12] > 0 ? "+" : "") + bonuses[12]), 667, id++);
				id = 47;
			}
		}
	}

	public void sendShopLoadMainStock(int shopId) {
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(152).setSize(Size.VariableShort)
		.addString("vg")
		.addInt(shopId)
		.addInt(93)
		.addInt(25);
		player.getSession().write(spb.toPacket());
	}

	public void sendOverlay(int i) {
		sendInterface(1, 548, 5, i);
	}

	public void sendRemoveOverlay() {
		sendCloseInterface(548, 5);
	}

	public void sendProjectile(Location source, Location dest, int offsetX, int offsetY, int gfx, int angle, int startHeight, int endHeight, int speed, Entity lockon) {
		sendCoords(source, -3, -2);
		StaticPacketBuilder spb = new StaticPacketBuilder().setId(112)
		.addByte((byte) angle)
		.addByte((byte) offsetX)
		.addByte((byte) offsetY)
		.addLEShort(lockon == null ? -1 : lockon.getClientIndex())
		.addShort(gfx)
		.addByte((byte) startHeight)
		.addByte((byte) endHeight)
		.addShort(51)
		.addShort(speed)
		.addByte((byte) 16)
		.addByte((byte) 64);
		player.getSession().write(spb.toPacket());
	}

}
