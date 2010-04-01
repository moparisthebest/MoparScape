package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * Handles the regaining of player energy.
 * @author Graham
 *
 */
public class RunEnergyEvent extends Event {

	public RunEnergyEvent() {
		super(2000);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			if((p.getWalkingQueue().isRunToggled() || p.getWalkingQueue().isRunning()) && p.getSprites().getSecondarySprite() != -1) {
				continue;
			} else {
				if(p.getRunEnergy() < 100) {
					p.setRunEnergy(p.getRunEnergy()+1);
				}
			}
		}
	}

}
