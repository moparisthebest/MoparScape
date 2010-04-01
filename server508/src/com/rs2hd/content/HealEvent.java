package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * Handles player+NPC healing.
 * @author Graham
 *
 */
public class HealEvent extends Event {

	public HealEvent() {
		super(60000);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			p.heal(1);
		}
		for(NPC n : World.getInstance().getNpcList()) {
			n.heal(1);
		}
	}

}
