package com.rs2hd.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rs2hd.util.XStreamUtil;
import com.rs2hd.util.log.Logger;

public class NPCDrop {
	
	public static Map<Integer, NPCDrop> npcDrops = new HashMap<Integer, NPCDrop>();
	@SuppressWarnings("unchecked")
	public static void load() throws FileNotFoundException {
		List<NPCDrop> list = (List<NPCDrop>) XStreamUtil.getXStream().fromXML(new FileInputStream(com.rs2hd.Main.workingDir+"data/npcDrops.xml"));
		for(NPCDrop drop : list) {
			npcDrops.put(drop.getNpc(), drop);
		}
		Logger.getInstance().info("Loaded " + npcDrops.size() + " npc drops.");
	}
	
	public static NPCDrop forId(int id) {
		return npcDrops.get(id);
	}
	
	public class Drop {
		private int chance;
		private Item[] items;
		
		public int getChance() {
			return chance;
		}
		
		public Item[] getItems() {
			return items;
		}
	}
	
	private int npc;
	private Drop[] drops;
	
	public int getNpc() {
		return npc;
	}
	
	public Drop[] getDrops() {
		return drops;
	}

}
