package DavidScape.npcs.combat;


import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class NPCPlayerCombat {


    public int DragAttack = Misc.random(1);

    public void attackPlayer(NPC n) {
        Player p = Engine.players[n.attackPlayer];
        if (p == null) {
            return;
        }
        int hitType = Misc.random(5);
        int maxHit = Misc.random(n.maxHit);
        int offsetX = (n.absX - p.absX) * -1;
        int offsetY = (n.absY - p.absY) * -1;

        if (n.attackPlayer <= 0 || n.isDead || p.isDead
                || n.attackPlayer >= Engine.players.length || p == null
                || p.disconnected[1] || !(offsetX > -3 && offsetX < 3) || !(offsetY > -3 && offsetY < 3)) {
            resetAttack(n);
        }
        if (n.combatDelay > 0 || n.attackPlayer <= 0) {
            return;
        }

        if (Misc.getDistance(p.absX, p.absY, n.absX, n.absY) <= 1) {
            n.requestFaceTo(p.playerId + 32768);

            if (n.npcType == 9 || n.npcType == 21 || n.npcType == 20) {
                n.requestAnim(451, 0);
            } else if (n.npcType == 2 || n.npcType == 1) {
                n.requestAnim(422, 0);
            } else if (n.npcType == 742 && DragAttack == 1 || n.npcType == 5363 && DragAttack == 1 || n.npcType == 55 && DragAttack == 1 || n.npcType == 53 && DragAttack == 1 || n.npcType == 941 && DragAttack == 1) {
                n.requestGFX(1, 0);
                n.requestAnim(81, 0);
                DragAttack = Misc.random(1);
                if (p.equipment[5] == 1540 || p.equipment[5] == 11283) {
                    p.frames.sendMessage(p, "Your shield obsorbs some of the dragon fire.");
                    maxHit = Misc.random(5);
                } else {
                    p.frames.sendMessage(p, "Your get hit by the dragon fire.");
                    maxHit = 10 + Misc.random(20);
                }
            } else if (n.npcType == 742 && DragAttack == 0 || n.npcType == 5363 && DragAttack == 0 || n.npcType == 55 && DragAttack == 0 || n.npcType == 53 && DragAttack == 0 || n.npcType == 941 && DragAttack == 0) {
                n.requestAnim(91, 0);
                DragAttack = Misc.random(1);
            } else {
                n.requestAnim(n.attackEmote, 0);
            }

            if (p.prayerIcon == 0) {
                if (p.Hitter > 0) {
                    p.Hitter -= 1;
                    maxHit = 0;
                } else {
                    p.Hitter = 2 + Misc.random(4);
                }
            }

            p.appendHit(maxHit, 0);
            p.requestAnim(424, 0);
            n.combatDelay = n.attackDelay;
            if (p.autoRetaliate == 0 && !p.attackingNPC) {
                p.combatDelay += 3;
                p.requestFaceTo(n.npcId);
                p.attackNPC = n.npcId;
                p.attackingNPC = true;
            }
        }
    }

    public void resetAttack(NPC n) {
        Player p = Engine.players[n.attackPlayer];
        if (n == null) {
            return;
        }
        n.attackingPlayer = false;
        n.attackPlayer = 0;
        // need to cancle the npc facing here, somehow.
    }
}
