package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.NPCDefinition;
import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Handles examining.
 * @author Graham
 *
 */
public class ExaminePacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 38:
			int id = packet.readLEShortA();
			player.getActionSender().sendMessage(ItemDefinition.forId(id).getExamine());
			break;
		case 88:
			id = packet.readShort();
			NPCDefinition def = NPCDefinition.forId(id);
			if(def == null) {
				player.getActionSender().sendMessage("It's an NPC!");
			} else {
				player.getActionSender().sendMessage(def.getExamine());
			}
			break;
		case 84:
			id = packet.readShort();
			player.getActionSender().sendMessage("It's an object!");
			break;
		}
	}

}
