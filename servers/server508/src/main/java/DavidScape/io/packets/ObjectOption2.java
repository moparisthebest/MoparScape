package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class ObjectOption2 implements Packet {

    /*
     * make sure to document EVERY coordinate to go with each object unless an un-important object(wilderness ditch lol).
     * This will prevent people from spawning an object client side and actually using it.
     * So make sure to include with the id, objectX == # && objectY == #
     */

    /**
     * Handles the second option on objects.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        if (!p.playerOption2) {
            int playerId = p.stream.readUnsignedWord();

            if (playerId <= 0 || playerId >= Engine.players.length || Engine.players[playerId] == null) {
                return;
            }
            p.clickId = playerId;
            p.wc.resetWoodcutting();
            p.mi.resetMining();
            p.clickX = Engine.players[playerId].absX;
            p.clickY = Engine.players[playerId].absY;
            Misc.println("[" + p.username + "] Unhandled object 2: " + p.clickId);

            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.playerOption2 = true;
        }
        if (Engine.players[p.clickId] == null) {
            p.playerOption2 = false;
            return;

        }
        if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 1) {

            return;

        }
        p.clickId = p.stream.readUnsignedWord();
        switch (p.clickId) {
            case 34874:
                if (p.absY > 3302) {
                    p.setCoords(2571, 3303, 0);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 0);
                }
                break;
            case 28089:
                p.openBank();
                break;
//case 28089:
//p.frames.showChatboxInterface(p, 458);
//p.frames.setString(p, "Buy", 458, 1);
//p.frames.setString(p, "Sell", 458, 2);
//p.frames.setString(p, "Status", 458, 3);
//break;
        }

        /*Player p2 = Engine.players[p.clickId];
         p.frames.sendMessage(p, "Sending trade request...");
         p.frames.sendMessage(p2, p.username+":tradereq:");
         p.requestFaceTo(p.clickId);
         p.tradePlayer = p2.playerId;
         p2.tPartner = p.playerId;
         Engine.playerTrade.checkStage(p);
        */
        p.playerOption2 = false;

    }
}
