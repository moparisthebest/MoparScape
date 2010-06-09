package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;


public class NPCAttack implements Packet {

    /**
     * Handles selecting the attack option on NPCs.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        int npcId = p.stream.readUnsignedWord();
        NPC n = Engine.npcs[npcId];
        if (n.summoned && n.owner != p && n.attackPlayer != p.playerId) {
            p.frames.sendMessage(p, "You cannot attack a player summoned NPC!");
            return;
        }
        if (n.summoned && n.owner == p) {
            p.frames.sendMessage(p, "You pick up your knight.");
            p.FamiliarType = 0;
            n.isDead = true;
            p.FamiliarID = 0;
            return;
        }

        p.attackNPC = npcId;
        n.followPlayer = Engine.getIdFromName(p.username);
        p.attackingNPC = true;
        p.requestFaceTo(npcId);

    }
}
