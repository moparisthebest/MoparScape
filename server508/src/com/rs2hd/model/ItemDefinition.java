package com.rs2hd.model;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

import com.rs2hd.util.log.Logger;

/**
 * Item Definition class
 * @author Graham
 *
 */
public class ItemDefinition {
	
	private static Map<Integer, ItemDefinition> definitions = null;
	public static void load() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(com.rs2hd.Main.workingDir+"data/itemDefinitions.dat", "r");
		int amt = raf.readInt();
		definitions = new HashMap<Integer, ItemDefinition>();
		for(int i = 0; i < amt; i++) {
			ItemDefinition def = new ItemDefinition();
			def.id = raf.readShort();
			def.equipId = raf.readShort();
			def.noted = raf.readBoolean();
			def.stackable = raf.readBoolean();
			def.price = new ItemPrice();
			def.price.normPrice = raf.readInt();
			def.price.minPrice = raf.readInt();
			def.price.maxPrice = raf.readInt();
			def.bonus = new int[13];
			for(int j = 0; j < 13; j++) {
				def.bonus[j] = raf.readByte();
			}
			StringBuilder s = new StringBuilder();
			byte b = 0;
			while((b = raf.readByte()) != 0) {
				s.append((char) b);
			}
			def.name = s.toString();
			s = new StringBuilder();
			while((b = raf.readByte()) != 0) {
				s.append((char) b);
			}
			def.examine = s.toString();
			definitions.put(def.getId(), def);
		}
		Logger.getInstance().info("Loaded " + definitions.size() + " item definitions.");
	}
	public static ItemDefinition forId(int id) {
		ItemDefinition i = definitions.get(id);
		if(i == null) {
			i = produceDefinition(id);
		}
		return i;
	}
	
	private static ItemDefinition produceDefinition(int id) {
		ItemDefinition def = new ItemDefinition();
		def.price = new ItemPrice();
		def.price.minPrice = 0;
		def.price.maxPrice = 0;
		def.price.normPrice = 0;
		def.bonus = new int[13];
		for(int i = 0; i < 13; i++) {
			def.bonus[i] = 0;
		}
		def.id = id;
		def.stackable = false;
		def.noted = false;
		def.name = "#"+id;
		def.examine = "It's an item!";
		def.equipId = -1;
		definitions.put(id, def);
		return def;
	}

	public static class ItemPrice {
		private int minPrice;
		private int maxPrice;
		private int normPrice;
		
		public int getMinimumPrice() {
			return minPrice;
		}
		
		public int getMaximumPrice() {
			return maxPrice;
		}
		
		public int getNormalPrice() {
			return normPrice;
		}
	}
	
	private ItemPrice price;
	private int[] bonus;
	private String examine;
	private int id;
	private boolean stackable;
	private String name;
	private boolean noted;
	private int equipId;
	
	public ItemPrice getPrice() {
		return price;
	}
	
	public int getEquipId() {
		return equipId;
	}
	
	public int[] getBonuses() {
		return bonus;
	}

	public int getBonus(int id) {
		return bonus[id];
	}

	public String getExamine() {
		return examine;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isNoted() {
		return noted;
	}

	public boolean isStackable() {
		return stackable;
	}

}
