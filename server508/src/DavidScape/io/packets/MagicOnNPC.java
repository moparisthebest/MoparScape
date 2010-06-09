package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;

public class MagicOnNPC {
    private static int hitDamage;
    private static int mainDelayInt = 2;
    private static int mainClickDelay = 1;
    public static int air = 556;
    public static int earth = 557;
    public static int water = 555;
    public static int fire = 554;
    public static int body = 559;
    public static int mind = 558;
    public static int law = 563;
    public static int cosmic = 564;
    public static int death = 560;
    public static int nature = 561;
    public static int chaos = 562;
    public static int blood = 565;
    public static int soul = 566;


    public static void deleteItems(Player p, int itemId, int amt) {
        Engine.playerItems.deleteItem(p, itemId,
                Engine.playerItems.getItemSlot(p, itemId), amt);
    }

    public static boolean giveHPXP(Player p, double xpamt) {
        p.addSkillXP(xpamt, 3);
        return false;
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt) {
        Engine.playerItems.deleteItem(p, item1id,
                Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id,
                Engine.playerItems.getItemSlot(p, item2id), item2amt);
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt, int item3id, int item3amt) {
        Engine.playerItems.deleteItem(p, item1id,
                Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id,
                Engine.playerItems.getItemSlot(p, item2id), item2amt);
        Engine.playerItems.deleteItem(p, item3id,
                Engine.playerItems.getItemSlot(p, item3id), item3amt);
    }

    public static void deleteItems(Player p, int item1id, int item1amt, int item2id, int item2amt, int item3id, int item3amt, int item4id, int item4amt) {
        Engine.playerItems.deleteItem(p, item1id,
                Engine.playerItems.getItemSlot(p, item1id), item1amt);
        Engine.playerItems.deleteItem(p, item2id,
                Engine.playerItems.getItemSlot(p, item2id), item2amt);
        Engine.playerItems.deleteItem(p, item3id,
                Engine.playerItems.getItemSlot(p, item3id), item3amt);
        Engine.playerItems.deleteItem(p, item4id,
                Engine.playerItems.getItemSlot(p, item4id), item4amt);
    }

    public static String itemName(int itemID) {
        return Engine.items.getItemName(itemID);
    }

    public static boolean addItem(Player p, int ItemId, int amt) {
        return Engine.playerItems.addItem(p, ItemId, amt);
    }

    public static int magicLvl(Player p) {
        return p.getLevelForXP(6);
    }

    public static boolean hasReq(Player p, int ItemId, int amt) {
        return Engine.playerItems.haveItem(p, ItemId, amt);
    }

    public static boolean giveMagicXP(Player p, double xpamt) {
        p.addSkillXP(xpamt, 6);
        return false;
    }

    public static boolean magicXp(Player p, double xpamt) {
        p.addSkillXP(xpamt, 6);
        return false;
    }

    public static void sendMsg(Player p, String MSG) {
        p.frames.sendMessage(p, MSG);
    }

    public static void cast(Player p, int offsetx, int offsety, int moving, int starth, int endh, int speed, int target) {
//p.frames.createGlobalProjectile(p.absY, p.absX, offsety, offsetx, moving,
//starth, endh, speed, target);
    }

    public static void face(Player p, int amt) {
        p.requestFaceTo(amt);
    }

    public static int MagicLevel(Player p) {
        return p.getLevelForXP(6);
    }

    public static void gfa(Player p, int gfxID, int time, int animID, int time2) {
        p.requestAnim(animID, time2);
        p.requestGFX(gfxID, time);
    }

    public static void gfx(NPC n, int gfxID) {
        n.requestGFX(gfxID, 0);
    }

    public static void anim(Player p, int animID) {
        p.requestAnim(animID, 0);
    }

    public static void stopMove(Player p) {
        p.stopMovement(p);
    }


    public static void magicAop(Player p, int packetId, int packetSize) {
        p.attackNPC = p.stream.readSignedWordA();
        int buttonId = p.stream.readSignedWordA();
        int interfaceId = p.stream.readUnsignedWord();

        NPC n = Engine.npcs[p.attackNPC];
        int offsetX = (p.absX - n.absX) * -1;
        int offsetY = (p.absY - n.absY) * -1;

        p.attackingNPC = true;
        if (!n.attackingPlayer) {
            n.attackingPlayer = true;
            n.attackPlayer = p.playerId;
            n.followPlayer = p.playerId;
        }

        switch (interfaceId) {

            case 193: // Ancients magic
                switch (buttonId) {
                    case 131: // Ice Barrage
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 94) {
                                if (hasReq(p, death, 4) && hasReq(p, water, 6)
                                        && hasReq(p, blood, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(369, 1);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(40);
                                    deleteItems(p, death, 4, water, 6, blood, 2);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 900 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    //n.freezeDelay = 20;
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 94 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 135: // Blood Barrage
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 92) {
                                if (hasReq(p, death, 4) && hasReq(p, soul, 1)
                                        && hasReq(p, blood, 4)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(377, 0);
                                    deleteItems(p, death, 4, soul, 1, blood, 4);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(36);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 860 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.updateHP(hitdmg / 4, true);
                                    sendMsg(p, "The spell hits and you heal yourself.");
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 92 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 143: // Shadow Barrage
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 88) {
                                if (hasReq(p, death, 4) && hasReq(p, soul, 3)

                                        && hasReq(p, blood, 2) && hasReq(p, air, 4)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(383, 0);
                                    deleteItems(p, death, 2, soul, 2, blood, 2, air, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(33);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 845 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 88 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 139: // Smoke Barrage
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 86) {
                                if (hasReq(p, death, 4) && hasReq(p, fire, 4)
                                        && hasReq(p, blood, 2) && hasReq(p, air, 4)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(391, 0);
                                    deleteItems(p, death, 4, fire, 4, blood, 2, air, 4);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(30);

                                    n.appendHit(hitdmg, 4);
                                    magicXp(p, hitdmg * 820 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 86 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 129: // Ice blitz
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 82) {
                                if (hasReq(p, death, 2) && hasReq(p, water, 3)
                                        && hasReq(p, blood, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(367, 1);
                                    deleteItems(p, death, 2, water, 3, blood, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(27);
                                    face(p, n.npcId);
                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 800 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 82 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 133: // Blood blitz
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 80) {
                                if (hasReq(p, death, 2) && hasReq(p, blood, 4)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(375, 0);
                                    deleteItems(p, death, 2, blood, 4);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(25);
                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 770 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.updateHP(hitdmg / 4, true);
                                    sendMsg(p, "The spell hits and you heal yourself.");
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 80 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 141: // Shadow blitz
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 76) {
                                if (hasReq(p, death, 2) && hasReq(p, blood, 2)
                                        && hasReq(p, air, 2) && hasReq(p, soul, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(381, 0);
                                    deleteItems(p, death, 2, blood, 2, air, 2, soul, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(23);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 750 + 3);
                                    giveHPXP(p, hitdmg * 80);

                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 76 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 137: // Smoke Blitz
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 74) {
                                if (hasReq(p, death, 2) && hasReq(p, fire, 2)
                                        && hasReq(p, blood, 2) && hasReq(p, air, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(387, 0);
                                    deleteItems(p, death, 2, fire, 2, blood, 2, air, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(21);

                                    n.appendHit(hitdmg, 4);
                                    magicXp(p, hitdmg * 735 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 74 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 130: // Ice Burst
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 70) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                        && hasReq(p, water, 4)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(363, 1);
                                    deleteItems(p, death, 2, chaos, 4, water, 4);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(20);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 700 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 70 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 134: // Blood Burst
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 68) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                        && hasReq(p, blood, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(376, 0);
                                    deleteItems(p, death, 2, chaos, 4, blood, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(20);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 670 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.updateHP(hitdmg / 4, true);
                                    sendMsg(p, "The spell hits and you heal yourself.");
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 68 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 142: // Shadow Burst
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 64) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                        && hasReq(p, air, 2) && hasReq(p, soul, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(382, 0);
                                    deleteItems(p, death, 2, chaos, 4, air, 2, soul, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(20);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 650 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 64 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 138: // Smoke Burst
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 64) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 4)
                                        && hasReq(p, air, 2) && hasReq(p, fire, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1979);
                                    n.requestGFX(389, 0);
                                    deleteItems(p, death, 2, chaos, 4, air, 2, fire, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(20);

                                    n.appendHit(hitdmg, 2);
                                    magicXp(p, hitdmg * 630 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 62 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 128: // Ice Rush
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 58) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                        && hasReq(p, water, 2)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(361, 50);
                                    deleteItems(p, death, 2, chaos, 2, water, 2);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(18);
                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 630 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 58 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 132: // Blood Rush
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 56) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                        && hasReq(p, blood, 1)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(361, 0);
                                    deleteItems(p, death, 2, chaos, 2, blood, 1);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(16);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 600 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.updateHP(hitdmg / 4, true);
                                    sendMsg(p, "The spell hits and you heal yourself.");
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 56 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 140: // Shadow Rush
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 52) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                        && hasReq(p, air, 1) && hasReq(p, soul, 1)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(379, 0);
                                    deleteItems(p, death, 2, chaos, 2, air, 1, soul, 1);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(15);

                                    n.appendHit(hitdmg, 0);
                                    magicXp(p, hitdmg * 500 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 52 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 136: // Smoke Rush
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 50) {
                                if (hasReq(p, death, 2) && hasReq(p, chaos, 2)
                                        && hasReq(p, air, 1) && hasReq(p, fire, 1)) {
                                    stopMove(p);
                                    p.magicDelay = 3;
                                    anim(p, 1978);
                                    n.requestGFX(385, 0);
                                    deleteItems(p, death, 2, chaos, 2, air, 1, fire, 1);
                                    face(p, n.npcId);
                                    int hitdmg = Misc.random(15);

                                    n.appendHit(hitdmg, 2);
                                    magicXp(p, hitdmg * 400 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                } else {
                                    sendMsg(p,
                                            "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p,
                                        "You need level 50 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    default:
                        Misc.println("Unhandled Ancients button: " + buttonId + ".");
                }
                break;


            case 192: // Modern Magic Spells
                switch (buttonId) {

                    case 129: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 1) {
                                if (hasReq(p, mind, 1) && hasReq(p, air, 1)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 90, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 91, 43, 31, 80, n.npcId);
                                    n.requestGFX(92, 177);
                                    int hitdmg = Misc.random(3);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 40 + 1);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, mind, Engine.playerItems.getItemSlot(p, mind), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 1);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 1 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 132: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 5) {
                                if (hasReq(p, mind, 1) && hasReq(p, air, 1) && hasReq(p, water, 1)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 93, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 94, 43, 31, 80, n.npcId);
                                    n.requestGFX(95, 177);
                                    int hitdmg = Misc.random(4);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 60 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, mind, Engine.playerItems.getItemSlot(p, mind), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 1);
                                    Engine.playerItems.deleteItem(p, water, Engine.playerItems.getItemSlot(p, water), 1);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 5 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 134: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 9) {
                                if (hasReq(p, mind, 1) && hasReq(p, air, 1) && hasReq(p, earth, 2)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 96, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 97, 43, 31, 80, n.npcId);
                                    n.requestGFX(98, 177);
                                    int hitdmg = Misc.random(6);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 90 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, mind, Engine.playerItems.getItemSlot(p, mind), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 1);
                                    Engine.playerItems.deleteItem(p, earth, Engine.playerItems.getItemSlot(p, earth), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 9 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 136: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 13) {
                                if (hasReq(p, mind, 1) && hasReq(p, air, 1) && hasReq(p, fire, 2)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 99, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 100, 43, 31, 80, n.npcId);
                                    n.requestGFX(101, 177);
                                    int hitdmg = Misc.random(8);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 110 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, mind, Engine.playerItems.getItemSlot(p, mind), 1);
                                    Engine.playerItems.deleteItem(p, fire, Engine.playerItems.getItemSlot(p, fire), 2);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 13 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 138: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 17) {
                                if (hasReq(p, chaos, 1) && hasReq(p, air, 2)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 117, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 118, 43, 31, 80, n.npcId);
                                    n.requestGFX(119, 177);
                                    int hitdmg = Misc.random(11);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 150 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, chaos, Engine.playerItems.getItemSlot(p, chaos), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 17 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 142: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 23) {
                                if (hasReq(p, chaos, 1) && hasReq(p, air, 2) && hasReq(p, water, 2)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 120, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 121, 43, 31, 80, n.npcId);
                                    n.requestGFX(122, 177);
                                    int hitdmg = Misc.random(13);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 175 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, chaos, Engine.playerItems.getItemSlot(p, chaos), 1);
                                    Engine.playerItems.deleteItem(p, water, Engine.playerItems.getItemSlot(p, water), 2);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 23 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 145: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 29) {
                                if (hasReq(p, chaos, 1) && hasReq(p, air, 2) && hasReq(p, earth, 3)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 123, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 124, 43, 31, 80, n.npcId);
                                    n.requestGFX(125, 177);
                                    int hitdmg = Misc.random(15);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 200 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, chaos, Engine.playerItems.getItemSlot(p, chaos), 1);
                                    Engine.playerItems.deleteItem(p, earth, Engine.playerItems.getItemSlot(p, earth), 3);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 29 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 148: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 35) {
                                if (hasReq(p, chaos, 1) && hasReq(p, air, 2) && hasReq(p, fire, 3)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 126, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 127, 43, 31, 80, n.npcId);
                                    n.requestGFX(128, 177);
                                    int hitdmg = Misc.random(17);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 300 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, chaos, Engine.playerItems.getItemSlot(p, chaos), 1);
                                    Engine.playerItems.deleteItem(p, fire, Engine.playerItems.getItemSlot(p, fire), 3);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 2);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 35 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;


                    case 152: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 41) {
                                if (hasReq(p, death, 1) && hasReq(p, air, 3)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 132, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 133, 43, 31, 80, n.npcId);
                                    n.requestGFX(134, 177);
                                    int hitdmg = Misc.random(16);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 360 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, death, Engine.playerItems.getItemSlot(p, death), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 41 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 155: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 47) {
                                if (hasReq(p, death, 1) && hasReq(p, air, 3)
                                        && hasReq(p, water, 3)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 135, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 136, 43, 31, 80, n.npcId);
                                    n.requestGFX(137, 177);
                                    int hitdmg = Misc.random(18);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 390 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, death, Engine.playerItems.getItemSlot(p, death), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                    Engine.playerItems.deleteItem(p, water, Engine.playerItems.getItemSlot(p, water), 3);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 47 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 161: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 53) {
                                if (hasReq(p, death, 1) && hasReq(p, air, 3)
                                        && hasReq(p, earth, 4)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 138, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 139, 43, 31, 80, n.npcId);
                                    n.requestGFX(140, 177);
                                    int hitdmg = Misc.random(16);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 420 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, death, Engine.playerItems.getItemSlot(p, death), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                    Engine.playerItems.deleteItem(p, earth, Engine.playerItems.getItemSlot(p, earth), 4);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 53 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 166: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 59) {
                                if (hasReq(p, death, 1) && hasReq(p, air, 3)
                                        && hasReq(p, fire, 5)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 129, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 130, 43, 31, 80, n.npcId);
                                    n.requestGFX(131, 177);
                                    int hitdmg = Misc.random(20);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 500 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, death, Engine.playerItems.getItemSlot(p, death), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                    Engine.playerItems.deleteItem(p, fire, Engine.playerItems.getItemSlot(p, fire), 5);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 59 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 173: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 62) {
                                if (hasReq(p, blood, 1) && hasReq(p, air, 5)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 158, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 159, 43, 31, 80, n.npcId);
                                    n.requestGFX(160, 177);
                                    int hitdmg = Misc.random(22);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 550 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, blood, Engine.playerItems.getItemSlot(p, blood), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 62 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    case 176: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 65) {
                                if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                        && hasReq(p, water, 7)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 161, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 162, 43, 31, 80, n.npcId);
                                    n.requestGFX(163, 177);
                                    int hitdmg = Misc.random(24);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 600 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, blood, Engine.playerItems.getItemSlot(p, blood), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                    Engine.playerItems.deleteItem(p, water, Engine.playerItems.getItemSlot(p, water), 7);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 65 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;
                    case 180: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 70) {
                                if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                        && hasReq(p, earth, 7)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 164, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 165, 43, 31, 80, n.npcId);
                                    n.requestGFX(166, 177);
                                    int hitdmg = Misc.random(26);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 670 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, blood, Engine.playerItems.getItemSlot(p, blood), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 3);
                                    Engine.playerItems.deleteItem(p, earth, Engine.playerItems.getItemSlot(p, earth), 7);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 70 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;
                    case 183: //spells
                        if (p.magicDelay <= 0) {
                            if (MagicLevel(p) >= 75) {
                                if (hasReq(p, blood, 1) && hasReq(p, air, 5)
                                        && hasReq(p, fire, 5)) {
                                    p.stopMovement(p);
                                    face(p, n.npcId);
                                    gfa(p, 155, 100, 711, 0);
                                    cast(p, offsetX, offsetY, 156, 43, 31, 80, n.npcId);
                                    n.requestGFX(157, 177);
                                    int hitdmg = Misc.random(26);
                                    n.appendHit(hitdmg, 0);
                                    giveMagicXP(p, hitdmg * 680 + 3);
                                    giveHPXP(p, hitdmg * 80);
                                    p.combatDelay += p.attackDelay;
                                    p.magicDelay = mainDelayInt;
                                    Engine.playerItems.deleteItem(p, blood, Engine.playerItems.getItemSlot(p, blood), 1);
                                    Engine.playerItems.deleteItem(p, air, Engine.playerItems.getItemSlot(p, air), 5);
                                    Engine.playerItems.deleteItem(p, fire, Engine.playerItems.getItemSlot(p, fire), 7);
                                } else {
                                    sendMsg(p, "You dont have the required runes for this spell.");
                                    p.magicDelay = mainDelayInt;
                                }
                            } else {
                                sendMsg(p, "You need level 75 magic to use this spell.");
                                p.magicDelay = mainDelayInt;
                            }
                        } else {
                            sendMsg(p, "You need to wait before casting a spell again.");
                            p.clickDelay = mainClickDelay;
                        }
                        break;

                    default:
                        Misc.println("[" + p.username + "]: button: " + buttonId);
//Misc.println("["+p.username+"]: npcindex: "+p.attackNPC);
                        break;
                }
        }
    }
} // end off class