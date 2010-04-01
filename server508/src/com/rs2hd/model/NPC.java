package com.rs2hd.model;

import java.util.LinkedList;
import java.util.Queue;

import com.rs2hd.content.DeathEvent;
import com.rs2hd.content.Combat.CombatType;
import com.rs2hd.model.Hits.Hit;
import com.rs2hd.model.NPCDrop.Drop;
import com.rs2hd.util.Misc;

/**
 * Represents a 'non-player' character in the game.
 * @author Graham
 *
 */
public class NPC extends Entity {
	
	public static enum WalkType {
		STATIC,
		RANGE,
	}
	
	private int id;
	private transient NPCDefinition definition;
	private transient NPCUpdateFlags updateFlags;
	private transient int sprite;
	private transient int hp;
	private transient Queue<Hit> queuedHits;
	private WalkType walkType;
	private transient Location originalLocation;
	private Location minimumCoords = Location.location(0, 0, 0);
	private Location maximumCoords = Location.location(0, 0, 0);
	
	public NPC(int id) {
		this.id = id;
		this.definition = NPCDefinition.forId(id);
		this.setWalkType(WalkType.STATIC);
	}
	
	public void tick() {
		sprite = -1;
		if(!this.isAttacking() && Math.random() > 0.8 && walkType == WalkType.RANGE) {
			int moveX = (int) (Math.floor((Math.random() * 3)) - 1);
			int moveY = (int) (Math.floor((Math.random() * 3)) - 1);
			int tgtX = this.getLocation().getX() + moveX;
			int tgtY = this.getLocation().getY() + moveY;
			sprite = Misc.direction(this.getLocation().getX(), this.getLocation().getY(), tgtX, tgtY);
			if(tgtX > this.maximumCoords.getX() || tgtX < this.minimumCoords.getX() || tgtY > this.maximumCoords.getY() || tgtY < this.minimumCoords.getY()) {
				sprite = -1;
			}
			if(sprite != -1) {
				sprite >>= 1;
				this.setLocation(Location.location(tgtX, tgtY, this.getLocation().getZ()));
			}
		}
	}
	
	public int getId() {
		return id;
	}
	
	public int getSprite() {
		return sprite;
	}
	
	public NPCDefinition getDefinition() {
		return definition;
	}
	
	public Object readResolve() {
		super.readResolve();
		definition = NPCDefinition.forId(id);
		updateFlags = new NPCUpdateFlags();
		sprite = -1;
		hp = definition.getHitpoints();
		this.queuedHits = new LinkedList<Hit>();
		this.originalLocation = this.getLocation();
		return this;
	}
	
	public void processQueuedHits() {
		if(!updateFlags.isHit1UpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
		if(!updateFlags.isHit2UpdateRequired()) {
			if(queuedHits.size() > 0) {
				Hit h = queuedHits.poll();
				hit(h.getDamage(), h.getType());
			}
		}
	}
	
	public NPCUpdateFlags getUpdateFlags() {
		return updateFlags;
	}

	/**
	 * @param minimumCoords the minimumCoords to set
	 */
	public void setMinimumCoords(Location minimumCoords) {
		this.minimumCoords = minimumCoords;
	}

	/**
	 * @return the minimumCoords
	 */
	public Location getMinimumCoords() {
		return minimumCoords;
	}

	/**
	 * @param walkType the walkType to set
	 */
	public void setWalkType(WalkType walkType) {
		this.walkType = walkType;
	}

	/**
	 * @return the walkType
	 */
	public WalkType getWalkType() {
		return walkType;
	}

	/**
	 * @param maximumCoords the maximumCoords to set
	 */
	public void setMaximumCoords(Location maximumCoords) {
		this.maximumCoords = maximumCoords;
	}

	/**
	 * @return the maximumCoords
	 */
	public Location getMaximumCoords() {
		return maximumCoords;
	}

	public void heal(int amount) {
		this.hp += amount;
		if(hp >= this.getDefinition().getHitpoints()) {
			hp = this.getDefinition().getHitpoints();
		}
	}
	
	public void hit(int damage) {
		if(damage == 0) {
			hit(damage, Hits.HitType.NO_DAMAGE);
		} else {
			hit(damage, Hits.HitType.NORMAL_DAMAGE);
		}
	}
	
	public void hit(int damage, Hits.HitType type) {
		if(damage > hp) {
			damage = hp;
		}
		if(!updateFlags.isHit1UpdateRequired()) {
			getHits().setHit1(new Hit(damage, type));
			updateFlags.setHit1UpdateRequired(true);
		} else {
			if(!updateFlags.isHit2UpdateRequired()) {
				getHits().setHit2(new Hit(damage, type));
				updateFlags.setHit2UpdateRequired(true);
			} else {
				queuedHits.add(new Hit(damage, type));
			}
		}
		hp -= damage;
		if(hp <= 0) {
			hp = 0;
			if(!this.isDead()) {
				World.getInstance().registerEvent(new DeathEvent(this));
			}
			this.setDead(true);
		}
	}

	@Override
	public void turnTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
	}

	@Override
	public void turnTemporarilyTo(Entity entity) {
		this.getUpdateFlags().setFaceToUpdateRequired(true, entity.getClientIndex());
		this.getUpdateFlags().setClearFaceTo(true);
	}

	@Override
	public void resetTurnTo() {
		this.getUpdateFlags().setFaceToUpdateRequired(true, 0);
	}

	public void graphics(int id) {
		graphics(id, 0);
	}
	
	public void graphics(int id, int delay) {
		this.setLastGraphics(new Graphics(id, delay));
		updateFlags.setGraphicsUpdateRequired(true);
	}
	
	public void animate(int id) {
		animate(id, 0);
	}
	
	public void animate(int id, int delay) {
		this.setLastAnimation(new Animation(id, delay));
		updateFlags.setAnimationUpdateRequired(true);
	}

	public int getHitpoints() {
		return hp;
	}

	@Override
	public int getAttackAnimation() {
		return this.getDefinition().getAttackAnimation();
	}

	@Override
	public int getAttackSpeed() {
		return this.getDefinition().getAttackSpeed();
	}

	@Override
	public int getMaxHit() {
		return this.getDefinition().getMaxHit();
	}

	@Override
	public int getDefenceAnimation() {
		return this.getDefinition().getDefenceAnimation();
	}

	@Override
	public boolean isAnimating() {
		return this.getUpdateFlags().isAnimationUpdateRequired();
	}

	@Override
	public boolean isDestroyed() {
		return !World.getInstance().getNpcList().contains(this);
	}

	@Override
	public int getDeathAnimation() {
		return this.getDefinition().getDeathAnimation();
	}
	
	public Location getOriginalLocation() {
		return this.originalLocation;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public int getMaxHp() {
		return this.definition.getHitpoints();
	}

	@Override
	public void setHp(int val) {
		hp = val;
	}

	@Override
	public void dropLoot() {
		Entity killer = this.getKiller();
		Player p = killer instanceof Player ? (Player) killer : null;
		NPCDrop drop = NPCDrop.forId(definition.getId());
		if(drop == null) {
			return;
		}
		for(Drop d : drop.getDrops()) {
			int random = (int) Math.ceil(Math.random() * 100D);
			if(d.getChance() >= random) {
				for(Item i : d.getItems()) {
					if(p == null) {
						World.getInstance().getItemManager().createGroundItem(this.getLocation(), (Item) i.clone());
					} else {
						World.getInstance().getItemManager().createDropGroundItem(p, this.getLocation(), (Item) i.clone());
					}
				}
			}
		}
	}

	@Override
	public boolean isAutoRetaliating() {
		return this.definition.getHitpoints() > 0;
	}

	@Override
	public CombatType getCombatType() {
		return CombatType.MELEE;
	}

	@Override
	public int getDrawBackGraphics() {
		return 18; // TODO atm bronze arrow
	}

	@Override
	public int getProjectileId() {
		return 10; // TODO atm bronze(?) arrow
	}

	@Override
	public boolean hasAmmo() {
		return true;
	}
	
}