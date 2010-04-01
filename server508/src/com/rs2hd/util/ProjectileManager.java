package com.rs2hd.util;

import com.rs2hd.model.Entity;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class ProjectileManager {

	public void fire(Location source, Location dest, int gfx, int angle, int speed, int startHeight, int endHeight, Entity lockon) {
		int offsetX = (source.getX() - dest.getX()) * -1;
		int offsetY = (source.getY() - dest.getY()) * -1;
		for(Player p : World.getInstance().getPlayerList()) {
			if(p.getLocation().withinDistance(source) && p.getLocation().withinDistance(dest)) {
				p.getActionSender().sendProjectile(source, dest, offsetX, offsetY, gfx, angle, speed, startHeight, endHeight, lockon);
			}
		}
	}

}
