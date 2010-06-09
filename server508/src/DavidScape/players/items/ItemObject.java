/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DavidScape.players.items;

/**
 * @author Gravediggah
 */
public class ItemObject {
    private int itemId = -1;
    private int itemAmount = -1;

    public ItemObject(int itemId, int itemAmount) {
        this.itemId = itemId;
        this.itemAmount = itemAmount;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void addItemAmount(int amount) {
        this.itemAmount += amount;
    }

}