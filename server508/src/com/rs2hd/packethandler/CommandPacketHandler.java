package com.rs2hd.packethandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.mina.common.IoSession;

import com.rs2hd.content.Combat;
import com.rs2hd.model.Container;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.Skills;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;

/**
 * Handles any commands sent to the client.
 * @author Graham
 *
 */
public class CommandPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		String command = packet.readRS2String();
		String[] cmd = command.split(" ");
		cmd[0] = cmd[0].toLowerCase();
		
		try {
			if(cmd[0].equals("coords")) {
				player.getActionSender().sendMessage("Your position is: x: " + player.getLocation().getX() + ", y: " + player.getLocation().getY() + ", z: " + player.getLocation().getZ() + ".");
			} else if(cmd[0].equals("tele")) {
				if(cmd.length == 3 || cmd.length == 4) {
					int x = Integer.valueOf(cmd[1]);
					int y = Integer.valueOf(cmd[2]);
					int z = 0;
					if(cmd.length == 4) {
						z = Integer.valueOf(cmd[3]);
					}
					player.teleport(Location.location(x, y, z));
				} else {
					player.getActionSender().sendMessage("Syntax is: ::tele <x> <y> [z=0].");
				}
			} else if(cmd[0].equals("item")) {
				if(cmd.length == 2 || cmd.length == 3) {
					int item = Integer.valueOf(cmd[1]);
					int amount = 1;
					if(cmd.length == 3) {
						amount = Integer.valueOf(cmd[2]);
					}
					player.getInventory().addItem(item, amount);
				} else {
					player.getActionSender().sendMessage("Syntax is: ::item <item> [amount=1].");
				}
			} else if(cmd[0].equals("npc")) {
				if(cmd.length == 2) {
					int id = Integer.valueOf(cmd[1]);
					NPC npc = new NPC(id);
					npc.readResolve();
					npc.setLocation(player.getLocation());
					World.getInstance().getNpcList().add(npc);
					player.getActionSender().sendMessage("Internal id: " + npc.getIndex());
				} else {
					player.getActionSender().sendMessage("Syntax is ::npc <id>.");
				}
			} else if(cmd[0].equals("master")) {
				if(cmd.length == 1) {
					for(int i = 0; i < Skills.SKILL_COUNT; i++) {
						player.getSkills().addXp(i, 200000000);
					}
				} else if(cmd.length == 2) {
					int skill = Integer.valueOf(cmd[1]);
					player.getSkills().addXp(skill, 200000000);
				} else {
					player.getActionSender().sendMessage("Syntax is ::master [id=all].");
				}
			} else if(cmd[0].equals("reset")) {
				player.getSkills().reset();
			} else if(cmd[0].equals("forcereset")) {
				player.getSkills().forceReset();
			} else if(cmd[0].equals("rnl")) {
				player.setRebuildNpcList(true);
			} else if(cmd[0].equals("hit")) {
				int dmg = 0;
				if(cmd.length == 1) {
				} else if(cmd.length == 2) {
					dmg = Integer.valueOf(cmd[1]);
				} else {
					player.getActionSender().sendMessage("Syntax is ::hit [damage=0].");
					return;
				}
				player.hit(dmg);
			} else if(cmd[0].equals("dhit")) {
				int dmg = 0;
				if(cmd.length == 1) {
				} else if(cmd.length == 2) {
					dmg = Integer.valueOf(cmd[1]);
				} else {
					player.getActionSender().sendMessage("Syntax is ::dhit [damage=0].");
					return;
				}
				player.hit(dmg);
				player.hit(dmg);
			} else if(cmd[0].equals("bank")) {
				player.getBank().openBank();
			} else if(cmd[0].equals("config")) {
				if(cmd.length == 3) {
					player.getActionSender().sendConfig(Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
				} else {
					player.getActionSender().sendMessage("Syntax is ::config [id] [value].");
				}
			} else if(cmd[0].equals("interface")) {
				if(cmd.length == 2) {
					int id = Integer.valueOf(cmd[1]);
					player.getActionSender().sendInterface(id);
				} else {
					player.getActionSender().sendMessage("Syntax is ::interface <id>.");
				}
			} else if(cmd[0].equals("string")) {
				if(cmd.length == 3) {
					int id = Integer.valueOf(cmd[1]);
					int child = Integer.valueOf(cmd[2]);
					player.getActionSender().sendString("i"+id+"c"+child, id, child);
				} else {
					player.getActionSender().sendMessage("Syntax is ::interface <interface id> <child id>.");
				}
			} else if(cmd[0].equals("shop")) {
				Container<Item> stuff = new Container<Item>(60, false);
				stuff.forceAdd(new Item(1931, 10));
				stuff.forceAdd(new Item(1935, 10));
				stuff.forceAdd(new Item(1735, 10));
				stuff.forceAdd(new Item(1925, 10));
				stuff.forceAdd(new Item(1923, 10));
				stuff.forceAdd(new Item(1887, 10));
				stuff.forceAdd(new Item(590,  10));
				stuff.forceAdd(new Item(1755, 10));
				stuff.forceAdd(new Item(2347, 10));
				stuff.forceAdd(new Item(550,  10));
				stuff.forceAdd(new Item(9003, 10));
				player.getActionSender().sendConfig2(118, 17);
				player.getActionSender().sendShopOptions();
				player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
				player.getActionSender().sendItems(-1, 64285, 17, stuff);
				player.getActionSender().sendString("General Store", 620, 22);
				player.getActionSender().sendShopTab(true, true);
				player.getActionSender().sendInterface(620);
				player.getActionSender().sendInventoryInterface(621);
			} else if(cmd[0].equals("iconfig")) {
				if(cmd.length == 4) {
					int inter = Integer.valueOf(cmd[1]);
					int child = Integer.valueOf(cmd[2]);
					boolean set = cmd[3].equals("true") ? true : false;
					player.getActionSender().sendInterfaceConfig(inter, child, set);
				} else {
					player.getActionSender().sendMessage("Syntax is ::iconfig <interface id> <child id> <set>");
				}
			} else if(cmd[0].equals("help")) {
				String file = "index";
				if(cmd.length == 2) {
					file = cmd[1];
					if(!file.matches("[A-Za-z ]+")) {
						file = "index";
					}
				}
				String name = com.rs2hd.Main.workingDir+"data/help/"+file+".txt";
				File f = new File(name);
				if(!f.exists()) {
					player.getActionSender().sendMessage("Type ::help for help.");
					return;
				}
				BufferedReader reader = new BufferedReader(new FileReader(f));
				String title = reader.readLine();
				if(title == null) {
					return;
				}
				List<String> lines = new ArrayList<String>();
				String line = null;
				while((line = reader.readLine()) != null) {
					lines.add(line);
				}
				String[] data = lines.toArray(new String[0]);
				player.getActionSender().sendQuestInterface(title, data);
			} else if(cmd[0].equals("npcattack")) {
				if(cmd.length == 3) {
					NPC n1 = World.getInstance().getNpcList().get(Integer.valueOf(cmd[1]));
					NPC n2 = World.getInstance().getNpcList().get(Integer.valueOf(cmd[2]));
					Combat.attack(n1, n2);
				} else {
					player.getActionSender().sendMessage("Invalid syntax, use: [id1] [id2].");
				}
			} else if(cmd[0].equals("tonpc")) {
				player.getAppearance().transformToNpc(0);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
			} else if(cmd[0].equals("toplayer")) {
				player.getAppearance().transformToPlayer();
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
			} else {
				ScriptManager.getInstance().call("command_"+cmd[0], player, cmd);
			}
		} catch(Exception e) {
			player.getActionSender().sendMessage("Malformed command or error: " + e.getMessage() + ".");
			e.printStackTrace();
		}
	}

}
