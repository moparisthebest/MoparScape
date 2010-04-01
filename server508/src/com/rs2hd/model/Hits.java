package com.rs2hd.model;

/**
 * Handles player hits.
 * @author Graham
 *
 */
public class Hits {
	
	public static enum HitType {
		NO_DAMAGE		(0),			// blue
		NORMAL_DAMAGE	(1),		// red
		POISON_DAMAGE	(2),		// green
		DISEASE_DAMAGE	(3);	// orange
		
		private final int type;
		
		private HitType(int type) {
			this.type = type;
		}
		
		public int getType() {
			return this.type;
		}
	}
	
	public static class Hit {
		
		private HitType type;
		private int damage;
		
		public Hit(int damage, HitType type) {
			this.type = type;
			this.damage = damage;
		}
		
		public HitType getType() {
			return type;
		}
		
		public int getDamage() {
			return damage;
		}
	}
	
	public Hits() {
		hit1 = null;
		hit2 = null;
	}
	
	private Hit hit1;
	private Hit hit2;
	
	public void setHit1(Hit hit) {
		this.hit1 = hit;
	}

	public void setHit2(Hit hit) {
		this.hit2 = hit;
	}
	
	public int getHitDamage1() {
		if(hit1 == null) {
			return 0;
		}
		return hit1.damage;
	}
	
	public int getHitDamage2() {
		if(hit2 == null) {
			return 0;
		}
		return hit2.damage;
	}
	
	public int getHitType1() {
		if(hit1 == null) {
			return HitType.NO_DAMAGE.getType();
		}
		return hit1.type.getType();
	}
	
	public int getHitType2() {
		if(hit2 == null) {
			return HitType.NO_DAMAGE.getType();
		}
		return hit2.type.getType();
	}
	
	public void clear() {
		hit1 = null;
		hit2 = null;
	}

}
