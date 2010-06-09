package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class SwitchItems2 implements Packet {
    /**
     * Handles rotating items on interfaces, and bank tabs (= rotating)
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        int toInterface = p.stream.readDWord();

        int interfaceId = toInterface >> 16;
        int fromInterface = p.stream.readDWord();
        int fromId = p.stream.readUnsignedWord();
        int toId = p.stream.readUnsignedWordBigEndian();
        int tabId = toInterface - 49938432;

        int temp = -1;
        int tempN = 0;
        int tabIndex = Engine.playerBank.getArrayIndex(tabId);
        int fromTab;

        if ((fromInterface == 50003968 || toInterface == 50003968) && fromInterface != toInterface) {
            //if(fromInterface == 50003968) {
            //	p.frames.sendMessage(p, "You can't drag a item from your inventory to your bank!");
            //} else {
            //	p.frames.sendMessage(p, "You can't drag a item from your bank to your inventory!");
            //}
            return;
        }
        switch (interfaceId) {
            case 762:
                switch (tabId) {
                    case 73: //Switch items from any slot to any filled slot.
                        if (fromId < 0 || fromId >= 500 || toId < 0 || toId >= 500) {
                            break;
                        }
                        if (!p.insertMode) {
                            temp = p.bankItems[fromId];
                            tempN = p.bankItemsN[fromId];
                            p.bankItems[fromId] = p.bankItems[toId];
                            p.bankItemsN[fromId] = p.bankItemsN[toId];
                            p.bankItems[toId] = temp;
                            p.bankItemsN[toId] = tempN;
                            p.frames.setItems(p, -1, 64207, 95, p.bankItems, p.bankItemsN);
                        } else {
                            if (Engine.playerBank.getTabByItemSlot(p, fromId) == Engine.playerBank.getTabByItemSlot(p, toId)) {
                                Engine.playerBank.insert(p, fromId, toId);
                            } else {
                                tabIndex = Engine.playerBank.getTabByItemSlot(p, toId);
                                fromTab = Engine.playerBank.getTabByItemSlot(p, fromId);
                                if (toId > fromId) {
                                    Engine.playerBank.insert(p, fromId, toId - 1);
                                } else if (fromId > toId) {
                                    Engine.playerBank.insert(p, fromId, toId);
                                }
                                Engine.playerBank.increaseTabStartSlots(p, tabIndex);
                                Engine.playerBank.decreaseTabStartSlots(p, fromTab);
                                Engine.playerBank.sendTabConfig(p);
                            }
                        }
                        break;

                    case 41: // Dragging an item to tab icon: MAIN (10)
                        if (Engine.playerBank.getTabByItemSlot(p, fromId) == 10) {
                            break;
                        }
                    case 39: // Dragging an item to tab icon: 2
                    case 37: // Dragging an item to tab icon: 3
                    case 35: // Dragging an item to tab icon: 4
                    case 33: // Dragging an item to tab icon: 5
                    case 31: // Dragging an item to tab icon: 6
                    case 29: // Dragging an item to tab icon: 7
                    case 27: // Dragging an item to tab icon: 8
                    case 25: // Dragging an item to tab icon: 9
                    case 51: // Dragging an directly into tab: MAIN (10)
                    case 52: // Dragging an directly into tab: 2
                    case 53: // Dragging an directly into tab: 3
                    case 54: // Dragging an directly into tab: 4
                    case 55: // Dragging an directly into tab: 5
                    case 56: // Dragging an directly into tab: 6
                    case 57: // Dragging an directly into tab: 7
                    case 58: // Dragging an directly into tab: 8
                    case 59: // Dragging an directly into tab: 9
                        toId = tabIndex == 10 ? Engine.playerBank.getFreeBankSlot(p) : p.tabStartSlot[tabIndex] + Engine.playerBank.getItemsInTab(p, tabIndex);
                        fromTab = Engine.playerBank.getTabByItemSlot(p, fromId);
                        if (toId > fromId) {
                            Engine.playerBank.insert(p, fromId, toId - 1);
                        } else if (fromId > toId) {
                            Engine.playerBank.insert(p, fromId, toId);
                        }
                        Engine.playerBank.increaseTabStartSlots(p, tabIndex);
                        Engine.playerBank.decreaseTabStartSlots(p, fromTab);
                        Engine.playerBank.sendTabConfig(p);
                        break;
                    default:
                        //Shouldnt happen unless I missed something or player is using a cheat client
                        //Engine.fileManager.appendData("cheaters/"+p.username+".txt", "Suspicious bank tab activities: "+tabId);
                        System.out.println("[" + p.username + "] BANK ERROR (Unhandled Option): " + tabId);
                        break;
                }
                break;
            case 763:
                /*
                     * Switch items in your inventory.
                     */
                if (fromId < 0 || fromId >= p.items.length || toId < 0 || toId >= p.items.length) {
                    break;
                }
                temp = p.items[fromId];
                tempN = p.itemsN[fromId];
                p.items[fromId] = p.items[toId];
                p.itemsN[fromId] = p.itemsN[toId];
                p.items[toId] = temp;
                p.itemsN[toId] = tempN;
                p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);
                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                break;
            default:
                Misc.println("[" + p.username + "] Unhandled Switch Items interface: " + interfaceId);
                break;
        }
    }
}