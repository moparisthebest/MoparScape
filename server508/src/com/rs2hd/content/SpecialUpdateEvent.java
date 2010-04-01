package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class SpecialUpdateEvent extends Event {

	public SpecialUpdateEvent() {
		super(10000);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			p.getSpecials().tick();
		}
	}

}
