/*
 * Class PlayerItems
 *
 * Version 1.0
 *
 * Thursday, August 21, 2008
 *
 * Created by Palidino76
 */

package DavidScape.players.items;


import DavidScape.Engine;
import DavidScape.Server;
import DavidScape.players.Player;


public class PlayerItems {

    /**
     * Private referance to the Engine class.
     */
    private Engine ge;


    /**
     * Constructs a new PlayerItems class.
     */
    public PlayerItems() {
        ge = Server.engine;
    }

    /**
     * Adds an item to the specified player.
     * <p>Adds an item to Player p if that player has enough space. If it doesnt,
     * it will return false and give the error message to the player,
     * "Not enough space in your inventory."
     *
     * @param p       The player to add the item to.
     * @param itemId  The item to give the player.
     * @param itemAmt The amount of itemId to give the player.
     * @return Returns true if the item was successfully added.
     */
    public boolean HasItemAmount(Player p, int itemID, int itemAmount) {
        int playerItemAmountCount = 0;
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == itemID) {
                playerItemAmountCount = p.items[i];
            }
            if (playerItemAmountCount >= itemAmount) {
                return true;
            }
        }
        return false;
    }

    public boolean haveItem(Player p, int itemID) {
        return haveItem(p, itemID, 1);
    }

    public boolean haveItem(Player p, int itemID, int amount) {
        int found = 0;
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == itemID) {
                if (p.itemsN[i] >= amount)
                    return true;
                else
                    found++;
            }
        }
        if (found >= amount)
            return true;
        return false;
    }

    public boolean deleteItem(Player p, int itemId, int amount) {
        return deleteItem(p, itemId, getItemSlot(p, itemId), amount);
    }

    public boolean noted(int itemId) {
        return new BankUtils().isNote(itemId);
    }

    public boolean getaxesid(Player p) {
        return Engine.playerItems.holditem(p, 1349, 1) ||
                Engine.playerItems.holditem(p, 1351, 1) ||
                Engine.playerItems.holditem(p, 1353, 1) ||
                Engine.playerItems.holditem(p, 1355, 1) ||
                Engine.playerItems.holditem(p, 1357, 1) ||
                Engine.playerItems.holditem(p, 1359, 1) ||
                Engine.playerItems.holditem(p, 1361, 1) ||
                Engine.playerItems.holditem(p, 6762, 1);
    }

    public static int barrowschest[] = {4745, 4747, 4749, 4751, 4753, 4755, 4757, 4759, 4856, 4868, 4874, 4880, 4892, 4898, 4904, 4916, 4922, 4928, 4940, 4946, 4716, 4718, 4721, 4723};

    public static int barrowschest() {
        return barrowschest[(int) (Math.random() * barrowschest.length)];
    }

    public boolean holditem(Player p, int itemID, int amount) {
        int found = 0;
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == itemID) {
                if (p.itemsN[i] >= amount)
                    return true;
                else
                    found++;
            }
        }
        if (found >= amount)
            return true;
        return false;
    }

    public boolean addItem(Player p, int itemId, int itemAmt) {
        if (itemId <= -1 || itemAmt <= 0 || p == null) {
            return false;
        }
        if (!ge.items.stackable(itemId) && !ge.items.noted(itemId)) {
            for (int i = 0; i < p.items.length; i++) {
                int index = findInvSlot(p);

                if (index >= 0 && itemAmt != 0) {
                    itemAmt--;
                    p.items[index] = itemId;
                    p.itemsN[index] = 1;
                } else {
                    break;
                }
            }
            p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
            if (itemAmt == 0) {
                return true;
            } else {
                p.frames.sendMessage(p, "Not enough space in your inventory.");
                p.wc.resetWoodcutting();
                return false;
            }
        } else if (ge.items.stackable(itemId) || ge.items.noted(itemId)) {
            if (invItemCount(p, itemId) > 0) {
                if ((itemAmt + invItemCount(p, itemId))
                        <= ge.items.maxItemAmount) {
                    p.itemsN[getItemSlot(p, itemId)] += itemAmt;
                    p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                    return true;
                } else {
                    p.itemsN[getItemSlot(p, itemId)] = ge.items.maxItemAmount;
                    p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                    return true;
                }
            } else if (invItemCount(p, itemId) <= 0) {
                int index = findInvSlot(p);

                if (index >= 0) {
                    p.items[index] = itemId;
                    p.itemsN[index] = itemAmt;
                    p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                    return true;
                } else {
                    p.frames.sendMessage(p,
                            "Not enough space in your inventory.");
                    p.wc.resetWoodcutting();
                    return false;
                }
            }
        }
        p.frames.sendMessage(p, "Not enough space in your inventory.");
        p.wc.resetWoodcutting();
        return false;
    }

    /**
     * Deletes an item from Player p.
     * <p>Deletes amount of itemId from p at the selected index in the players inventory, if the item
     * id at that position is not the same it will automatically find the items index.
     *
     * @param p      The player to apply the item changes to.
     * @param itemId The item id to delete.
     * @param index  the position in the inventory to delete the item.
     * @param amount The amount of that item to delete.
     * @return Returns true if the item was successfully deleted.
     */
    public boolean deleteItem(Player p, int itemId, int index, int amount) {
        if (itemId <= 0 || amount <= 0 || p == null || index < 0 || index > 27) {
            return false;
        }
        if ((p.items[index] == itemId)
                && (!ge.items.stackable(itemId) && !ge.items.noted(itemId))) {
            if (amount == 1 && p.items[index] == itemId) {
                p.items[index] = -1;
                p.itemsN[index] = 0;
                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                return true;
            } else {
                for (int i = 0; i < p.items.length; i++) {
                    if (p.items[i] == itemId && amount != 0) {
                        amount--;
                        p.items[i] = -1;
                        p.itemsN[i] = 0;
                    }
                }
                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                if (amount == 0) {
                    return true;
                }
            }
        }
        if ((p.items[index] == itemId)
                && (ge.items.stackable(itemId) || ge.items.noted(itemId))) {
            if (p.items[index] != itemId) {
                index = getItemSlot(p, itemId);
            }
            if (p.itemsN[index] > amount) {
                p.itemsN[index] -= amount;
                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                return true;
            } else {
                p.items[index] = -1;
                p.itemsN[index] = 0;
                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the first index itemId is at, or -1 if the item isn't found.
     *
     * @param p      The player to apply the item changes to.
     * @param itemId The item id to check for.
     * @return Returns the items slot.
     */
    public int getItemSlot(Player p, int itemId) {
        if (p == null) {
            return 0;
        }
        int itemAmt = 0;

        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == itemId) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns an empty inventory slot.
     *
     * @param p The player to check.
     * @return Returns the index of a free inventory slot, or -1 if there are none.
     */
    public int findInvSlot(Player p) {
        if (p == null) {
            return -1;
        }
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gets the number of open inventory slots.
     *
     * @param p The player to check.
     * @return Returns the number of empty inventory slots.
     */
    public int freeSlotCount(Player p) {
        if (p == null) {
            return 0;
        }
        int count = 0;

        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of the specified item in the players
     * inventory.
     *
     * @param p      The player to check.
     * @param itemId The item id to count.
     * @return Returns the number of itemId in the players inventory.
     */
    public int invItemCount(Player p, int itemId) {
        if (p == null || itemId <= 0) {
            return 0;
        }
        int itemAmt = 0;

        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] == itemId) {
                if (p.items[i] == itemId
                        && (ge.items.stackable(itemId) || ge.items.noted(itemId))) {
                    itemAmt += p.itemsN[i];
                } else {
                    itemAmt++;
                }
            }
        }
        return itemAmt;
    }
}
