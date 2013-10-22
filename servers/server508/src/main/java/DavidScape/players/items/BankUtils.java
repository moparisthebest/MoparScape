package DavidScape.players.items;

import DavidScape.Engine;
import DavidScape.world.items.ItemList;

/**
 * @author Gravediggah
 */
public class BankUtils {
    public BankUtils() {

    }

    public boolean isNote(int itemId) {
        String description = Engine.items.getItemDescription(itemId);
        return description.toLowerCase().startsWith("swap");
    }

    public boolean canBeNoted(int itemId) {
        return (findNote(itemId) > -1);
    }

    public int findNote(int itemId) {
        for (ItemList i : Engine.items.itemLists) {
            if (i != null) {
                if (i.itemDescription.toLowerCase().startsWith("swap") &&
                        i.itemName.equals(Engine.items.getItemName(itemId))) {
                    return i.itemId;
                }
            }
        }
        return -1;
    }

    public int findUnNote(int itemId) {
        for (ItemList i : Engine.items.itemLists) {
            if (i != null) {
                if (!i.itemDescription.toLowerCase().startsWith("swap") &&
                        i.itemName.equals(Engine.items.getItemName(itemId))) {
                    return i.itemId;
                }
            }
        }
        return -1;
    }
}