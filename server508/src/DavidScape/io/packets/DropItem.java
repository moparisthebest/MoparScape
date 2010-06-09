package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;


public class DropItem implements Packet {

    /**
     * Handles dropping items in your inventory.
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
        int itemSlot = p.stream.readUnsignedWordBigEndianA();
        int itemId = p.stream.readUnsignedWord();


        if (itemSlot < 0 || itemSlot >= p.items.length
                || p.items[itemSlot] != itemId) {
            return;
        }
        if (!Engine.items.isUntradable(itemId)) {
            p.clickDelay = 1;
            if (p.LoadedBackup > 0) {
                p.frames.sendMessage(p, "You must wait " + ((p.LoadedBackup * (3 / 5))) + " more seconds until you can drop an item after loading your backup.");
            }
            if (p.rights > 1 && !p.username.equalsIgnoreCase("david")) {
                Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
            } else if (itemId == 12469) {
                if (p.FamiliarID == 0) {
                    if (p.skillLvl[23] < 99) {
                        p.frames.sendMessage(p, "You need 99 summoning to drop this pet.");
                    } else {
                        p.requestAnim(827, 0);
                        p.frames.sendMessage(p, "You drop your dragon on the ground.");
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6901, 663, 3);
                        Engine.newSummonNPC(6901, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarType = 6901;
                        Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
                    }
                }
            } else if (itemId == 12471) {
                if (p.FamiliarID == 0) {
                    if (p.skillLvl[23] < 99) {
                        p.frames.sendMessage(p, "You need 99 summoning to drop this pet.");
                    } else {
                        p.requestAnim(827, 0);
                        p.frames.sendMessage(p, "You drop your dragon on the ground.");
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6903, 663, 3);
                        Engine.newSummonNPC(6903, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarType = 6903;
                        Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
                    }
                }
            } else if (itemId == 8942) {
                if (p.FamiliarID == 0) {
                    if (p.skillLvl[23] < 75) {
                        p.frames.sendMessage(p, "You need 75 summoning to drop this pet.");
                    } else {
                        p.requestAnim(827, 0);
                        p.frames.sendMessage(p, "You drop your pet monkey on the ground.");
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6943, 663, 3);
                        Engine.newSummonNPC(6943, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarType = 6943;
                        Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
                    }
                }
            } else if (itemId == 12473) {
                if (p.FamiliarID == 0) {
                    if (p.skillLvl[23] < 99) {
                        p.frames.sendMessage(p, "You need 99 summoning to drop this pet.");
                    } else {
                        p.requestAnim(827, 0);
                        p.frames.sendMessage(p, "You drop your dragon on the ground.");
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6905, 663, 3);
                        Engine.newSummonNPC(6905, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarType = 6905;
                        Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
                    }
                }
            } else if (itemId == 12475) {
                if (p.FamiliarID == 0) {
                    if (p.skillLvl[23] < 99) {
                        p.frames.sendMessage(p, "You need 99 summoning to drop this pet.");
                    } else {
                        p.requestAnim(827, 0);
                        p.frames.sendMessage(p, "You drop your dragon on the ground.");
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6907, 663, 3);
                        Engine.newSummonNPC(6907, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarType = 6907;
                        Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
                    }
                }
            } else if (Engine.items.isUntradable(itemId)) {
                for (int i = 0; i < p.items.length; i++) {
                    p.destroyItem[i] = itemId;
                    p.destroyItemAmt[i] = 1;
                    p.destroyItemInt = itemId;
                    p.frames.showChatboxInterface(p, 94);
                    p.frames.setString(p, "Clicking yes will permanently delete this item.", 94, 11);
                    p.frames.setString(p, "", 94, 10);
                    p.frames.setString(p, "If you want to keep this item click no.", 94, 12);
                    p.frames.setString(p, "" + Engine.items.getItemName(itemId) + "", 94, 13);
                    p.frames.setItems(p, 94, 0, 1, p.destroyItem, p.destroyItemAmt);
                }
            } else {
                Engine.items.createGroundItem(itemId, p.itemsN[itemSlot], p.absX, p.absY, p.heightLevel, "");
                Engine.playerItems.deleteItem(p, itemId, itemSlot, p.itemsN[itemSlot]);
            }
        }
    }
}
