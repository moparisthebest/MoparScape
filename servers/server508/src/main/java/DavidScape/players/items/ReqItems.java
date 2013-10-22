/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DavidScape.players.items;

import DavidScape.Engine;
import DavidScape.players.Player;

import java.util.LinkedList;

/**
 * @author Gravediggah
 */
public class ReqItems {

    private LinkedList<ItemObject> reqItems = new LinkedList<ItemObject>();

    public void addReq(int id, int amount) {
        if (itemListed(id) > -1) {
            reqItems.get(itemListed(id)).addItemAmount(amount);
        } else {
            reqItems.add(new ItemObject(id, amount));
        }
    }

    public void removeReq(int id) {
        if (itemListed(id) > -1) {
            reqItems.remove(itemListed(id));
        }
    }

    public int itemListed(int id) {
        int i = 0;
        for (ItemObject obj : reqItems) {
            if (obj.getItemId() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean playerHasReq(Player p) {
        for (ItemObject obj : reqItems) {
            if (!Engine.playerItems.haveItem(
                    p, obj.getItemId(), obj.getItemAmount())) {
                return false;
            }
        }
        return true;
    }

    public void deleteItems(Player p) {
        for (ItemObject obj : reqItems) {
            Engine.playerItems.deleteItem(
                    p, obj.getItemId(), obj.getItemAmount());
        }
    }

}