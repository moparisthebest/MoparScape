package DavidScape.players.items;

import DavidScape.Engine;
import DavidScape.players.Player;

public class PlayerBank {

    public final int SIZE = 1000; //DONT GO OVER 1024
    BankUtils bankUtils = new BankUtils();

    /**
     * Add an item to bank, remove from inv
     */
    public void bankItem(Player p, int id, int amt) {
        if (p == null || id < 0 || id >= 28 || p.items[id] == -1) {
            return;
        }
        int itemId = p.items[id];
        int invItemCount = Engine.playerItems.invItemCount(p, itemId);
        if (amt > invItemCount) {
            amt = invItemCount;
        }
        if (bankUtils.isNote(itemId)) {
            Engine.playerItems.deleteItem(p, itemId, Engine.playerItems.getItemSlot(p, itemId), amt);
            itemId = bankUtils.findUnNote(itemId);
        }
        int bankItemCount = getBankItemCount(p, itemId);
        int freeBankSlot = -1;
        if (p.viewingBankTab == 10) {
            freeBankSlot = getFreeBankSlot(p);
        } else {
            freeBankSlot = p.tabStartSlot[p.viewingBankTab] + getItemsInTab(p, p.viewingBankTab);
            insert(p, getFreeBankSlot(p), freeBankSlot);
            increaseTabStartSlots(p, p.viewingBankTab);
            sendTabConfig(p);
            // This line should be removed once you figure out how to not switch back to main tab automaticly when depositing in a tab.
            p.viewingBankTab = 10;
        }
        if (bankItemCount + amt < 0) {
            amt = Integer.MAX_VALUE - bankItemCount;
            p.frames.sendMessage(p, "Your bank is full");
        }
        if (bankItemCount == 0 && freeBankSlot == -1) {
            p.frames.sendMessage(p, "Not enough space in your bank.");
            return;
        } else if (bankItemCount > 0) {
            int bankItemSlot = getBankItemSlot(p, itemId);
            p.bankItemsN[bankItemSlot] += amt;
        } else {
            p.bankItems[freeBankSlot] = itemId;
            p.bankItemsN[freeBankSlot] = amt;
            p.frames.setString(p, "" + getFreeBankSlot(p), 762, 97);
        }
        Engine.playerItems.deleteItem(p, itemId, id, amt);
        p.frames.setItems(p, -1, 64207, 95, p.bankItems, p.bankItemsN);
        p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);
        p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
    }

    /**
     * Remove a item from bank, add to inv
     */
    public void bankWithdraw(Player p, int id, int amt) {
        if (p == null || id < 0 || id >= SIZE || p.bankItems[id] == -1) {
            return;
        }
        int itemId = p.bankItems[id];
        int bankItemCount = getBankItemCount(p, itemId);
        int tabId = getTabByItemSlot(p, id);
        if (amt > bankItemCount) {
            amt = bankItemCount;
        }
        int invItemCount = Engine.playerItems.invItemCount(p, itemId);
        int freeInvSlot = Engine.playerItems.findInvSlot(p);
        if (invItemCount + amt < 0) {
            amt = Integer.MAX_VALUE - invItemCount;
            p.frames.sendMessage(p, "You can't carry more of that item!");
        }
        if ((invItemCount == 0 && !Engine.items.stackable(itemId)) && freeInvSlot == -1) {
            p.frames.sendMessage(p, "Not enough space in your inventory.");
            return;
        } else if (invItemCount > 0 && Engine.items.stackable(itemId)) {
            int invItemSlot = Engine.playerItems.getItemSlot(p, itemId);
            p.itemsN[invItemSlot] += amt;
        } else {
            if (Engine.items.stackable(itemId)) {
                Engine.playerItems.addItem(p, itemId, amt);
            } else if (p.withdrawNote && bankUtils.canBeNoted(itemId)) {
                Engine.playerItems.addItem(p, bankUtils.findNote(itemId), amt);
            } else {
                int tempAmt = amt;
                while (tempAmt > 0) {
                    if (!Engine.playerItems.addItem(p, itemId, 1)) {
                        p.frames.sendMessage(p, "Not enough space in your inventory.");
                        break;
                    }
                    tempAmt--;
                }
                amt = (amt - tempAmt);
            }
        }
        p.bankItemsN[id] -= amt;
        if (p.bankItemsN[id] <= 0) {
            p.bankItems[id] = -1;
            decreaseTabStartSlots(p, tabId);
            sendTabConfig(p);
            alignBank(p);
            p.frames.setString(p, "" + getFreeBankSlot(p), 762, 97);
        }
        p.frames.setItems(p, -1, 64207, 95, p.bankItems, p.bankItemsN);
        p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);
        p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
    }

    /**
     * Aligns the bank, by moving all items left to fill possible holes
     */
    public void alignBank(Player p) {
        int[] tempBank = p.bankItems;
        int[] tempBankN = p.bankItemsN;
        int id = 0;
        for (int i = 0; i < SIZE; i++) {
            if (tempBank[i] != -1) {
                p.bankItems[id] = tempBank[i];
                p.bankItemsN[id++] = tempBankN[i];
            }
        }
        for (int i = id; i < SIZE; i++) {
            p.bankItems[i] = -1;
            p.bankItemsN[i] = 0;
        }
    }

    /**
     * Finds the bank slot for item X
     */
    public int getBankItemSlot(Player p, int itemId) {
        for (int i = 0; i < SIZE; i++) {
            if (p.bankItems[i] == itemId) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds a free bank slot
     */
    public int getFreeBankSlot(Player p) {
        for (int i = 0; i < SIZE; i++) {
            if (p.bankItems[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds how much of item X you have in your bank
     */
    public int getBankItemCount(Player p, int itemId) {
        for (int i = 0; i < SIZE; i++) {
            if (p.bankItems[i] == itemId) {
                return p.bankItemsN[i];
            }
        }
        return 0;
    }

    /**
     * Increase/decrease the tabStartSlots of some specific tabs
     *
     * @param p       The player whos startslots needs to be changed
     * @param startId The tabIdx to start increasing/decreasing at
     */
    public void increaseTabStartSlots(Player p, int startId) {
        for (int i = startId + 1; i < p.tabStartSlot.length; i++) {
            p.tabStartSlot[i]++;
        }
    }

    public void decreaseTabStartSlots(Player p, int startId) {
        if (startId == 10)
            return;
        for (int i = startId + 1; i < p.tabStartSlot.length; i++) {
            p.tabStartSlot[i]--;
        }
        if (getItemsInTab(p, startId) == 0) {
            collapseTab(p, startId);
        }
    }

    /**
     * Inserts a item into a slot and move the other slots up
     *
     * @param p      The player who needs an item inserted somewhere
     * @param fromId The bankslot the item is coming from
     * @param toId   The bankslot the item needs to go to
     */
    public void insert(Player p, int fromId, int toId) {
        int temp = p.bankItems[fromId];
        int tempN = p.bankItemsN[fromId];
        if (toId > fromId) {
            for (int i = fromId; i < toId; i++) {
                p.bankItems[i] = p.bankItems[i + 1];
                p.bankItemsN[i] = p.bankItemsN[i + 1];
            }
        } else if (fromId > toId) {
            for (int i = fromId; i > toId; i--) {
                p.bankItems[i] = p.bankItems[i - 1];
                p.bankItemsN[i] = p.bankItemsN[i - 1];
            }
        }
        p.bankItems[toId] = temp;
        p.bankItemsN[toId] = tempN;
        p.frames.setItems(p, -1, 64207, 95, p.bankItems, p.bankItemsN);
    }

    /**
     * Gets the amount of items in a specific tab, used to set client configs
     *
     * @param p     The player whos bank is being checked
     * @param tabId The tabArrayIndex to get the size for.
     * @return Decrease the tabStartSlot of then next tab with the tab you want the size for
     *         NOTE: This cannot be used for the tenth tab, if you need the size anyways use startSlot10 - freebankSlot
     */
    public int getItemsInTab(Player p, int tabId) {
        return p.tabStartSlot[tabId + 1] - p.tabStartSlot[tabId];
    }

    /**
     * Finds the tab array idx wich a specific item is in
     *
     * @param p        The player whos bank is being checked
     * @param itemSlot The bankslot of the item that we want the tab for
     * @return Returns the tabId (arrayIdx)
     */
    public int getTabByItemSlot(Player p, int itemSlot) {
        int tabId = 0;
        for (int i = 0; i < p.tabStartSlot.length; i++) {
            if (itemSlot >= p.tabStartSlot[i]) {
                tabId = i;
            }
        }
        return tabId;
    }

    /**
     * Removes a certain tab
     *
     * @param p     The player to remove a tab for
     * @param tabId (arrayIndex) The tab to remove all items in
     */
    public void collapseTab(Player p, int tabId) {
        //The size of the tab
        int size = getItemsInTab(p, tabId);
        //Creates arrays to hold info about the items in the collapsed tab
        int[] tempTabItems = new int[size];
        int[] tempTabItemsN = new int[size];
        for (int i = 0; i < size; i++) {
            //Actually add items to the array
            tempTabItems[i] = p.bankItems[p.tabStartSlot[tabId] + i];
            tempTabItemsN[i] = p.bankItemsN[p.tabStartSlot[tabId] + i];
            //Remove the items from your bank
            p.bankItems[p.tabStartSlot[tabId] + i] = -1;
            p.bankItemsN[p.tabStartSlot[tabId] + i] = 0;
        }
        //Align the bank nicely
        alignBank(p);
        //Copy start slots from the higher tab to the lower tab
        for (int i = tabId; i < p.tabStartSlot.length - 1; i++) {
            p.tabStartSlot[i] = p.tabStartSlot[i + 1] - size;
        }
        //We have to set the 10th manually because there is no higher tab
        p.tabStartSlot[10] = p.tabStartSlot[10] - size;
        //Resets the tabs by sending the configs to the client
        Engine.playerBank.sendTabConfig(p);
        //Add the items to the end of our bank
        for (int i = 0; i < size; i++) {
            int slot = getFreeBankSlot(p);
            p.bankItems[slot] = tempTabItems[i];
            p.bankItemsN[slot] = tempTabItemsN[i];
        }
        p.frames.setItems(p, -1, 64207, 95, p.bankItems, p.bankItemsN);
    }

    /**
     * Sends all bank tab configs
     */
    public void sendTabConfig(Player p) {
        int config = 0;
        config += getItemsInTab(p, 2);
        config += getItemsInTab(p, 3) * 1024;
        config += getItemsInTab(p, 4) * 1048576;
        p.frames.setConfig2(p, 1246, config);
        config = 0;
        config += getItemsInTab(p, 5);
        config += getItemsInTab(p, 6) * 1024;
        config += getItemsInTab(p, 7) * 1048576;
        p.frames.setConfig2(p, 1247, config);
        config = -2013265920;
        config += getItemsInTab(p, 8);
        config += getItemsInTab(p, 9) * 1024;
        p.frames.setConfig2(p, 1248, config);
    }

    /**
     * Sets the last withraw/deposit X variable
     *
     * @param p   The player to set the variable for
     * @param amt The withdraw/deposit X amount
     */
    public void setBankX(Player p, int amt) {
        p.bankX = amt;
        p.frames.setConfig(p, 1249, amt);
    }

    /**
     * Gets the array index of a tabId that we find in the "switchItems2" packet
     *
     * @param tabId The tabId to find the array index for
     * @return Returns the array index
     */
    public int getArrayIndex(int tabId) {
        switch (tabId) {
            case 39:
            case 52:
                return 2;
            case 37:
            case 53:
                return 3;
            case 35:
            case 54:
                return 4;
            case 33:
            case 55:
                return 5;
            case 31:
            case 56:
                return 6;
            case 29:
            case 57:
                return 7;
            case 27:
            case 58:
                return 8;
            case 25:
			case 59:
				return 9;
			case 41:
			case 51:
				return 10;
		}
	  //Should not happen
	  return -1;
	}
}