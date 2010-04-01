package com.rs2hd.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rs2hd.util.XStreamUtil;
import com.rs2hd.util.log.Logger;

/**
 * Represents a type of NPC.
 * @author Graham
 *
 */
public class NPCDefinition {
	
	private static Logger logger = Logger.getInstance();
	
	private static Map<Integer, NPCDefinition> definitions;

	@SuppressWarnings("unchecked")
	public static void load() throws FileNotFoundException {
		List<NPCDefinition> defs = (List<NPCDefinition>) XStreamUtil.getXStream().fromXML(new FileInputStream(com.rs2hd.Main.workingDir+"data/npcDefinitions.xml"));
		definitions = new HashMap<Integer, NPCDefinition>();
		for(NPCDefinition def : defs) {
			definitions.put(def.getId(), def);
		}
		logger.info("Loaded " + definitions.size() + " npc definitions.");
		NPCDrop.load();
	}
	
	public static NPCDefinition forId(int id) {
		NPCDefinition d = definitions.get(id);
		if(d == null) {
			d = produceDefinition(id);
		}
		return d;
	}
	
	private int id;
	private String name, examine;
	private int respawn = 0, combat = 0, hitpoints = 1, maxHit = 0, size = 1, attackSpeed = 8, attackAnim = 422, defenceAnim = 404, deathAnim = 7197;

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getExamine() {
		return examine;
	}
	
	public int getRespawn() {
		return respawn;
	}
	
	public int getCombat() {
		return combat;
	}
	
	public int getHitpoints() {
		return hitpoints;
	}
	
	public int getMaxHit() {
		return maxHit;
	}

	public int getSize() {
		return size;
	}

	public static NPCDefinition produceDefinition(int id) {
		NPCDefinition def = new NPCDefinition();
		def.id = id;
		def.name = "NPC #" + def.id;
		def.examine = "It's an NPC.";
		return def;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public int getAttackAnimation() {
		return attackAnim;
	}

	public int getDefenceAnimation() {
		return defenceAnim;
	}

	public int getDeathAnimation() {
		return deathAnim;
	}

}
