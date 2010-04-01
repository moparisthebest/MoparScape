package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;

/**
 * Handles walking packets.
 * @author Graham
 *
 */
public class WalkPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		player.setAttacking(false);
		
		int size = packet.getLength();
		if(packet.getId() == 119) {
			size -= 14;
		}
		
		player.getWalkingQueue().reset();
		
		int steps = (size - 5) / 2;
		int[][] path = new int[steps][2];
		
		int firstX = packet.readLEShortA() - (player.getLocation().getRegionX() - 6) * 8;
		int firstY = packet.readShortA()   - (player.getLocation().getRegionY() - 6) * 8;
		boolean runSteps = packet.readByteC() == 1;
		player.getWalkingQueue().setIsRunning(runSteps);
		player.getWalkingQueue().addToWalkingQueue(firstX, firstY);
		for(int i = 0; i < steps; i++) {
			path[i][0] = packet.readByte()  + firstX;
			path[i][1] = packet.readByteS() + firstY;
			player.getWalkingQueue().addToWalkingQueue(path[i][0], path[i][1]);
		}
	}

}
