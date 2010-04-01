package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.content.LevelUp;
import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Handles removing of interfaces.
 * @author Graham
 *
 */
public class RemoveInterfacePacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 63:
			if(player.getTemporaryAttribute("leveledUp") != null) {
				player.getActionSender().sendConfig(1179, LevelUp.SKILL_FLASH[(Integer) player.getTemporaryAttribute("leveledUp")]);
				player.removeTemporaryAttribute("leveledUp");
			}
			player.getActionSender().sendCloseChatboxInterface();
			break;
		case 108:
			if(player.getTemporaryAttribute("skillMenu") != null) {
				player.getActionSender().sendConfig(1179, 0);
				player.removeTemporaryAttribute("skillMenu");
			}
			player.getActionSender().sendCloseInterface();
			break;
		}
	}

}
