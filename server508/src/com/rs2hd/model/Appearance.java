package com.rs2hd.model;

/**
 * Appearance class
 * @author Graham
 *
 */
public class Appearance {
	
	private boolean asNpc   = false;
	private int     npcId   = -1;
	private int     gender  = 0;
	private int[]   look    = new int[7];
	private int[]   colour  = new int[5];
	
	public Appearance() {
		look[1] = 10;
		look[2] = 18;
		look[3] = 26;
		look[4] = 33;
		look[5] = 36;
		look[6] = 42;
		for(int i = 0; i < 5; i++) {
			colour[i] = i*3+2;
		}
	}
	
	public boolean isNpc() {
		return asNpc;
	}
	
	public int getNpcId() {
		return npcId;
	}
	
	public int getGender() {
		return gender;
	}
	
	public int getLook(int id) {
		return look[id];
	}
	
	public int getColour(int id) {
		return colour[id];
	}
	
	public int[] getColours() {
		return colour.clone();
	}

	public void transformToPlayer() {
		asNpc = false;
	}

	public void transformToNpc(int i) {
		asNpc = true;
		npcId = i;
	}

}
