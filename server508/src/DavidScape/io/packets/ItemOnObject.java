package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.Skills.Smithing;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;


public class ItemOnObject implements Packet {

    /**
     * Handles item on item packet.
     *
     * @param Player     p The player which the packet will be created for.
     * @param packetId   the packet id which is activated (Which handles this class)
     * @param packetSize the amount of bytes being received for the packet.
     */
    public void handlePacket(Player player, int packetId, int packetSize) {
        if (player == null)
            return;
        /**
         * These are the correct stream methods
         * for item on item packet.
         */
        Player p = player;
        int usedWith = player.stream.readUnsignedWord();
        int itemUsed = player.stream.readSignedWordA();
        Smithing Smithing = new Smithing();
        PlayerItems pi = new PlayerItems();
        player.wc.resetWoodcutting();
        player.mi.resetMining();
        if (itemUsed == 8 && usedWith == 7) { //
            pi.deleteItem(p, 8, Engine.playerItems.getItemSlot(player, 8), 1);
            p.createGlobalObject(8, p.heightLevel, p.cannonC[0], p.cannonC[1], 0, 10);
        }
        if (itemUsed == 4968 && usedWith == 34573) { //Marigold
            if (player.HerbType > 0) {
                player.frames.sendMessage(player, "You can't plant more than one thing at a time.");
            } else {
                player.HerbloreTimer = 30;
                player.HerbloreType = 7867;
                player.HerbType = 1;
                Engine.playerItems.deleteItem(player, 5096, Engine.playerItems.getItemSlot(player, 5096), 1);
                player.requestAnim(5212, 0);
                player.createGlobalObject(7867, player.heightLevel, 2809, 3463, 0, 10);
            }
        }
        if (itemUsed == 4972 && usedWith == 34573) { //Limpwurt
            if (player.HerbType > 0) {
                player.frames.sendMessage(player, "You can't plant more than one thing at a time.");
            } else {
                player.HerbloreTimer = 30;
                player.HerbloreType = 7851;
                player.HerbType = 1;
                Engine.playerItems.deleteItem(player, 5100, Engine.playerItems.getItemSlot(player, 5100), 1);
                player.requestAnim(5212, 0);
                player.createGlobalObject(7851, player.heightLevel, 2809, 3463, 0, 10);
            }
        }
        if (itemUsed == 5155 && usedWith == 34573) { //AppleTree
            if (player.HerbType > 0) {
                player.frames.sendMessage(player, "You can't plant more than one thing at a time.");
            } else {
                player.HerbloreTimer = 30;
                player.HerbloreType = 7936;
                player.HerbType = 2;
                Engine.playerItems.deleteItem(player, 5283, Engine.playerItems.getItemSlot(player, 5283), 1);
                player.requestAnim(5212, 0);
                player.createGlobalObject(7936, player.heightLevel, 2813, 3463, 0, 10);
            }
        }
        if (itemUsed == 5160 && usedWith == 34573) { //PapayaTree
            if (player.HerbType > 0) {
                player.frames.sendMessage(player, "You can't plant more than one thing at a time.");
            } else {
                player.HerbloreTimer = 30;
                player.HerbloreType = 8106;
                player.HerbType = 2;
                Engine.playerItems.deleteItem(player, 5288, Engine.playerItems.getItemSlot(player, 5288), 1);
                player.requestAnim(5212, 0);
                player.createGlobalObject(8106, player.heightLevel, 2813, 3463, 0, 10);
            }
        }


//=======================================SMITHING =====================================
        if (itemUsed == 308 && usedWith == 56332) {//Tin
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 10;
            player.SmithingID = 436;
            player.SmithingGet = 2349;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }
        if (itemUsed == 310 && usedWith == 56332) {//Copper
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 10;
            player.SmithingID = 438;
            player.SmithingGet = 2349;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }
        if (itemUsed == 312 && usedWith == 56332) {//Iron
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 50;
            player.SmithingID = 440;
            player.SmithingGet = 2351;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }
        if (itemUsed == 325 && usedWith == 56332) {//Coal
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 100;
            player.SmithingID = 453;
            player.SmithingGet = 2353;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }
        if (itemUsed == 316 && usedWith == 56332) {//Gold
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 150;
            player.SmithingID = 444;
            player.SmithingGet = 2357;
            player.Smithing = true;
            player.Cooking = false;
        }

        if (itemUsed == 319 && usedWith == 56332) {//Mith
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 200;
            player.SmithingID = 447;
            player.SmithingGet = 2359;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }

        if (itemUsed == 321 && usedWith == 56332) {//Addy
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 250;
            player.SmithingID = 449;
            player.SmithingGet = 2361;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }

        if (itemUsed == 323 && usedWith == 56332) {//Rune
            player.frames.setString(player, "Smelt 1", 458, 1);
            player.frames.setString(player, "Smelt 5", 458, 2);
            player.frames.setString(player, "Smelt All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.SmithingXP = 300;
            player.SmithingID = 451;
            player.SmithingGet = 2363;
            player.Smithing = true;
            player.Cooking = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }
        if (itemUsed == 2477 && usedWith == 54540) { //BRONZE
            Smithing.smithing(p, 1);
            p.smithType = 1;
        }
        if (itemUsed == 2479 && usedWith == 54540) { //IRON
            Smithing.smithing(p, 2);
            p.smithType = 2;
        }
        if (itemUsed == 2481 && usedWith == 54540) { //STEEL
            Smithing.smithing(p, 3);
            p.smithType = 3;
        }
        if (itemUsed == 2487 && usedWith == 54540) { //MITH
            Smithing.smithing(p, 4);
            p.smithType = 4;
        }
        if (itemUsed == 2489 && usedWith == 54540) { //ADDY
            Smithing.smithing(p, 5);
            p.smithType = 5;
        }
        if (itemUsed == 2491 && usedWith == 54540) { //RUNE
            Smithing.smithing(p, 6);
            p.smithType = 6;
        }


//======================================= COOKING =====================================
        if (itemUsed == 445 && usedWith == 58124) {
            player.frames.setString(player, "Cook 1", 458, 1);
            player.frames.setString(player, "Cook 5", 458, 2);
            player.frames.setString(player, "Cook All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.CookXP = 25;
            player.CookID = 317;
            player.CookGet = 315;
            player.Cooking = true;
            player.Smithing = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }


        if (itemUsed == 463 && usedWith == 58124) {
            if (player.skillLvl[7] < 15) {
                player.frames.sendMessage(player, "You need level 15 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 50;
                player.CookID = 335;
                player.CookGet = 333;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }
        if (itemUsed == 491 && usedWith == 58124) {
            if (player.skillLvl[7] < 30) {
                player.frames.sendMessage(player, "You need level 30 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 100;
                player.CookID = 363;
                player.CookGet = 365;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 505 && usedWith == 58124) {
            if (player.skillLvl[7] < 50) {
                player.frames.sendMessage(player, "You need level 50 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 200;
                player.CookID = 377;
                player.CookGet = 379;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 511 && usedWith == 58124) {
            if (player.skillLvl[7] < 79) {
                player.frames.sendMessage(player, "You need level 79 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 250;
                player.CookID = 383;
                player.CookGet = 385;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 261 && usedWith == 58124) {
            if (player.skillLvl[7] < 90) {
                player.frames.sendMessage(player, "You need level 90 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 350;
                player.CookID = 389;
                player.CookGet = 391;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }


        if (itemUsed == 445 && usedWith == 28173) {
            player.frames.setString(player, "Cook 1", 458, 1);
            player.frames.setString(player, "Cook 5", 458, 2);
            player.frames.setString(player, "Cook All", 458, 3);
            player.frames.showChatboxInterface(player, 458);
            player.CookXP = 25;
            player.CookID = 317;
            player.CookGet = 315;
            player.Cooking = true;
            player.Smithing = false;
            player.TalkAgent = false;
            player.DecorChange = false;
        }


        if (itemUsed == 463 && usedWith == 28173) {
            if (player.skillLvl[7] < 15) {
                player.frames.sendMessage(player, "You need level 15 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 50;
                player.CookID = 335;
                player.CookGet = 333;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }
        if (itemUsed == 491 && usedWith == 28173) {
            if (player.skillLvl[7] < 30) {
                player.frames.sendMessage(player, "You need level 30 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 100;
                player.CookID = 363;
                player.CookGet = 365;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 505 && usedWith == 28173) {
            if (player.skillLvl[7] < 50) {
                player.frames.sendMessage(player, "You need level 50 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 200;
                player.CookID = 377;
                player.CookGet = 379;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 511 && usedWith == 28173) {
            if (player.skillLvl[7] < 79) {
                player.frames.sendMessage(player, "You need level 79 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 250;
                player.CookID = 383;
                player.CookGet = 385;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }

        if (itemUsed == 261 && usedWith == 28173) {
            if (player.skillLvl[7] < 90) {
                player.frames.sendMessage(player, "You need level 90 Cooking to cook this.");
            } else {
                player.frames.setString(player, "Cook 1", 458, 1);
                player.frames.setString(player, "Cook 5", 458, 2);
                player.frames.setString(player, "Cook All", 458, 3);
                player.frames.showChatboxInterface(player, 458);
                player.CookXP = 350;
                player.CookID = 389;
                player.CookGet = 391;
                player.Cooking = true;
                player.Smithing = false;
                player.TalkAgent = false;
                player.DecorChange = false;
            }
        }


        System.out.println("Used with object: " + usedWith + " itemUsed: "+itemUsed);
	}

}