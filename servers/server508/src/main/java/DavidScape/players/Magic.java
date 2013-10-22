package DavidScape.players;

import DavidScape.Engine;
import DavidScape.util.Misc;


public class Magic {


    private static int mainDelayInt = 3;
    private static int mainClickDelay = 1;
    public static int fire = 554;
    public static int water = 555;
    public static int air = 556;
    public static int earth = 557;
    public static int mind = 558;
    public static int body = 559;
    public static int law = 563;
    public static int cosmic = 564;
    public static int death = 560;
    public static int nature = 561;
    public static int chaos = 562;
    public static int blood = 565;
    public static int soul = 566;
    public static int bones = 526;
    private static int hitDamage;

    public static void deleteItems(Player p, int itemId, int amt) {
        Engine.playerItems.deleteItem(p, itemId, Engine.playerItems.getItemSlot(p, itemId), amt);
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt) {
        Engine.playerItems.deleteItem(p, item1id, Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id, Engine.playerItems.getItemSlot(p, item2id), item2amt);
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt, int item3id, int item3amt) {
        Engine.playerItems.deleteItem(p, item1id,
                Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id, Engine.playerItems.getItemSlot(p, item2id), item2amt);
        Engine.playerItems.deleteItem(p, item3id, Engine.playerItems.getItemSlot(p, item3id), item3amt);
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt, int item3id, int item3amt, int item4id, int item4amt) {
        Engine.playerItems.deleteItem(p, item1id, Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id, Engine.playerItems.getItemSlot(p, item2id), item2amt);
        Engine.playerItems.deleteItem(p, item3id, Engine.playerItems.getItemSlot(p, item3id), item3amt);
        Engine.playerItems.deleteItem(p, item4id, Engine.playerItems.getItemSlot(p, item4id), item4amt);
    }

    public static String itemName(int itemID) {
        return Engine.items.getItemName(itemID);
    }

    public static boolean addItem(Player p, int ItemId, int amt) {
        return Engine.playerItems.addItem(p, ItemId, amt);
    }

    public static boolean hasReq(Player p, int ItemId, int amt) {
        return Engine.playerItems.haveItem(p, ItemId, amt);
    }

    public static boolean magicXp(Player p, double xpamt) {
        p.addSkillXP(xpamt * 3, 6);
        return false;
    }

    public static void sendMsg(Player p, String MSG) {
        p.frames.sendMessage(p, MSG);
    }

    public static void anim(Player p, int animID, int time) {
        p.requestAnim(animID, time);
    }

    public static void teleTo(Player p, int x, int y) {
        p.teleportTo(x, y, 0, 4, 4, 8939, 8941, 1576, 0, 1577, 0);
    }

    public static void teleTo(Player p, int x, int y, int h) {
        p.teleportTo(x, y, h, 4, 4, 8939, 8941, 1576, 0, 1577, 0);
    }

    public static void ancientTeleTo(Player p, int x, int y) {
        p.teleportTo(x, y, 0, 4, 4, 1979, 0, 392, 0, 0, 0);
    }

    public static void stopMove(Player p) {
        p.stopMovement(p);
    }

    public static void cast(Player p, int offsetx, int offsety, int moving, int starth, int endh, int speed, int target) {
        p.frames.createGlobalProjectile(p.absY, p.absX, offsety, offsetx, moving, starth, endh, speed, target);
    }

    public static void face(Player p, int amt) {
        p.requestFaceTo(amt);
    }

    public static int magicLvl(Player p) {
        return p.getLevelForXP(6);
    }

    public static void anim(Player p, int animID) {
        p.requestAnim(animID, 0);
    }

    public static void gfa(Player p, int gfxID, int animID) {
        p.requestAnim(animID, 0);
        p.requestGFX(gfxID, 0);
    }

    public static void gfa(Player p, int gfxID, int time, int animID, int time2) {
        p.requestAnim(animID, time2);
        p.requestGFX(gfxID, time);
    }

    public static void gfx(Player p, int gfxID) {
        p.requestGFX(gfxID, 0);
    }

    public static void gfx(Player p, int gfxID, int time) {
        p.requestGFX(gfxID, time);
    }

    public boolean lunarMagicAB(Player p, int buttonID) {
        switch (buttonID) {
            case 14:
                if (p.skillLvl[6] >= 94) {
                    if (Engine.playerItems.invItemCount(p, 557) > 10 && Engine.playerItems.invItemCount(p, 560) > 2 && Engine.playerItems.invItemCount(p, 9075) > 4) {
                        if (!p.vengOn) {
                            if (System.currentTimeMillis() - p.lastVeng >= 30000) {
                                p.requestAnim(4410, 0);
                                p.requestGFX(726, 0);
                                p.vengOn = true;
                                p.requestForceChat("VENGEANCE!");
                                p.lastVeng = System.currentTimeMillis();
                                Engine.playerItems.deleteItem(p, 557, Engine.playerItems.getItemSlot(p, 557), 10);
                                Engine.playerItems.deleteItem(p, 560, Engine.playerItems.getItemSlot(p, 560), 2);
                                Engine.playerItems.deleteItem(p, 9075, Engine.playerItems.getItemSlot(p, 9075), 4);
                            } else {
                                p.frames.sendMessage(p, "You can only cast vengeance spells every 30 seconds.");
                            }
                        } else {
                            p.frames.sendMessage(p, "You already have vengeance casted.");
                        }
                    } else {
                        p.frames.sendMessage(p, "You don't have enough runes to cast this spell.");
                    }
                } else {
                    p.frames.sendMessage(p, "You need a magic level of 94 to cast this spell.");
                }
                break;
        }
//End Lunar
        return true;
    }//End Lunar

    public boolean ancientMagicAB(Player p, int buttonID) {
        int miscAmount;// Needs Home Tele fixed, and Paddawa Teleport fixed.
        switch (buttonID) {
            case 24: // Home Teleport
                if (p.homeTeleDelay <= 0) {
                    p.homeTele = 15;
                    p.ancientsHomeTele = true;
                } else if (p.homeTeleDelay > 0) {
                    sendMsg(p, "You cannot teleport until you've waited 30 minutes.");
                    p.magicDelay = mainDelayInt;
                }
                break;


            default:
                return false;
        }
        return true;
    }

    public boolean modernMagicAB(Player p, int buttonID) {
        int miscAmount;

        switch (buttonID) {
            case 0: // Home Teleport
                if (p.homeTeleDelay <= 0) {
                    p.homeTele = 15;
                    p.normalHomeTele = true;
                } else if (p.homeTeleDelay > 0) {
                    sendMsg(p, "You cannot teleport until you've waited 30 minutes.");
                    p.magicDelay = mainDelayInt;
                }
                break;

            case 3: // Enchant Arrows
                if (magicLvl(p) >= 4) {
                    p.frames.showInterface(p, 432);
                    p.magicDelay = mainDelayInt;
                } else {
                    sendMsg(p,
                            "You need level " + modernLvlReq[buttonID]
                                    + " magic to use this spell.");
                    p.magicDelay = mainDelayInt;
                }
                break;

            case 9: // Bones to bananas
                if (magicLvl(p) >= 15) {
                    if (hasReq(p, earth, 2) && hasReq(p, water, 2)
                            && hasReq(p, nature, 1) && hasReq(p, bones, 1)) {
                        gfa(p, 141, 100, 722, 0);
                        miscAmount = Engine.playerItems.invItemCount(p, bones);
                        deleteItems(p, bones, miscAmount);
                        deleteItems(p, earth, 2, water, 2, nature, 1);
                        addItem(p, 1963, miscAmount);

                        magicXp(p, 15);
                        p.magicDelay = mainDelayInt;
                    } else {
                        sendMsg(p,
                                "You dont have the required bones/runes to cast this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p,
                            "You need level " + modernLvlReq[buttonID]
                                    + " magic to use this spell.");
                    p.magicDelay = mainDelayInt;
                }
                break;

            case 15: // Varrock Teleport
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, air, 3) && hasReq(p, law, 1)
                                && hasReq(p, fire, 1)) {
                            teleTo(p, 3212, 3434);
                            deleteItems(p, air, 3, law, 1, fire, 1);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 18: // Lumbridge Teleport
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, air, 3) && hasReq(p, law, 1)
                                && hasReq(p, earth, 1)) {
                            teleTo(p, 3221, 3219);
                            deleteItems(p, air, 3, law, 1, earth, 1);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 21: // Falador Teleport
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, air, 3) && hasReq(p, law, 1)
                                && hasReq(p, water, 1)) {
                            teleTo(p, 2965, 3380);
                            deleteItems(p, water, 1, law, 1, air, 3);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 26: // Camelot teleport
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, air, 5) && hasReq(p, law, 1)) {
                            teleTo(p, 2757, 3477);
                            deleteItems(p, law, 1, air, 5);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 32: // Ardougne Teleport
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, water, 2) && hasReq(p, law, 2)) {
                            teleTo(p, 2662, 3305);
                            deleteItems(p, law, 2, water, 2);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 37:
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, earth, 2) && hasReq(p, law, 2)) {
                            teleTo(p, 2545, 3112);
                            deleteItems(p, law, 2, earth, 2);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 40: // Bones to peachs
                if (magicLvl(p) >= modernLvlReq[buttonID]) {
                    if (hasReq(p, earth, 4) && hasReq(p, water, 4)
                            && hasReq(p, nature, 2) && hasReq(p, bones, 1)) {
                        gfa(p, 141, 100, 722, 0);
                        miscAmount = Engine.playerItems.invItemCount(p, bones);

                        deleteItems(p, nature, 1, water, 2, earth, 2, bones,
                                miscAmount);
                        addItem(p, 6883, miscAmount);
                        magicXp(p, modernSpellXp[buttonID]);
                        p.magicDelay = mainDelayInt;
                    } else {
                        sendMsg(p,
                                "You dont have the required items to cast this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p,
                            "You need level " + modernLvlReq[buttonID]
                                    + " magic to use this spell.");
                    p.magicDelay = mainDelayInt;
                }
                break;

            case 44:
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, fire, 2) && hasReq(p, law, 2)) {
                            teleTo(p, 2891, 3678);
                            deleteItems(p, law, 2, fire, 2);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 47:
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[buttonID]) {
                        if (hasReq(p, fire, 2) && hasReq(p, law, 2)
                                && hasReq(p, water, 2) && hasReq(p, 1963, 1)) {
                            teleTo(p, 2755, 2784);
                            deleteItems(p, water, 2, law, 2, fire, 2, 1963, 1);
                            magicXp(p, modernSpellXp[buttonID]);
                        } else {
                            sendMsg(p,
                                    "You dont have the required items to cast this spell.");
                            p.magicDelay = mainDelayInt;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[buttonID]
                                        + " magic to use this spell.");
                        p.magicDelay = mainDelayInt;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 58: // Charge
                if (p.ActionTimer == 0) {
                    if (p.magicDelay <= 0) {
                        if (magicLvl(p) >= modernLvlReq[buttonID]) {
                            if (hasReq(p, 565, 3) && hasReq(p, fire, 3)
                                    && hasReq(p, air, 3)) {
                                deleteItems(p, air, 3, fire, 3, 565, 3);
                                sendMsg(p,
                                        "You feel a sudden urge run through your veins.");
                                p.ActionTimer = 2;
                                p.arenaSpellPower = 1.3;
                                anim(p, 811);
                                magicXp(p, modernSpellXp[buttonID]);
                            } else {
                                sendMsg(p,
                                        "You dont have the required runes to cast this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You need level " + modernLvlReq[buttonID]
                                            + " magic to use this spell.");
                            p.magicDelay = mainDelayInt;
                        }

                    } else {
                        sendMsg(p, "You need to wait before casting a spell again.");
                        p.clickDelay = mainClickDelay;
                    }
                }

                break;

            default:
                return false;
        }
        return true;
    }

    public static void MagicOnItemHandle(Player p, int packetId, int packetSize) {
        if ((p == null) || (p.stream == null)) {
            return;
        }

        int itemID = p.stream.readUnsignedWordBigEndianA();
        int i2 = p.stream.readUnsignedWordBigEndian();
        int itemSlot = p.stream.readUnsignedWordBigEndian();
        int i4 = p.stream.readDWord();
        int spellID = p.stream.readDWord();

        if (p.items[itemSlot] != itemID) {
            return;
        }

        switch (spellID) {
            case 570474496: // High-Alchemy
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[0]) {
                        if (hasReq(p, nature, 1) && hasReq(p, fire, 5)) {
                            gfa(p, 113, 713);
                            deleteItems(p, fire, 5, nature, 1);
                            Engine.playerItems.deleteItem(p, itemID, itemSlot, 1);
                            addItem(p, 995, 2);
                            magicXp(p, modernSpellXp[34]);
                            p.magicDelay = mainDelayInt;


                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[34]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 218152960: // Low-Alchemy
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[0]) {
                        if (hasReq(p, nature, 1) && hasReq(p, fire, 3)) {
                            gfa(p, 112, 712);
                            addItem(p, 995, 2);
                            deleteItems(p, fire, 3, nature, 1);
                            Engine.playerItems.deleteItem(p, itemID, itemSlot, 1);
                            magicXp(p, modernSpellXp[12]);
                            p.magicDelay = mainDelayInt;
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes to cast this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[12]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 419479552: // Superheat Item
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[25]) {
                        if (hasReq(p, nature, 1) && hasReq(p, fire, 4)) {
                            if ((itemID == 436) && hasReq(p, 438, 1)) {
                                if (p.skillLvl[13] >= 1) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, nature, 1, fire, 4, 436, 1, 438,
                                            1);
                                    addItem(p, 2349, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2349)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 1 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 438 && hasReq(p, 436, 1)) {
                                if (p.skillLvl[13] >= 1) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, nature, 1, fire, 4, 436, 1, 438,
                                            1);
                                    addItem(p, 2349, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2349)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 1 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 440 && !hasReq(p, 453, 1)) {
                                if (p.skillLvl[13] >= 15) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 440, 1);
                                    addItem(p, 2351, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2351)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 15 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if ((itemID == 440) && hasReq(p, 453, 2)) {
                                if (p.skillLvl[13] >= 30) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 440, 1, 453,
                                            2);
                                    addItem(p, 2353, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2353)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 30 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 440 && hasReq(p, 453, 1)) {
                                sendMsg(p,
                                        "You need 2 coal and 1 iron ore to superheat a steel bar.");
                                p.clickDelay = mainClickDelay;
                            }
                            if (itemID == 447 && hasReq(p, 453, 4)) {
                                if (p.skillLvl[13] >= 50) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 447, 1, 453,
                                            4);
                                    addItem(p, 2359, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2359)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 50 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 449 && hasReq(p, 453, 6)) {
                                if (p.skillLvl[13] >= 70) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 449, 1, 453,
                                            6);
                                    addItem(p, 2361, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2361)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 70 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 451 && hasReq(p, 453, 8)) {
                                if (p.skillLvl[13] >= 85) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 451, 1, 453,
                                            8);
                                    addItem(p, 2363, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2363)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 85 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 668) {
                                if (p.skillLvl[13] >= 8) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 668, 1);
                                    addItem(p, 9467, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(9467)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 8 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 442) {
                                if (p.skillLvl[13] >= 20) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 442, 1);
                                    Engine.playerItems.deleteItem(p, 442, 1);
                                    addItem(p, 2355, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2355)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                } else {
                                    sendMsg(p,
                                            "You need level 20 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            }
                            if (itemID == 444) {
                                if (p.skillLvl[13] >= 40) {
                                    gfa(p, 148, 100, 722, 40);
                                    deleteItems(p, fire, 4, nature, 1, 444, 1);
                                    addItem(p, 2357, 1);
                                    sendMsg(p,
                                            "You superheat a " + itemName(2357)
                                                    + " .");
                                    magicXp(p, modernSpellXp[25]);
                                    p.magicDelay = mainDelayInt;
                                    return;
                                } else {
                                    sendMsg(p,
                                            "You need level 40 smithing to cast this spell.");
                                    p.clickDelay = mainClickDelay;
                                }
                            } else if (itemID != 444 && itemID != 442
                                    && itemID != 668 && itemID != 451
                                    && itemID != 449 && itemID != 447
                                    && itemID != 440 && itemID != 438
                                    && itemID != 436) {
                                sendMsg(p, "You can only Superheat ores into bars.");
                                sendMsg(p, "Make sure you have the correct Items.");
                                p.clickDelay = mainClickDelay;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required items to cast this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[25]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 83935232: // Enchant lvl 1 jewelry
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[4]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, water, 1)) {
                            if (itemID == 1637) { // Saphire ring
                                deleteItems(p, 1637, 1, water, 1, cosmic, 1);
                                addItem(p, 2550, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[4]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11072) { // Saphire bracelet
                                addItem(p, 11074, 1);
                                deleteItems(p, 1637, 1, water, 1, cosmic, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[4]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1656) { // Saphire necklace
                                deleteItems(p, 1656, 1, water, 1, cosmic, 1);
                                addItem(p, 3853, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[4]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1694) { // Saphire amulet
                                addItem(p, 1727, 1);
                                deleteItems(p, 1675, 1, water, 1, cosmic, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[4]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 1694 && itemID != 1656
                                    && itemID != 1637 && itemID != 11072) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[4]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 268484608: // Enchant lvl 2 jewelry
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[15]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, air, 3)) {
                            if (itemID == 1639) { // Emerald ring
                                deleteItems(p, air, 3, cosmic, 1, 1639, 1);
                                addItem(p, 2552, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[15]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11076) { // Emerald bracelet
                                deleteItems(p, 11076, 1, air, 3, cosmic, 1);
                                addItem(p, 11079, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[15]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1658) { // Emerald necklace
                                deleteItems(p, 1658, 1, air, 3, cosmic, 1);
                                addItem(p, 5521, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[15]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1696) { // Emerald amulet
                                deleteItems(p, air, 3, cosmic, 1, 1696, 1);
                                addItem(p, 1729, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[15]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 1696 && itemID != 1658
                                    && itemID != 1639 && itemID != 11076) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[15]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 469811200: // Enchant lvl 3 jewlery
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[28]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, fire, 5)) {
                            if (itemID == 1641) { // Ruby ring
                                deleteItems(p, cosmic, 1, fire, 1, 1641, 1);
                                addItem(p, 2568, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[28]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11085) { // Ruby bracelet
                                deleteItems(p, cosmic, 1, fire, 5, 11085, 1);
                                addItem(p, 11088, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[28]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1660) { // Ruby necklace
                                deleteItems(p, cosmic, 1, fire, 5, 1660, 1);
                                addItem(p, 11194, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[28]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1698) { // Ruby amulet
                                deleteItems(p, cosmic, 1, fire, 5, 1698, 1);
                                addItem(p, 1725, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[28]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 1698 && itemID != 1660
                                    && itemID != 1641 && itemID != 11085) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[28]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 604028928: // Enchant lvl 4 jewlery
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[36]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, earth, 10)) {
                            if (itemID == 1643) { // Diamond ring
                                deleteItems(p, earth, 10, cosmic, 1, 1643, 1);
                                addItem(p, 2570, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[36]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11092) { // Diamond bracelet
                                deleteItems(p, earth, 10, cosmic, 1, 11092, 1);
                                addItem(p, 11095, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[36]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1662) { // Diamond necklace
                                deleteItems(p, earth, 10, cosmic, 1, 1662, 1);
                                addItem(p, 11090, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[36]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1700) { // Diamond amulet
                                deleteItems(p, earth, 10, cosmic, 1, 1700, 1);
                                addItem(p, 1731, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[36]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 1643 && itemID != 1662
                                    && itemID != 1700 && itemID != 11092) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[36]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 855687168: // Enchant lvl 5 jewlery
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[51]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, earth, 15)
                                && hasReq(p, fire, 15)) {
                            if (itemID == 1645) { // Dragon ring
                                deleteItems(p, cosmic, 1, earth, 15, fire, 15, 1645,
                                        1);
                                addItem(p, 2572, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[51]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11115) { // Dragon bracelet
                                deleteItems(p, cosmic, 1, earth, 15, fire, 15, 11115,
                                        1);
                                addItem(p, 11118, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[51]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 1702) { // Dragon amulet
                                deleteItems(p, cosmic, 1, earth, 15, fire, 15, 1702,
                                        1);
                                addItem(p, 1704, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[51]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 1645 && itemID != 11115
                                    && itemID != 1702) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[51]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;

            case 1023459328: // Enchant lvl 6 jewlery
                if (p.magicDelay <= 0) {
                    if (magicLvl(p) >= modernLvlReq[60]) {
                        if (hasReq(p, cosmic, 1) && hasReq(p, earth, 20)
                                && hasReq(p, fire, 20)) {
                            if (itemID == 6575) { // Onyx ring
                                deleteItems(p, cosmic, 1, earth, 20, fire, 20, 6575,
                                        1);
                                addItem(p, 6583, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[60]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 11130) { // Onyx bracelet
                                deleteItems(p, cosmic, 1, earth, 20, fire, 20, 11130,
                                        1);
                                addItem(p, 11133, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[60]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 6577) { // Onyx necklace
                                deleteItems(p, cosmic, 1, earth, 20, fire, 20, 6577,
                                        1);
                                addItem(p, 11128, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[60]);
                                p.magicDelay = mainDelayInt;
                            }
                            if (itemID == 6581) { // Onyx amulet
                                deleteItems(p, cosmic, 1, earth, 20, fire, 20, 6581,
                                        1);
                                addItem(p, 6585, 1);
                                sendMsg(p,
                                        "You enchant the " + itemName(itemID) + ".");
                                magicXp(p, modernSpellXp[60]);
                                p.magicDelay = mainDelayInt;
                            } else if (itemID != 6575 && itemID != 11130
                                    && itemID != 6577 && itemID != 6581) {
                                sendMsg(p, "You cannot enchant this.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p,
                                    "You dont have the required runes for this spell.");
                            p.clickDelay = mainClickDelay;
                        }
                    } else {
                        sendMsg(p,
                                "You need level " + modernLvlReq[60]
                                        + " magic to use this spell.");
                        p.clickDelay = mainClickDelay;
                    }
                } else {
                    sendMsg(p, "You need to wait before casting a spell again.");
                    p.clickDelay = mainClickDelay;
                }
                break;
        }
    }

    public static void magicAop(Player p, int packetId, int packetSize) {

        p.attackPlayer = p.stream.readSignedWordA();
        int playerId = p.stream.readSignedWordBigEndian();
        int interfaceId = p.stream.readUnsignedWord();
        Player p2 = Engine.players[playerId];

        int offsetX = (p.absX - p2.absX) * -1;
        int offsetY = (p.absY - p2.absY) * -1;

        p.clickId = p.stream.readUnsignedWord();
        if (Engine.wildernessArea(p.absX, p.absY) || p.AtDuel() == true || p.AtClanField() == true || p.AtCastleWars() == false) {
            if (Engine.wildernessArea(p2.absX, p2.absY) || p2.AtDuel() == true || p2.AtClanField() == true || p2.AtCastleWars() == true) {
                switch (interfaceId) {
                    case 193: // Ancients magic
                        switch (p.clickId) {

                            case 3: // Ice Barrage
                                if (p.magicDelay <= 0) {

                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {

                                        if (hasReq(p, death, 4) && hasReq(p, water, 6) && hasReq(p, blood, 2)) {

                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            deleteItems(p, death, 4, blood, 2, water, 6);
                                            System.out.println("Barrage 1");
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            gfx(p2, 369, 0);
                                            sendMsg(p2, "Your frozen.");
                                            p2.freezeDelay = 33;
                                            p2.appendHit(hitdmg, 0);
                                            for (Player ps : Engine.players) {
                                                if (ps != null) {

                                                    if (ps.absX < p2.absX + 3 && ps.absY < p2.absY + 3 && ps.absX > p2.absX - 3 && ps.absY > p2.absY - 3 && ps.playerId != p.playerId && ps.playerId != p2.playerId && Engine.wildernessArea(p2.absX, p2.absY)) {
                                                        gfx(ps, 369, 0);
                                                        ps.appendHit(hitdmg, 0);
                                                        sendMsg(ps, "You've been frozen!");
                                                        ps.freezeDelay = 33;
                                                    }
                                                }
                                            }
                                        } else {
                                            sendMsg(p, "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p, "You need level " + ancientLvlReq[p.clickId] + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;


                            case 7: // BLood Barrage
                                if (p.magicDelay <= 0) {

                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {

                                        if (hasReq(p, death, 4) && hasReq(p, water, 6) && hasReq(p, blood, 2)) {

                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            deleteItems(p, death, 4, blood, 2, water, 6);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            gfx(p2, 377, 0);
                                            sendMsg(p, "The spell hits and you heal yourself.");
                                            p.updateHP(hitdmg / 4, true);
                                            p2.appendHit(hitdmg, 0);
                                            for (Player ps : Engine.players) {
                                                if (ps != null) {

                                                    if (ps.absX < p2.absX + 3 && ps.absY < p2.absY + 3 && ps.absX > p2.absX - 3 && ps.absY > p2.absY - 3 && ps.playerId != p2.playerId && ps.playerId != p.playerId && Engine.wildernessArea(p2.absX, p2.absY)) {
                                                        gfx(ps, 377, 0);
                                                        ps.appendHit(hitdmg, 0);
                                                        p.updateHP(hitdmg / 4, true);
                                                    }
                                                }
                                            }
                                        } else {
                                            sendMsg(p, "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p, "You need level " + ancientLvlReq[p.clickId] + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;


                            case 15: // Shadow Barrage
                                if (p.magicDelay <= 0) {

                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {

                                        if (hasReq(p, death, 4) && hasReq(p, water, 6) && hasReq(p, blood, 2)) {

                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, death, 4, blood, 2, water, 6);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            gfx(p2, 383, 0);
                                            p2.appendHit(hitdmg, 0);
                                            for (Player ps : Engine.players) {
                                                if (ps != null) {

                                                    if (ps.absX < p2.absX + 3 && ps.absY < p2.absY + 3 && ps.absX > p2.absX - 3 && ps.absY > p2.absY - 3 && ps.playerId != p2.playerId && ps.playerId != p.playerId && Engine.wildernessArea(p2.absX, p2.absY)) {
                                                        gfx(ps, 377, 0);
                                                        ps.appendHit(hitdmg, 0);

                                                    }
                                                }
                                            }
                                        } else {
                                            sendMsg(p, "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p, "You need level " + ancientLvlReq[p.clickId] + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;


                            case 11: // Smoke Barrage
                                if (p.magicDelay <= 0) {

                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {

                                        if (hasReq(p, death, 4) && hasReq(p, water, 6) && hasReq(p, blood, 2)) {

                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            deleteItems(p, death, 4, blood, 2, water, 6);
                                            p.combatDelay += p.attackDelay;
                                            gfx(p2, 391, 0);
                                            p2.appendHit(hitdmg, 4);
                                            for (Player ps : Engine.players) {
                                                if (ps != null) {

                                                    if (ps.absX < p2.absX + 3 && ps.absY < p2.absY + 3 && ps.absX > p2.absX - 3 && ps.absY > p2.absY - 3 && ps.playerId != p2.playerId && ps.playerId != p.playerId && Engine.wildernessArea(p2.absX, p2.absY)) {
                                                        gfx(ps, 391, 0);
                                                        ps.appendHit(hitdmg, 4);

                                                    }
                                                }
                                            }
                                        } else {
                                            sendMsg(p, "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p, "You need level " + ancientLvlReq[p.clickId] + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 1: // Ice blitz
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, water, 3)
                                                && hasReq(p, blood, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 367, 0);
                                            deleteItems(p, death, 2, water, 3, blood, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your frozen.");
                                            sendMsg(p, "You freeze your enemy.");
                                            p2.freezeDelay = 15;
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 5: // Blood blitz
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, blood, 4)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 375, 0);
                                            deleteItems(p, death, 2, blood, 4);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.updateHP(hitdmg / 2, true);
                                            sendMsg(p, "The spell hits and you heal yourself.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 13: // Shadow blitz
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, blood, 2)
                                                && hasReq(p, air, 2) && hasReq(p, soul, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 381, 0);
                                            deleteItems(p, death, 2, blood, 2, air, 2, soul, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2,
                                                    "You feel your attacking powers get slightly damaged.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 9: // Smoke Blitz
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, fire, 2)
                                                && hasReq(p, blood, 2) && hasReq(p, air, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 387, 0);
                                            deleteItems(p, death, 2, fire, 2, blood, 2, air, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 4);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your poisened.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 2: // Ice Burst
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                                && hasReq(p, water, 4)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            gfx(p2, 363, 0);
                                            deleteItems(p, death, 2, chaos, 4, water, 4);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your frozen.");
                                            sendMsg(p, "You freeze your enemy.");
                                            p2.freezeDelay = 10;
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 6: // Blood Burst
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                                && hasReq(p, blood, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            gfx(p2, 376, 0);
                                            deleteItems(p, death, 2, chaos, 4, blood, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.updateHP(hitdmg / 2, true);
                                            sendMsg(p, "The spell hits and you heal yourself.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 14: // Shadow Burst
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                                && hasReq(p, air, 2) && hasReq(p, soul, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 382, 0);
                                            deleteItems(p, death, 2, chaos, 4, air, 2, soul, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2,
                                                    "You feel your attacking powers get slightly damaged.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 10: // Smoke Burst
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                                && hasReq(p, air, 2) && hasReq(p, fire, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1979);
                                            gfx(p2, 389, 0);
                                            deleteItems(p, death, 2, chaos, 4, air, 2, fire, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 2);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your poisened.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 0: // Ice Rush
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                                && hasReq(p, water, 2)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 361, 0);
                                            deleteItems(p, death, 2, chaos, 2, water, 2);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your frozen.");
                                            sendMsg(p, "You freeze your enemy.");
                                            p2.freezeDelay = 5;
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 4: // Blood Rush
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                                && hasReq(p, blood, 1)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 361, 0);
                                            deleteItems(p, death, 2, chaos, 2, blood, 1);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            p.updateHP(hitdmg / 2, true);
                                            sendMsg(p, "The spell hits and you heal yourself.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 12: // Shadow Rush
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                                && hasReq(p, air, 1) && hasReq(p, soul, 1)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 379, 0);
                                            deleteItems(p, death, 2, chaos, 2, air, 1, soul, 1);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2,
                                                    "You feel your attacking powers get slightly damaged.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 8: // Smoke Rush
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= ancientLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                                && hasReq(p, air, 1) && hasReq(p, fire, 1)) {
                                            stopMove(p);
                                            p.magicDelay = mainDelayInt;
                                            anim(p, 1978);
                                            gfx(p2, 385, 0);
                                            deleteItems(p, death, 2, chaos, 2, air, 1, fire, 1);
                                            face(p, p2.playerId + 32768);
                                            int hitdmg = Misc.random(ancientMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 2);
                                            magicXp(p, hitdmg * 2 + ancientSpellXp[p.clickId]);
                                            sendMsg(p2, "Your poisened.");
                                            p.combatDelay += p.attackDelay;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + ancientLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            default:
                                Misc.println("Unhandled Ancients button: " + p.clickId + ".");
                        }
                        break;

                    case 192: // Modern magic
                        switch (p.clickId) {
                            case 1: // Wind Strike
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, mind, 1) && hasReq(p, air, 1)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, air, 1, mind, 1);
                                            gfa(p, 90, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 91, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 92, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 4: // Water Strike
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, mind, 1) && hasReq(p, air, 1)
                                                && hasReq(p, water, 1)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, air, 1, mind, 1, water, 1);
                                            gfa(p, 93, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 94, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 95, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 6: // Earth Strike
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, mind, 1) && hasReq(p, air, 1)
                                                && hasReq(p, earth, 2)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, air, 1, mind, 1, earth, 2);
                                            gfa(p, 96, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 97, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 98, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 8: // Fire Strike
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, mind, 1) && hasReq(p, air, 2)
                                                && hasReq(p, fire, 3)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, air, 2, mind, 1, fire, 3);
                                            gfa(p, 99, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 100, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 101, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 10: // Wind Bolt
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, chaos, 1) && hasReq(p, air, 2)) {
                                            stopMove(p);
                                            deleteItems(p, chaos, 1, air, 2);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 117, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 118, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 119, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 14: // Water Bolt
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, chaos, 1) && hasReq(p, air, 2)
                                                && hasReq(p, water, 2)) {
                                            stopMove(p);
                                            deleteItems(p, chaos, 1, air, 2, water, 2);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 120, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 121, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 122, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 17: // Earth Bolt
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, chaos, 1) && hasReq(p, air, 2)
                                                && hasReq(p, earth, 3)) {
                                            stopMove(p);
                                            deleteItems(p, chaos, 1, air, 2, earth, 3);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 123, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 124, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 125, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 20: // Fire Bolt
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, chaos, 1) && hasReq(p, air, 2)
                                                && hasReq(p, fire, 3)) {
                                            stopMove(p);
                                            deleteItems(p, chaos, 1, air, 2, fire, 3);
                                            gfa(p, 126, 100, 711, 0);
                                            face(p, p2.playerId + 32768);
                                            cast(p, offsetX, offsetY, 127, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 128, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 24: // Wind Blast
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 1) && hasReq(p, air, 3)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, death, 1, air, 3);
                                            gfa(p, 132, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 133, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 134, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 27: // Water Blast
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 1) && hasReq(p, air, 3)
                                                && hasReq(p, water, 3)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, death, 1, air, 3, water, 3);
                                            gfa(p, 135, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 136, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 137, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 33: // Earth Blast
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 1) && hasReq(p, air, 3)
                                                && hasReq(p, earth, 4)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, death, 1, air, 3, earth, 4);
                                            gfa(p, 138, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 139, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 140, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 38: // Fire Blast
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, death, 1) && hasReq(p, air, 4)
                                                && hasReq(p, fire, 5)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, death, 1, air, 4, fire, 5);
                                            gfa(p, 129, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 130, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 131, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 45: // Wind Wave
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, blood, 1) && hasReq(p, air, 5)) {
                                            stopMove(p);
                                            face(p, p2.playerId + 32768);
                                            deleteItems(p, blood, 1, air, 5);
                                            gfa(p, 158, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 159, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 160, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 48: // Water Wave
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                                && hasReq(p, water, 7)) {
                                            stopMove(p);
                                            deleteItems(p, blood, 1, air, 5, water, 7);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 161, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 162, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 163, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 52: // Earth Wave
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                                && hasReq(p, earth, 7)) {
                                            stopMove(p);
                                            deleteItems(p, blood, 1, air, 5, earth, 7);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 164, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 165, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 166, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            case 55: // Fire Wave
                                if (p.magicDelay <= 0) {
                                    if (magicLvl(p) >= modernLvlReq[p.clickId]) {
                                        if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                                && hasReq(p, fire, 7)) {
                                            stopMove(p);
                                            deleteItems(p, blood, 1, air, 5, fire, 7);
                                            face(p, p2.playerId + 32768);
                                            gfa(p, 155, 100, 711, 0);
                                            cast(p, offsetX, offsetY, 156, 43, 31, 80,
                                                    p2.playerId);
                                            gfx(p2, 157, 177);
                                            int hitdmg = Misc.random(
                                                    modernMagicMaxHit[p.clickId]);

                                            p2.appendHit(hitdmg, 0);
                                            magicXp(p, hitdmg * 4 + modernSpellXp[p.clickId]);
                                            p.combatDelay += p.attackDelay;
                                            p.magicDelay = mainDelayInt;
                                        } else {
                                            sendMsg(p,
                                                    "You dont have the required runes for this spell.");
                                            p.magicDelay = mainDelayInt;
                                        }
                                    } else {
                                        sendMsg(p,
                                                "You need level " + modernLvlReq[p.clickId]
                                                        + " magic to use this spell.");
                                        p.magicDelay = mainDelayInt;
                                    }
                                } else {
                                    sendMsg(p, "You need to wait before casting a spell again.");
                                    p.clickDelay = mainClickDelay;
                                }
                                break;

                            default:
                                Misc.println("Unhandled Modern button: " + p.clickId + ".");
                        }
                        break;

                    default:
                        Misc.println(
                                "PlayerID " + playerId + " - InterfaceID " + interfaceId
                                        + " - ButtonID " + p.clickId + ".");
                }
            }
        }
    }

    public static int[] ancientLvlReq = {
            58, 82, 70, 94, 56, 80, 68, 92, 50, 74, 62, 86, 52, 76, 64, 88, 54, 60,
            66, 72, 78, 84, 90, 96, 0
    };

    public static int[] ancientSpellXp = {
            34, 46, 40, 52, 33, 45, 39, 51, 30, 42, 36, 48, 31, 43, 37, 49, 64, 70,
            76, 82, 88, 94, 100, 106, 0
    };

    public static int[] ancientMaxHit = {
            18, 26, 22, 30, 17, 25, 21, 29, 15, 23, 19, 27, 16, 24, 20, 28, 0, 0, 0,
            0, 0, 0, 0, 0, 0
    };

    public static double[] modernSpellXp = {
            0, 5.5, 13, 0, 7.5, 9.5, 21, 11.5, 25, 13.5, 29, 30, 31, 16.5, 35, 37,
            19.5, 41, 45, 43, 22.5, 48, 24.5, 30, 25.5, 53, 55.5, 28.5, 59, 30, 60,
            30, 61, 31.5, 65, 66, 67, 68, 35.5, 70, 35.5, 35, 35, 35, 68, 36, 73, 74,
            37.5, 76, 76, 78, 40, 83, 84, 42.5, 89, 90, 180, 92, 97, 100
    };

    public static int[] modernLvlReq = {
            0, 1, 3, 4, 5, 7, 9, 11, 13, 15, 17, 19, 20, 21, 23, 25, 27, 29, 31, 32,
            33, 35, 37, 39, 40, 41, 43, 45, 47, 49, 50, 50, 50, 51, 53, 55, 56, 57,
            58, 59, 60, 60, 60, 60, 60, 61, 62, 63, 64, 65, 66, 66, 68, 70, 73, 74,
            75, 79, 80, 80, 82, 87, 90
    };

    public static int[] modernMagicMaxHit = {
            0, 2, 0, 0, 4, 0, 6, 0, 8, 0, 9, 0, 0, 0, 10, 0, 0, 11, 0, 0, 12, 0, 15,
            0, 13, 0, 0, 14, 25, 2, 19, 19, 0, 15, 0, 0, 0, 0, 16, 0, 0, 20, 20, 20,
            0, 17, 0, 0, 18, 0, 0, 0, 19, 0, 0, 20, 0, 0, 0, 0, 0, 0
    };

}
