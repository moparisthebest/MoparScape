package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

/**
 * Handles friends, ignores and PMs.
 * @author Graham
 *
 */
public class FriendsPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		long name = packet.readLong();
		if(packet.getId() == 30) {
			player.getFriends().addFriend(name);
		} else if(packet.getId() == 61) {
			player.getFriends().addIgnore(name);
		} else if(packet.getId() == 132) {
			player.getFriends().removeFriend(name);
		} else if(packet.getId() == 2) {
			player.getFriends().removeIgnore(name);
		} else if(packet.getId() == 178) {
			sendMessage(player, session, packet, name);
		}
	}
	
	private void sendMessage(Player player, IoSession session, Packet packet, long name) {
		int numChars = packet.readByte()  & 0xFF;
		String text  = Misc.decryptPlayerChat(packet, numChars);
		player.getFriends().sendMessage(name, text);
	}

}
