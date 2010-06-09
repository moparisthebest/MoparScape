package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class NPCOption3 implements Packet {

    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        if (!p.npcOption3) {

            int npcId = p.stream.readUnsignedWordBigEndian();
            p.requestFaceTo(npcId);
            if (npcId <= 0 || npcId >= Engine.npcs.length
                    || Engine.npcs[npcId] == null) {
                return;
            }
            p.clickId = npcId;
            p.wc.resetWoodcutting();
            p.mi.resetMining();
            p.clickX = Engine.npcs[npcId].absX;
            p.clickY = Engine.npcs[npcId].absY;
            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.npcOption3 = true;
        }
        if (p.clickId <= 0 || p.clickId >= Engine.npcs.length
                || Engine.npcs[p.clickId] == null) {
            p.npcOption3 = false;
            return;
        }
        if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 1) {
            return;
        }

        p.npcOption3 = false;

        NPC pnp = Engine.npcs[p.clickId];
        NPC np = Engine.npcs[p.FamiliarID];
        if (pnp.npcType == 548) {
            p.frames.showInterface(p, 591);
        }
        if (pnp.npcType == 553) {
            p.setCoords(3504, 3575, 0);
        }

        if (pnp.npcType == 1599) {
            Engine.shopHandler.openshop(p, 8);
            p.shopid = 8;
        }

        if (pnp.npcType == 4906) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9827, 241, 2);
            p.frames.setNPCId(p, 4906, 241, 2);
            p.frames.setString(p, "Woodcutting Tutor", 241, 3);
            p.frames.setString(p, "I'll pay you 8 coins per log you bring me.", 241, 4);
        }

        if (pnp.npcType == 1861) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9827, 241, 2);
            p.frames.setNPCId(p, 1861, 241, 2);
            p.frames.setString(p, "Range Tutor", 241, 3);
            p.frames.setString(p, "Sorry, I have no work for you today...", 241, 4);
        }
        if (pnp.npcType == 4900) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9827, 241, 2);
            p.frames.setNPCId(p, 4900, 241, 2);
            p.frames.setString(p, "Crafting Tutor", 241, 3);
            p.frames.setString(p, "Sorry, I have no work for you today...", 241, 4);
        }


        switch (p.clickId) {


            default:
                Misc.println(
                        "[" + p.username + "] Unhandled npc option 3: " + p.clickId);
                break;
        }
    }
}
