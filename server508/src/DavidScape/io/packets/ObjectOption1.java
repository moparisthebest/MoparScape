package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.Skills.Mining;
import DavidScape.Skills.Woodcutting;
import DavidScape.Skills.construction.Construction;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;
import DavidScape.util.Misc;


public class ObjectOption1 implements Packet {


    /**
     * make sure to document EVERY coordinate to go with each object unless an un-important object(wilderness ditch lol).
     * This will prevent people from spawning an object client side and actually using it.
     * So make sure to include with the id, objectX == # && objectY == #
     */

    public static int capes[] = {1052, 6570, 9747, 9748, 9750, 9751};

    public static boolean cape(Player p) {

        if (Engine.playerItems.HasItemAmount(p, 1052, 1) || Engine.playerItems.HasItemAmount(p, 6570, 1) || Engine.playerItems.HasItemAmount(p, 6568, 1)
                || Engine.playerItems.HasItemAmount(p, 9747, 1) || Engine.playerItems.HasItemAmount(p, 9748, 1) || Engine.playerItems.HasItemAmount(p, 9750, 1)
                || Engine.playerItems.HasItemAmount(p, 9751, 1) || Engine.playerItems.HasItemAmount(p, 9753, 1) || Engine.playerItems.HasItemAmount(p, 9754, 1)
                || Engine.playerItems.HasItemAmount(p, 9756, 1) || Engine.playerItems.HasItemAmount(p, 9757, 1) || Engine.playerItems.HasItemAmount(p, 9759, 1)
                || Engine.playerItems.HasItemAmount(p, 9760, 1) || Engine.playerItems.HasItemAmount(p, 9762, 1) || Engine.playerItems.HasItemAmount(p, 9763, 1)
                || Engine.playerItems.HasItemAmount(p, 9765, 1) || Engine.playerItems.HasItemAmount(p, 9766, 1) || Engine.playerItems.HasItemAmount(p, 9767, 1)
                || Engine.playerItems.HasItemAmount(p, 9769, 1) || Engine.playerItems.HasItemAmount(p, 9771, 1) || Engine.playerItems.HasItemAmount(p, 9772, 1)
                || Engine.playerItems.HasItemAmount(p, 9774, 1) || Engine.playerItems.HasItemAmount(p, 9775, 1) || Engine.playerItems.HasItemAmount(p, 9777, 1)
                || Engine.playerItems.HasItemAmount(p, 9778, 1) || Engine.playerItems.HasItemAmount(p, 9780, 1) || Engine.playerItems.HasItemAmount(p, 9781, 1)
                || Engine.playerItems.HasItemAmount(p, 9783, 1) || Engine.playerItems.HasItemAmount(p, 9784, 1) || Engine.playerItems.HasItemAmount(p, 9786, 1)
                || Engine.playerItems.HasItemAmount(p, 9787, 1) || Engine.playerItems.HasItemAmount(p, 9789, 1) || Engine.playerItems.HasItemAmount(p, 9790, 1)
                || Engine.playerItems.HasItemAmount(p, 9792, 1) || Engine.playerItems.HasItemAmount(p, 9793, 1) || Engine.playerItems.HasItemAmount(p, 9795, 1)
                || Engine.playerItems.HasItemAmount(p, 9796, 1) || Engine.playerItems.HasItemAmount(p, 9798, 1) || Engine.playerItems.HasItemAmount(p, 9799, 1)
                || Engine.playerItems.HasItemAmount(p, 9801, 1) || Engine.playerItems.HasItemAmount(p, 9802, 1) || Engine.playerItems.HasItemAmount(p, 9804, 1)
                || Engine.playerItems.HasItemAmount(p, 9805, 1) || Engine.playerItems.HasItemAmount(p, 9807, 1) || Engine.playerItems.HasItemAmount(p, 9808, 1)
                || Engine.playerItems.HasItemAmount(p, 9810, 1) || Engine.playerItems.HasItemAmount(p, 9811, 1) || Engine.playerItems.HasItemAmount(p, 9813, 1)

                || Engine.playerItems.HasItemAmount(p, 1038, 1) || Engine.playerItems.HasItemAmount(p, 1040, 1) || Engine.playerItems.HasItemAmount(p, 1042, 1)
                || Engine.playerItems.HasItemAmount(p, 1044, 1) || Engine.playerItems.HasItemAmount(p, 1046, 1) || Engine.playerItems.HasItemAmount(p, 1048, 1)
                || Engine.playerItems.HasItemAmount(p, 1050, 1) || Engine.playerItems.HasItemAmount(p, 1053, 1) || Engine.playerItems.HasItemAmount(p, 1055, 1)
                || Engine.playerItems.HasItemAmount(p, 1057, 1) || Engine.playerItems.HasItemAmount(p, 1149, 1) || Engine.playerItems.HasItemAmount(p, 1155, 1)
                || Engine.playerItems.HasItemAmount(p, 1157, 1) || Engine.playerItems.HasItemAmount(p, 1159, 1) || Engine.playerItems.HasItemAmount(p, 1161, 1)
                || Engine.playerItems.HasItemAmount(p, 1163, 1) || Engine.playerItems.HasItemAmount(p, 1165, 1) || Engine.playerItems.HasItemAmount(p, 4716, 1)
                || Engine.playerItems.HasItemAmount(p, 4708, 1) || Engine.playerItems.HasItemAmount(p, 4724, 1) || Engine.playerItems.HasItemAmount(p, 4732, 1)
                || Engine.playerItems.HasItemAmount(p, 4745, 1) || Engine.playerItems.HasItemAmount(p, 4753, 1) || Engine.playerItems.HasItemAmount(p, 11335, 1)
                || Engine.playerItems.HasItemAmount(p, 10828, 1) || Engine.playerItems.HasItemAmount(p, 10334, 1) || Engine.playerItems.HasItemAmount(p, 10342, 1)
                || Engine.playerItems.HasItemAmount(p, 10350, 1) || Engine.playerItems.HasItemAmount(p, 2639, 1) || Engine.playerItems.HasItemAmount(p, 2641, 1)
                || Engine.playerItems.HasItemAmount(p, 2743, 1) || Engine.playerItems.HasItemAmount(p, 2581, 1) || Engine.playerItems.HasItemAmount(p, 12210, 1)
                || Engine.playerItems.HasItemAmount(p, 12213, 1) || Engine.playerItems.HasItemAmount(p, 12216, 1) || Engine.playerItems.HasItemAmount(p, 12219, 1)
                || Engine.playerItems.HasItemAmount(p, 12222, 1) || Engine.playerItems.HasItemAmount(p, 9749, 1) || Engine.playerItems.HasItemAmount(p, 9752, 1)
                || Engine.playerItems.HasItemAmount(p, 9755, 1) || Engine.playerItems.HasItemAmount(p, 9758, 1) || Engine.playerItems.HasItemAmount(p, 9761, 1)
                || Engine.playerItems.HasItemAmount(p, 9764, 1) || Engine.playerItems.HasItemAmount(p, 9767, 1) || Engine.playerItems.HasItemAmount(p, 9770, 1)
                || Engine.playerItems.HasItemAmount(p, 9773, 1) || Engine.playerItems.HasItemAmount(p, 9776, 1) || Engine.playerItems.HasItemAmount(p, 9779, 1)
                || Engine.playerItems.HasItemAmount(p, 9782, 1) || Engine.playerItems.HasItemAmount(p, 9785, 1) || Engine.playerItems.HasItemAmount(p, 9788, 1)
                || Engine.playerItems.HasItemAmount(p, 9791, 1) || Engine.playerItems.HasItemAmount(p, 9794, 1) || Engine.playerItems.HasItemAmount(p, 9797, 1)
                || Engine.playerItems.HasItemAmount(p, 9800, 1) || Engine.playerItems.HasItemAmount(p, 9803, 1) || Engine.playerItems.HasItemAmount(p, 9806, 1)
                || Engine.playerItems.HasItemAmount(p, 9809, 1) || Engine.playerItems.HasItemAmount(p, 9812, 1) || Engine.playerItems.HasItemAmount(p, 9814, 1)
                ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Handles the first option on objects.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void dropGraveItems(Player p) {
        try {
            for (int i = 0; i < p.gsItems.size(); i++) {
                if (p.gsItems.get(i) != null && p.gsItemsN.get(i) != null) {
                    //if(pi.addItem(p, p.gsItems.get(i), p.gsItemsN.get(i))) {
                    Engine.items.createGroundItem(p.gsItems.get(i), p.gsItemsN.get(i), p.absX, p.absY, p.gsH, p.username);
                    p.gsItems.remove(i);
                    p.gsItemsN.remove(i);
                    //}
                    //else {
                    //p.frames.sendMessage(p, "You had better bank to recover the rest of your items!");
                    //p.frames.sendMessage(p, "You have " + (int)(p.graveStoneTimer * 600 / 1000) + " seconds left!");
                    //return;
                    //}
                }
            }
            for (int i = 0; i < p.gsEquip.size(); i++) {
                if (p.gsEquip.get(i) != null && p.gsEquipN.get(i) != null) {
                    //if(pi.addItem(p, p.gsEquip.get(i), p.gsEquipN.get(i))) {
                    Engine.items.createGroundItem(p.gsEquip.get(i), p.gsEquipN.get(i), p.absX, p.absY, p.gsH, p.username);
                    p.gsEquip.remove(i);
                    p.gsEquipN.remove(i);
                    //}
                    //else {
                    //p.frames.sendMessage(p, "You had better bank to recover the rest of your items!");
                    //p.frames.sendMessage(p, "You have " + (int)(p.graveStoneTimer * 600 / 1000) + " seconds left!");
                    //return;
                    //}
                }
            }
            if (p.gsItems.size() < 1 && p.gsItems.size() < 1 && p.gsEquip.size() < 1 && p.gsEquip.size() < 1) {
                p.frames.createGlobalObject(0, p.gsH, p.gsX, p.gsY, 0, 10);
                p.gsX = -1;
                p.gsY = -1;
                p.graveStone = false;
                p.graveStoneTimer = -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        if (Misc.random(150) == 2) {
            p.randomEvent();
            return;
        }
        if (p.objectTimer != 0) {
            return;
        }
        PlayerItems pi = new PlayerItems();
        if (!p.objectOption1) {
            p.wc.resetWoodcutting();
            p.mi.resetMining();
            p.clickX = p.stream.readUnsignedWordBigEndian();
            p.clickId = p.stream.readUnsignedWord();
            p.clickY = p.stream.readUnsignedWordBigEndianA();


            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.objectOption1 = true;
        }
        int distance = 0;

        if (p.walkDir != -1 || p.runDir != -1
                || distance > objectSize(p.clickId)) {
            return;
        }
        p.objectOption1 = false;
        int reqL = 1;
        int rE = 1;
        switch (p.clickId) {
            case 34498:
                if (p.absX > 2671 && p.absX < 2674 && p.absY > 3321 && p.absY < 3325) {
                    p.setCoords(2672, 3320, 1);
                }
                break;
            case 34499:
                if (p.absX > 2671 && p.absX < 2674 && p.absY > 3321 && p.absY < 3325) {
                    p.setCoords(2672, 3322, 0);
                }
                break;
            case 36793:
                p.setCoords(3200, 3242, 1);
                p.frames.sendMessage(p, "You climb the stairs.");
                break;
            case 36794:
                p.setCoords(3200, 3245, 0);
                p.frames.sendMessage(p, "You climb down the stairs.");
                break;
            case 34548:
                p.setCoords(2611, 3307, 1);
                p.frames.sendMessage(p, "You climb the stairs.");
                break;
            case 34550:
                p.setCoords(2611, 3304, 0);
                p.frames.sendMessage(p, "You down climb the stairs.");
                break;

            case 26106:
                p.setCoords(2751, 3513, 1);
                p.frames.sendMessage(p, "You climb the stairs.");
                break;
            case 25604:
                p.setCoords(2750, 3508, 0);
                p.frames.sendMessage(p, "You down climb the stairs.");
                break;

            case 26082:
                if (p.username.equalsIgnoreCase("richman55") || p.username.equalsIgnoreCase("karaliesa")) {
                    p.frames.sendMessage(p, "You own this house!");
                    if (p.absX == Engine.houseX[27] && p.absY == Engine.houseY[27]) {
                        p.setCoords(p.absX + Engine.hMoveX[27], p.absY + Engine.hMoveY[27], 0);
                        return;
                    } else {
                        p.setCoords(Engine.houseX[27], Engine.houseY[27], 0);
                        return;
                    }
                } else {
                    p.frames.sendMessage(p, "Richman55 and Karaliesa own this house!");
                    Player p3 = Engine.players[Engine.getIdFromName("richman55")];
                    Player p4 = Engine.players[Engine.getIdFromName("karaliesa")];
                    if (p3 != null) {
                        if (p3.houseLocked) {
                            p.frames.sendMessage(p, "Richman55 has the house locked!");
                            return;
                        }
                        if (p.absX == Engine.houseX[27] && p.absY == Engine.houseY[27]) {
                            p.setCoords(p.absX + Engine.hMoveX[27], p.absY + Engine.hMoveY[27], 0);
                            return;
                        } else {
                            p.setCoords(Engine.houseX[27], Engine.houseY[27], 0);
                            return;
                        }
                    }
                    if (p4 != null) {
                        if (p4.houseLocked) {
                            p.frames.sendMessage(p, "Karaliesa has the house locked!");
                            return;
                        }
                        if (p.absX == Engine.houseX[27] && p.absY == Engine.houseY[27]) {
                            p.setCoords(p.absX + Engine.hMoveX[27], p.absY + Engine.hMoveY[27], 0);
                            return;
                        } else {
                            p.setCoords(Engine.houseX[27], Engine.houseY[27], 0);
                            return;
                        }
                    } else {
                        p.frames.sendMessage(p, "Karaliesa and Richman55 are offline!");
                    }
                }
                break;
            case 34809:
                if (p.absX == 2576 && p.absY == 3298) {
                    p.setCoords(2576, 3299, 0);
                    return;
                }
                if (p.absX == 2576 && p.absY == 3299) {
                    p.setCoords(2576, 3298, 0);
                    return;
                }
                if (p.absX == 2576 && p.absY == 3295) {
                    p.setCoords(2576, 3294, 0);
                    return;
                }
                if (p.absX == 2576 && p.absY == 3294) {
                    p.setCoords(2576, 3295, 0);
                    return;
                }
                break;
            case 25638:
            case 25640:
                if (p.absY == 3503) {
                    p.setCoords(2757, 3504, 0);
                }
                if (p.absY == 3504) {
                    p.setCoords(2757, 3503, 0);
                }
                break;
            case 1738:
                if (p.absX > 2610 && p.absX < 2622 && p.absY > 3207 && p.absY < 3212) {
                    p.setCoords(2618, 3208, 1);
                    return;
                }
                if (p.absX > 2593 && p.absX < 2602 && p.absY > 3207 && p.absY < 3212) {
                    p.setCoords(2597, 3208, 1);
                    return;
                }
                break;
            case 1740:
                p.setCoords(p.absX, p.absY, 0);
                break;

            case 34874:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 1);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 1);
                }
            case 34871:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 1);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 1);
                }
                break;
            case 34872:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 2);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 2);
                }
            case 34875:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 2);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 2);
                }
                break;
            case 34873:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 1);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 1);
                }
            case 34876:
                if (p.absY > 3302) {
                    p.setCoords(2572, 3306, 1);
                    return;
                }
                if (p.absY < 3291) {
                    p.setCoords(2572, 3287, 1);
                }
            case 34825:
                if (p.absX == 2572 && p.absY == 3296) {
                    p.setCoords(2573, 3296, p.heightLevel);
                    return;
                }
                if (p.absX == 2573 && p.absY == 3296) {
                    p.setCoords(2572, 3296, p.heightLevel);
                    return;
                }
                break;
            case 1530:
            case 1533:
            case 1553:
            case 36846:
            case 1536:
            case 2706:
            case 34812:
            case 34807:
            case 34811:
            case 2546:
            case 34819:
            case 34822:
            case 2555:
                if (p.absX == 2573 && p.absY == 3290) {
                    p.setCoords(2574, 3290, p.heightLevel);
                    return;
                }
                if (p.absX == 2574 && p.absY == 3290) {
                    p.setCoords(2573, 3290, p.heightLevel);
                    return;
                }

                if (p.absX == 2577 && p.absY == 3306) {
                    p.setCoords(2577, 3305, p.heightLevel);
                    return;
                }
                if (p.absX == 2577 && p.absY == 3305) {
                    p.setCoords(2577, 3306, p.heightLevel);
                    return;
                }
                if (p.absX == 2579 && p.absY == 3286) {
                    p.setCoords(2580, 3286, p.heightLevel);
                    return;
                }
                if (p.absX == 2580 && p.absY == 3286) {
                    p.setCoords(2579, 3286, p.heightLevel);
                    return;
                }
                if (p.absX == 2579 && p.absY == 3307) {
                    p.setCoords(2580, 3307, p.heightLevel);
                    return;
                }
                if (p.absX == 2580 && p.absY == 3307) {
                    p.setCoords(2579, 3307, p.heightLevel);
                    return;
                }
                if (p.absX == 2572 && p.absY == 3302) {
                    p.setCoords(2572, 3303, p.heightLevel);
                    return;
                }
                if (p.absX == 2572 && p.absY == 3303) {
                    p.setCoords(2572, 3302, 0);
                    return;
                }
                if (p.absX == 2572 && p.absY == 3291) {
                    p.setCoords(2572, 3290, 0);
                    return;
                }
                if (p.absX == 2572 && p.absY == 3290) {
                    p.setCoords(2572, 3291, 0);
                    return;
                }
                if (p.absX == 2602 && p.absY == 3209) {
                    p.setCoords(2601, 3209, 0);
                    return;
                }
                if (p.absX == 2601 && p.absY == 3209) {
                    p.setCoords(2602, 3209, 0);
                    return;
                }
                if (p.absX == 2610 && p.absY == 3209) {
                    p.setCoords(2611, 3209, 0);
                    return;
                }
                if (p.absX == 2611 && p.absY == 3209) {
                    p.setCoords(2610, 3209, 0);
                    return;
                }
                if (p.absX == 2670 && p.absY == 3319) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2670, 3320, 0);
                    return;
                }
                if (p.absX == 2670 && p.absY == 3320) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2670, 3319, 0);
                    return;
                }

                if (p.absX == 2613 && p.absY == 3309) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2612, 3309, 0);
                    return;
                }
                if (p.absX == 2612 && p.absY == 3309) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2613, 3309, 0);
                    return;
                }

                if (p.absX == 2611 && p.absY == 3308) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2611, 3307, 0);
                    return;
                }
                if (p.absX == 2611 && p.absY == 3307) {
                    if ((p.clickX - p.absX < 2 && p.clickX - p.absX > -2) && (p.clickY - p.absY < 2 && p.clickY - p.absY > -2))
                        p.setCoords(2611, 3308, 0);
                    return;
                }

                if (p.absX == 3201 && p.absY == 3241) {
                    if (Engine.houseOwners[9].equalsIgnoreCase(p.username)) {
                        p.setCoords(3202, 3241, 1);
                        return;
                    } else {
                        p.frames.sendMessage(p, Engine.houseOwners[9] + " owns this house!");
                    }
                }
                if (p.absX == 3202 && p.absY == 3241) {
                    p.setCoords(3201, 3241, 1);
                }
                for (int i = 0; i < Engine.houseX.length; i++) {
                    if ((Engine.houseX[i] == p.absX && Engine.houseY[i] == p.absY) || (Engine.houseX[i] == p.clickX && Engine.houseY[i] == p.clickY) || (Engine.houseX[i] == p.clickX + Engine.hMoveX[i] && Engine.houseY[i] == p.absY + Engine.hMoveY[i])) {
                        if (i == 31) {
                            if (p.username.equalsIgnoreCase("abbo") || p.username.equalsIgnoreCase("mother earth")) {
                                p.frames.sendMessage(p, "You own this house!");
                                if (p.absX == Engine.houseX[i] && p.absY == Engine.houseY[i]) {
                                    p.setCoords(p.absX + Engine.hMoveX[i], p.absY + Engine.hMoveY[i], 0);
                                    return;
                                } else {
                                    p.setCoords(Engine.houseX[i], Engine.houseY[i], 0);
                                    return;
                                }
                            } else {
                                p.frames.sendMessage(p, "Mother Earth and Abbo own this house!");
                                Player p3 = Engine.players[Engine.getIdFromName("abbo")];
                                Player p4 = Engine.players[Engine.getIdFromName("mother earth")];
                                if (p3 != null) {
                                    if (p3.houseLocked) {
                                        p.frames.sendMessage(p, "Abbo has the house locked!");
                                        return;
                                    }
                                    if (p.absX == Engine.houseX[i] && p.absY == Engine.houseY[i]) {
                                        p.setCoords(p.absX + Engine.hMoveX[i], p.absY + Engine.hMoveY[i], 0);
                                        return;
                                    } else {
                                        p.setCoords(Engine.houseX[i], Engine.houseY[i], 0);
                                        return;
                                    }
                                }
                                if (p4 != null) {
                                    if (p4.houseLocked) {
                                        p.frames.sendMessage(p, "Mother Earth has the house locked!");
                                        return;
                                    }
                                    if (p.absX == Engine.houseX[i] && p.absY == Engine.houseY[i]) {
                                        p.setCoords(p.absX + Engine.hMoveX[i], p.absY + Engine.hMoveY[i], 0);
                                        return;
                                    } else {
                                        p.setCoords(Engine.houseX[i], Engine.houseY[i], 0);
                                        return;
                                    }
                                } else {
                                    p.frames.sendMessage(p, "Abbo and Mother Earth are offline!");
                                    return;
                                }
                            }
                        }
                        if (Engine.houseOwners[i].equalsIgnoreCase(p.username)) {
                            p.frames.sendMessage(p, "You own this house!");
                            if (p.absX == Engine.houseX[i] && p.absY == Engine.houseY[i]) {
                                p.setCoords(p.absX + Engine.hMoveX[i], p.absY + Engine.hMoveY[i], 0);
                            } else {
                                p.setCoords(Engine.houseX[i], Engine.houseY[i], 0);
                            }
                        } else {
                            p.frames.sendMessage(p, Engine.houseOwners[i] + " owns this house!");
                            Player p3 = Engine.players[Engine.getIdFromName(Engine.houseOwners[i])];
                            if (p3 != null) {
                                if (p3.houseLocked) {
                                    p.frames.sendMessage(p, Engine.houseOwners[i] + " has the house locked!");
                                    return;
                                }
                                if (p.absX == Engine.houseX[i] && p.absY == Engine.houseY[i]) {
                                    p.setCoords(p.absX + Engine.hMoveX[i], p.absY + Engine.hMoveY[i], 0);
                                } else {
                                    p.setCoords(Engine.houseX[i], Engine.houseY[i], 0);
                                }
                            } else {
                                p.frames.sendMessage(p, "The owner is offline!");
                                return;
                            }
                            //p.frames.sendMessage(p, "Do \"::enter " + Engine.houseOwners[i] + "\" to go inside!");
                        }
                        return;
                    }
                }
                break;
            case 280:
                p.openBank();
                break;
            case 26194:
                if (Engine.pdT > 0) {
                    p.frames.sendMessage(p, "There is already a drop starting soon!");
                    return;
                }
                int rEA = pi.invItemCount(p, 995);
                if (rEA > 4999) {
                    pi.deleteItem(p, 955, pi.getItemSlot(p, 955), 5000);
                    p.frames.sendMessage(p, "You pull the lever for 5000 coins!");
                    Engine.pdT = 300;
                } else {
                    p.frames.sendMessage(p, "It costs 5000 coins to pull the lever!");
                    return;
                }

                break;
            case 2672:
                p.openBank();
                break;
            case 12719:
                if ((p.gsX - p.absX == 0 && p.gsY - p.absY == -1) || (p.gsX - p.absX == -1 && p.gsY - p.absY == 0) || (p.gsX - p.absX == 0 && p.gsY - p.absY == 1) || (p.gsX - p.absX == 1 && p.gsY - p.absY == 0)) {
                    try {
                        p.frames.createGlobalObject(13340, p.gsH, p.gsX, p.gsY, 0, 10);
                        p.graveStoneTimer = 1200;
                        if (!p.graveStone || p.clickY != p.gsY || p.clickX != p.gsX) {
                            p.frames.sendMessage(p, "That's not your grave stone!");
                            return;
                        }
                        while (p.graveStone) {
                            dropGraveItems(p);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 10284:
                if (p.barrows[0] == true && p.barrows[1] == true && p.barrows[2] == true && p.barrows[3] == true && p.barrows[4] == true && p.barrows[4] == true) {
                    int reward[] = {4740, 4708, 4712, 4714, 4710, 4716, 4720, 4722, 4718, 4724, 4728, 4730, 4726, 4730, 4734, 4736, 4732, 4745, 4749, 4751, 4747, 4753, 4757, 4759, 4755, 7462, 7461, 995, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566};
                    int rewardA[] = {30, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 200, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70};
                    int amt = Misc.random(3);
                    if (amt < 1) {
                        amt++;
                    }
                    for (int i = 0; i < amt; i++) {
                        int rand = Misc.random(reward.length);
                        int item = reward[rand];
                        int itemA = Misc.random(rewardA[rand]);
                        if (itemA == 0) {
                            itemA++;
                        }
                        Engine.playerItems.addItem(p, item, itemA);
                    }
                    for (int i = 0; i < p.barrows.length; i++) {
                        p.barrows[i] = false;
                    }
                } else {
                    p.frames.sendMessage(p, "You haven't killed all of the brothers!");
                }
                break;

            case 26193:
                if (p.rights > 1 && !p.username.equalsIgnoreCase("david")) {
                    p.frames.sendMessage(p, "Admins and higher are not allowed to put items into the party room!");
                    return;
                }
                Engine.shopHandler.openshop(p, 17);
                p.party = true;
                break;
            case 2478: //Air
                reqL = 1;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Air Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Air Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 556, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20] * rE, 20);
                break;

            case 2479: //Mind
                reqL = 2;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Mind Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Mind Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 558, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2480: //Water
                reqL = 5;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Water Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Water Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 555, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2481: //Earth
                reqL = 9;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Earth Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Earth Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 557, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2482: //Fire
                reqL = 14;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Fire Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Fire Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 554, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2483: //Body
                reqL = 20;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Body Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Body Runes!");

                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 559, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2484: //Cosmic
                reqL = 27;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Cosmic Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Cosmic Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 564, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2487: //Chaos
                reqL = 35;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Chaos Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Chaos Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 562, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2486: //Nature
                reqL = 44;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Nature Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Nature Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 561, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2485: //Law
                reqL = 54;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Law Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Law Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 563, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2488: //Death
                reqL = 65;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Death Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Death Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 560, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;

            case 2489: //Soul Altar, Blood Rune
                reqL = 78;
                if (p.getLevelForXP(20) < reqL) {
                    p.frames.sendMessage(p, "You need a RuneCrafting level of " + reqL + " to craft Blood Runes!");
                    return;
                }
                if (!pi.haveItem(p, 1436)) {
                    p.frames.sendMessage(p, "You need Rune Essence to craft Blood Runes!");
                    return;
                }
                rE = pi.invItemCount(p, 1436);
                pi.deleteItem(p, 1436, pi.getItemSlot(p, 1436), rE);
                pi.addItem(p, 565, rE * ((int) (((p.getLevelForXP(20) - reqL) / 20) + 1)));
                p.addSkillXP(15 * p.skillLvl[20], 20);
                break;


            case 2477:
                p.frames.showInterface(p, 45);
                p.frames.setString(p, "<col=FFFFFF>NOTE: SOUL RUNE IS FOR DEATHS", 45, 88);
                p.frames.setString(p, "Teleport to Altar:", 45, 66);
                p.frames.setString(p, "Options:", 45, 84);
                p.frames.setString(p, "Teleport", 45, 83);
                p.frames.setString(p, "CLOSED", 45, 75);
                p.frames.setString(p, "CLOSED", 45, 81);
                p.frames.setString(p, "CLOSED", 45, 82);
                p.frames.setString(p, "Click on Rune", 45, 68);
                p.frames.setString(p, "RuneCrafting", 45, 111);
                break;

            case 25213:
                p.setCoords(3048, 3203, 0);
                break;
            case 3203:
                p.frames.sendMessage(p, "You cannot forfeit yet.");
                break;


            case 36773:
                if (p.absX == 3205 && p.absY == 3209 && p.heightLevel == 0) {
                    p.setCoords(3205, 3209, 1);
                }
                break;
            case 36774:
                if (p.absX == 3205 && p.absY == 3209 && p.heightLevel == 1) {
                    p.setCoords(3205, 3209, 0);
                }
                break;

            case 36844:
                if (p.absX == 3207 && p.absY == 3222) {
                    p.setCoords(3208, 3222, 1);
                }
                if (p.absX == 3208 && p.absY == 3222) {
                    p.setCoords(3207, 3222, 1);
                }
                break;

            case 1805:
                if (p.absX == 3191 && p.absY == 3363) {
                    p.setCoords(3191, 3362, 0);
                }
                if (p.absX == 3191 && p.absY == 3362) {
                    p.setCoords(3191, 3363, 0);
                }
                break;

            case 26917:
                if (p.absX == 3069 && p.absY == 3513) {
                    p.setCoords(3069, 3514, 0);
                }
                if (p.absX == 3069 && p.absY == 3514) {
                    p.setCoords(3069, 3513, 0);
                }
                break;

            case 3192:
                for (Player pg : Engine.players) {
                    if (pg != null) {
                        p.setscores(pg);
                    }
                }
                p.frames.showInterface(p, 156);
                for (int i = 7; i < 97; i++) {
                    p.frames.setString(p, "", 156, i);
                }
                p.frames.setString(p, "Highscores", 156, 5);

                break;
            case 9369:
                if (p.absX == 2399 && p.absY == 5177) {
                    p.setCoords(2399, 5175, 0);
                    p.OverTimer = 5;
                    p.frames.setOverlay(p, 653);
                }
                if (p.absX == 2399 && p.absY == 5175) {
                    p.setCoords(2399, 5177, 0);
                    p.OverTimer = 5;
                    p.frames.removeOverlay(p);
                }

                break;
            case 9368:
                if (p.absX == 2399 && p.absY == 5167) {
                    p.setCoords(2399, 5169, 0);
                    p.OverTimer = 5;
                }
                break;


            case 28121:
                Engine.BH.enterBounty(p);
                break;

            case 28122:
                Engine.BH.leaveBounty(p);
                break;

            case 28120:
                Engine.BH.enterBounty(p);
                break;

            case 28119:
                Engine.BH.enterBounty(p);
                break;

            case 28140:
                p.ResetClanWars();
                break;
            case 28214:

                if (!p.AtClanField()) {
                    p.frames.showInterface(p, 120);
                    p.JadTele = 4;
                    p.frames.showChatboxInterface(p, 241);
                    p.frames.animateInterfaceId(p, 9837, 241, 2);
                    p.frames.setNPCId(p, 6537, 241, 2);
                    p.frames.setString(p, "", 241, 3);
                    p.frames.setString(p, "Hah, you won't last 2 minutes...", 241, 4);
                    p.frames.sendMessage(p, "Welcome to Tzhaar, enjoy the fight pits!");
                } else {
                    if (p.ClanSide == 0) {
                        p.setCoords(3272, 3675, 0);
                    }
                    if (p.ClanSide == 1) {
                        p.setCoords(3273, 3692, 0);
                    }
                }
                break;

            case 28213:
                if (!p.AtClanLobby()) {
                    p.frames.showInterface(p, 120);
                    p.ClanTele = 4;
                    p.frames.showChatboxInterface(p, 241);
                    p.frames.animateInterfaceId(p, 9850, 241, 2);
                    p.frames.setNPCId(p, 6537, 241, 2);
                    p.frames.setString(p, "", 241, 3);
                    p.frames.setString(p, "Enjoy your gang fights...", 241, 4);
                    p.frames.sendMessage(p, "Use ::joinchat [playername] to join a clan.");
                } else {
                    if (p.ClanBattle == true) {
                        if (p.ClanTimer == -1) {
                            p.frames.sendMessage(p, "Game has already  begun.");
                        } else if (p.ClanSide == 0) {
                            p.setCoords(3299, 3722, p.clanheight);
                        } else if (p.ClanSide == 1) {
                            p.setCoords(3291, 3830, p.clanheight);
                        }
                    } else {
                        p.frames.sendMessage(p, "Your clan has not challenged any one yet.");
                    }
                }
                break;

//=============================CONSTRUCTION===============================

            case 13161:
                p.frames.showInterface(p, 591);
                break;
            case 15482:
//p.InHouse = true;
//p.OwnHouse = true;
//p.HouseHeight = p.playerId*4;
//p.frames.showInterface(p, 399);
//p.HouseTele = 6;
//p.setCoords(3104, 3926, p.HouseHeight);
//p.frames.showInterface(p, 399);
                Construction.teleToPOH(p);
                p.frames.sendMessage(p, "You can make a new room with ::newroom");
                p.frames.sendMessage(p, "Stuck on 'No Place like home? Just walk using the minimap");
                break;

            case 13405:
                p.KickPlayers = false;
                p.BuildingMode = false;
                p.setCoords(2544, 3096, 0);
                break;

//=======================END OF CONSTRUCTION==========================
            case 7871:
                p.createGlobalObject(7843, p.heightLevel, 2809, 3463, 0, 10);
                p.ActionTimer = 2;
                p.HerbType = 0;
                p.requestAnim(5212, 0);
                p.addSkillXP(250 * p.skillLvl[19], 19);
                Engine.playerItems.addItem(p, 6010, 1);
                break;

            case 7855:
                p.createGlobalObject(7843, p.heightLevel, 2809, 3463, 0, 10);
                p.ActionTimer = 2;
                p.HerbType = 0;
                p.requestAnim(5212, 0);
                p.addSkillXP(750 * p.skillLvl[19], 19);
                Engine.playerItems.addItem(p, 225, 1);
                break;

            case 8111:
                p.createGlobalObject(8135, p.heightLevel, 2813, 3463, 0, 10);
                p.ActionTimer = 2;
                p.HerbType = 0;
                p.requestAnim(5212, 0);
                p.addSkillXP(1000 * p.skillLvl[19], 19);
                Engine.playerItems.addItem(p, 5972, 1);
                break;

            case 7941:
                p.createGlobalObject(8135, p.heightLevel, 2813, 3463, 0, 10);
                p.ActionTimer = 2;
                p.HerbType = 0;
                p.requestAnim(5212, 0);
                p.addSkillXP(500 * p.skillLvl[19], 19);
                Engine.playerItems.addItem(p, 1955, 1);
                break;


            case 28716:
                if (distance > 0 && (p.walkDir > 0 || p.runDir > 0) || distance != 0 && p.walkDir <= 0 && p.runDir <= 0) {
                    p.frames.showInterface(p, 669);
                    return;
                }

            case 28714:
                if (distance > 0 && (p.walkDir > 0 || p.runDir > 0) || distance != 0 && p.walkDir <= 0 && p.runDir <= 0) {
                    p.teleportTo(2926, 3444, 0, 4, 4, 8939, 8941, 1576, 0, 1577, 0);
                }
                break;

            case 6282:
                p.frames.showInterface(p, 120);

                p.PkTimer = 4;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 6537, 241, 2);
                p.frames.setString(p, "", 241, 3);
                p.frames.setString(p, "Ready to die??", 241, 4);
                break;

            case 8132:
                p.Smithing = false;
                p.Cooking = false;
                p.Farm = true;
                p.ActionTimer = 2;
                p.frames.setString(p, "Grow Apple Tree", 458, 1);
                p.frames.setString(p, "Grow Spirit Tree", 458, 2);
                p.frames.setString(p, "Grow Papaya Tree", 458, 3);
                p.frames.showChatboxInterface(p, 458);
                break;

            case 2282://Rope Swing
                if (p.absX == 2551 && p.absY == 3554) {
                    p.chatText = "Lulz.";
                    p.chatTextUpdateReq = true;
                    p.updateReq = true;
                    p.SwingTimer1 = 2;
                    p.isRunning = true;
                }
                break;

            case 2294://Log
                if (p.absX == 2551 && p.absY == 3546) {
                    p.LogTimer = 4;
                    p.AgilityXP = 250;
                    p.AgilityTimer = 24;
                    p.jumpDelay = 24;
                    p.NewEmote = 844;
                    p.isRunning = false;
                    p.reqWalkQueue(2541, 3546);
                }
                break;

            case 20211://Obstacle Net
                if (p.absX == 2539 && p.absY == 3546 || p.absX == 2539 && p.absY == 3545) {
                    p.AgilityXP = 400;
                    p.AgilityTimer = 6;
                    p.NetTimer = 4;
                    p.requestAnim(3063, 0);
                }
                break;

            case 2302://WallSlide
                if (p.absX == 2536 && p.absY == 3547) {
                    p.AgilityXP = 200;
                    p.AgilityTimer = 10;
                    p.jumpDelay = 10;
                    p.NewEmote = 756;
                    p.isRunning = false;
                    p.reqWalkQueue(2532, 3547);
                }
                break;

            case 3205:
                p.setCoords(2532, 3546, 0);
                break;

            case 1948:
                if (p.AgilityTimer == -1) {
                    if (p.absX == 2535 && p.absY == 3553) {
                        p.wallTimer1 = 1;
                        p.NewEmote = 839;
                    }
                    if (p.absX == 2538 && p.absY == 3553) {
                        p.wallTimer2 = 1;
                        p.NewEmote = 839;
                    }
                    if (p.absX == 2541 && p.absY == 3553) {
                        p.wallTimer3 = 1;
                        p.NewEmote = 839;
                    }
                }
                break;


            case 25161:
                if (p.AgilityTimer == -1) {
                    if (p.absX == 2845 && p.absY == 9635 || p.absX == 2845 && p.absY == 9636) {
                        p.wallTimer4 = 1;
                        p.NewEmote = 839;
                    }
                    if (p.absX == 2847 && p.absY == 9635 || p.absX == 2847 && p.absY == 9636) {
                        p.wallTimer5 = 1;
                        p.NewEmote = 839;
                    }
                }
                break;

//case 2484:
//if(p.ActionTimer == 0)
//{
//if(Misc.random(50) < 47) { 
//p.ActionTimer = 3;
//p.requestAnim(791, 0);
//Engine.playerItems.addItem(p, 554+Misc.random(12), Misc.random(30));
//p.addSkillXP(15*p.skillLvl[20] ,20);
//p.frames.sendMessage(p, "You make some runes...");
//}
//else {
//p.randomEvent();
//}
//}
//break;

            case 2471:
                p.setCoords(2605, 3092, 0);
                break;


            case 20199:
                Engine.Assult.goIn(p, 1);
                break;

            case 20200:
                Engine.Assult.goIn(p, 2);
                break;

            case 20201:
                Engine.Assult.goIn(p, 3);
                break;

            case 20202:
                Engine.Assult.goIn(p, 4);
                break;


            case 4387://cw sara portal
                if (p.equipment[1] > 0 && p.equipmentN[1] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing a cape.");
                } else if (p.equipment[0] > 0 && p.equipmentN[0] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing anything on your head.");
                } else if (Engine.CWGameTime > 0) {
                    p.frames.sendMessage(p, "Game has already begun.");
                } else if (cape(p) == true) {
                    p.frames.sendMessage(p, "You cannot bring capes or hats into the game.");
                } else if (Engine.ZamorakTeam < Engine.SaradominTeam) {
                    p.frames.sendMessage(p, "This team has more players than the other.");
                } else {
                    p.equipment[1] = 4041;
                    p.equipmentN[1] = 1;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    p.setCoords(2377 + Misc.random(4), 9486 + Misc.random(4), 0);
                    p.frames.sendMessage(p, "You join Saradomin's side.");
                }

                break;
            case 25808:
            case 4483:
                p.openBank();
                break;
            case 4408:
                if (p.equipment[1] > 0 && p.equipmentN[1] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing a cape.");
                } else if (p.equipment[0] > 0 && p.equipmentN[0] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing anything on your head.");
                } else if (Engine.CWGameTime > 0) {
                    p.frames.sendMessage(p, "Game has already begun.");
                } else if (cape(p) == true) {
                    p.frames.sendMessage(p, "You cannot bring capes or hats into the game.");
                } else {
                    if (Engine.ZamorakTeam > Engine.SaradominTeam || Engine.ZamorakTeam == Engine.SaradominTeam) {
                        p.equipment[1] = 4041;
                        p.equipmentN[1] = 1;
                        p.appearanceUpdateReq = true;
                        p.updateReq = true;
                        p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                        p.setCoords(2377 + Misc.random(4), 9486 + Misc.random(4), 0);
                        p.frames.sendMessage(p, "You join Saradomin's side..");
                    } else if (Engine.ZamorakTeam < Engine.SaradominTeam) {
                        p.equipment[1] = 4042;
                        p.equipmentN[1] = 1;
                        p.appearanceUpdateReq = true;
                        p.updateReq = true;
                        p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                        p.setCoords(2420 + Misc.random(4), 9521 + Misc.random(4), 0);
                        p.frames.sendMessage(p, "You join Zamorak's side..");
                    }
                }
                break;
            case 2273:
                if (p.combatLevel < 75) {
                    p.teleportTo(2862, 3547, 0, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.showChatboxInterface(p, 241);
                    p.frames.animateInterfaceId(p, 21, 241, 2);
                    p.frames.setNPCId(p, 21, 241, 2);
                    p.frames.setString(p, "You are under combat level 75.", 241, 3);
                    p.frames.setString(p, "You may proceed to lower level training.", 241, 4);
                } else {
                    p.teleportTo(2858, 3545, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.showChatboxInterface(p, 241);
                    p.frames.animateInterfaceId(p, 21, 241, 2);
                    p.frames.setNPCId(p, 21, 241, 2);
                    p.frames.setString(p, "You are over combat level 75.", 241, 3);
                    p.frames.setString(p, "You may proceed to higher level training.", 241, 4);
                }
                break;
            case 4388:
                if (p.equipment[1] > 0 && p.equipmentN[1] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing a cape.");
                } else if (p.equipment[0] > 0 && p.equipmentN[0] > 0) {
                    p.frames.sendMessage(p, "You cannot be wearing anything on your head.");
                } else if (Engine.CWGameTime > 0) {
                    p.frames.sendMessage(p, "Game has already begun.");
                } else if (cape(p) == true) {
                    p.frames.sendMessage(p, "You cannot bring capes or hats into the game.");
                } else if (Engine.ZamorakTeam < Engine.SaradominTeam) {
                    p.frames.sendMessage(p, "This team has more players than the other.");
                } else {
                    p.equipment[1] = 4042;
                    p.equipmentN[1] = 1;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    p.setCoords(2420 + Misc.random(4), 9521 + Misc.random(4), 0);
                    p.frames.sendMessage(p, "You join Zamorak's side..");
                }
                break;


            case 4902:
                if (p.CWTeam == 0 && p.equipment[3] == 4039) {
                    Engine.SaradominScore += 1;
                    Engine.ZamorakFlag = false;
                    Engine.ZamorakP = 0;
                    p.equipment[3] = -1;
                    p.equipmentN[3] = 0;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    for (Player pg : Engine.players) {
                        p.frames.sendMessage(pg, p.username + " scored a point for Saradomin.");
                    }
                } else if (Engine.SaradominFlag == true) {
                    p.frames.sendMessage(p, "The flag has already been taken.");
                } else if (p.CWTeam == 1) {
                    Engine.SaradominP = p.playerId;
                    Engine.SaradominFlag = true;
                    Engine.playerItems.addItem(p, p.equipment[3], 1);
                    p.equipment[3] = 4037;
                    p.equipmentN[3] = 1;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    p.frames.sendMessage(p, "You take Saradomin's flag.");
                } else {
                    p.frames.sendMessage(p, "This is your flag.");
                }
                break;

            case 4903:
                if (p.CWTeam == 1 && p.equipment[3] == 4037) {
                    Engine.ZamorakScore += 1;
                    Engine.SaradominFlag = false;
                    Engine.SaradominP = 0;
                    p.equipment[3] = -1;
                    p.equipmentN[3] = 0;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    for (Player pg : Engine.players) {
                        p.frames.sendMessage(pg, p.username + " scored a point for Zamorak.");
                    }
                } else if (Engine.ZamorakFlag == true) {
                    p.frames.sendMessage(p, "The flag has already been taken.");
                } else if (p.CWTeam == 0) {
                    Engine.ZamorakP = p.playerId;
                    Engine.ZamorakFlag = true;
                    Engine.playerItems.addItem(p, p.equipment[3], 1);
                    p.equipment[3] = 4039;
                    p.equipmentN[3] = 1;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    p.frames.sendMessage(p, "You take Zamorak's flag.");
                } else {
                    p.frames.sendMessage(p, "This is your flag.");
                }
                break;

            case 4407:
            case 4390:
            case 4406:
            case 4389:
                p.setCoords(2440 + Misc.random(4), 3085 + Misc.random(10), 0);
                p.OverTimer = 2;
                p.equipment[1] = -1;
                p.equipmentN[1] = 0;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                if (p.equipment[3] == 4037 && p.CWTeam == 1) {
                    Engine.SaradominFlag = false;
                    p.equipment[3] = -1;
                    p.equipmentN[3] = 0;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                }
                if (p.equipment[3] == 4039 && p.CWTeam == 0) {
                    Engine.ZamorakFlag = false;
                    p.equipment[3] = -1;
                    p.equipmentN[3] = 0;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                }
                break;

            case 4484:
                p.frames.showChatboxInterface(p, 55);
                p.frames.setString(p, "Saradomin: " + Engine.SaradominScore, 55, 1);
                p.frames.setString(p, "Zamorak: " + Engine.ZamorakScore, 55, 2);
                break;
            case 20150:
                Engine.playerItems.addItem(p, 554, 30);
                Engine.playerItems.addItem(p, 555, 30);
                Engine.playerItems.addItem(p, 556, 30);
                Engine.playerItems.addItem(p, 557, 30);
                Engine.playerItems.addItem(p, 558, 30);
                Engine.playerItems.addItem(p, 560, 30);
                Engine.playerItems.addItem(p, 565, 30);
                Engine.playerItems.addItem(p, 562, 30);
                p.taken++;
                p.frames.sendMessage(p, "These items will dissapear when you leave Barbarian Assault");
                break;
            case 26972:
//case 28089:
            case 2213:
                p.openBank();
                break;


            case 36575://Barricade table (saradomin)
                Engine.playerItems.addItem(p, 4053, 1);
                break;
            case 36582://Barricade table (zamorak)
                Engine.playerItems.addItem(p, 4053, 1);
                break;
            case 36577://Explode potion table(saradomin)
                Engine.playerItems.addItem(p, 4045, 1);
                break;

            case 36584://Explode potion table(zamorak)
                Engine.playerItems.addItem(p, 4045, 1);
                break;

            case 36576://Rope table(saradomin)
                Engine.playerItems.addItem(p, 954, 1);
                break;
            case 36583://Rope table(zamorak)
                Engine.playerItems.addItem(p, 954, 1);
                break;


            case 36573:// Toolkit table (saradomin)
                Engine.playerItems.addItem(p, 4051, 1);
                break;
            case 36580:// Toolkit table (zamorak)
                Engine.playerItems.addItem(p, 4051, 1);
                break;

            case 36574:// Rock table(saradomin)
                Engine.playerItems.addItem(p, 4043, 1);
                break;
            case 36581:// Rock table(zamorak)
                Engine.playerItems.addItem(p, 4043, 1);
                break;
            case 36585:// pick table(zamorak)
                Engine.playerItems.addItem(p, 1265, 1);
                break;

            case 36578:
                Engine.playerItems.addItem(p, 1265, 1);
                break;


            case 4469://cw sara barrier
                if (p.absX == 2426 && p.absY == 3080) {
                    p.setCoords(2426, 3081, 1);
                }
                if (p.absX == 2426 && p.absY == 3081 && p.CWTeam == 0) {
                    p.setCoords(2426, 3080, 1);
                }
                if (p.absX == 2423 && p.absY == 3076) {
                    p.setCoords(2422, 3076, 1);
                }
                if (p.absX == 2422 && p.absY == 3076 && p.CWTeam == 0) {
                    p.setCoords(2423, 3076, 1);
                }
                break;

            case 36484://cw sara stairs
                p.setCoords(2426, 3074, 3);
                break;
            case 4470://cw zammy barrier
                if (p.absX == 2373 && p.absY == 3127) {
                    p.setCoords(2373, 3126, 1);
                }
                if (p.absX == 2373 && p.absY == 3126 && p.CWTeam == 1) {
                    p.setCoords(2373, 3127, 1);
                }
                if (p.absX == 2376 && p.absY == 3131) {
                    p.setCoords(2377, 3131, 1);
                }
                if (p.absX == 2377 && p.absY == 3131 && p.CWTeam == 1) {
                    p.setCoords(2376, 3131, 1);
                }
                break;


            case 4467://zammy door
                if (p.absX == 2385 && p.absY == 3134) {
                    p.setCoords(2384, 3134, 0);
                }
                if (p.absX == 2384 && p.absY == 3134) {
                    p.setCoords(2385, 3134, 0);
                }
                break;
            case 36521://cw zammy stairs
                p.setCoords(2369, 3127, 2);
                break;


            case 36540:
            case 4415://cw sara down staircase
                if (p.absX == 2420 && p.absY == 3080) {
                    p.setCoords(2419, 3077, 0);
                }
                if (p.absX == 2430 && p.absY == 3080) {
                    p.setCoords(2427, 3081, 1);
                }
                if (p.absX == 2426 && p.absY == 3074) {
                    p.setCoords(2425, 3077, 2);
                }
                if (p.absX == 2416 && p.absY == 3075) {
                    p.setCoords(2417, 3078, 0);
                }
                if (p.absX == 2382 && p.absY == 3129) {
                    p.setCoords(2383, 3132, 0);
                }
                if (p.absX == 2379 && p.absY == 3127) {
                    p.setCoords(2380, 3130, 0);
                }
                if (p.absX == 2369 && p.absY == 3127) {
                    p.setCoords(2372, 3126, 1);
                }
                if (p.absX == 2373 && p.absY == 3133) {
                    p.setCoords(2374, 3130, 2);
                }
                if (p.absX == 2383 && p.absY == 3132) {
                    p.setCoords(2382, 3129, 0);
                }
                break;


            case 36532://cw zammy up staircase
                p.setCoords(2379, 3127, 1);
                break;

            case 36523://cw zammy  stairs
                p.setCoords(2373, 3133, 3);
                break;

            case 36480://cw sara up steps
                p.setCoords(2430, 3080, 2);
                break;


            case 4465://cw sara door(unlock)
                if (p.absX == 2414 && p.absY == 3073) {
                    p.setCoords(2415, 3073, 0);
                }
                if (p.absX == 2415 && p.absY == 3073) {
                    p.setCoords(2414, 3073, 0);
                }
                break;

            case 36579://cw sara bandages
                Engine.playerItems.addItem(p, 4049, 1);
                p.requestAnim(881, 0);
                break;
            case 36586://cw zammy bandages
                Engine.playerItems.addItem(p, 4049, 1);
                p.requestAnim(881, 0);
                break;


            case 36481://cw sara steps(to catapult)
                p.setCoords(2415, 3075, 0);
                break;

            case 36495://cw sara steps(to starting room)
                p.setCoords(2420, 3080, 1);
                break;

            case 1276:
            case 1277:
            case 1278:
            case 1279:
            case 1280:
            case 1282:
            case 1283:
            case 1284:
            case 1285:
            case 1286:
            case 1289:
            case 1290:
            case 1291:
            case 1315:
            case 1316:
            case 1318:
            case 1319:
            case 1330:
            case 1331:
            case 1332:
            case 1365:
            case 1383:
            case 1384:
            case 2409:
            case 3033:
            case 3034:
            case 3035:
            case 3036:
            case 3881:
            case 3882:
            case 3883:
            case 5902:
            case 5903:
            case 5904: /* Normal */
            case 1308:
            case 5551:
            case 5552:
            case 5553:/* Willow */
            case 1281:
            case 3037:/* Oak */
            case 1292:
            case 1306:/* Magic */
            case 1307:
            case 4674:/* Maple */
            case 9034:/* Mahogany */
            case 9036:/* Teak */
            case 2023: /* Achey */
            case 1309: /* Yews */
                p.frames.removeShownInterface(p);
                p.frames.removeChatboxInterface(p);

                p.wc = new Woodcutting(p);
                p.wc.startCutting(p.clickId);


                break;
            case 2110:
            case 2090:
            case 11189:
            case 11190:
            case 11191:
            case 2091:/* Copper */
            case 2094:
            case 11186:
            case 11187:
            case 11188:
            case 2095:/* Tin */
            case 2092:
            case 2093:/* Iron */
            case 2100:
            case 2101:/* Silver */
            case 2098:
            case 11183:
            case 11184:
            case 11185:
            case 2099:/* Gold */
            case 2096:
            case 2097:/* Coal */
            case 2102:
            case 2103:/* Mithril */
            case 2104:
            case 2105:/* Adamantite */
            case 2106:
            case 2107:/* Rune */
            case 4028:
            case 4029:
            case 4030:/* Limestone( */
            case 6669:
            case 6670:
            case 6671:/* Elemental */
            case 16687:
                p.frames.removeShownInterface(p);
                p.frames.removeChatboxInterface(p);

                p.mi = new Mining(p);
                p.mi.startCutting(p.clickId);

                break;

/**
 * GodWars
 */
            case 26444:
                p.teleportTo(2920, 5274, 0, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                p.frames.sendMessage(p, "You tied the rope, and jumped down.");
                break;
            /**case 26445:
             p.teleportTo(2920, 5279, 1, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
             p.frames.sendMessage(p, "You tied the rope, and jumped down.");
             break;**/

            case 26303:
                if (p.absX == 2871 && p.absY == 5269) {
                    p.teleportTo(2871, 5279, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You swing yourself over...");
                }
                if (p.absX == 2871 && p.absY == 5279) {
                    p.teleportTo(2871, 5269, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You swing yourself over...");
                }
                break;

            case 26286:
                p.skillLvl[5] = p.getLevelForXP(5);
                p.frames.setSkillLvl(p, 5);
                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "The Zamorak Gods Restore Your Prayer Points.");
                break;

            case 26289:
                p.skillLvl[5] = p.getLevelForXP(5);
                p.frames.setSkillLvl(p, 5);
                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "The Bandos Gods Restore Your Prayer Points.");
                break;
            case 20203:
                Engine.Assult.goIn(p, 5); //Gratz. You found this you leecher. You must be so proud.
                break;
            case 26288:
                p.skillLvl[5] = p.getLevelForXP(5);
                p.frames.setSkillLvl(p, 5);
                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "You give the gods a blow-job and they restore your Prayer Points.");
                break;

            case 409:
            case 34616:
            case 19145:
                p.skillLvl[5] = p.getLevelForXP(5);
                p.frames.setSkillLvl(p, 5);
                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "You give David a blow-job and he restores your Prayer Points. How kind of him.");
                break;


            case 6552:

                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "You have been granted a gift from David. Use it wisely!");
                if (p.isAncients == 0) {
                    if (p.usingHD) {
                        p.frames.setInterface(p, 1, 746, 93, 193); //Ancients tab
                        p.frames.sendMessage(p, "ANCIENTS");
                        p.isAncients = 1;
                        p.isLunar = 0;
                    } else {
                        p.frames.setInterface(p, 1, 548, 79, 193); //Ancients tab
                        p.frames.sendMessage(p, "ANCIENTS");
                        p.isAncients = 1;
                        p.isLunar = 0;
                    }
                } else if (p.isAncients == 1) {
                    if (p.usingHD) {
                        p.frames.setInterface(p, 1, 746, 93, 192); //Ancients tab
                        p.frames.sendMessage(p, "MODERN");
                        p.isAncients = 0;
                        p.isLunar = 0;
                    } else {
                        p.frames.setInterface(p, 1, 548, 79, 192); //Ancients tab
                        p.frames.sendMessage(p, "MODERN");
                        p.isAncients = 0;
                        p.isLunar = 0;
                    }
                }

                break;
            case 17010:

                p.requestAnim(645, 1);
                p.frames.sendMessage(p, "You have been granted a gift from David. Use it wisely!");
                if (p.isLunar == 0) {
                    if (p.usingHD) {
                        p.frames.setInterface(p, 1, 746, 93, 430); //Ancients tab
                        p.frames.sendMessage(p, "LUNAR");
                        p.isLunar = 1;
                        p.isAncients = 0;
                    } else {
                        p.frames.setInterface(p, 1, 548, 79, 430); //Ancients tab
                        p.frames.sendMessage(p, "LUNAR");
                        p.isLunar = 1;
                        p.isAncients = 0;
                    }
                } else if (p.isLunar == 1) {
                    if (p.usingHD) {
                        p.frames.setInterface(p, 1, 746, 93, 192); //Ancients tab
                        p.frames.sendMessage(p, "MODERN");
                        p.isLunar = 0;
                        p.isAncients = 0;
                    } else {
                        p.frames.setInterface(p, 1, 548, 79, 192); //Ancients tab
                        p.frames.sendMessage(p, "MODERN");
                        p.isLunar = 0;
                        p.isAncients = 0;
                    }
                }
            case 26427:
                if (p.absX == 2908 && p.absY == 5265) {
                    if (p.skc > 19) {
                        p.teleportTo(2907, 5265, 0, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                        p.frames.sendMessage(p, "You Enter Saradomins Lair and lose 20 kill count... Prepare to fight!");
                        p.skc = (p.skc - 20);
                    } else if (p.skc <= 19) {
                        p.frames.sendMessage(p, "You must have a kill count of 20 to enter this lair.");
                    }
                }
                if (p.absX == 2907 && p.absY == 5265) {
                    p.teleportTo(2906, 5265, 0, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You left Saradomins Lair...");
                }
                break;

            case 26425:
                if (p.absX == 2863 && p.absY == 5354) {
                    if (p.bkc > 19) {
                        p.teleportTo(2864, 5354, 2, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                        p.frames.sendMessage(p, "You Enter The Bandos Lair and lose 20 kill count... Prepare to fight!");
                        p.bkc = (p.bkc - 20);
                    } else if (p.bkc <= 19) {
                        p.frames.sendMessage(p, "You must have a kill count of 20 to enter this lair.");
                    }
                }
                if (p.absX == 2864 && p.absY == 5354) {
                    p.frames.sendMessage(p, "You left Bandos Lair...");
                }
                break;

            case 26426:
                if (p.absX == 2839 && p.absY == 5295) {
                    if (p.akc > 19) {
                        p.teleportTo(2839, 5296, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                        p.frames.sendMessage(p, "You enter Armadyls Lair and lose 20 kill count... Prepare to fight!");
                        p.akc = (p.akc - 20);
                    } else if (p.akc <= 19) {
                        p.frames.sendMessage(p, "You must have a kill count of 20 to enter this lair.");
                    }
                }
                if (p.absX == 2839 && p.absY == 5296) {
                    p.teleportTo(2839, 5295, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You left Armadyls Lair...");
                }
                break;

            case 26428:
                if (p.absX == 2925 && p.absY == 5332) {
                    if (p.zkc > 19) {
                        p.teleportTo(2925, 5331, 2, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                        p.frames.sendMessage(p, "You enter Zamoraks Lair and lose 20 kill count... Prepare to fight!");
                        p.zkc = (p.zkc - 20);
                    } else if (p.zkc <= 19) {
                        p.frames.sendMessage(p, "You must have a kill count of 20 to enter this lair.");
                    }
                }
                if (p.absX == 2925 && p.absY == 5331) {
                    p.teleportTo(2925, 5332, 2, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You left Zamoraks Lair...");
                }
                break;

            case 26439:
                if (p.absX == 2885 && p.absY == 5345) {
                    p.teleportTo(2885, 5332, 2, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You cross the icey bridge...");
                }
                if (p.absX == 2885 && p.absY == 5332) {
                    p.teleportTo(2885, 5345, 2, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You cross the icey bridge...");
                }
                break;

            case 26384:
                if (p.absX == 2850 && p.absY == 5333) {
                    p.teleportTo(2851, 5333, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You left Bandos lair...");
                }
                if (p.absX == 2851 && p.absY == 5333) {
                    p.teleportTo(2850, 5333, 2, 4, 0, 8939, 8941, 1576, 0, 1577, 0);
                    p.frames.sendMessage(p, "You destroyed the door, and walked into Bandos lair...");
                }
                break;
            case 23271:
                p.jumpDelay = 3;
                p.requestAnim(2750, 0);
                if (p.absY > p.clickY) {
                    p.reqWalkQueue(p.absX, p.clickY - 1);
                }
                if (p.absY < p.clickY) {
                    p.reqWalkQueue(p.absX, p.clickY + 2);
                }
                break;

            default:
                Misc.println("[" + p.username + "] Unhandled object 1: " + p.clickId);
                break;
        }
        p.objectTimer = 2;
    }

    private int objectSize(int id) {
        switch (id) {

            case 23271:
                return 2;

            default:
                return 1;
        }
    }
}
