package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

public class HdNotificationPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		player.setHd(true);
	}

}
