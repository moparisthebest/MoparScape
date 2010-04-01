package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Entity;
import com.rs2hd.model.Item;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Combat {
	
	public static enum CombatType {
		MELEE,
		MAGE,
		RANGE,
	}
	
	public static void attack(Entity source, Entity victim) {
		if(!canAttack(source, victim)) {
			return;
		}
		if(source instanceof Player) {
			Player p = (Player) source;
			if(p.isBusy()) {
				return;
			}
		}
		source.setAttacking(true);
		source.setInteractingWith(victim);
		source.turnTo(victim);
		source.setAggressor(true);
		if(source.getCombatType().equals(CombatType.RANGE)) {
			// discard next walk queue here or something
			if(source instanceof Player) {
				Player p = (Player) source;
				p.getWalkingQueue().reset();
			}
		}
		if(!victim.isAttacking() && victim.isAutoRetaliating()) {
			// incur a slight delay on the attack back
			victim.resetCombatTurns();
			victim.setCombatTurns(victim.getAttackSpeed()/2);
			victim.setAttacking(true);
			victim.setInteractingWith(source);
			victim.turnTo(source);
			victim.setAggressor(false);
		}
	}
	
	private static boolean canAttack(Entity source, Entity victim) {
		if((source instanceof Player) && (victim instanceof Player)) {
			Player pSource = (Player) source;
			Player pVictim = (Player) victim;
			int sWildy = Location.wildernessLevel(pSource.getLocation());
			int vWildy = Location.wildernessLevel(pVictim.getLocation());
			int diff = Math.abs(sWildy-vWildy);
			if(diff >= sWildy && diff >= vWildy) {
				pSource.getActionSender().sendMessage("You need to move deeper into the wilderness to attack this player.");
				return false;
			} else if(pSource.isAggressor()) {
				if(victim.getInteractingWith() != source) {
					pSource.getHeadIcons().setSkulled(true);
					pSource.getUpdateFlags().setAppearanceUpdateRequired(true);
				}
			}
		}
		return true;
	}

	public static void handleCombat(final Entity entity) {
		entity.incrementCombatTurns();
		if(!entity.isAttacking()) {
			return;
		}
		final Entity victim = entity.getInteractingWith();
		if(entity instanceof Player && victim instanceof Player) {
			Player p = (Player) entity;
			if(p.getHeadIcons().isSkulled() && victim.getInteractingWith() != entity) {
				p.getHeadIcons().renewSkull();
			}
		}
		if(!canAttack(entity, victim)) {
			entity.setAttacking(false);
			return;
		}
		if(entity.isDead() || victim == null || victim.isDestroyed() || victim.isDead()) {
			entity.setAttacking(false);
			return;
		}
		int amt = 3;
		if(entity.getCombatType().equals(CombatType.RANGE)) {
			amt = 8;
		}
		if(!entity.getLocation().withinDistance(victim.getLocation(), amt)) {
			entity.setAttacking(false);
			//if(victim.getInteractingWith() == entity) {
			//	victim.setAttacking(false);
			//}
			return;
		}
		int hitDelay = 0;
		if(entity.getCombatType().equals(CombatType.RANGE)) {
			int dist = (int) (Math.round(entity.getLocation().getDistance(victim.getLocation())));
			if(dist == 0) {
			} else if(dist == 1) {
				hitDelay = 2;
			} else if(dist == 2 || dist == 3) {
				hitDelay = 3;
			} else {
				hitDelay = 4;
			}
			//hitDelay *= 500;
			hitDelay = hitDelay * 250 + 750;
			if(!entity.hasAmmo()) {
				if(entity instanceof Player) {
					Player p = (Player) entity;
					p.getActionSender().sendMessage("You've ran out of ammo!");
				}
				entity.setAttacking(false);
				return;
			}
		}
		Item ammoDrop = null;
		if(entity.getCombatTurns() >= entity.getAttackSpeed()) {
			entity.resetCombatTurns();
			entity.turnTo(victim);
			boolean skip = false;
			if(entity instanceof Player) {
				Player p = (Player) entity;
				if(p.getSpecials().isActive() && p.getSpecials().canPerform(victim)) {
					p.getSpecials().perform(victim);
					skip = true;
				}
				if(!skip) {
					if(entity.getCombatType().equals(CombatType.RANGE)) {
						ammoDrop = p.getEquipment().removeAmmo();
					}
				}
			}
			boolean victimAnim = false;
			if(!skip) {
				if(!entity.isAnimating() || entity.getCombatType().equals(CombatType.RANGE)) {
					entity.animate(entity.getAttackAnimation());
					victimAnim = true;
					if(entity.getCombatType().equals(CombatType.RANGE)) {
						entity.graphics(entity.getDrawBackGraphics(), (100 << 16));
						World.getInstance().getProjectileManager().fire(entity.getLocation(), victim.getLocation(), entity.getProjectileId(), 50, 43, 31, 70, victim);
					}
				}
				if(hitDelay == 0) {
					if(victimAnim) {
						if(!victim.isAnimating()) {
							victim.animate(victim.getDefenceAnimation());
						}
					}
					int hit = (int) (Math.ceil((double) Math.random() * (double) entity.getMaxHit()));
					victim.hit(hit);
					victim.addKillerHit(entity, hit);
					if(ammoDrop != null) {
						World.getInstance().getItemManager().createGroundItem(victim.getLocation(), ammoDrop);
					}
				} else {
					final boolean fVictimAnim = victimAnim;
					final Item fAmmoDrop = ammoDrop;
					final int hit = (int) (Math.ceil((double) Math.random() * (double) entity.getMaxHit()));
					World.getInstance().registerEvent(new Event(hitDelay) {
						public void execute() {
							if(fVictimAnim) {
								if(!victim.isAnimating()) {
									victim.animate(victim.getDefenceAnimation());
								}
							}
							victim.hit(hit);
							victim.addKillerHit(entity, hit);
							if(fAmmoDrop != null && entity instanceof Player) {
								World.getInstance().getItemManager().createDropGroundItem((Player) entity, victim.getLocation(), fAmmoDrop);
							} else {
								World.getInstance().getItemManager().createGroundItem(victim.getLocation(), fAmmoDrop);
							}
							this.stop();
						}
					});
				}
			}
		}
	}

}
