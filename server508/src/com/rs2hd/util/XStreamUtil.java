package com.rs2hd.util;

import com.thoughtworks.xstream.XStream;

/**
 * Util class to get the xstream object.
 * @author Graham
 *
 */
public class XStreamUtil {
	
	private XStreamUtil() {}
	
	private static XStream xstream = null;
	
	public static XStream getXStream() {
		if(xstream == null) {
			xstream = new XStream();
			/*
			 * Set up our aliases.
			 */
			xstream.alias("packet", com.rs2hd.packethandler.PacketHandlerDef.class);
			xstream.alias("player", com.rs2hd.model.Player.class);
			xstream.alias("itemDefinition", com.rs2hd.model.ItemDefinition.class);
			xstream.alias("item", com.rs2hd.model.Item.class);
			xstream.alias("npcDefinition", com.rs2hd.model.NPCDefinition.class);
			xstream.alias("npc", com.rs2hd.model.NPC.class);
			xstream.alias("npcDrop", com.rs2hd.model.NPCDrop.class);
			xstream.alias("drop", com.rs2hd.model.NPCDrop.Drop.class);
			xstream.alias("spawn", com.rs2hd.model.Spawn.class);
			xstream.alias("shop", com.rs2hd.model.Shop.class);
			xstream.alias("config", com.rs2hd.Configuration.class);
		}
		return xstream;
	}

}
