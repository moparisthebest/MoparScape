package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class ItemOption2 implements Packet {


    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        int itemSlot = p.stream.readUnsignedWordBigEndianA();
        int interfaceId = p.stream.readUnsignedWord();
        int junk = p.stream.readUnsignedWord();
        int itemId = p.stream.readUnsignedWord();

        if (itemSlot < 0 || itemId < 0) {
            return;
        }


        switch (interfaceId) {


            case 387: // Unequip item.
                if (itemSlot < p.equipment.length && p.equipment[itemSlot] == itemId) {
                    if (!Engine.playerItems.addItem(p, p.equipment[itemSlot],
                            p.equipmentN[itemSlot])) {
                        break;
                    }
                    p.equipment[itemSlot] = -1;
                    p.equipmentN[itemSlot] = 0;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    p.playerWeapon.setWeapon();
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.calculateEquipmentBonus();
                }
                break;

            default:
                Misc.println("[" + p.username + "] Item option 2: " + interfaceId + " " + itemSlot + " " + itemId + " " + packetId);
                break;
        }
    }
}
