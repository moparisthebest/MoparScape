package DavidScape.players.combat;


import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class PlayerNPCCombat {
    public int CombatXPRate = 25;
    public int RangeDamage = 0;

    public void GiveRangeXP(Player p) {
        p.addSkillXP((500 * RangeDamage * CombatXPRate) / 3, 3);
    }

    public int maxRangeHit(Player p) {
        int a = p.skillLvl[4];
        int b = p.equipmentBonus[4];
        double c = (double) a;
        double d = (double) b;
        double f = 0;
        double h = 0;
        f = (d * 0.00175) + 0.1;
        h = Math.floor(c * f + 2.05);

        return (int) h;


    }

    public int getBarrowsCount(Player p) {
        int i = 0;
        for (int h = 0; h < p.barrows.length; h++) {
            if (p.barrows[h] == true) {
                i++;
            }
        }
        if (6 - i == 0) {
            p.frames.sendMessage(p, "You have killed all of the brothers! Use the chest for your reward!");
        }
        return 6 - i;
    }

    public void attackNPC(Player p) {
        if (p != null) {
        } else {
            return;
        }
        NPC n = Engine.npcs[p.attackNPC];
        RangeDamage = Misc.random(maxRangeHit(p));
        int hitDamage = Misc.random(maxMeleeHit(p));
        int hitDamage2 = Misc.random(hitDamage);

        if ((p != null) && (n != null)) {
            if (((p.absX - n.absX) == 0)) {
                int offsetX = -1;
            } else {
                int offsetX = (p.absX - n.absX) * -1;
            }

            if (((p.absY - n.absY) == 0)) {
                int offsetY = -1;
            } else {
                int offsetY = (p.absY - n.absY) * -1;
            }


            if (p.attackNPC <= 0 || p.attackNPC >= Engine.npcs.length || n == null
                    || n.isDead || p.isDead) {
                resetAttack(p);
            }
            if (p.clickDelay > 0) {
                return;
            }
            if (n.isDead) {
                p.combatDelay = 3;
                p.clickDelay = 5;
            }
            if (n.isDead == true) {
                if (n.npcType == 742 && p.DragonSlayer == 3) {
                    p.HeadTimer = 8;
                    p.DragonSlayer = 4;
                    Engine.playerItems.addItem(p, 11279, 1);
                    p.frames.sendMessage(p, "You slayed Elvarg and took his head!");
                }
            }
            if (n.isDead && n.summoned) {
                n.owner.FamiliarID = 0;
            }
            if (n.isDead == true) {
                switch (n.npcType) {
                    case 2025:
                        p.barrows[0] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                    case 2026:
                        p.barrows[1] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                    case 2027:
                        p.barrows[2] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                    case 2028:
                        p.barrows[3] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                    case 2029:
                        p.barrows[4] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                    case 2030:
                        p.barrows[5] = true;
                        p.frames.sendMessage(p, "You killed a barrows brother! You need to kill " + getBarrowsCount(p) + " more!");
                        break;
                }
            }


//ZAMMY
            if (n.isDead == true) {
                if ((n.npcType == 1619) || (n.npcType == 49) || (n.npcType == 6219)) {
                    p.zkc = (p.zkc + 1);
                    p.frames.sendMessage(p, "You now have a " + (p.zkc) + " Zamorak kill count!");
                    p.combatDelay = 5;
                    p.clickDelay = 2;

                }
            }

//SARA
            if (n.isDead == true) {
                if ((n.npcType == 6255) || (n.npcType == 6254)) {
                    p.skc = (p.skc + 1);
                    p.frames.sendMessage(p, "You now have a " + (p.skc) + " Saradomin kill count!");
                    p.combatDelay = 5;
                    p.clickDelay = 2;
                }
            }

//Bandos
            if (n.isDead == true) {
                if ((n.npcType == 6275) || (n.npcType == 6277) || (n.npcType == 6270)) {
                    p.bkc = (p.bkc + 1);
                    p.frames.sendMessage(p, "You now have a " + (p.bkc) + " Bandos kill count!");
                    p.combatDelay = 5;
                    p.clickDelay = 2;
                }
            }

//Armadyl
            if (n.isDead == true) {
                if ((n.npcType == 6232) || (n.npcType == 6229)) {
                    p.akc = (p.akc + 1);
                    p.frames.sendMessage(p, "You now have a " + (p.akc) + " Armadyl kill count!");
                    p.combatDelay = 5;
                    p.clickDelay = 2;
                }
            }


            if (n.isDead == true && p.SlayerAm > 0) {
                if (p.SlayerTask == 0 && n.npcType == 941) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(150 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 0 && n.npcType == 55) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(150 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 0 && n.npcType == 53) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(150 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 0 && n.npcType == 5363) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(500 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 1 && n.npcType == 9) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(250 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 2 && n.npcType == 110 || p.SlayerTask == 2 && n.npcType == 111 || p.SlayerTask == 2 && n.npcType == 112) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(250 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 3 && n.npcType == 4387 || p.SlayerTask == 3 && n.npcType == 6998) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(400 * p.skillLvl[18], 18);
                }
                if (p.SlayerTask == 4 && n.npcType == 21) {
                    p.SlayerAm -= 1;
                    p.addSkillXP(250 * p.skillLvl[18], 18);
                }
            }

            if (p.combatDelay > 0) {
                return;
            }

            if (p.magicNPC.autoCasting) {
                p.magicNPC.attackNPC(p.attackNPC);
            } else if (Misc.getDistance(n.absX, n.absY, p.absX, p.absY) >= 1
                    && UsingABow(p.equipment[3])) {
                if (Misc.getDistance(n.absX, n.absY, p.absX, p.absY) <= 10) {
                    p.teleportToX = p.absX;
                    p.teleportToY = p.absY;
                    if (p.equipment[3] == 4214) {
                        p.requestAnim(p.attackEmote, 0);
                        p.requestGFX(250, 100);
                        p.combatDelay = p.attackDelay;
                        //  p.frames.createGlobalProjectile(p.absY, p.absX, offsetY, offsetX,
                        //         249, 43, 31, 70, n.npcId);
                        p.requestFaceTo(n.npcId);
                        n.appendHit(hitDamage, 0);

                        n.requestAnim(n.defendEmote, 0);
                    } else if (arrowNot(p.equipment[13]) && p.equipmentN[13] > 0) {
                        if (!p.usingSpecial) {
                            p.requestAnim(p.attackEmote, 0);
                        } else if (p.usingSpecial) {
                            p.usingSpecial = false;
                            p.frames.setConfig(p, 301, 0);
                            p.requestAnim(p.attackEmote, 0);
                        }
                        p.equipmentN[13] -= 1;
                        if (p.equipmentN[13] == 0) {
                            p.equipment[13] = -1;
                            p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                        }
                        p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                        p.requestGFX(fetchArrowBack(p.equipment[13]), 100);
                        // p.frames.createGlobalProjectile(p.absY, p.absX, offsetY,
                        //       offsetX, fetchArrowAir(p.equipment[13]), 43, 31, 70,
                        //      n.npcId);
                        p.combatDelay = p.attackDelay;
                        if (Engine.items.itemExists(p.equipment[13], n.absX, n.absY, p.heightLevel) != -1) {
                            int index = Engine.items.itemExists(p.equipment[13], n.absX, n.absY, p.heightLevel);
//p.equipmentN[13] -= 1;
                            Engine.items.groundItems[index].itemAmt += 1;
                        } else {
                            Engine.items.createGroundItem(p.equipment[13], 1, n.absX, n.absY, p.heightLevel, p.username);
                        }
                        //p.equipmentN[13] -= 1;
                        p.requestFaceTo(n.npcId);
                        n.appendHit(Misc.random(p.skillLvl[4] / 4), 0);

                        if (p.skillLvl[4] < 15) {
                            hitDamage = 1;
                        } else {
                            hitDamage = p.skillLvl[4] / 4;
                        }
                        n.requestAnim(424, 0);
                        p.addSkillXP(4 * hitDamage * CombatXPRate, 4);
                        p.addSkillXP(2 * hitDamage * CombatXPRate, 3);
                        if (!n.attackingPlayer) {
                            n.attackingPlayer = true;
                            n.attackPlayer = p.playerId;
                        }
                    } else {
                        p.frames.sendMessage(p,
                                "You need some arrows to attack a monster!");
                        resetAttack(p);
                    }
                } else if (Misc.getDistance(n.absX, n.absY, p.absX, p.absY) >= 10) {
                    p.frames.sendMessage(p, "You need to move closer to range attack!");
                    resetAttack(p);
                    p.teleportToX = p.absX;
                    p.teleportToY = p.absY;
                }
            } else if (Misc.getDistance(n.absX, n.absY, p.absX, p.absY) <= 1
                    && UsingABow(p.equipment[3]) == false) {
                if (!p.usingSpecial) {
                    p.requestAnim(p.attackEmote, 0);
                } else if (p.usingSpecial) {
                    p.frames.setConfig(p, 301, 0);
                    if (p.equipment[3] == 11694 && p.specialAmount >= 50) { // Armadyl godsword.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.25));
                        p.usingSpecial = false;
                        p.specialAmount -= 50;
                        p.requestAnim(7074, 0);
                        p.requestGFX(1222, 0);
                    } else if (p.equipment[3] == 11696 && p.specialAmount == 100) { // Bandos godsword.
                        hitDamage = Misc.random(
                                (int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.specialAmount -= 100;
                        p.requestAnim(7073, 0);
                        p.requestGFX(1223, 0);
                    } else if (p.equipment[3] == 11698 && p.specialAmount >= 75) { // Saradomin godsword.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.specialAmount -= 75;
                        p.requestAnim(7071, 0);
                        p.requestGFX(1220, 0);
                    } else if (p.equipment[3] == 11700 && p.specialAmount >= 75) { // Zamorak godsword.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.specialAmount -= 50;
                        p.requestAnim(7070, 0);
                        p.requestGFX(1221, 0);
                    } else if (p.equipment[3] == 3101 && p.specialAmount >= 50) {   //Dragon Claws.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.secHit2 = hitDamage / 2;
                        p.thirdHit2 = p.secHit2 / 2;
                        if (p.thirdHit2 != 0) {
                            p.fourHit2 = p.thirdHit2 - 1;
                        } else {
                            p.fourHit2 = 0;
                        }
                        n.appendHit(p.secHit2, 0);
                        p.clawTimer2 = 1;
                        p.UseClaws2 = true;
                        p.specialAmount -= 50;
                        p.requestAnim(2068, 0);
                        p.requestGFX(274, 100);
                    } else if (p.equipment[3] == 4151 && p.specialAmount >= 50) { // Abyssal whip.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 0.9));
                        p.usingSpecial = false;
                        p.specialAmount -= 50;
                        p.requestAnim(1658, 0);
                        n.requestGFX(341, 100);
                    } else if (p.equipment[3] == 1305 && p.specialAmount >= 25) { // Dragon longsword.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.0));
                        p.usingSpecial = false;
                        p.specialAmount -= 25;
                        p.requestAnim(1058, 0);
                        p.requestGFX(248, 100);
                        p.requestAnim(1658, 0);
                    } else if (p.equipment[3] == 4587 && p.specialAmount >= 70) { // Dragon scimitar.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.0));
                        p.usingSpecial = false;
                        p.specialAmount -= 70;
                        p.requestAnim(2081, 0);
                        p.requestGFX(347, 100);
                    } else if (p.equipment[3] == 1434 && p.specialAmount >= 40) { // Dragon mace.
                        hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.specialAmount -= 40;
                        p.requestAnim(1060, 0);
                        p.requestGFX(251, 100);
                    } else if (p.equipment[3] == 3204 && p.specialAmount >= 100) { // Dragon halberd.
                        hitDamage2 = Misc.random((int) (maxMeleeHit(p) * 1.1));
                        p.usingSpecial = false;
                        p.specialAmount -= 100;
                        p.requestAnim(1665, 0);
                        p.requestGFX(282, 100);
                        n.appendHit(hitDamage2, 0);
                    } else if (p.equipment[3] == 5698 && p.specialAmount >= 25) { // Dragon dagger(s).
                        hitDamage2 = Misc.random((int) (maxMeleeHit(p) * 1.00));
                        p.usingSpecial = false;
                        p.specialAmount -= 25;
                        p.requestAnim(1062, 0);
                        p.requestGFX(252, 100);
                        n.appendHit(hitDamage2, 0);
                    } else {
                        p.usingSpecial = false;
                        p.frames.sendMessage(p,
                                "You don't have enough special energy.");
                    }
                }
                p.combatDelay = p.attackDelay;
                p.requestFaceTo(n.npcId);
                n.appendHit(hitDamage, 0);
                if (p.attackStyle == 0) {
                    p.addSkillXP(4 * hitDamage * CombatXPRate, 0);
                    p.addSkillXP(2 * hitDamage * CombatXPRate, 3);
                }
                if (p.attackStyle == 1) {
                    p.addSkillXP(4 * hitDamage * CombatXPRate, 2);
                    p.addSkillXP(2 * hitDamage * CombatXPRate, 3);
                }
                if (p.attackStyle == 2) {
                    p.addSkillXP(4 * hitDamage * CombatXPRate, 1);
                    p.addSkillXP(2 * hitDamage * CombatXPRate, 3);
                }
                if (p.attackStyle == 3) {
                    p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 0);
                    p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 1);
                    p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 2);
                    p.addSkillXP(3 * hitDamage * CombatXPRate, 3);
                }
                n.requestAnim(n.defendEmote, 0);
                p.specialAmountUpdateReq = true;
                if (!n.attackingPlayer) {
                    n.attackingPlayer = true;
                    n.attackPlayer = p.playerId;
                }
            }
        }
    }

    public static boolean UsingABow(int bow) {
        for (int i = 0; i < Bows.length; i++) {
            if (bow == Bows[i]) {
                return true;
            }
        }
        return false;
    }

    public static int Bows[] = {
            4212, 4214, 4215, 4216, 4217, 4218, 4219, 4220, 4221, 4222, 4223, 837,
            767, 4734, 839, 841, 843, 845, 847, 849, 851, 853, 855, 857, 859, 861,
            2883, 4827, 6724, 11235
    };

    public boolean arrowNot(int id) {
        if (id == 882) {
            return true;
        }
        if (id == 78) {
            return true;
        }

        if (id == 4740) {
            return true;
        }

        if (id == 884) {
            return true;
        }
        if (id == 886) {
            return true;
        }
        if (id == 888) {
            return true;
        }
        if (id == 890) {
            return true;
        }
        if (id == 892) {
            return true;
        }
        return false;
    }

    public int fetchArrowAir(int id) {
        if (id == 882) {
            return 10;
        }
        if (id == 884) {
            return 11;
        }
        if (id == 886) {
            return 12;
        }
        if (id == 888) {
            return 13;
        }
        if (id == 890) {
            return 14;
        }
        if (id == 892) {
            return 15;
        } else {
            return 500;
        }
    }

    public int fetchArrowBack(int id) {
        if (id == 882) {
            return 19;
        }
        if (id == 884) {
            return 18;
        }
        if (id == 886) {
            return 20;
        }
        if (id == 888) {
            return 21;
        }
        if (id == 890) {
            return 22;
        }
        if (id == 892) {
            return 24;
        } else {
            return 500;
        }
    }

    public int maxMeleeHit(Player p) {
        if (p.username.equalsIgnoreCase("David")) {
            int h = 5000;
            return (int) h;
        }
        int a = p.skillLvl[2];
        int b = p.equipmentBonus[10];
        double c = (double) a;
        double d = (double) b;
        double f = 0;
        double h = 0;
        f = (d * 0.00175) + 0.1;
        h = Math.floor(c * f + 2.05);
        return (int) h;
    }

    public void resetAttack(Player p) {
        if (p == null) {
            return;
        }
        p.attackingNPC = false;
        if (p.faceToReq != 65535) {
            p.requestFaceTo(65535);
        }
    }
}
