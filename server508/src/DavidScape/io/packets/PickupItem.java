package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;
import DavidScape.world.items.GroundItem;


public class PickupItem implements Packet {

    /**
     * Handles picking up items on the ground.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        if (!p.itemPickup) {
            p.clickY = p.stream.readUnsignedWordA();
            p.clickX = p.stream.readUnsignedWord();
            p.clickId = p.stream.readUnsignedWordBigEndianA();
        }
        int distance = Misc.getDistance(p.clickX, p.clickY, p.absX, p.absY);

        if (distance > 0 && (p.walkDir > 0 || p.runDir > 0)
                || distance != 0 && p.walkDir <= 0 && p.runDir <= 0) {
            p.itemPickup = true;
            return;
        }
        p.itemPickup = false;
        int idx = Engine.items.itemExists(p.clickId, p.clickX, p.clickY,
                p.heightLevel);

        if (idx == -1) {
            return;
        }
        GroundItem g = Engine.items.groundItems[idx];

        if (g != null) {
            if (Engine.playerItems.addItem(p, g.itemId, g.itemAmt)) {
                Engine.items.itemPickedup(g.itemId, g.itemX, g.itemY,
                        p.heightLevel);
            }
        }
    }
}
