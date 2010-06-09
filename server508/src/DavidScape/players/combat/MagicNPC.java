/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DavidScape.players.combat;

import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.players.items.ReqItems;
import DavidScape.util.Misc;

/**
 * @author Gravediggah
 */
public class MagicNPC {

    private Player p;
    public boolean autoCasting = false;
    public int autoCastSpell = -1;
    public int autoCastNpc = -1;
    public boolean canCast = true;
    public static int magicXpRate = 5;
    public static int magicId = 6;
    public static int magicDelay = 3;
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

    /**
     * Construct an instance of MagicNPC for a player
     *
     * @param p The player using this instance
     */
    public MagicNPC(Player p) {
        this.p = p;
    }

    /**
     * Resets magic attacking
     */
    public void resetMagic() {
        canCast = false;
        p.magicDelay = 3;
    }

    /**
     * Handles attacking while autocasting
     *
     * @param npcId The position of the NPC in Engine.npcs[].
     */
    public void attackNPC(int npcId) {
        if (autoCasting && canCast) {
            if (hasStaff()) {
                autoCastNpc = npcId;
                castSpell(npcId, autoCastSpell);
            } else {
                autoCasting = false;
            }
        }
    }

    /**
     * Handles using magic spells on NPCs
     *
     * @param npcId   The position of the NPC in Engine.npcs[].
     * @param spellId The spell id as button from interface
     */
    public void magicOnNPC(int npcId, int spellId) {
        if (canCast) {
            castSpell(npcId, getSpellId(spellId));
        }
    }

    /**
     * Handles the process of casting a spell
     *
     * @param npcId     The position of the NPC in Engine.npcs[].
     * @param spellList The spell id, as returned by getSpellId()
     */
    public void castSpell(int npcId, int spellList) {

        if (npcById(npcId) != null) { //Npc exists
            if (!npcById(npcId).isDead) { // Npc is not dead
                if (spellList > -1) { //Valid Spell
                    if (p.getLevelForXP(magicId) >=
                            getLevelForSpell(spellList)) { //Player has required level
                        if (getRunes(spellList).playerHasReq(p)) { //Player has required runes
                            p.stopMovement(p); //Stop moving
                            getRunes(spellList).deleteItems(p); //Delete required runes
                            int spellDamage = getDamage(spellList); //Damage done by this attack
                            //doGfx(npcId, spellList); //Graphics+projectiles
                            npcById(npcId).appendHit(spellDamage, 0); //Append damage to NPC
                            p.attackingNPC = true;
                            p.attackNPC = npcId;
                            npcById(npcId).attackPlayer = p.playerId;
                            npcById(npcId).attackingPlayer = true;
                            npcById(npcId).followPlayer = Engine.getIdFromName(p.username);
                            npcById(npcId).appendPlayerFollowing(p, npcById(npcId));
                            p.addSkillXP(getExpByHit(spellList, spellDamage), magicId); //Give player experience
                            resetMagic();
                        } else {
                            autoCasting = false;
                        }
                    }
                }
            }
        }
    }

    /**
     * Handles the gfx for both Player and Npc
     *
     * @param npcId   The position of the NPC in Engine.npcs[]
     * @param spellId The spell id, as returned by getSpellId()
     */
    public void doGfx(int npcId, int spellId) {
        if (npcById(npcId) != null) {
            p.requestFaceTo(npcId); //Turn face to target
            p.stopMovement(p); //Stop movement for caster
            p.requestAnim(711, 0); //Caster animation
            p.requestGFX(getPlayerGFX(spellId), 100); //Caster gfx
            npcById(npcId).requestGFX(getNpcGFX(spellId), 177); //Victim gfx
        }
    }

    /**
     * Retrieves an NPC from Engine.npcs[]
     *
     * @param id The position of the NPC in Engine.npcs[]
     * @return Returns an instance of NPC, directly from Engine.npcs[]
     */
    public NPC npcById(int id) {
        if (Engine.npcs[id] != null) {
            return Engine.npcs[id];
        } else {
            return null;
        }
    }

    /**
     * Retrieves the type of an NPC
     *
     * @param id The position of the NPC in Engine.npcs[]
     * @return Returns the NPC type for this NPC
     */
    public int getNpcType(int id) {
        if (Engine.npcs[id] != null) {
            return Engine.npcs[id].npcType;
        } else {
            return -1;
        }
    }

    /**
     * Retrieves the id of a spell
     *
     * @param id The button used for this spell
     * @return Returns the id id of a spell
     */
    public int getSpellId(int id) {
        switch (id) {
            case 129: //wind strike
                return 1;
            case 132: //water strike
                return 2;
            case 134: //earth strike
                return 3;
            case 136: //fire strike
                return 4;
            case 138: //wind bolt
                return 5;
            case 142: //water bolt
                return 6;
            case 145: //earth bolt
                return 7;
            case 148: //fire bolt
                return 8;
            case 152: //wind blast
                return 9;
            case 155: //water blast
                return 10;
            case 161: //earth blast
                return 11;
            case 166: //fire blast
                return 12;
            case 173: //wind wave
                return 13;
            case 176: //water wave
                return 14;
            case 180: //earth wave
                return 15;
            case 183: //fire wave
                return 16;
        }
        return -1;
    }

    /**
     * Retrieves the required GFX for the caster
     *
     * @param id The id of the spell
     * @return Returns the Caster-side Gfx for this spell
     */
    public int getPlayerGFX(int id) {
        switch (id) {
            case 1:
                return 90;
            case 2:
                return 93;
            case 3:
                return 96;
            case 4:
                return 99;
            case 5:
                return 117;
            case 6:
                return 120;
            case 7:
                return 123;
            case 8:
                return 126;
            case 9:
                return 132;
            case 10:
                return 135;
            case 11:
                return 138;
            case 12:
                return 129;
            case 13:
                return 158;
            case 14:
                return 161;
            case 15:
                return 164;
            case 16:
                return 155;
        }

        return -1;
    }

    /**
     * Retrieves the required Magic level for a spell
     *
     * @param id The id of the spell
     * @return Returns the required Magic level for this spell
     */
    public int getLevelForSpell(int id) {
        switch (id) {
            case 1:
                return 1;
            case 2:
                return 5;
            case 3:
                return 9;
            case 4:
                return 13;
            case 5:
                return 17;
            case 6:
                return 23;
            case 7:
                return 29;
            case 8:
                return 35;
            case 9:
                return 41;
            case 10:
                return 47;
            case 11:
                return 53;
            case 12:
                return 59;
            case 13:
                return 62;
            case 14:
                return 65;
            case 15:
                return 70;
            case 16:
                return 75;
        }

        return -1;
    }

    /**
     * Retrieves the base Experience for a spell
     *
     * @param id The id of the spell
     * @return Returns the base Experience for this spell
     */
    public double getExpForSpell(int id) {
        switch (id) {
            case 1:
                return 25;
            case 2:
                return 35;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 110;
            case 6:
                return 140;
            case 7:
                return 170;
            case 8:
                return 200;
            case 9:
                return 215;
            case 10:
                return 220;
            case 11:
                return 235;
            case 12:
                return 250;
            case 13:
                return 350;
            case 14:
                return 360;
            case 15:
                return 380;
            case 16:
                return 450;
        }

        return -1.0;
    }

    /**
     * Retrieves the final Experience for a spell
     *
     * @param id  The id of the spell
     * @param hit The damage done
     * @return Returns the final Experience for this attack
     */
    public double getExpByHit(int id, int hit) {
        return (getExpForSpell(id) + hit) * magicXpRate;
    }

    /**
     * Retrieves the damage done by a spell
     *
     * @param id The id of the spell
     * @return Returns the calculated damage for an attack
     */
    public int getDamage(int id) {
        return Misc.random(getMaxHit(id) + getBonusDamage());
    }

    /**
     * Retrieves the damage by equipment bonus
     *
     * @return Returns the damage for Magic bonus
     */
    public int getBonusDamage() {
        double c = (double) p.skillLvl[magicId];
        double d = (double) p.equipmentBonus[3];
        double f = 0;
        double h = 0;

        f = (d * 0.00175) + 0.1;
        h = Math.floor(c * f + 1.06) / 4;
        return (int) h;
    }

    /**
     * Retrieves the max hit for the spell
     *
     * @param id The id of the spell
     * @return Returns the max hit of a spell
     */
    public int getMaxHit(int id) {
        int maxHit = 0;
        for (int i = 1; i <= id; i++) {
            if (i <= 4) {
                maxHit += 2;
            } else {
                maxHit += 1;
            }
        }
        return maxHit;
    }

    /**
     * Retrieves the required GFX for the victim
     *
     * @param id The id of the spell
     * @return Returns the Victim-side Gfx for this spell
     */
    public int getNpcGFX(int id) {
        return getPlayerGFX(id) + 2;
    }

    /**
     * Retrieves the required runes for the spell
     *
     * @param id The id of the spell
     * @return Returns the item requirements for this spell
     */
    public ReqItems getRunes(int id) {
        ReqItems r = new ReqItems();
        switch (id) {
            case 1: // wind strike
                r.addReq(air, 1);
                r.addReq(mind, 1);
                break;
            case 2:
                r.addReq(water, 1);
                r.addReq(air, 1);
                r.addReq(mind, 1);
                break;
            case 3:
                r.addReq(earth, 2);
                r.addReq(air, 1);
                r.addReq(mind, 1);
                break;
            case 4:
                r.addReq(fire, 3);
                r.addReq(air, 2);
                r.addReq(mind, 1);
                break;
            case 5: // wind bolt
                r.addReq(air, 2);
                r.addReq(chaos, 1);
                break;
            case 6:
                r.addReq(water, 2);
                r.addReq(air, 2);
                r.addReq(chaos, 1);
                break;
            case 7:
                r.addReq(earth, 3);
                r.addReq(air, 2);
                r.addReq(chaos, 1);
                break;
            case 8:
                r.addReq(fire, 4);
                r.addReq(air, 3);
                r.addReq(chaos, 1);
                break;
            case 9: // wind blast
                r.addReq(air, 3);
                r.addReq(death, 1);
                break;
            case 10:
                r.addReq(water, 3);
                r.addReq(air, 3);
                r.addReq(death, 1);
                break;
            case 11:
                r.addReq(earth, 4);
                r.addReq(air, 3);
                r.addReq(death, 1);
                break;
            case 12:
                r.addReq(fire, 5);
                r.addReq(air, 4);
                r.addReq(death, 1);
                break;
            case 13: // wind wave
                r.addReq(air, 5);
                r.addReq(blood, 1);
                break;
            case 14:
                r.addReq(water, 7);
                r.addReq(air, 5);
                r.addReq(blood, 1);
                break;
            case 15:
                r.addReq(earth, 7);
                r.addReq(air, 5);
                r.addReq(blood, 1);
                break;
            case 16:
                r.addReq(fire, 7);
                r.addReq(air, 5);
                r.addReq(blood, 1);
                break;
        }

        return checkStaff(r);
    }

    /**
     * Updates the required Runes for Elemental Staffs
     *
     * @param r The required runes list.
     * @return Returns the updated required items.
     */
    public ReqItems checkStaff(ReqItems r) {
        switch (p.equipment[3]) {
            case 1381: // Staff of Air
                r.removeReq(air);
                break;
            case 1383: // Staff of Water
                r.removeReq(water);
                break;
            case 1385: // Staff of Earth
                r.removeReq(earth);
                break;
            case 1387: // Staff of Fire
                r.removeReq(fire);
                break;
        }
        return r;
    }

    /**
     * Checks if player is wearing a staff
     *
     * @return True: wearing staff, False: Not wearing staff
     */
    public boolean hasStaff() {
        switch (p.equipment[3]) {
            case 1379: // Regular Staff
            case 1381: // Staff of Air
            case 1383: // Staff of Water
            case 1385: // Staff of Earth
            case 1387: // Staff of Fire
                return true;
        }
        return false;
    }
}