package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class WildernessUpdateEvent extends Event {

	public WildernessUpdateEvent() {
		super(500);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			p.updateWildernessState();
		}
	}

}
