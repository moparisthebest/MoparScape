package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;

/**
 * @author David <www.DavidScape.com>
 */

public class ItemOnNPC {

    public ItemOnNPC() {
        //Nothing
    }

    public void handlePacket(Player p) {
        int itemId = p.stream.readUnsignedWordA();
        int junk = p.stream.readUnsignedWordA();
        int npcI = p.stream.readUnsignedWordA();
        int interfaceId = p.stream.readUnsignedWordA();
        p.frames.sendMessage(p, "itemid: " + itemId);
        p.frames.sendMessage(p, "NpcSlot: " + npcI);
        p.frames.sendMessage(p, "interface: " + interfaceId);
        if (interfaceId == 33152) {
            NPC n = Engine.npcs[npcI];
            if (n != null) {
                n.appendHit(10, 0);
            }
        }


    }

}