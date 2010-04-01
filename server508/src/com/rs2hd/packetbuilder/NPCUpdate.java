package com.rs2hd.packetbuilder;

import com.rs2hd.Constants;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.Packet.Size;

/**
 * Handles NPC updating.
 * @author Graham
 *
 */
public class NPCUpdate implements PacketBuilder {
	
	/**
	 * Prevent instance creation.
	 */
	private NPCUpdate() {}
	
	/**
	 * Update the specified player's NPCs.
	 * @param p
	 */
	public static void update(Player p) {
		StaticPacketBuilder mainPacket = new StaticPacketBuilder().setId(222).setSize(Size.VariableShort).initBitAccess();
		StaticPacketBuilder updateBlock = new StaticPacketBuilder().setBare(true);
		mainPacket.addBits(8, p.getNpcListSize());
		int size = p.getNpcListSize();
		p.setNpcListSize(0);
        boolean[] newNpc = new boolean[Constants.NPC_CAP];
		for(int i = 0; i < size; i++) {
			if(p.getNpcList()[i] == null || !p.getNpcList()[i].getLocation().withinDistance(p.getLocation()) || p.getUpdateFlags().didTeleport() || p.getNpcList()[i].isHidden()) {
				if(p.getNpcList()[i] != null) {
					p.getNpcsInList()[p.getNpcList()[i].getIndex()] = 0;
				//	p.getNpcList()[i] = null;
				}
				mainPacket.addBits(1, 1);
				mainPacket.addBits(2, 3);
			} else {
				updateNpcMovement(p.getNpcList()[i], mainPacket);
				if(p.getNpcList()[i].getUpdateFlags().isUpdateRequired()) {
					appendUpdateBlock(p.getNpcList()[i], updateBlock);
				}
				p.getNpcList()[p.getNpcListSize()] = p.getNpcList()[i];
				p.setNpcListSize(p.getNpcListSize()+1);
			}
		}
		for(NPC npc : World.getInstance().getNpcList()) {
			if(npc == null || p.getNpcsInList()[npc.getIndex()] == 1 || !npc.getLocation().withinDistance(p.getLocation()) || npc.isHidden()) {
				continue;
			}
			addNewNpc(p, npc, mainPacket);
			if(npc.getUpdateFlags().isUpdateRequired()) {
				appendUpdateBlock(npc, updateBlock);
			}
			newNpc[npc.getIndex()] = true;
		}
		if(updateBlock.getLength() >= 3) {
			mainPacket.addBits(15, 32767);
		}
		mainPacket.finishBitAccess();
		if(updateBlock.getLength() > 0) {
			mainPacket.addBytes(updateBlock.toPacket().getData());
		}
		p.getSession().write(mainPacket.toPacket());
	}

	private static void addNewNpc(Player p, NPC npc, StaticPacketBuilder mainPacket) {
		p.getNpcsInList()[npc.getIndex()] = 1;
		p.getNpcList()[p.getNpcListSize()] = npc;
		p.setNpcListSize(p.getNpcListSize()+1);
		mainPacket.addBits(15, npc.getIndex());
		mainPacket.addBits(14, npc.getId());
		mainPacket.addBits(1, npc.getUpdateFlags().isUpdateRequired() ? 1 : 0);
		int y = npc.getLocation().getY() - p.getLocation().getY();
		if(y < 0) {
			y += 32;
		}
		int x = npc.getLocation().getX() - p.getLocation().getX();
		if(x < 0) {
			x += 32;
		}
		mainPacket.addBits(5, y);
		mainPacket.addBits(5, x);
		mainPacket.addBits(3, 0);
		mainPacket.addBits(1, 1);
	}

	private static void updateNpcMovement(NPC npc, StaticPacketBuilder mainPacket) {
		int sprite = npc.getSprite();
		if(sprite == -1) {
			if(npc.getUpdateFlags().isUpdateRequired()) {
				mainPacket.addBits(1, 1);
				mainPacket.addBits(2, 0);
			} else {
				mainPacket.addBits(1, 0);
			}
		} else {
			mainPacket.addBits(1, 1);
			mainPacket.addBits(2, 1);
			int dir = Constants.XLATE_DIRECTION_TO_CLIENT[sprite];
			mainPacket.addBits(3, dir);
			mainPacket.addBits(1, npc.getUpdateFlags().isUpdateRequired() ? 1 : 0);
		}
	}
	
	private static void appendUpdateBlock(NPC npc, StaticPacketBuilder updateBlock) {
		int mask = 0x0;
		if(npc.getUpdateFlags().isFaceToUpdateRequired()) {
			mask |= 0x10;
		}
		if(npc.getUpdateFlags().isAnimationUpdateRequired()) {
			mask |= 0x1;
		}
		if(npc.getUpdateFlags().isGraphicsUpdateRequired()) {
			mask |= 0x2;
		}
		if(npc.getUpdateFlags().isHit2UpdateRequired()) {
			mask |= 0x20;
		}
		if(npc.getUpdateFlags().isHit1UpdateRequired()) {
			mask |= 0x4;
		}
		updateBlock.addByte((byte) mask);
		if(npc.getUpdateFlags().isFaceToUpdateRequired()) {
			appendFaceToUpdate(npc, updateBlock);
		}
		if(npc.getUpdateFlags().isAnimationUpdateRequired()) {
			appendAnimationUpdtae(npc, updateBlock);
		}
		if(npc.getUpdateFlags().isGraphicsUpdateRequired()) {
			appendGraphicsUpdate(npc, updateBlock);
		}
		if(npc.getUpdateFlags().isHit2UpdateRequired()) {
			appendHit2Update(npc, updateBlock);
		}
		if(npc.getUpdateFlags().isHit1UpdateRequired()) {
			appendHit1Update(npc, updateBlock);
		}
	}

	private static void appendHit1Update(NPC npc, StaticPacketBuilder updateBlock) {
		updateBlock.addByte((byte) npc.getHits().getHitDamage1());
		updateBlock.addByte((byte) npc.getHits().getHitType1());
		int hpRatio = npc.getHitpoints() * 255 / npc.getDefinition().getHitpoints();
		updateBlock.addByteS(hpRatio);
	}

	private static void appendHit2Update(NPC npc, StaticPacketBuilder updateBlock) {
		updateBlock.addByte((byte) npc.getHits().getHitDamage2());
		updateBlock.addByteS((byte) npc.getHits().getHitType2());
	}

	private static void appendGraphicsUpdate(NPC npc, StaticPacketBuilder updateBlock) {
		updateBlock.addShortA(npc.getLastGraphics().getId());
		updateBlock.addInt2(npc.getLastGraphics().getDelay());
	}

	private static void appendAnimationUpdtae(NPC npc, StaticPacketBuilder updateBlock) {
		updateBlock.addShortA(npc.getLastAnimation().getId());
		updateBlock.addByte((byte) npc.getLastAnimation().getDelay());
	}

	private static void appendFaceToUpdate(NPC npc, StaticPacketBuilder updateBlock) {
		updateBlock.addShort(npc.getUpdateFlags().getFaceTo());
	}

}
