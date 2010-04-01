package com.rs2hd.packethandler;

import org.apache.mina.common.IoSession;

import com.rs2hd.content.Wilderness;
import com.rs2hd.event.CoordinateEvent;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet;
import com.rs2hd.script.ScriptManager;

public class ObjectPacketHandler implements PacketHandler {

	@Override
	public void handlePacket(Player player, IoSession session, Packet packet) {
		switch(packet.getId()) {
		case 158:
			option1(player, session, packet);
			break;
		case 228:
			option2(player, session, packet);
			break;
		}
	}

	private void option1(final Player player, IoSession session, Packet packet) {
		final int x  = packet.readLEShort()  & 0xFFFF;
		final int id = packet.readShort()    & 0xFFFF;
		final int y  = packet.readLEShortA() & 0xFFFF;
		Location location = Location.location(x, y, player.getLocation().getZ());
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, location) {
			@Override
			public void run() {
				// TODO
				switch(id) {
				case 23271:
					Wilderness.showWarning(player);
					break;
				default:
					ScriptManager.getInstance().call("object_option_1_" + id, player, x, y);
					break;
				}
			}
		});
	}

	private void option2(final Player player, IoSession session, Packet packet) {
		final int y  = packet.readShortA()   & 0xFFFF;
		final int id = packet.readLEShort()  & 0xFFFF;
		final int x  = packet.readLEShortA() & 0xFFFF;
		Location location = Location.location(x, y, player.getLocation().getZ());
		World.getInstance().registerCoordinateEvent(new CoordinateEvent(player, location) {
			@Override
			public void run() {
				// TODO
				switch(id) {
				default:
					ScriptManager.getInstance().call("object_option_2_" + id, player, x, y);
					break;
				}
			}
		});
	}

}
