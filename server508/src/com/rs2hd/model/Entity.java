package com.rs2hd.model;

import java.util.HashMap;
import java.util.Map;

import com.rs2hd.content.Combat.CombatType;

/**
 * An 'entity' in the game world.
 * @author Graham
 *
 */
public abstract class Entity {
	
	public static final Location DEFAULT_LOCATION = Location.location(3200, 3200, 0);
	private Location location;
	private transient int index;
	private transient Location teleportTo;
	private transient Hits hits;
	private transient Animation lastAnimation;
	private transient Graphics lastGraphics;
	private transient Entity interactingWith;
	private transient boolean attacking;
	private transient int combatTurns;
	private transient boolean dead;
	private transient boolean hidden;
	private transient Map<Entity, Integer> killers;
	private transient boolean isAggressor;
	private transient int attackStyle;
	
	public abstract boolean isAutoRetaliating();
	
	public void addKillerHit(Entity killer, int hit) {
		if(!killers.containsKey(killer)) {
			killers.put(killer, hit);
		} else {
			killers.put(killer, killers.get(killer)+hit);
		}
		if(killer instanceof Player) {
			Player p = (Player) killer;
			CombatType type = p.getCombatType();
			int fightType = p.getAttackStyle();
			if(type == CombatType.MELEE) {
				if(fightType != 3) {
					int skill = 0;
					if(fightType == 1) {
						skill = 0;
					} else if(fightType == 4) {
						skill = 1;
					} else if(fightType == 2) {
						skill = 2;
					} else {
						return; // should not happen
					}
					double exp = (double) (0.8 * hit), hpExp = (double) (0.25 * hit);
					p.getSkills().addXp(skill, exp);
					p.getSkills().addXp(Skills.HITPOINTS, hpExp);
				} else {
					double exp = (double) (0.4 * hit), hpExp = (double) (0.25 * hit);
					p.getSkills().addXp(Skills.ATTACK, exp);
					p.getSkills().addXp(Skills.DEFENCE, exp);
					p.getSkills().addXp(Skills.STRENGTH, exp);
					p.getSkills().addXp(Skills.HITPOINTS, hpExp);
				}
			} else {
				if(fightType == 1 || fightType == 2) {
					p.getSkills().addXp(Skills.RANGE, (10D * (double) hit));
				} else if(fightType == 3) {
					p.getSkills().addXp(Skills.RANGE, (10D * (double) hit)/2D);
					p.getSkills().addXp(Skills.DEFENCE, (10D * (double) hit)/2D);
				}
				p.getSkills().addXp(Skills.HITPOINTS, (10D * (double) hit)/3D);
			}
		}
	}
	
	public void clearKillersHits() {
		killers.clear();
	}
	
	public Entity getKiller() {
		Entity highestHitter = null;
		int highestHit       = -1;
		for(Map.Entry<Entity, Integer> entry : killers.entrySet()) {
			if(entry.getValue() == highestHit) {
				if(entry.getKey() == this.getInteractingWith()) {
					highestHitter = this.getInteractingWith();
				}
			} else if(entry.getValue() > highestHit) {
				highestHitter = entry.getKey();
			}
		}
		return highestHitter;
	}
	
	public Entity() {
		this.location = DEFAULT_LOCATION;
	}
	
	public Object readResolve() {
		hits = new Hits();
		lastAnimation = null;
		lastGraphics = null;
		teleportTo = null;
		interactingWith = null;
		attacking = false;
		combatTurns = 0;
		dead = false;
		hidden = false;
		killers = new HashMap<Entity, Integer>();
		isAggressor = false;
		attackStyle = 1;
		return this;
	}
	
	public boolean isAggressor() {
		return isAggressor;
	}
	
	public void setAggressor(boolean b) {
		isAggressor = b;
	}
	
	public Hits getHits() {
		return hits;
	}
	
	public void teleport(Location location) {
		this.teleportTo = location;
	}
	
	public void resetTeleportTo() {
		this.teleportTo = null;
	}
	
	public Location getTeleportTo() {
		return this.teleportTo;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return this.index;
	}

	public int getClientIndex() {
		if(this instanceof Player) {
			return this.index + 32768;
		} else {
			return this.index;
		}
	}
	
	public abstract void heal(int amount);
	public abstract void hit(int damage);
	public abstract void hit(int damage, Hits.HitType type);
	public abstract void turnTo(Entity entity);
	public abstract void turnTemporarilyTo(Entity entity);
	public abstract void resetTurnTo();
	public abstract void graphics(int id);
	public abstract void graphics(int id, int delay);
	public abstract void animate(int id);
	public abstract void animate(int id, int delay);
	
	public Animation getLastAnimation() {
		return lastAnimation;
	}
	
	public void setLastAnimation(Animation lastAnimation) {
		this.lastAnimation = lastAnimation;
	}
	
	public Graphics getLastGraphics() {
		return lastGraphics;
	}
	
	public void setLastGraphics(Graphics lastGraphics) {
		this.lastGraphics = lastGraphics;
	}
	
	public Entity getInteractingWith() {
		return interactingWith;
	}
	
	public boolean isInteracting() {
		return interactingWith != null;
	}
	
	public void setInteractingWith(Entity entity) {
		this.interactingWith = entity;
	}
	
	public boolean isAttacking() {
		return this.attacking;
	}
	
	public void setAttacking(boolean b) {
		if(!b) {
			interactingWith = null;
			this.resetTurnTo();
			this.setAggressor(false);
		}
		this.attacking = b;
	}
	
	public int getCombatTurns() {
		return combatTurns;
	}
	
	public void resetCombatTurns() {
		combatTurns = 0;
	}
	
	public void incrementCombatTurns() {
		combatTurns++;
	}
	
	public abstract int getAttackAnimation();
	public abstract int getAttackSpeed();
	public abstract int getMaxHit();
	public abstract int getDefenceAnimation();
	public abstract boolean isAnimating();
	public abstract int getDeathAnimation();

	public abstract boolean isDestroyed();

	public void setCombatTurns(int i) {
		combatTurns = i;
	}
	
	public void setDead(boolean b) {
		dead = b;
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public void setHidden(boolean b) {
		hidden = b;
	}
	
	public boolean isHidden() {
		return hidden;
	}

	public abstract int getMaxHp();
	public abstract int getHp();
	public abstract void setHp(int val);

	public abstract void dropLoot();
	
	public void setAttackStyle(int i) {
		this.attackStyle = i;
	}
	
	public int getAttackStyle() {
		return attackStyle;
	}
	
	public abstract CombatType getCombatType();
	public abstract int getDrawBackGraphics();
	public abstract int getProjectileId();
	public abstract boolean hasAmmo();
	
}
