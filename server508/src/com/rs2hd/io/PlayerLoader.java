package com.rs2hd.io;

import com.rs2hd.model.Player;
import com.rs2hd.model.PlayerDetails;

/**
 * Player load/save interface.
 * @author Graham
 *
 */
public interface PlayerLoader {
	
	public PlayerLoadResult load(PlayerDetails p);
	public boolean save(Player p);

}
