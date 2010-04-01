package com.rs2hd.model;

public class Bonuses {
	
	public static final String[] BONUS_NAMES = new String[] {
		"Stab", "Slash", "Crush", "Magic", "Range", "Stab", "Slash", "Crush", "Magic", "Range", "Strength", "Prayer", "Summoning"
	};
	
	public static final int SIZE = 13;
	
	private Player player;
	private int[] bonuses = new int[SIZE];
	
	public Bonuses(Player player) {
		this.player = player;
	}

	public void refresh() {
		for(int i = 0; i < SIZE; i++) {
			bonuses[i] = 0;
		}
		for(int i = 0; i < Equipment.SIZE; i++) {
			Item item = player.getEquipment().getContainer().get(i);
			if(item != null) {
				for(int j = 0; j < SIZE; j++) {
					bonuses[j] += item.getDefinition().getBonus(j);
				}
			}
		}
		player.getActionSender().sendBonus(bonuses);
	}
	
	public int[] getBonuses() {
		return bonuses;
	}
	
	public int getBonus(int i) {
		return bonuses[i];
	}

}
