package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class ItemOperate implements Packet {

    /**
     * Handles operating equipped items.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        int junk = p.stream.readDWord();
        int itemId = p.stream.readUnsignedWordA();
        int itemSlot = p.stream.readUnsignedWordBigEndianA();

        if (itemSlot < 0 || itemSlot >= p.equipment.length
                || p.equipment[itemSlot] != itemId) {
            return;
        }


        switch (itemId) {


            case 1704:
                p.Choice = 3;
                p.Dialogue = 0;
                p.frames.setString(p, "Fight Pits", 458, 1);
                p.frames.setString(p, "Caslte Wars", 458, 2);
                p.frames.setString(p, "Port Sarim", 458, 3);
                p.frames.showChatboxInterface(p, 458);
                p.Smithing = false;
                p.Cooking = false;
                p.TalkAgent = false;
                p.DecorChange = false;
                break;
            case 11283:
                Player p2 = Engine.players[p.attackPlayer];
                int offsetX = (p.absX - p2.absX) * -1;
                int offsetY = (p.absY - p2.absY) * -1;
                if (p.DFStimer == 0) {
                    if (p.attackingPlayer) {
                        p.requestAnim(6695, 0);
                        p.requestGFX(1164, 0);
                        p.DFStimer += 10;
                        p2.appendHit(Misc.random(50), 0);
                        p.frames.createGlobalProjectile(p.absY, p.absX, offsetY,
                                offsetX, 1166, 43, 31, 70, p2.playerId);
                    }
                }
                if (p.DFStimer > 0) {
                    p.frames.sendMessage(p, "You must wait before you can use the DFS special again.");
                }
                break;


            default:
                Misc.println("[" + p.username + "] Operate item: " + itemId);
                break;
        }
    }
}
