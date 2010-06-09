package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;


public class ItemGive implements Packet {

    /**
     * Handles item on item packet.
     *
     * @param Player     p The player which the packet will be created for.
     * @param packetId   the packet id which is activated (Which handles this class)
     * @param packetSize the amount of bytes being received for the packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null)
            return;
        /**
         * These are the correct stream methods
         * for item on item packet.
         */

        int usedWith = p.stream.readSignedWordA();
        int itemUsed = p.stream.readSignedWordBigEndian();
        PlayerItems pi = new PlayerItems();
        p.wc.resetWoodcutting();
        p.mi.resetMining();

        Player p2 = Engine.players[usedWith];

        Engine.playerItems.addItem(p2, 1042, 1);
        Engine.playerItems.deleteItem(p, itemUsed, Engine.playerItems.getItemSlot(p, itemUsed), 1);


        System.out.println("Used with: " + usedWith + " itemUsed: "+usedWith);
	}

}