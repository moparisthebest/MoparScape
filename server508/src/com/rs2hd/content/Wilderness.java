package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class Wilderness {

	public static void showWarning(Player player) {
		if(Location.wildernessLevel(player.getLocation()) > 0) {
			handleJump(player);
		} else {
			if(player.getTemporaryAttribute("wildernessWarned") == Boolean.TRUE) {
				handleJump(player);
			} else {
				player.getActionSender().sendInterface(382);
			}
		}
	}

	public static void handleJump(final Player player) {
		final int baseY = Location.location(0, 3521, 0).getLocalY();
		player.getActionSender().sendCloseInterface();
		player.setTemporaryAttribute("wildernessWarned", Boolean.TRUE);
		int delay = 0;
		if(Location.wildernessLevel(player.getLocation()) > 0) {
			// leaving wildy
			player.getWalkingQueue().reset();
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+2);
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+1);
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+0);
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY-1);
		} else {
			// entering wildy
			player.getWalkingQueue().reset();
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+1);
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+2);
			player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), baseY+3);
			delay = 500;
		}
		final boolean isRunning = player.getWalkingQueue().isRunToggled();
		player.getWalkingQueue().setIsRunning(false);
		player.getWalkingQueue().setRunToggled(false);
		World.getInstance().registerEvent(new Event(delay) {
			@Override
			public void execute() {
				player.getEquipment().setTempWalkAnim(2750);
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				this.stop();
			}
		});
		World.getInstance().registerEvent(new Event(2500+delay) {
			@Override
			public void execute() {
				player.getEquipment().setNoTempWalkAnim();
				player.getUpdateFlags().setAppearanceUpdateRequired(true);
				player.getWalkingQueue().setRunToggled(isRunning);
				this.stop();
			}
		});
	}

}
