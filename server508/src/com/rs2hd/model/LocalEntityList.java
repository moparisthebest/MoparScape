package com.rs2hd.model;

import com.rs2hd.Constants;

/**
 * Handles local entities.
 * @author Graham
 *
 */
public class LocalEntityList {

	protected int playerListSize;
	protected Player[] playerList;
	protected byte[] playersInList;
	
	protected int npcListSize;
	protected NPC[] npcList;
	protected byte[] npcsInList;
	
	protected boolean rebuildNpcList;
	
	public LocalEntityList() {
		playerList = new Player[Constants.PLAYER_CAP+1];
		playersInList = new byte[Constants.PLAYER_CAP+1];
		playerListSize = 0;
		
		npcList = new NPC[Constants.NPC_CAP+1];
		npcsInList = new byte[Constants.NPC_CAP+1];
		npcListSize = 0;
		
		rebuildNpcList = false;
	}

}
