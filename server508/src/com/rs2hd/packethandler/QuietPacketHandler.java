package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Null packet handlers.
 * @author Graham
 *
 */
public class QuietPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		
	}

}
