package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Entity;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

public class DeathEvent extends Event {
	
	private Entity entity;
	private boolean firstNpcStage = false;

	public DeathEvent(Entity entity) {
		super(3500);
		this.entity = entity;
		this.entity.resetTurnTo();
		this.entity.animate(entity.getDeathAnimation());
	}

	@Override
	public void execute() {
		if(entity instanceof NPC) {
			if(!firstNpcStage) {
				entity.setHidden(true);
				entity.dropLoot();
				entity.clearKillersHits();
				NPC n = (NPC) entity;
				n.teleport(n.getLocation());
				this.setTick(n.getDefinition().getRespawn()*500);
				this.firstNpcStage = true;
			} else {
				entity.setHp(entity.getMaxHp());
				entity.setDead(false);
				entity.setHidden(false);
				this.stop();
			}
		} else if(entity instanceof Player) {
			entity.setHp(entity.getMaxHp());
			entity.setDead(false);
			entity.teleport(Entity.DEFAULT_LOCATION);
			entity.dropLoot();
			entity.clearKillersHits();
			World.getInstance().registerEvent(new Event(500) {
				@Override
				public void execute() {
					Player p = (Player) entity;
					if(!p.getSettings().isHidingDeathInterface()) {
						p.getActionSender().sendInterface(153);
					}
					this.stop();
				}
			});
			this.stop();
		}
	}

}
