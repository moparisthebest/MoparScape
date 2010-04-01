package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.ChatMessage;
import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.util.Misc;

/**
 * Chat packet handler.
 * @author Graham
 *
 */
public class ChatPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		int effects  = packet.readShort() & 0xFFFF;
		int numChars = packet.readByte()  & 0xFF;
		String text  = Misc.decryptPlayerChat(packet, numChars);
		/*byte[] bytes = new byte[500];
		bytes[0] = (byte) text.length();
		Misc.encryptPlayerChat(bytes, 0, 1, text.length(), text.getBytes());*/
		player.setLastChatMessage(new ChatMessage(effects, numChars, text));
		player.getUpdateFlags().setChatTextUpdateRequired(true);
	}

}
