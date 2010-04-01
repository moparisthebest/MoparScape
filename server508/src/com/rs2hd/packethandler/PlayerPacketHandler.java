package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.content.Combat;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;

public class PlayerPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 160:
			/*
			 * Option 1.
			 */
			option1(player, session, packet);
			break;
		case 37:
			/*
			 * Option 2.
			 */
			option2(player, session, packet);
			break;
		case 227:
			/*
			 * Option 3.
			 */
			option3(player, session, packet);
			break;
		}
	}

	private void option1(final Player player, IoSession session, Packet packet) {
		int id = packet.readLEShort() & 0xFFFF;
		if(id < 0 || id >= Constants.PLAYER_CAP) {
			return;
		}
		final Player victim = World.getInstance().getPlayerList().get(id);
		if(victim == null) {
			return;
		}
		player.turnTo(victim);
		if(player.getCombatType().equals(CombatType.RANGE)) {
			Combat.attack(player, victim);
		} else {
			World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, victim.getLocation()) {
				@Override
				public void run() {
					Combat.attack(player, victim);
				}
			});
		}
	}
	
	private void option2(Player player, IoSession session, Packet packet) {
		int id = packet.readShort() & 0xFFFF;
		if(id < 0 || id >= Constants.PLAYER_CAP) {
			return;
		}
	}
	
	private void option3(Player player, IoSession session, Packet packet) {
		int id = packet.readLEShortA() & 0xFFFF;
		if(id < 0 || id >= Constants.PLAYER_CAP) {
			return;
		}
	}

}
