package com.rs2hd.packethandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.mina.common.IoSession;

import com.rs2hd.model.Player;
import com.rs2hd.net.Packet;
import com.rs2hd.util.XStreamUtil;
import com.rs2hd.util.log.Logger;
import com.thoughtworks.xstream.XStream;

/**
 * Wholly static class used to handle packets.
 * @author Graham
 *
 */
public class PacketHandlers {
	
	/**
	 * Packet handlers map.
	 */
	private static Map<Integer, PacketHandler> handlers;
	
	/**
	 * Logger instance.
	 */
	private static Logger logger = Logger.getInstance();
	
	/**
	 * Prevent an instance being created.
	 */
	private PacketHandlers() {}
	
	/**
	 * Loads the packet handlers.
	 * @throws FileNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public static void loadHandlers() throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		handlers = new HashMap<Integer, PacketHandler>();
		XStream xstream = XStreamUtil.getXStream();
		
		logger.info("Packet handlers:");
		List<PacketHandlerDef> defs = (List<PacketHandlerDef>) xstream.fromXML(new FileInputStream(com.rs2hd.Main.workingDir+"data/packetHandlers.xml"));
		for(PacketHandlerDef def : defs) {
			
			PacketHandler handler = (PacketHandler) Class.forName(def.handler).newInstance();
			
			String binds = "[ ";
			for(int bind : def.binds) {
				binds += bind + ", ";
				handlers.put(bind, handler);
			}
			binds = binds.substring(0, binds.length()-2);
			binds += " ]";
			logger.info("\tPacket " + handler.getClass().getSimpleName() + " bound to: " + binds);
		}
	}
	
	/**
	 * Handles a packet.
	 * @param session
	 * @param p
	 */
	public static void handlePacket(IoSession session, Packet p) {
		try {
			if(!p.isBare()) {
				PacketHandler handler = handlers.get(p.getId());
				if(handler == null) {
					logger.debug("Unhandled packet: " + p + ".");
				} else {
					handler.handlePacket((Player) session.getAttachment(), session, p);
				}
			}
		} catch(Exception e) {
			// it may be sending an invalid packet
			// in which case we just ignore errors
			// thanks to thefithlord for finding the bug!
		}
	}

}
