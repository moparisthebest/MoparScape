package com.rs2hd.model;

import com.rs2hd.content.LevelUp;

/**
 * Manages the player's skills.
 * @author Graham
 *
 */
public class Skills {
	
	public static final int SKILL_COUNT = 24;
	
	private transient Player player;
	
	public static final double MAXIMUM_EXP = 200000000;
	
	private int level[] = new int[SKILL_COUNT];
	private double xp[] = new double[SKILL_COUNT];

	public static final String[] SKILL_NAME = {
		"Attack", "Defence", "Strength", "Hitpoints", "Range", "Prayer",
		"Magic", "Cooking", "Woodcutting",  "Fletching", "Fishing", "Firemaking",
		"Crafting", "Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer",
		"Farming", "Runecrafting", "Construction", "Hunter", "Summoning",
	};
	
	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2, HITPOINTS = 3, RANGE = 4, PRAYER = 5,
		MAGIC = 6, COOKING = 7, WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11,
		CRAFTING = 12, SMITHING = 13, MINING = 14, HERBLORE = 15, AGILITY = 16, THIEVING = 17, SLAYER = 18,
		FARMING = 19, RUNECRAFTING = 20, CONSTRUCTION = 21, HUNTER = 22, SUMMONING = 23;
	
	public Skills() {
		for(int i = 0; i < SKILL_COUNT; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
	}
	
	public void hit(int hitDiff) {
		level[3] -= hitDiff;
		if(level[3] < 0) {
			level[3] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}
	
	public void heal(int hitDiff) {
		level[3] += hitDiff;
		int max = getLevelForXp(3);
		if(level[3] > max) {
			level[3] = max;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}
	
	public void reset() {
		for(int i = 0; i < SKILL_COUNT; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}
	
	public void forceReset() {
		for(int i = 0; i < SKILL_COUNT; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		player.getActionSender().sendSkillLevels();
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}
	
	public int getCombatLevel() {
		int attack = getLevelForXp(0);
		int defence = getLevelForXp(1);
		int strength = getLevelForXp(2);
		int hp = getLevelForXp(3);
		int prayer = getLevelForXp(5);
		int ranged = getLevelForXp(4);
		int magic = getLevelForXp(6);
		int combatLevel = 3;
		combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25) + 1; 
		double melee = (attack + strength) * 0.325; 
		double ranger = Math.floor(ranged * 1.5) * 0.325; 
		double mage = Math.floor(magic * 1.5) * 0.325; 
		if (melee >= ranger && melee >= mage) {
			combatLevel += melee;
		} else if (ranger >= melee && ranger >= mage) {
			combatLevel += ranger;
		} else if (mage >= melee && mage >= ranger) {
			combatLevel += mage;
		}
		int summoning = getLevelForXp(Skills.SUMMONING);
		summoning /= 8;
		return combatLevel + summoning;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public int getLevel(int skill) {
		return level[skill];
	}
	
	public double getXp(int skill) {
		return xp[skill];
	}
	
	public int getLevelForXp(int skill) {
		double exp = xp[skill];
		int points = 0;
		int output = 0;
		for(int lvl = 1; lvl < 100; lvl++) {
			points += Math.floor((double)lvl + 300.0 * Math.pow(2.0, (double)lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if((output - 1) >= exp) {
				return lvl;
			}
		}
		return 99;
	}
	
	public void addXp(int skill, double exp) {
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		if(xp[skill] > MAXIMUM_EXP) {
			xp[skill] = MAXIMUM_EXP;
		}
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if(newLevel > oldLevel) {
			level[skill] += levelDiff;
			LevelUp.levelUp(player, skill);
		}
		player.getActionSender().sendSkillLevel(skill);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}

	public void set(int skill, int val) {
		level[skill] = val;
		player.getActionSender().sendSkillLevel(skill);
		player.getUpdateFlags().setAppearanceUpdateRequired(true);
	}

}
