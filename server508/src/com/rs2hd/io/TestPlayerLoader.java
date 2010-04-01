package com.rs2hd.io;

import com.rs2hd.Constants;
import com.rs2hd.model.Player;
import com.rs2hd.model.PlayerDetails;

/**
 * Test player loader/saver.
 * @author Graham
 *
 */
public class TestPlayerLoader implements PlayerLoader {
	
	public PlayerLoadResult load(PlayerDetails p) {
		PlayerLoadResult result = new PlayerLoadResult();
		result.returnCode = Constants.ReturnCodes.LOGIN_OK;
		result.player = (Player) new Player(p).readResolve();
		return result;
	}
	
	public boolean save(Player p) {
		return true;
	}

}
