package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Packet handler interface.
 * @author Graham
 *
 */
public interface PacketHandler {
	
	public void handlePacket(Player player, IoSession session, Packet packet);

}
