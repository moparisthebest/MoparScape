package DavidScape.Skills.construction;

import DavidScape.Engine;
import DavidScape.players.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Construction {

    /**
     * If roomtype == garden {
     * 0 = Center
     * 1 = Small plant space 1
     * 2 = Small plant space 2
     * 3 = Big plant space 1
     * 4 = Big plant space 2
     * 5 = Tree space
     * 6 = Big tree space
     * }
     */
    private static int roomCoordsX[][] = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Full empty place
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Parlour
            {3, 3, 4, 6, 0, 6, 1, -1, -1, -1}, //Garden
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Kitchen
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1} //Dining room
    };
    private static int roomCoordsY[][] = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Full empty place
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Parlour
            {3, 1, 5, 0, 0, 6, 5, -1, -1, -1}, //Garden
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, //Kitchen
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1} //Dining room
    };
    //X, Y, Price, Level
    public static int roomInfo[][] = {
            {1864, 5056, 0, 0}, //Unbuilded land
            {1856, 5112, 1000, 1}, //Parlour
            {1856, 5064, 1000, 1}, //Garden
            {1872, 5112, 5000, 5}, //Kitchen
            {1890, 5112, 5000, 10}, //Dining room
            {1856, 5096, 10000, 15}, //Workshop
            {1904, 5112, 10000, 20}, //Bedroom
            {1880, 5104, 15000, 25}, //Skill hall
            {1896, 5088, 25000, 30}, //Games room
            {1880, 5088, 25000, 32}, //Combat room
            {1912, 5104, 25000, 35}, //Quest hall
            {1888, 5096, 50000, 40}, //Study
            {1904, 5064, 50000, 42}, //Costume room
            {1872, 5096, 50000, 45}, //Chapel
            {1864, 5088, 100000, 50}, //Portal chamber
            {1872, 5064, 75000, 55}, //Formal garden
            {1904, 5096, 150000, 60}, //Throne room
            {1904, 5080, 150000, 65}, //Oubliette
            {1888, 5080, 7500, 70}, //Dungeon - Corridor
            {1856, 5080, 7500, 70}, //Dungeon - Junction
            {1872, 5080, 7500, 70}, //Dungeon - Stairs
            {1912, 5088, 250000, 75} //Treasure room
    };

    private static void send3SlotShop(Player p, int[] itemArray, int[] itemAmt, String[] names, int[] level, String[][] need) {
        p.frames.setItems(p, 394, 106, 8, itemArray, itemAmt);

        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                p.frames.setString(p, need[i][i2], 394, 92 + i * 5 + i2);
                p.frames.setString(p, names[i], 394, 91 + i * 5);
                p.frames.setString(p, "Lvl " + level[i], 394, 110 + i);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (p.skillLvl[22] >= level[i]) {
                p.frames.setConfig(p, 261 + i, 1);
            } else {
                p.frames.setConfig(p, 261 + i, 0);
            }
        }
        p.frames.showInterface(p, 394);
    }

    public static void showGardenCenterBuildspot(Player p) {
        int[] itemArray = {8168, 8172, 8169, -1, 8170, -1, 8171};
        int[] itemAmt = {0, 0, 0, 0, 0, 0, 0};
        String[] names = {"Exit portal", "Decorative rock", "Pond", "Imp statue", "Dungeon entrance"};
        int[] level = {1, 5, 10, 15, 70};
        String[][] need = {{"Iron bar: 10", "", "", "",}, {"Limestone brick: 5", "", "", "",}, {"Soft clay: 10", "", "", "",}, {"Limestone brick: 5", "Soft clay: 5", "", "",}, {"Marble block: 1", "", "", ""}};

        p.frames.setItems(p, 396, 132, 8, itemArray, itemAmt);

        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                for (int i2 = 0; i2 < 4; i2++) {
                    p.frames.setString(p, need[i][i2], 396, 98 + i * 5 + i2);
                    p.frames.setString(p, names[i], 396, 97 + i * 5);
                    p.frames.setString(p, "Lvl " + level[i], 396, 140 + i);
                }
            } else {
                for (int i2 = 0; i2 < 4; i2++) {
                    p.frames.setString(p, "", 396, 98 + i * 5 + i2);
                    p.frames.setString(p, "", 396, 140 + i);
                    p.frames.setString(p, "", 396, 97 + i * 5);
                }
            }
        }

        p.frames.showInterface(p, 396);
    }

    public static void showGardenSmallPlant1Buildspot(Player p) {
        int[] itemArray = {8180, 8181, 8182};
        int[] itemAmt = {0, 0, 0};
        String[] names = {"Plant", "Small fern", "Fern"};
        int[] level = {1, 6, 12};
        String[][] need = {{"Bagged plant 1: 1", "Watering can: 1", "", "",}, {"Bagged plant 2: 1", "Watering can: 1", "", "",}, {"Bagged plant 3: 1", "Watering can: 1", "", "",}};
        send3SlotShop(p, itemArray, itemAmt, names, level, need);
    }

    public static void showGardenSmallPlant2Buildspot(Player p) {
        int[] itemArray = {8183, 8184, 8185};
        int[] itemAmt = {0, 0, 0};
        String[] names = {"Dock leaf", "Thistle", "Reeds"};
        int[] level = {1, 6, 12};
        String[][] need = {{"Bagged plant 1: 1", "Watering can: 1", "", "",}, {"Bagged plant 2: 1", "Watering can: 1", "", "",}, {"Bagged plant 3: 1", "Watering can: 1", "", "",}};
        send3SlotShop(p, itemArray, itemAmt, names, level, need);
    }

    public static void showGardenBigPlant1Buildspot(Player p) {
        int[] itemArray = {8186, 8187, 8188};
        int[] itemAmt = {0, 0, 0};
        String[] names = {"Fern", "Bush", "Tall plant"};
        int[] level = {1, 6, 12};
        String[][] need = {{"Bagged plant 1: 1", "Watering can: 1", "", "",}, {"Bagged plant 2: 1", "Watering can: 1", "", "",}, {"Bagged plant 3: 1", "Watering can: 1", "", "",}};
        send3SlotShop(p, itemArray, itemAmt, names, level, need);
    }

    public static void showGardenBigPlant2Buildspot(Player p) {
        int[] itemArray = {8189, 8190, 8191};
        int[] itemAmt = {0, 0, 0};
        String[] names = {"Short plant", "Large leaf bush", "Huge plant"};
        int[] level = {1, 6, 12};
        String[][] need = {{"Bagged plant 1: 1", "Watering can: 1", "", "",}, {"Bagged plant 2: 1", "Watering can: 1", "", "",}, {"Bagged plant 3: 1", "Watering can: 1", "", "",}};
        send3SlotShop(p, itemArray, itemAmt, names, level, need);
    }


//        public static void showGardenBigTreeBuildspot(Player p) {
//        int[] itemArray = {8173, 8177, 8174, 8178, 8175, 8179, 8176};
//        int[] itemAmt = {0, 0, 0, 0, 0, 0, 0};
//        String[] names = {"Tree", "Nice Tree", "Oak Tree", "Willow Tree", "Maple Tree", "Yew Tree", "Magic Tree"};
//        int[] level = {5, 10, 15, 30, 45, 60, 75};
//        String[][] need = {{"Bagged tree: 1", "Watering can: 1", "", "",}, {"Bagged nice tree: 1", "Watering can: 1", "", "",}, {"Bagged oak tree: 1", "Watering can: 1", "", "",}, {"Bagged willow tree: 1", "Watering can: 1", "", "",}, {"Bagged maple tree: 1", "Watering can: 1", "", ""}, {"Bagged yew tree: 1", "Watering can: 1", "", ""}, {"Bagged magic tree: 1", "Watering can: 1", "", ""}};
//
//        p.frames.setItems(p, 396, 132, 8, itemArray, itemAmt);
//
//        for (int i = 0; i < 7; i++) {
//            for (int i2 = 0; i2 < 4; i2++) {
//                p.frames.setString(p, need[i][i2], 396, 98 + i * 5 + i2);
//                p.frames.setString(p, names[i], 396, 97 + i * 5);
//                p.frames.setString(p, "Lvl " + level[i], 396, 140 + i);
//            }
//        }
//        //Playerlvl needed to send out the correct setConfig
//        //if player lvl 1
//        p.frames.setConfig(p, 261, 194);
//        p.frames.showInterface(p, 396);
//    }

    public static boolean haveCan(Player p) {
        if ((Engine.playerItems.invItemCount(p, 5340) >= 1) || (Engine.playerItems.invItemCount(p, 5339) >= 1) || (Engine.playerItems.invItemCount(p, 5338) >= 1) || (Engine.playerItems.invItemCount(p, 5337) >= 1) || (Engine.playerItems.invItemCount(p, 5336) >= 1) || (Engine.playerItems.invItemCount(p, 5335) >= 1) || (Engine.playerItems.invItemCount(p, 5334) >= 1) || (Engine.playerItems.invItemCount(p, 5333) >= 1)) {
            return true;
        }
        return false;
    }

    public static void decraseCan(Player p) {
        for (int can = 5333; can <= 5340; can++) {
            if (Engine.playerItems.invItemCount(p, can) >= 1) {
                Engine.playerItems.deleteItem(p, can, 1);
                Engine.playerItems.addItem(p, can - 1, 1);
                can = 5341;
            }
        }
    }

    public static void teleToPOH(final Player p) {
        //p.frames.showInterface(p, 399);
        p.frames.removeShownInterface(p);
        p.customMapdata = true;
        p.heightLevel = 1;
        p.teleportToX = 4000 + 100 * Engine.constPlayers;
        p.teleportToY = 4000;
        p.mapRegionX = (p.teleportToX >> 3);
        p.mapRegionY = (p.teleportToY >> 3);
        int[][][] xPallete = new int[4][13][13];
        int[][][] yPallete = new int[4][13][13];
        int[][][] zPallete = new int[4][13][13];
        Engine.fileManager.saveRoomData(p);
        Engine.fileManager.readRoomData(p);
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                xPallete[1][x][y] = (roomInfo[p.roomTypes[1][x][y]][0] / 8);
                yPallete[1][x][y] = (roomInfo[p.roomTypes[1][x][y]][1] / 8);
                zPallete[1][x][y] = p.heightLevel;
            }
        }
        p.frames.sendMapRegion2(p, xPallete, yPallete, zPallete);
        Engine.constPlayers++;

        ActionListener taskPerformer = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                p.frames.teleportOnMapdata(p, 2, 61, 59);

                for (int x = 0; x < 13; x++) {
                    for (int y = 0; y < 13; y++) {
                        for (int i = 0; i < 10; i++) {
                            if (p.roomSpots[1][x][y][i] != 0) {
                                p.frames.createLocalObject(p, p.roomSpots[1][x][y][i], x * 8 + roomCoordsX[p.roomTypes[1][x][y]][i], y * 8 + roomCoordsY[p.roomTypes[1][x][y]][i], 1, 10);
                            } else {
                                if (p.buildMode == false) {
                                    p.frames.deleteLocalObject(p, x * 8 + roomCoordsX[p.roomTypes[1][x][y]][i], y * 8 + roomCoordsY[p.roomTypes[1][x][y]][i], 10);
                                }
                            }
                        }
                        if (p.roomTypes[1][x][y] != 0) {
                            if (p.buildMode == false) {
                                //Remove doors from that room
                                if (p.roomTypes[1][x][y] != 1) { //Parlour don't have door on that spot, it have wall...
                                    p.frames.deleteLocalObject(p, x * 8 + 4, y * 8 + 7, 0);
                                    p.frames.deleteLocalObject(p, x * 8 + 3, y * 8 + 7, 0);
                                }
                                p.frames.deleteLocalObject(p, x * 8 + 4, y * 8, 0);
                                p.frames.deleteLocalObject(p, x * 8 + 3, y * 8, 0);
                                p.frames.deleteLocalObject(p, x * 8, y * 8 + 4, 0);
                                p.frames.deleteLocalObject(p, x * 8, y * 8 + 3, 0);
                                p.frames.deleteLocalObject(p, x * 8 + 7, y * 8 + 3, 0);
                                p.frames.deleteLocalObject(p, x * 8 + 7, y * 8 + 4, 0);

                            }
                        }
                    }
                }

                p.frames.removeShownInterface(p);
                Engine.fileManager.saveRoomData(p);
            }
        };
        Timer timer = new Timer(1200, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }

    public static void addRoom(Player p, int roomId) {
        if (p.skillLvl[22] >= roomInfo[roomId + 1][3]) {
            if (Engine.playerItems.invItemCount(p, 995) >= roomInfo[roomId + 1][2]) {
                switch (p.nextRoom[0]) {
                    case 1: //North
                        p.roomTypes[1][p.nextRoom[1]][p.nextRoom[2]++] = roomId + 1;
                        p.nextRoom[0] = 2;
                        break;
                    case 2: //East
                        p.roomTypes[1][p.nextRoom[1]++][p.nextRoom[2]] = roomId + 1;
                        p.nextRoom[0] = 3;
                        break;
                    case 3: //South
                        p.roomTypes[1][p.nextRoom[1]][p.nextRoom[2]--] = roomId + 1;
                        p.nextRoom[0] = 4;
                        break;
                    case 4: //West
                        p.roomTypes[1][p.nextRoom[1]--][p.nextRoom[2]] = roomId + 1;
                        p.nextRoom[0] = 1;
                        break;
                }
                //System.out.println(p.nextRoom[0]);
                //System.out.println(p.nextRoom[1]);
                //System.out.println(p.nextRoom[2]);
                Engine.fileManager.saveRoomData(p);
                Engine.playerItems.deleteItem(p, 995, roomInfo[roomId + 1][2]);
                Construction.teleToPOH(p);
            } else {
                p.frames.sendMessage(p, "You don't have enough money to buy this room.");
            }
        } else {
            p.frames.sendMessage(p, "You level " + roomInfo[roomId + 1][3] + " Construction to build this room.");
        }
    }

    public static void removeFurniture(Player p, int spot, int newObj) {
        int objArrayX = (int) Math.floor((p.lastObjectX - 8 * (p.mapRegionX - 6)) / 8);
        int objArrayY = (int) Math.floor((p.lastObjectY - 8 * (p.mapRegionY - 6)) / 8);

        if (p.buildMode) {
            p.roomSpots[1][objArrayX][objArrayY][spot] = 0;
            p.frames.createObject(p, newObj, p.lastObjectX, p.lastObjectY, 1, 10);
            Engine.fileManager.saveRoomData(p);
        } else {
            p.frames.sendMessage(p, "You can only do that in building mode.");
        }
    }

    public static void addFurniture(Player p, int level, int[] item, int[] itemAmt, int spot, int newObj, boolean needCan, int conXP) {
        int roomX = (int) Math.floor((p.lastObjectX - 8 * (p.mapRegionX - 6)) / 8);
        int roomY = (int) Math.floor((p.lastObjectY - 8 * (p.mapRegionY - 6)) / 8);

        if (!(p.skillLvl[22] >= level)) {
            p.frames.sendMessage(p, "You need level " + level + " Construction to build this.");
            return;
        }

        for (int i = 0; i < item.length; i++) {
            if (item[i] != 0) {
                if (Engine.playerItems.invItemCount(p, item[i]) < itemAmt[i]) {
                    p.frames.sendMessage(p, "You don't have the needed items.");
                    return;
                }
            }
        }
        if (needCan && Construction.haveCan(p) == false) {
            p.frames.sendMessage(p, "You don't have the needed items.");
            return;
        }

        p.addSkillXP(conXP, 22); //Const XP
        if (needCan) {
            p.addSkillXP(conXP, 19); //Farming XP
        }
        p.roomSpots[p.heightLevel][roomX][roomY][spot] = newObj;
        Engine.fileManager.saveRoomData(p);
        if (needCan) {
            Construction.decraseCan(p);
        }
        for (int i = 0; i < item.length; i++) {
            if (item[i] != 0) {
                Engine.playerItems.deleteItem(p, item[i], itemAmt[i]);
            }
        }
        p.frames.createObject(p, newObj, p.lastObjectX, p.lastObjectY, 1, 10);
        p.frames.removeShownInterface(p);
    }
}