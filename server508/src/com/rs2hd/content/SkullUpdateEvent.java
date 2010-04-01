package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class SkullUpdateEvent extends Event {

	public static final int TIME = 5000;

	public SkullUpdateEvent() {
		super(TIME);
	}

	@Override
	public void execute() {
		for(Player p : World.getInstance().getPlayerList()) {
			p.getHeadIcons().decCycle();
			if(p.getHeadIcons().removeSkulls()) {
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
			}
		}
	}

}
