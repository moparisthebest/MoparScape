package com.rs2hd.model;

import com.rs2hd.content.SkullUpdateEvent;

/**
 * Manages head icons.
 * @author Graham
 *
 */
// TODO needs recoding
// TODO !!IMPORTANT!! SAVE THIS SOMEHOW! (e.g. skullTimeRemaining???)
// TODO prayer icon support
public class HeadIcons {
	
	private boolean isSkulled = false;
	private int skullCyclesRemaining = 0;
	
	public int getPkIcon() {
		return isSkulled? 0 : -1;
	}

	public int getPrayerIcon() {
		return -1;
	}

	public boolean isSkulled() {
		return isSkulled;
	}

	public void setSkulled(boolean b) {
		isSkulled = b;
		if(isSkulled == false) {
			skullCyclesRemaining = 0;
		} else {
			skullCyclesRemaining = 900000 / SkullUpdateEvent.TIME;;
		}
	}
	
	public void renewSkull() {
		skullCyclesRemaining = 900000 / SkullUpdateEvent.TIME;
	}
	
	public void decCycle() {
		skullCyclesRemaining--;
	}
	
	public boolean removeSkulls() {
		if(skullCyclesRemaining <= 0) {
			isSkulled = false;
			skullCyclesRemaining = 0;
			return true;
		}
		return false;
	}

}
