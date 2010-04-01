package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.Constants;
import com.rs2hd.content.Combat;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;

public class NpcPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 7:
			/*
			 * Option 1.
			 */
			option1(player, session, packet);
			break;
		case 52:
			/*
			 * Option 2.
			 */
			option2(player, session, packet);
			break;
		case 199:
			/*
			 * Option 3.
			 */
			option3(player, session, packet);
			break;
		case 123:
			/*
			 * Attack.
			 */
			attack(player, session, packet);
			break;
		}
	}

	private void attack(final Player player, IoSession session, Packet packet) {
		int id = packet.readShort() & 0xFFFF;
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		if(player.getCombatType().equals(CombatType.RANGE)) {
			Combat.attack(player, npc);
		} else {
			World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, npc.getLocation(), npc.getDefinition().getSize()) {
				@Override
				public void run() {
					Combat.attack(player, npc);
				}
			});
		}
	}
	
	private void option1(final Player player, IoSession session, Packet packet) {
		int id = packet.readShortA() & 0xFFFF;
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, npc.getLocation(), npc.getDefinition().getSize()) {
			@Override
			public void run() {
				player.resetTurnTo();
			}
		});
	}

	private void option2(final Player player, IoSession session, Packet packet) {
		int id = packet.readLEShortA() & 0xFFFF;
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, npc.getLocation(), npc.getDefinition().getSize()) {
			@Override
			public void run() {
				player.resetTurnTo();
				// TODO do through configuration file
				if(npc.getId() == 520 || npc.getId() == 521) {
					npc.turnTemporarilyTo(player);
					World.getInstance().getShopManager().openShop(player, 1);
				}
			}
		});
	}
	
	private void option3(final Player player, IoSession session, Packet packet) {
		int id = packet.readLEShort() & 0xFFFF;
		if(id < 0 || id >= Constants.NPC_CAP) {
			return;
		}
		final NPC npc = World.getInstance().getNpcList().get(id);
		if(npc == null) {
			return;
		}
		player.turnTo(npc);
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, npc.getLocation(), npc.getDefinition().getSize()) {
			@Override
			public void run() {
				player.resetTurnTo();
			}
		});
	}

}
