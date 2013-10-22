/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DavidScape.players.ptrade;

import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;

/**
 * @author Gravediggah
 */
public class TButtons {

    private Player p;
    private PlayerItems pi = new PlayerItems();

    public TButtons(Player p) {
        this.p = p;
    }

    public void handleButton(int interfaceId, int packetId, int buttonId, int buttonId2) {
        switch (interfaceId) {
            case 334:
                secondScreen(packetId, buttonId, buttonId2);
                break;
            case 335:
                firstScreen(packetId, buttonId, buttonId2);
                break;
            case 336:
                inventoryItems(packetId, buttonId2);
                break;

        }
    }

    public void firstScreen(int packetId, int buttonId, int buttonId2) {
        switch (buttonId) {
            case 16:
                p.pTrade.confirmTrade();
                break;
            case 12:
            case 18:
                p.pTrade.declineTrade();
                break;
            case 30:
                if (packetId == 233 && buttonId == 30) {
                    p.pTrade.removeItemB(buttonId2, 1);
                }
                break;
        }

    }

    public void secondScreen(int packetId, int buttonId, int buttonId2) {
        switch (buttonId) {
            case 20:
                p.pTrade.confirmTrade();
                break;
            case 8:
            case 21:
                p.pTrade.declineTrade();
                break;
        }

    }

    public void inventoryItems(int packetId, int buttonId2) {
        switch (packetId) {
            case 233:
                p.pTrade.tradeItemB(buttonId2, 1);
                break;
            case 21:
                p.pTrade.tradeItemB(buttonId2, 5);
                break;
            case 169:
                p.pTrade.tradeItemB(buttonId2, 10);
                break;
            case 214:
                p.pTrade.tradeItemB(buttonId2, Engine.playerItems.invItemCount(p, p.items[buttonId2]));
                break;
            case 173:
                p.uinput.request(1, buttonId2);
                break;
        }
    }
}