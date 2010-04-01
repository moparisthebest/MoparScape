package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Handles an 'idle' packet.
 * @author Graham
 *
 */
public class IdlePacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		player.getActionSender().sendLogout();
	}

}
