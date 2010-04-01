package com.rs2hd.model;

public class Specials {
	
	private transient Player player;
	private transient boolean active = false;
	private int amount = 1000;
	
	public void setPlayer(Player player) {
		this.player = player;
		this.active = false;
	}

	public void tick() {
		boolean update = false;
		if(amount < 1000) {
			amount += 100;
			update = true;
		}
		if(amount > 1000) {
			amount = 1000;
			update = true;
		}
		if(update) {
			refresh();
		}
	}
	
	public void refresh() {
		player.getActionSender().sendConfig(300, amount);
		if(active) {
			player.getActionSender().sendConfig(301, 1);
		} else {
			player.getActionSender().sendConfig(301, 0);
		}
	}

	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean b) {
		active = b;
		refresh();
	}
	
	public boolean canPerform(Entity victim) {
		return player.getEquipment().get(3) != null && player.getEquipment().isSpecialWeapon();
	}
	
	public void perform(Entity victim) {
		if(!(player.getEquipment().get(3) != null && player.getEquipment().isSpecialWeapon())) {
			return;
		}
		int id  = player.getEquipment().get(3).getId();
		int req = getRequiredLevel(id);
		if(amount >= req) {
			amount -= req;
		} else {
			return;
		}
		active = false;
		refresh();
		double factor = 1;
		int customHit = -1;
		boolean dmg2 = false;
		switch(id) {
		case 11694:
			factor = 1.25;
			player.graphics(1222);
			player.animate(7074);
			break;
		case 11696:
			factor = 1.1;
			player.graphics(1223);
			player.animate(7073);
			break;
		case 11698:
			factor = 1.1;
			player.graphics(1220);
			player.animate(7071);
			break;
		case 10887:
			player.graphics(1027);
			player.animate(5870);
			break;
		case 11700:
			factor = 1.1;
			player.graphics(1221);
			player.animate(7070);
			break;
		case 11730:
			customHit = (int) (Math.ceil(Math.random() * 20D));
			player.graphics(1207);
			player.animate(7072);
			break;
		case 4151:
			factor = 0.9;
			player.animate(1658);
			victim.graphics(341, (100 << 16));
			break;
		case 1305:
			factor = 1;
			//player.animate(1058);
			player.graphics(248, (100 << 16));
			player.animate(1658);
			break;
		case 4587:
			factor = 1;
			player.animate(2081);
			player.graphics(347, (100 << 16));
			break;
		case 1434:
			factor = 1.1;
			player.animate(1060);
			player.graphics(251, (100 << 16));
			break;
		case 3204:
			factor = 1.1;
			player.animate(1665);
			player.graphics(282, (100 << 16));
			dmg2 = true;
			break;
		case 5698:
			customHit = (int) (Math.ceil(Math.random() * 42D));
			player.animate(1062);
			player.animate(252, (100 << 16));
			break;
		}
		int hit = 0;
		if(customHit != -1) {
			hit = customHit;
		} else {
			hit = (int) (Math.ceil((double) Math.random() * ((double) player.getMaxHit() * factor)));
		}
		victim.hit(hit);
		victim.addKillerHit(player, hit);
		if(dmg2) {
			if(customHit != -1) {
				hit = customHit;
			} else {
				hit = (int) (Math.ceil((double) Math.random() * ((double) player.getMaxHit() * factor)));
			}
			victim.hit(hit);
			victim.addKillerHit(player, hit);
		}
	}

	private int getRequiredLevel(int id) {
		switch(id) {
		case 11694:
			return 500;
		case 11696:
			return 1000;
		case 11698:
			return 750;
		case 10887:
			return 500;
		case 11700:
			return 550;
		case 11730:
			return 100;
		case 4151:
			return 500;
		case 1305:
			return 250;
		case 4587:
			return 700;
		case 1434:
			return 400;
		case 3204:
			return 1000;
		case 5698:
			return 250;
		default:
			return 1000;
		}
	}

}
