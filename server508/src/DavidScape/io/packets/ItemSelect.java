package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;
import DavidScape.util.Misc;


public class ItemSelect implements Packet {
    public static int regbone = 75;
    public static int burntbone = 50;
    public static int batbone = 50;
    public static int wolfbone = 50;
    public static int monkeybone = 50;
    public static int bigbone = 500;
    public static int shaikbone = 500;
    public static int jogrebone = 500;
    public static int burntjogrebone = 500;
    public static int babydragonbone = 3500;
    public static int dragonbone = 150;
    public static int zogrebone = 7500;
    public static int fayrgbone = 7500;
    public static int raurgbone = 7500;
    public static int ourgbone = 7500;
    public static int dagbone = 10000;
    public static int wyvbone = 10000;

    public int randB() {
        int[] randB2 = {1470, 1472, 1474, 1476, 7954, 592, 995, 884, 440, 1511};
        return randB2[Misc.random(10)];
    }

    public int randY() {
        int[] randY2 = {1470, 1472, 1474, 1476, 7954, 592, 995, 886, 1511};
        return randY2[Misc.random(9)];
    }

    public int randM() {
        int[] randM2 = {1470, 1472, 1474, 1476, 7954, 592, 995, 888, 453, 1511};
        return randM2[Misc.random(10)];
    }

    public int randN() {
        int[] randN2 = {1470, 1472, 1474, 1476, 7954, 592, 995, 890, 447, 1511};
        return randN2[Misc.random(10)];
    }

    public int randD() {
        int[] randD2 = {1470, 1472, 1474, 1476, 7954, 592, 995, 892, 451, 1511};
        return randD2[Misc.random(10)];
    }

    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        PlayerItems pi = new PlayerItems();
        int junk = p.stream.readUnsignedByte();
        int interfaceId = p.stream.readUnsignedWord();

        junk = p.stream.readUnsignedByte();
        int itemId = p.stream.readUnsignedWordBigEndian();
        int itemSlot = p.stream.readUnsignedWordA();

        p.attackPlayer = 0;
        p.attackingPlayer = false;
        if (itemSlot < 0 || itemSlot > p.items.length
                || p.items[itemSlot] != itemId) {
            return;
        }
        if (p.isDead || p.skillLvl[3] < 1) {
            return;
        }

        if (interfaceId == 149) {
            p.frames.removeChatboxInterface(p);


            switch (itemId) {
                case 6: //Base
                    if (p.hasCannon == false) {
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.createGlobalObject(7, p.heightLevel, p.absX - 1, p.absY - 1, 0, 10);
                        p.hasCannon = true;
                        p.cannonC[0] = p.absX - 1;
                        p.cannonC[1] = p.absY - 1;
                    } else if (p.hasCannon == true) {
                        p.frames.sendMessage(p, "You already have a cannon to build on somewhere!");
                    }
                    break;


                case 11238: //baby imp
                    pi.deleteItem(p, itemId, itemSlot, 1);
                    Engine.playerItems.addItem(p, randB(), 1);
                    break;
                case 11240: //young imp
                    pi.deleteItem(p, itemId, itemSlot, 1);
                    Engine.playerItems.addItem(p, randY(), 1);
                    break;
                case 11252: //magpie imp
                    pi.deleteItem(p, itemId, itemSlot, 1);
                    Engine.playerItems.addItem(p, randM(), 1);
                    break;
                case 11254: //ninja imp
                    pi.deleteItem(p, itemId, itemSlot, 1);
                    Engine.playerItems.addItem(p, randN(), 1);
                    break;
                case 11256: //dragon imp
                    pi.deleteItem(p, itemId, itemSlot, 1);
                    Engine.playerItems.addItem(p, randD(), 1);
                    break;
                case 526: //Regular Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(regbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;
                case 4447://White Night from Lamp
                    if (p.FamiliarID > 0) {
                        p.frames.sendMessage(p, "You cannot summon more than one familiar at a time.");
                    } else {
//Engine.playerItems.deleteItem(p, 4447, itemSlot, 1); // Summoning: Spirt Wolf
                        p.frames.sendMessage(p, "You summon a White Night Protector.");
                        Engine.newSummonNPC(3348, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                        p.FamiliarID = 3348;
                    }
                    break;
                case 528: //Burnt Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(burntbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 1538:
                    p.frames.showInterface(p, 547);
                    break;
                case 9003:
                    p.frames.showInterface(p, 156);
                    p.frames.setString(p, "Click on a skill tab to train that skill.", 156, 4);
                    p.frames.setString(p, "Make money by theiving or woodcutting.", 156, 6);
                    p.frames.setString(p, "Items are very cheap, so every coin counts!", 156, 7);
                    p.frames.setString(p, "Forums are: MoparScape.org/smf!", 156, 8);
                    p.frames.setString(p, "For the basic commands, type ::help", 156, 9);
                    p.frames.setString(p, "Never risk drop-trading with someone!", 156, 10);
                    p.frames.setString(p, "Never tell anyone your password!", 156, 11);
                    p.frames.setString(p, "If your screen goes white when you login,", 156, 12);
                    p.frames.setString(p, " contact an admin to fix it.", 156, 13);
                    p.frames.setString(p, "You are an admin!", 156, 14);
                    p.frames.setString(p, "Have fun on DavidScape 508!", 156, 15);
                    for (int i = 1; i < 82; i++) {
                        p.frames.setString(p, "~~~~~DavidScape~~~~~", 156, 15 + i);
                    }
                    break;

                case 4155:
                    if (p.SlayerAm == 0) {
                        p.frames.showChatboxInterface(p, 241);
                        p.frames.animateInterfaceId(p, 9850, 241, 2);
                        p.frames.setNPCId(p, 1599, 241, 2);
                        p.frames.setString(p, "Duradel", 241, 3);
                        p.frames.setString(p, "You do not have a slayer task at the moment.", 241, 4);
                    } else {
                        p.frames.showChatboxInterface(p, 241);
                        p.frames.animateInterfaceId(p, 9850, 241, 2);
                        p.frames.setNPCId(p, 1599, 241, 2);
                        p.frames.setString(p, "Duradel", 241, 3);
                        if (p.SlayerTask == 0) {
                            p.frames.setString(p, "You still need to slay " + p.SlayerAm + " more Dragons.", 241, 4);
                        }
                        if (p.SlayerTask == 1) {
                            p.frames.setString(p, "You still need to slay " + p.SlayerAm + " more Guards.", 241, 4);
                        }
                        if (p.SlayerTask == 2) {
                            p.frames.setString(p, "You still need to slay " + p.SlayerAm + " more Giants.", 241, 4);
                        }
                        if (p.SlayerTask == 3) {
                            p.frames.setString(p, "You still need to slay " + p.SlayerAm + " more Ghosts.", 241, 4);
                        }
                        if (p.SlayerTask == 4) {
                            p.frames.setString(p, "You still need to slay " + p.SlayerAm + " more Heroes.", 241, 4);
                        }
                    }
                    break;
                case 12844:
                    p.requestAnim(8990, 0);
                    break;
                case 199:
                    Engine.playerItems.deleteItem(p, 199, Engine.playerItems.getItemSlot(p, 199), 1);
                    Engine.playerItems.addItem(p, 249, 1);
                    p.addSkillXP(25 * p.skillLvl[15], 15);
                    p.frames.sendMessage(p, "You clean the guam leaf.");
                    break;

                case 207:
                    Engine.playerItems.deleteItem(p, 207, Engine.playerItems.getItemSlot(p, 207), 1);
                    Engine.playerItems.addItem(p, 257, 1);
                    p.addSkillXP(75 * p.skillLvl[15], 15);
                    p.frames.sendMessage(p, "You clean the ranarr weed.");
                    break;


                case 530: //Bat Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(batbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 532: //Big Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(bigbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 534: //Baby Dragon Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(babydragonbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 536: //Dragon Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(dragonbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 2859: //Wolf Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(wolfbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 3123: //Shaikahan Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(shaikbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 3125: //Jogre Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(jogrebone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 3127: //Burnt Jogre Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(burntjogrebone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 3179: //Monkey Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(monkeybone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 4812: //Zogre Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(zogrebone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 4830: //Fayrg Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(fayrgbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 4832: //Raurg Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(raurgbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 4834: //Ourg Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(ourgbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 6729: //Dagganoth Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(dagbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;

                case 6812: //Wyvern Bone Burying
                    if (p.buryDelay <= 0) {
                        p.buryDelay = 3;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.addSkillXP(wyvbone * p.skillLvl[5], 5);
                        p.requestAnim(827, 0);
                    }
                    break;
                case 391:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(22, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 385:
                case 397:
                case 1963:
                case 6883:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(20, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 315:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(3, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 1897:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(136, true);
                        p.frames.sendMessage(p, "You eat the cake from David's birthday!");
                        p.requestAnim(829, 0);
                        p.requestGFX(365, 1);
                    }
                    break;

                case 319:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(1, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 325:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(4, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 329:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(9, true);
                        p.requestAnim(829, 0);
                    }
                    break;
                case 4049:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(8, true);
                    }
                    break;

                case 339:
                case 333:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(7, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 347:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(5, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 351:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(8, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 355:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(6, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 361:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(10, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 365:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(13, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 7946:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(16, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 379:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(12, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 373:
                    if (p.eatDelay <= 0) {
                        p.eatDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.updateHP(16, true);
                        p.requestAnim(829, 0);
                    }
                    break;

                case 3024:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 5, (int) (p.getLevelForXP(5) * 0.26) + 8, 0,
                                true);
                        pi.addItem(p, 3026, 1);
                    }
                    break;

                case 3026:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 5, (int) (p.getLevelForXP(5) * 0.26) + 8, 0,
                                true);
                        pi.addItem(p, 3028, 1);
                    }
                    break;

                case 3028:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 5, (int) (p.getLevelForXP(5) * 0.26) + 8, 0,
                                true);
                        pi.addItem(p, 3030, 1);
                    }
                    break;

                case 3030:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.26) + 8, 0,
                                true);
                        changeStat(p, 5, (int) (p.getLevelForXP(5) * 0.26) + 8, 0,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2430:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.3) + 10, 0,
                                true);
                        pi.addItem(p, 127, 1);
                    }
                    break;

                case 127:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.3) + 10, 0,
                                true);
                        pi.addItem(p, 129, 1);
                    }
                    break;

                case 129:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.3) + 10, 0,
                                true);
                        pi.addItem(p, 131, 1);
                    }
                    break;

                case 131:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.3) + 10, 0,
                                true);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.3) + 10, 0,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 6685:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        p.updateHP((int) (p.getLevelForXP(3) * 0.15) + 2, true);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.2) + 2, 1,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.1) + 2, 0,
                                false);
                        pi.addItem(p, 6687, 1);
                    }
                    break;

                case 6687:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        p.updateHP((int) (p.getLevelForXP(3) * 0.15) + 2, true);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.2) + 2, 1,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.1) + 2, 0,
                                false);
                        pi.addItem(p, 6689, 1);
                    }
                    break;

                case 6689:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        p.updateHP((int) (p.getLevelForXP(3) * 0.15) + 2, true);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.2) + 2, 1,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.1) + 2, 0,
                                false);
                        pi.addItem(p, 6691, 1);
                    }
                    break;

                case 6691:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        p.updateHP((int) (p.getLevelForXP(3) * 0.15) + 2, true);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.2) + 2, 1,
                                true);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 2, 0,
                                false);
                        changeStat(p, 6, (int) (p.getLevelForXP(6) * 0.1) + 2, 0,
                                false);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 113:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 115, 1);
                    }
                    break;

                case 115:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 117, 1);
                    }
                    break;

                case 117:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 119, 1);
                    }
                    break;

                case 119:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2432:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 115, 1);
                    }
                    break;

                case 133:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 135, 1);
                    }
                    break;

                case 135:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 137, 1);
                    }
                    break;

                case 137:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2444:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 4, 1,
                                true);
                        pi.addItem(p, 169, 1);
                    }
                    break;

                case 169:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 4, 1,
                                true);
                        pi.addItem(p, 171, 1);
                    }
                    break;

                case 171:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 4, 1,
                                true);
                        pi.addItem(p, 173, 1);
                    }
                    break;

                case 173:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 4, (int) (p.getLevelForXP(4) * 0.1) + 4, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2428:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 121, 1);
                    }
                    break;

                case 121:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 123, 1);
                    }
                    break;

                case 123:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 125, 1);
                    }
                    break;

                case 125:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.1) + 3, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2440:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 157, 1);
                    }
                    break;

                case 157:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 159, 1);
                    }
                    break;

                case 159:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 161, 1);
                    }
                    break;

                case 161:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 2, (int) (p.getLevelForXP(2) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2442:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 163, 1);
                    }
                    break;

                case 163:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 165, 1);
                    }
                    break;

                case 165:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 167, 1);
                    }
                    break;

                case 167:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 1, (int) (p.getLevelForXP(1) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                case 2436:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 145, 1);
                    }
                    break;

                case 145:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 147, 1);
                    }
                    break;

                case 147:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 149, 1);
                    }
                    break;

                case 149:
                    if (p.drinkDelay <= 0) {
                        p.drinkDelay = 3;
                        p.combatDelay += 2;
                        pi.deleteItem(p, itemId, itemSlot, 1);
                        p.requestAnim(829, 0);
                        changeStat(p, 0, (int) (p.getLevelForXP(0) * 0.15) + 5, 1,
                                true);
                        pi.addItem(p, 229, 1);
                    }
                    break;

                default:
                    Misc.println(
                            "[" + p.username + "] Unhandled item selected: "
                                    + interfaceId + ":" + itemId + ":" + itemSlot);
                    break;
            }
        } else {
            Misc.println(
                    "[" + p.username + "] Unhandled item select " + interfaceId
                            + ":" + itemId);
        }

        pi = null;
    }

    public void changeStat(Player p, int stat, int amt, int type, boolean bol) {
        if (p == null) {
            return;
        }
        if (bol) {
            if (p.skillLvl[stat] >= (p.getLevelForXP(stat) + amt)) {
                return;
            }
            p.skillLvl[stat] += amt;
            if (p.skillLvl[stat] >= (p.getLevelForXP(stat) + amt)) {
                p.skillLvl[stat] = (p.getLevelForXP(stat) + amt);
            }
            if (type == 0) {
                if (p.skillLvl[stat] > p.getLevelForXP(stat)) {
                    p.skillLvl[stat] = p.getLevelForXP(stat);
                }
            }
        } else if (!bol) {
            p.skillLvl[stat] -= amt;
            if (p.skillLvl[stat] < 1) {
                p.skillLvl[stat] = 1;
            }
        }
        p.frames.setSkillLvl(p, stat);
    }
}
