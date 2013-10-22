package DavidScape.io.packets;

import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;

/**
 * @author Encouragin <ZLyricale@live.nl>
 */

public class ItemOnItem implements Packet {

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
        int usedWith = player.stream.readSignedWordBigEndian();
        int itemUsed = player.stream.readSignedWordA();
        PlayerItems pi = new PlayerItems();
        player.wc.resetWoodcutting();
        player.mi.resetMining();

        if (player.jailed) {
            player.frames.sendMessage(player, "You have been jailed! You can't do anything except yell!");
            return;
        }
//======================================= CRAFTING =====================================

        if (itemUsed == 1755 && usedWith == 1623 || itemUsed == 1623 && usedWith == 1755) {
            player.requestAnim(888, 0);
            pi.deleteItem(player, 1623, pi.getItemSlot(player, 1623), 1);
            pi.addItem(player, 1607, 1);
            player.addSkillXP(125 * player.skillLvl[12], 12);
            player.frames.sendMessage(player, "You cut the sapphire.");
        }

        if (itemUsed == 1755 && usedWith == 1621 || itemUsed == 1621 && usedWith == 1755) {
            if (player.skillLvl[12] >= 30) {
                player.requestAnim(889, 0);
                pi.deleteItem(player, 1621, pi.getItemSlot(player, 1621), 1);
                pi.addItem(player, 1605, 1);
                player.addSkillXP(172 * player.skillLvl[12], 12);
                player.frames.sendMessage(player, "You cut the emerald.");
            } else {
                player.frames.sendMessage(player, "You need level 30 crafting to cut this gem.");
            }
        }
//Start of Godsword Making
        if (itemUsed == 11702 && usedWith == 11690 || itemUsed == 11690 && usedWith == 11702) {
            pi.deleteItem(player, 11702, pi.getItemSlot(player, 11702), 1);
            pi.deleteItem(player, 11690, pi.getItemSlot(player, 11690), 1);
            player.addSkillXP(100, 12);
            pi.addItem(player, 11694, 1);
            player.frames.sendMessage(player, "You attach the Godsword Blade and Hilt together...");
            player.frames.sendMessage(player, "...and get an Armadyl Godsword!");
        }
        if (itemUsed == 11704 && usedWith == 11690 || itemUsed == 11690 && usedWith == 11704) {
            pi.deleteItem(player, 11704, pi.getItemSlot(player, 11704), 1);
            pi.deleteItem(player, 11690, pi.getItemSlot(player, 11690), 1);
            player.addSkillXP(100, 12);
            pi.addItem(player, 11696, 1);
            player.frames.sendMessage(player, "You attach the Godsword Blade and Hilt together...");
            player.frames.sendMessage(player, "...and get a Bandos Godsword!");
        }
        if (itemUsed == 11706 && usedWith == 11690 || itemUsed == 11690 && usedWith == 11706) {
            pi.deleteItem(player, 11706, pi.getItemSlot(player, 11706), 1);
            pi.deleteItem(player, 11690, pi.getItemSlot(player, 11690), 1);
            player.addSkillXP(100, 12);
            pi.addItem(player, 11698, 1);
            player.frames.sendMessage(player, "You attach the Godsword Blade and Hilt together...");
            player.frames.sendMessage(player, "...and get a Saradomin Godsword!");
        }
        if (itemUsed == 11708 && usedWith == 11690 || itemUsed == 11690 && usedWith == 11708) {
            pi.deleteItem(player, 11708, pi.getItemSlot(player, 11708), 1);
            pi.deleteItem(player, 11690, pi.getItemSlot(player, 11690), 1);
            player.addSkillXP(100, 12);
            pi.addItem(player, 11700, 1);
            player.frames.sendMessage(player, "You attach the Godsword Blade and Hilt together...");
            player.frames.sendMessage(player, "...and get a Zamorak Godsword!");
        }
//End of Godsword Making
        if (itemUsed == 1755 && usedWith == 1619 || itemUsed == 1619 && usedWith == 1755) {
            if (player.skillLvl[12] >= 50) {
                player.requestAnim(887, 0);
                pi.deleteItem(player, 1619, pi.getItemSlot(player, 1619), 1);
                pi.addItem(player, 1603, 1);
                player.addSkillXP(25 * player.skillLvl[12], 12);
                player.frames.sendMessage(player, "You cut the ruby.");
            } else {
                player.frames.sendMessage(player, "You need level 50 crafting to cut this gem.");
            }
        }

        if (itemUsed == 1755 && usedWith == 1617 || itemUsed == 1617 && usedWith == 1755) {
            if (player.skillLvl[12] >= 60) {
                player.requestAnim(886, 0);
                pi.deleteItem(player, 1617, pi.getItemSlot(player, 1617), 1);
                pi.addItem(player, 1601, 1);
                player.addSkillXP(50 * player.skillLvl[12], 12);
                player.frames.sendMessage(player, "You cut the diamond.");
            } else {
                player.frames.sendMessage(player, "You need level 60 crafting to cut this gem.");
            }
        }
        if (itemUsed == 1755 && usedWith == 1631 || itemUsed == 1631 && usedWith == 1755) {
            if (player.skillLvl[12] >= 75) {
                player.requestAnim(885, 0);
                pi.deleteItem(player, 1631, pi.getItemSlot(player, 1631), 1);
                pi.addItem(player, 1615, 1);
                player.addSkillXP(100 * player.skillLvl[12], 12);
                player.frames.sendMessage(player, "You cut the dragonstone.");
            } else {
                player.frames.sendMessage(player, "You need level 75 crafting to cut this gem.");
            }
        }

        if (itemUsed == 1755 && usedWith == 6571 || itemUsed == 6571 && usedWith == 1755) {
            if (player.skillLvl[12] >= 85) {
                player.requestAnim(892, 0);
                pi.deleteItem(player, 6571, pi.getItemSlot(player, 6571), 1);
                pi.addItem(player, 6573, 1);
                player.addSkillXP(200 * player.skillLvl[12], 12);
                player.frames.sendMessage(player, "You cut the onyx stone.");
            } else {
                player.frames.sendMessage(player, "You need level 85 crafting to cut this gem.");
            }
        }


// ====================================== FLETCHING ==================================

        if (itemUsed == 946 && usedWith == 1511 || itemUsed == 1511 && usedWith == 946) {
            player.FletchID = 1511;
            player.FletchGet = 882;
            player.FletchXP = 15;
            player.FletchAmount = 28;
            player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);

        }

        if (itemUsed == 946 && usedWith == 1521 || itemUsed == 1521 && usedWith == 946) {
            if (player.skillLvl[9] >= 15) {
                player.FletchID = 1521;
                player.FletchGet = 884;
                player.FletchXP = 45;
                player.FletchAmount = 28;
                player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);
            } else {
                player.frames.sendMessage(player, "You need level 15 fletching to cut this log.");
            }
        }
        if (itemUsed == 946 && usedWith == 1519 || itemUsed == 1519 && usedWith == 946) {
            if (player.skillLvl[9] >= 30) {
                player.FletchID = 1519;
                player.FletchGet = 886;
                player.FletchXP = 60;
                player.FletchAmount = 28;
                player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);
            } else {
                player.frames.sendMessage(player, "You need level 30 fletching to cut this log.");
            }
        }

        if (itemUsed == 946 && usedWith == 1517 || itemUsed == 1517 && usedWith == 946) {
            if (player.skillLvl[9] >= 45) {
                player.FletchID = 1517;
                player.FletchGet = 888;
                player.FletchXP = 70;
                player.FletchAmount = 28;
                player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);
            } else {
                player.frames.sendMessage(player, "You need level 45 fletching to cut this log.");
            }
        }

        if (itemUsed == 946 && usedWith == 1515 || itemUsed == 1515 && usedWith == 946) {
            if (player.skillLvl[9] >= 65) {
                player.FletchID = 1515;
                player.FletchGet = 890;
                player.FletchXP = 100;
                player.FletchAmount = 28;
                player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);
            } else {
                player.frames.sendMessage(player, "You need level 65 fletching to cut this log.");
            }
        }
        if (itemUsed == 946 && usedWith == 1513 || itemUsed == 1513 && usedWith == 946) {
            if (player.skillLvl[9] >= 75) {
                player.FletchID = 1513;
                player.FletchGet = 892;
                player.FletchXP = 150;
                player.FletchAmount = 28;
                player.FletchThat(player, player.FletchXP, player.FletchID, player.FletchGet);
            } else {
                player.frames.sendMessage(player, "You need level 75 fletching to cut this log.");
            }
        }
//============================= FIRE MAKING ====================================
        if (itemUsed == 590 && usedWith == 1511 || itemUsed == 1511 && usedWith == 590) {


            player.addSkillXP(20 * player.skillLvl[11], 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            //player.fmwalk(player.absY, player.absY);
            player.firedelay = 50;
        }
        if (itemUsed == 590 && usedWith == 1521 || itemUsed == 1521 && usedWith == 590) {
            if (player.skillLvl[11] >= 15) {
                player.addSkillXP(35 * player.skillLvl[11], 11);
                player.requestAnim(733, 0);
                player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
                player.objectX = player.absX;
                player.objectY = player.absY;
                player.objectHeight = player.heightLevel;
                pi.deleteItem(player, 1521, pi.getItemSlot(player, 1521), 1);
                player.frames.sendMessage(player, "You set the logs on fire.");
                //player.fmwalk(player.absY, player.absY);
                player.firedelay = 50;
            }
        }
        if (itemUsed == 590 && usedWith == 1519 || itemUsed == 1519 && usedWith == 590) {
            if (player.skillLvl[11] >= 30) {
                player.addSkillXP(60 * player.skillLvl[11], 11);
                player.requestAnim(733, 0);
                player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
                player.objectX = player.absX;
                player.objectY = player.absY;
                player.objectHeight = player.heightLevel;
                pi.deleteItem(player, 1519, pi.getItemSlot(player, 1519), 1);
                player.frames.sendMessage(player, "You set the logs on fire.");
                //player.fmwalk(player.absY, player.absY);
                player.firedelay = 50;
            }
        }
        if (itemUsed == 590 && usedWith == 1517 || itemUsed == 1517 && usedWith == 590) {
            if (player.skillLvl[11] >= 45) {
                player.addSkillXP(80 * player.skillLvl[11], 11);
                player.requestAnim(733, 0);
                player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
                player.objectX = player.absX;
                player.objectY = player.absY;
                player.objectHeight = player.heightLevel;
                pi.deleteItem(player, 1517, pi.getItemSlot(player, 1517), 1);
                player.frames.sendMessage(player, "You set the logs on fire.");
                //player.fmwalk(player.absY, player.absY);
                player.firedelay = 50;
            }
        }
        if (itemUsed == 590 && usedWith == 1515 || itemUsed == 1515 && usedWith == 590) {
            if (player.skillLvl[11] >= 60) {
                player.addSkillXP(120 * player.skillLvl[11], 11);
                player.requestAnim(733, 0);
                player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
                player.objectX = player.absX;
                player.objectY = player.absY;
                player.objectHeight = player.heightLevel;
                pi.deleteItem(player, 1515, pi.getItemSlot(player, 1515), 1);
                player.frames.sendMessage(player, "You set the logs on fire.");
                //player.fmwalk(player.absY, player.absY);
                player.firedelay = 50;
            }
        }
        if (itemUsed == 590 && usedWith == 1513 || itemUsed == 1513 && usedWith == 590) {
            if (player.skillLvl[11] >= 75) {
                player.addSkillXP(150 * player.skillLvl[11], 11);
                player.requestAnim(733, 0);
                player.frames.createGlobalObject(2732, player.heightLevel, player.absX, player.absY, 0, 10);
                player.objectX = player.absX;
                player.objectY = player.absY;
                player.objectHeight = player.heightLevel;
                pi.deleteItem(player, 1513, pi.getItemSlot(player, 1513), 1);
                player.frames.sendMessage(player, "You set the logs on fire.");
                //player.fmwalk(player.absY, player.absY);
                player.firedelay = 50;
            }
        }
        if (itemUsed == 7329 && usedWith == 1511 || itemUsed == 1511 && usedWith == 7329) { // red
            pi.deleteItem(player, 7329, pi.getItemSlot(player, 7329), 1);
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            pi.addItem(player, 7404, 1);
            player.frames.sendMessage(player, "You rub the firelighter on the logs to make red logs.");
        }
        if (itemUsed == 7330 && usedWith == 1511 || itemUsed == 1511 && usedWith == 7330) { // green
            pi.deleteItem(player, 7330, pi.getItemSlot(player, 7330), 1);
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            pi.addItem(player, 7405, 1);
            player.frames.sendMessage(player, "You rub the firelighter on the logs to make green logs.");
        }
        if (itemUsed == 7331 && usedWith == 1511 || itemUsed == 1511 && usedWith == 7331) { // blue
            pi.deleteItem(player, 7331, pi.getItemSlot(player, 7331), 1);
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            pi.addItem(player, 7406, 1);
            player.frames.sendMessage(player, "You rub the firelighter on the logs to make blue logs.");
        }
        if (itemUsed == 10326 && usedWith == 1511 || itemUsed == 1511 && usedWith == 10326) { // purple
            pi.deleteItem(player, 10326, pi.getItemSlot(player, 10326), 1);
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            pi.addItem(player, 10329, 1);
            player.frames.sendMessage(player, "You rub the firelighter on the logs to make purple logs.");
        }
        if (itemUsed == 10327 && usedWith == 1511 || itemUsed == 1511 && usedWith == 10327) { // white
            pi.deleteItem(player, 10327, pi.getItemSlot(player, 10327), 1);
            pi.deleteItem(player, 1511, pi.getItemSlot(player, 1511), 1);
            pi.addItem(player, 10328, 1);
            player.frames.sendMessage(player, "You rub the firelighter on the logs to make white logs.");
        }

        if (itemUsed == 590 && usedWith == 7404 || itemUsed == 7404 && usedWith == 590) { // red
            player.addSkillXP(50, 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(11404, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 7404, pi.getItemSlot(player, 7404), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            player.fmwalk(player.absY, player.absY);
            player.firedelay = 100;
        }
        if (itemUsed == 590 && usedWith == 7405 || itemUsed == 7405 && usedWith == 590) { // green
            player.addSkillXP(50, 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(11405, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 7405, pi.getItemSlot(player, 7405), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            player.fmwalk(player.absY, player.absY);
            player.firedelay = 100;
        }
        if (itemUsed == 590 && usedWith == 7406 || itemUsed == 7406 && usedWith == 590) { // blue
            player.addSkillXP(50, 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(11406, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 7406, pi.getItemSlot(player, 7406), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            player.fmwalk(player.absY, player.absY);
            player.firedelay = 100;
        }
        if (itemUsed == 590 && usedWith == 10329 || itemUsed == 10329 && usedWith == 590) { // blue
            player.addSkillXP(50, 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(20001, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 10329, pi.getItemSlot(player, 10329), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            player.fmwalk(player.absY, player.absY);
            player.firedelay = 100;
        }
        if (itemUsed == 590 && usedWith == 10328 || itemUsed == 10328 && usedWith == 590) { // blue
            player.addSkillXP(50, 11);
            player.requestAnim(733, 0);
            player.frames.createGlobalObject(20000, player.heightLevel, player.absX, player.absY, 0, 10);
            player.objectX = player.absX;
            player.objectY = player.absY;
            player.objectHeight = player.heightLevel;
            pi.deleteItem(player, 10328, pi.getItemSlot(player, 10328), 1);
            player.frames.sendMessage(player, "You set the logs on fire.");
            player.fmwalk(player.absY, player.absY);
            player.firedelay = 100;
		}
		
	}

}