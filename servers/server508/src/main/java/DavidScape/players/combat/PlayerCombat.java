package DavidScape.players.combat;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class PlayerCombat {
    int wildLvl(Player p) {
        return (p.absY - 3520) + 1;
    }

    public boolean isInWildRange(Player p) {
        Player p2 = Engine.players[p.attackPlayer];
        if (p.combatLevel > p2.combatLevel) {
            if (p.combatLevel - p2.combatLevel <= wildLvl(p2)) {
                return true;
            }
        } else if (p.combatLevel < p2.combatLevel) {
            if (p2.combatLevel - p.combatLevel <= wildLvl(p2)) {
                return true;
            }
        } else if (p.combatLevel == p2.combatLevel) {
            return true;
        }
        return false;
    }


    public void attackPlayer(Player p) {
        if (p.attackPlayer < 0) {
            return;
        }
        Player p2 = Engine.players[p.attackPlayer];

        if (p2 != null && p != null) {
            int hitDamage = Misc.random(maxMeleeHit(p));
            if (p2.vengOn) {
                p.appendHit((int) ((hitDamage / 4) * 3), 0);
                p2.chatText = "Taste Vengeance!";
                p.chatTextUpdateReq = true;
                p.updateReq = true;
                p2.vengOn = false;
            }
            int hitDamage2 = Misc.random(hitDamage);
            if (p != null & p2 != null) {
                int offsetX = (p.absX - p2.absX) * -1;
                int offsetY = (p.absY - p2.absY) * -1;
                int CombatXPRate = 25;
                if (p.attackPlayer <= 0 || p.isDead
                        || p.attackPlayer >= Engine.players.length
                        || Engine.players[p.attackPlayer] == null
                        || Engine.players[p.attackPlayer].isDead || p2.disconnected[1]) {
                    resetAttack(p);
                }
                if (p.combatDelay > 0) {
                    return;
                }

                if (p.bountyArea() && p.bountyOpp != p2.playerId) {
                    p.frames.sendMessage(p, "This is not your opponent");
                    resetAttack(p);
                    return;
                }
                if (p.AtDuel() && p.DuelPartner != p2.playerId) {
                    p.frames.sendMessage(p, "This is not your opponent");
                    resetAttack(p);
                    return;
                }

                if (p.AtCastleWars() && p.CWTeam == p2.CWTeam) {
                    p.frames.sendMessage(p, "You can't attack your team mate.");
                    resetAttack(p);
                    return;
                }

                if (p.AtPits() && p.GameStarted == false) {
                    p.frames.sendMessage(p, p.PitGame + " till game begins.");
                    resetAttack(p);
                    return;
                }

                if (p.DuelCan == false && p.AtDuel() == true) {
                    p.frames.sendMessage(p, "You cannot fight just yet.");
                    resetAttack(p);
                    return;
                }

                if (p.AtClanField() && p2.Opposing == p.Opposing) {
                    p.frames.sendMessage(p, "This is your team mate.");
                    resetAttack(p);
                    return;
                }
                if (p.AtClanField() && p.ClanTimer > 0) {
                    p.frames.sendMessage(p, "The game has not begun yet.");
                    resetAttack(p);
                    return;
                }
                if (p.AtJail() || p.AtClanLobby()) {
                    p.frames.sendMessage(p, "You cannot attack some one here.");
                    resetAttack(p);
                    return;
                }

                if (!isInWildRange(p) && p.AtDuel() == false && p.AtClanField() == false && p.AtCastleWars() == false && Engine.wildernessArea(p.absX, p.absY) && Engine.wildernessArea(p2.absX, p2.absY)) {
                    p.frames.sendMessage(p, "You need to move deeper into the wilderness to attack this player!");
                    resetAttack(p);
                    return;
                }
                if (p.canAttackPlayer(p)) {
                    p.followPlayer = p2.playerId;
                    p.followingPlayer = true;

                    if (Misc.getDistance(p2.absX, p2.absY, p.absX, p.absY) >= 1
                            && UsingABow(p.equipment[3])) {
                        p.teleportToX = p.absX;
                        p.teleportToY = p.absY;
                        if (p.equipment[3] == 4214) {
                            p.requestAnim(p.attackEmote, 0);
                            p.requestGFX(250, 100);
                            p.combatDelay = p.attackDelay;
                            p.requestGFX(250, 100);
                            p.requestFaceTo(p2.playerId + 32768);
                            p.frames.createGlobalProjectile(p.absY, p.absX, offsetY,
                                    offsetX, 249, 20, 31, 70, p2.playerId);
                            p2.appendHit(Misc.random(30), 0);
                            p2.requestAnim(424, 0);
                            p2.freezeDelay = 10;
                            p2.requestGFX(8, 100);
                        } else if (arrowNot(p.equipment[13])) {

                            if (!p.usingSpecial) {
                                p.requestAnim(p.attackEmote, 0);
                                p.requestGFX(fetchArrowBack(p.equipment[13]), 100);
                                p.frames.createGlobalProjectile(p.absY, p.absX, offsetY,
                                        offsetX, fetchArrowAir(p.equipment[13]), 43, 31,
                                        70, p2.playerId);
                            } else if (p.usingSpecial) {
                                p.usingSpecial = false;
                                p.frames.setConfig(p, 301, 0);
                                p.requestGFX(fetchArrowBack(p.equipment[13]), 100);
                                p.frames.createGlobalProjectile(p.absY, p.absX, offsetY,
                                        offsetX, fetchArrowAir(p.equipment[13]), 43, 31,
                                        70, p2.playerId);
                            }
                            p.combatDelay = p.attackDelay;
                            p.requestFaceTo(p2.playerId + 32768);
                            p.equipmentN[13] -= 1;
                            if (p.equipmentN[13] == 0) {
                                p.equipment[13] = -1;
                                p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                            }
                            if (p2.prayerIcon == 1) {
                                if (p2.Hitter > 0) {
                                    p2.Hitter -= 1;
                                    hitDamage = 0;
                                } else {
                                    p2.Hitter = 2 + Misc.random(4);
                                }
                            }

                            p2.appendHit(hitDamage, 0);
                            if (Engine.items.itemExists(p.equipment[13], p2.absX, p2.absY, p.heightLevel) != -1) {
                                int index = Engine.items.itemExists(p.equipment[13], p2.absX, p2.absY, p.heightLevel);
                                Engine.items.groundItems[index].itemAmt += 1;
                            } else {
                                Engine.items.createGroundItem(p.equipment[13], 1, p2.absX, p2.absY, p.heightLevel, p.username);
                            }
                            //p.equipmentN[13] -= 1;
                            p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                            p2.requestAnim(424, 0);
                            if (p2.autoRetaliate == 0) {
                                p2.requestFaceTo(p.playerId + 32768);
                                p2.attackPlayer = p.playerId;
                                p2.attackingPlayer = true;
                            }
                        } else {
                            p.frames.sendMessage(p,
                                    "You need some arrows to attack a player");
                            resetAttack(p);
                        }
                    } else if (Misc.getDistance(p2.absX, p2.absY, p.absX, p.absY) <= 1
                            && UsingABow(p.equipment[3]) == false) {
                        if (!p.usingSpecial) {
                            p.requestAnim(p.attackEmote, 0);
                        } else if (p.usingSpecial) {
                            p.frames.setConfig(p, 301, 0);
                            if (p.equipment[3] == 7806 && p.specialAmount >= 50) { // Anger Weapons Sword
                                hitDamage = (60 + Misc.random(69));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(19784, 0);
                                p.requestGFX(1222, 0);
                            }
                            if (p.equipment[3] == 7807 && p.specialAmount >= 100) { // Anger Weapons BAxe
                                hitDamage = (60 + Misc.random(69));
                                p.usingSpecial = false;
                                p.specialAmount -= 100;
                                p.requestAnim(1978, 0);
                                p.requestGFX(1222, 0);
                            }
                            if (p.equipment[3] == 7808 && p.specialAmount >= 75) { // Anger Weapons Mace
                                hitDamage = (60 + Misc.random(69));
                                p.usingSpecial = false;
                                p.specialAmount -= 75;
                                p.requestAnim(1978, 0);
                                p.requestGFX(1222, 0);
                            } else if (p.equipment[3] == 11730 && p.specialAmount >= 50) { // Saradomin sword by 1337 pow3r
                                hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.1));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(7072, 0);
                                p.requestGFX(1224, 100);
                            }
                            if (p.equipment[3] == 7809 && p.specialAmount >= 50) { // Anger Weapons Spear
                                hitDamage = (60 + Misc.random(69));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(1978, 0);
                                p.requestGFX(1222, 0);
                            }
                            if (p.equipment[3] == 11694 && p.specialAmount >= 50) { // Armadyl godsword.
                                hitDamage = Misc.random((int) (maxMeleeHit(p) * 1.6));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(7074, 0);
                                p.requestGFX(1222, 0);
                            } else if (p.equipment[3] == 11696 && p.specialAmount == 100) { // Bandos godsword.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.2));
                                p.usingSpecial = false;
                                p.specialAmount -= 100;
                                p.requestAnim(7073, 0);
                                p.requestGFX(1223, 0);
                            } else if (p.equipment[3] == 11698 && p.specialAmount >= 75) { // Saradomin godsword.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.3));
                                p.usingSpecial = false;
                                p.specialAmount -= 75;
                                p.requestAnim(7071, 0);
                                p.requestGFX(1220, 0);
                            } else if (p.equipment[3] == 11700 && p.specialAmount >= 75) { // Zamorak godsword.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.3));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(7070, 0);
                                p.requestGFX(1221, 0);
                            } else if (p.equipment[3] == 4151 && p.specialAmount >= 50) { // Abyssal whip.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.3));
                                p.usingSpecial = false;
                                p.specialAmount -= 50;
                                p.requestAnim(1658, 0);
                                p2.requestGFX(341, 100);
                            } else if (p.equipment[3] == 3101 && p.specialAmount >= 50) { //
                                p.usingSpecial = false;
                                p.secHit = hitDamage / 2;
                                p.thirdHit = p.secHit / 2;
                                if (p.thirdHit != 0) {
                                    p.fourHit = p.thirdHit - 1;
                                } else {
                                    p.fourHit = 0;
                                }
                                p2.appendHit(p.secHit, 0);
                                p2.appendHit(p.thirdHit, 0);
                                p.clawTimer = 1;
                                p.UseClaws = true;
                                p.specialAmount -= 50;
                                p.requestAnim(2068, 0);
                                p.requestGFX(274, 100);
                            } else if (p.equipment[3] == 1305 && p.specialAmount >= 25) { // Dragon longsword.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.0));
                                p.usingSpecial = false;
                                p.specialAmount -= 25;
                                p.requestAnim(1058, 0);
                                p.requestGFX(248, 100);
                                p.requestAnim(1658, 0);
                            } else if (p.equipment[3] == 4587 && p.specialAmount >= 70) { // Dragon scimitar.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.3));
                                p.usingSpecial = false;
                                p.specialAmount -= 70;
                                p.requestAnim(2081, 0);
                                p.requestGFX(347, 100);
                            } else if (p.equipment[3] == 11730 && p.specialAmount >= 10) {// saradomin sword
                                p2.appendHit(Misc.random(20), 0);
                                p.usingSpecial = false;
                                p.specialAmount -= 10;
                                p.requestAnim(7072, 0);
                                p.requestGFX(1224, 100);
                            } else if (p.equipment[3] == 1434 && p.specialAmount >= 40) { // Dragon mace.
                                hitDamage = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.1));
                                p.usingSpecial = false;
                                p.specialAmount -= 40;
                                p.requestAnim(1060, 0);
                                p.requestGFX(251, 100);
                            } else if (p.equipment[3] == 3204 && p.specialAmount >= 100) { // Dragon halberd.
                                hitDamage2 = Misc.random(
                                        (int) (maxMeleeHit(p) * 1.1));
                                p.usingSpecial = false;
                                p.specialAmount -= 100;
                                p.requestAnim(1665, 0);
                                p.requestGFX(282, 100);
                                p2.appendHit(hitDamage2, 0);
                            } else if (p.equipment[3] == 5698 && p.specialAmount >= 25) { // Dragon dagger(s).
                                p.usingSpecial = false;
                                p.specialAmount -= 25;
                                p.requestAnim(1062, 0);
                                p.requestGFX(252, 100);
                                p2.appendHit(Misc.random(42), 0);
                                p.usingSpecial = false;

                            }
                        }
//if (p.FamiliarType == 7344) {
//NPC n = Engine.npcs[p.FamiliarID];
//Player p7 = Engine.players[p.attackPlayer];
//n.attackPlayer = (p.attackPlayer);
//n.attackingPlayer = true;
//p.frames.sendMessage(p, "Your Steel Titan joins the fight!");
//p.frames.sendMessage(p7, "Your opponents Steel Titan joins the fight!");
//}


                        p.combatDelay = p.attackDelay;
                        p.requestFaceTo(p2.playerId + 32768);
                        if (p2.prayerIcon == 0) {
                            if (p2.Hitter > 0) {
                                p2.Hitter -= 1;
                                hitDamage = 0;
                            } else {
                                p2.Hitter = 2 + Misc.random(4);
                            }
                        }
                        p2.appendHit(hitDamage, 0);

                        if (p.attackStyle == 0) { //Accurate
                            p.addSkillXP(4 * hitDamage * CombatXPRate, 0);
                        }
                        if (p.attackStyle == 1) { //Strong
                            p.addSkillXP(4 * hitDamage * CombatXPRate, 2);
                        }
                        if (p.attackStyle == 2) { //Block
                            p.addSkillXP(4 * hitDamage * CombatXPRate, 1);
                        }
                        if (p.attackStyle == 3) { //All around
                            p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 0);
                            p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 1);
                            p.addSkillXP((4 * hitDamage * CombatXPRate) / 3, 2);
                        }
                        p.addSkillXP(3 * hitDamage * CombatXPRate, 3);
                        p2.requestAnim(1659, 0);
                        p.specialAmountUpdateReq = true;
                        if (p2.autoRetaliate == 0) {
                            p2.requestFaceTo(p.playerId + 32768);
                            p2.attackPlayer = p.playerId;
                            p2.attackingPlayer = true;
                        }
                    }
                } else if (!Engine.wildernessArea(p.absX, p.absY)) {
                    //p.frames.sendMessage(p, "You are not in the wild.");
                    resetAttack(p);
                } else if (!Engine.wildernessArea(p2.absX, p2.absY)) {
                    //p.frames.sendMessage(p, "This player is not in the wild.");
                    resetAttack(p);
                } else {
                    resetAttack(p);
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
        if (p.follower != null) {
            p.follower.attackPlayer = 0;
            p.follower.attackingPlayer = false;
            p.follower.followPlayer = p.playerId;
        }
        p.attackingPlayer = false;
        if (p.faceToReq != 65535) {
            p.requestFaceTo(65535);
        }
    }
}
