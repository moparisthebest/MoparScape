package DavidScape.players.items;

import DavidScape.Engine;
import DavidScape.players.Player;

public class PlayerTrade {

    public void declinePlayer(Player p) {
        if (p == null || !p.online) {
            return;
        }
        for (int i = 0; i < getTradeItemCount(p); i++) {
            Engine.playerItems.addItem(p, p.tradeItems[i], p.tradeItemsN[i]);
        }
        p.tradeItems = new int[28];
        p.tradeItemsN = new int[28];
        p.tradePlayer = 0;
        p.tAccept[0] = false;
        p.tAccept[1] = false;
        p.frames.removeShownInterface(p);
    }

    public void acceptPlayer(Player p, Player plr) {
        if (p == null || !p.online) {
            return;
        }
        if (plr == null || !plr.online) {
            return;
        }
        for (int i = 0; i < getTradeItemCount(plr); i++) {
            Engine.playerItems.addItem(p, plr.tradeItems[i], plr.tradeItemsN[i]);
        }
        for (int i = 0; i < getTradeItemCount(p); i++) {
            Engine.playerItems.addItem(plr, p.tradeItems[i], p.tradeItemsN[i]);
        }
        p.tradeItems = new int[28];
        p.tradeItemsN = new int[28];
        p.tradePlayer = 0;
        p.tAccept[0] = false;
        p.tAccept[1] = false;
        p.frames.removeShownInterface(p);
        plr.tradeItems = new int[28];
        plr.tradeItemsN = new int[28];
        plr.tradePlayer = 0;
        plr.tAccept[0] = false;
        plr.tAccept[1] = false;
        plr.frames.removeShownInterface(plr);
    }

    public void secondScreen(Player p, Player plr) {
        if (p == null || !p.online) {
            return;
        }
        if (plr == null || !plr.online) {
            return;
        }
        p.frames.showInterface(p, 334);
        p.frames.setInventory(p, 16);
        plr.frames.showInterface(plr, 334);
        plr.frames.setInventory(plr, 16);


        plr.tAccept[0] = true;
        p.tAccept[0] = true;


        //add string here for items
    }
    //Sub id's 30 and 31 are your offer and 32 and 33 is Traders offer

    public void firstScreen(Player p, Player plr) {
        if (p == null || !p.online) {
            return;
        }
        if (plr == null || !plr.online) {
            return;
        }
        p.frames.setString(p, "Trading with: " + plr.username, 335, 15);
        p.frames.setString(plr, "Trading with: " + p.username, 335, 15);

        p.frames.setString(p, "", 335, 36);
        p.frames.setString(plr, "", 335, 36);

        p.frames.setInventory(p, 763);
        p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);// my items my side
        plr.frames.setInventory(plr, 763);
        plr.frames.setItems(plr, -1, 64209, 93, p.items, p.itemsN);// my items my side

        p.TradeWithPerson = plr.playerId;
        plr.TradeWithPerson = p.playerId;
        p.frames.showInterface(p, 335);
        plr.frames.showInterface(plr, 335);
        refreshScreen(p, plr);
        refreshScreen(plr, p);
    }


    public void refreshScreen(Player p, Player plr) {
        if (p == null || !p.online) {
            return;
        }
        if (plr == null || !plr.online) {
            return;
        }
//p.frames.setItems(p, 335, 30, 28, p.items, p.itemsN);// my items my side
//plr.frames.setItems(plr, 335, 30, 28, plr.tradeItems, plr.tradeItemsN);//his items his side
//p.frames.setItems(p, 335, 32, 28, plr.tradeItems, plr.tradeItemsN);//his items on my screen
//plr.frames.setItems(plr, 335, 32, 28, p.items, p.itemsN);//my items on his screen

//p.frames.setItems(p, 336, 0, 93, p.items, p.itemsN);
//frames here for refreshing first screen
    }

    public void declineTrade(Player p) {
        if (p == null || !p.online) {
            return;
        }
        declinePlayer(p);
        Player plr = Engine.players[p.tradePlayer];
        if (plr == null || !plr.online) {
            return;
        }
        declinePlayer(plr);
    }

    public void checkStage(Player p) {
        if (p == null || !p.online) {
            return;
        }
        Player plr = Engine.players[p.tradePlayer];
        if (plr == null || !plr.online) {
            return;
        }
        if (plr.tradePlayer != p.playerId || p.tradePlayer != plr.playerId) {
            return;
        }
        if (plr.tAccept[1] && p.tAccept[1] && plr.tAccept[0] && p.tAccept[0]) {
            acceptPlayer(p, plr);
        }//final trade screen accepted by both
        else if (plr.tAccept[0] && p.tAccept[0]) {
            secondScreen(p, plr);
        } else if (!plr.tAccept[0] && !p.tAccept[0]) {
            firstScreen(p, plr);
        }
    }

    public void tradeItem(Player p, int itemId, int amount) {
        if (p == null || !p.online) {
            return;
        }
        Player plr = Engine.players[p.tradePlayer];
        if (plr == null || !plr.online) {
            return;
        }
        if (p.tradePlayer != plr.playerId || plr.tradePlayer != p.playerId) {
            return;
        }
        if (!Engine.playerItems.haveItem(p, itemId, amount)) {
            amount = Engine.playerItems.invItemCount(p, itemId);
        }
        if (getTradeItemCount(p) < 28) {
            if (Engine.items.itemLists[itemId].itemStackable || Engine.items.itemLists[itemId].itemIsNote) {
                if (Engine.playerItems.deleteItem(p, itemId, amount)) {
                    int freeSlot = getFreeSlots(p);
                    if (freeSlot < 0) {
                        return;
                    }
                    p.tradeItems[freeSlot] = itemId;
                    p.tradeItemsN[freeSlot] += amount;
                }
            } else {
                if (Engine.playerItems.deleteItem(p, itemId, amount)) {
                    for (int i = 0; i < amount; i++) {
                        int freeSlot = getFreeSlots(p);
                        if (freeSlot < 0) {
                            return;
                        }
                        p.tradeItems[freeSlot] = itemId;
                        p.tradeItemsN[freeSlot] = 1;
                    }
                }
            }
            p.tAccept[0] = false;
            plr.tAccept[0] = false;
            refreshScreen(p, plr);
            //add screen refresh frames here
        }
    }

    public void removeItem(Player p, int itemId, int amount) {
        if (amount <= 0 || amount > 999999999) {
            return;
        }
        if (p == null || !p.online) {
            return;
        }
        Player plr = Engine.players[p.tradePlayer];
        if (plr == null || !plr.online) {
            return;
        }
        if (p.tradePlayer != plr.playerId || plr.tradePlayer != p.playerId) {
            return;
        }
        int itemSlot = getTradeItemslot(p, itemId);
        if (p.tradeItemsN[itemSlot] > 0) {
            //this is for noted items etc
            //int itemSlot = getTradeItemslot(p,itemId);
            if (itemSlot < 0) {
                return;
            }
            if (p.tradeItemsN[itemSlot] > amount) {
                amount = p.tradeItemsN[itemSlot];
                Engine.playerItems.addItem(p, itemId, amount);
                p.tradeItems[itemSlot] = -1;
                p.tradeItemsN[itemSlot] = -1;
            } else if (amount < p.tradeItemsN[itemSlot]) {
                Engine.playerItems.addItem(p, itemId, amount);
                p.tradeItemsN[itemSlot] -= amount;
            }
        } else {
            for (int i = 0; i < amount; i++) {
                int itemSlot2 = getTradeItemslot(p, itemId);
                if (itemSlot2 < 0) {
                    return;
                }
                Engine.playerItems.addItem(p, itemId, 1);
                p.tradeItems[itemSlot2] = -1;
                p.tradeItemsN[itemSlot2] = -1;
            }
        }
        p.tAccept[0] = false;
        plr.tAccept[0] = false;
        refreshScreen(p, plr);
        //add screen refresh frames here
    }

    public int getTradeItemslot(Player p, int itemId) {
        for (int i = 0; i < 28; i++) {
            if (p.tradeItems[i] == itemId) {
                return i;
            }
        }
        return -1;
    }

    public int getTradeItemCount(Player p) {
        int count = 0;
        for (int i = 0; i < 28; i++) {
            if (p.tradeItems[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int getFreeSlots(Player p) {
        for (int i = 0; i < 28; i++) {
            if (p.tradeItems[i] == -1) {
                return i;
            }
        }
        return -1;
    }
}
