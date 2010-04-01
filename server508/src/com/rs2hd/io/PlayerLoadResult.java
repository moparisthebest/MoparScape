package com.rs2hd.io;

import com.rs2hd.Constants;
import com.rs2hd.model.Player;

/**
 * Player load result.
 * @author Graham
 *
 */
public class PlayerLoadResult {
	
	public int returnCode = Constants.ReturnCodes.LOGIN_OK;
	public Player player = null;

}
