package com.rs2hd.net;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

import org.apache.mina.common.IdleStatus;
import org.apache.mina.common.IoHandler;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;

import com.rs2hd.Constants;
import com.rs2hd.GameEngine;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;
import com.rs2hd.net.codec.CodecFactory;
import com.rs2hd.util.log.Logger;

/**
 * Handles incoming events from MINA.
 * @author Graham
 *
 */
public class ConnectionHandler implements IoHandler {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	/**
	 * The game engine.
	 */
	private GameEngine engine;
	
	/**
	 * Keeps track of connection counts.
	 */
	private Map<String, Integer> connections = new HashMap<String, Integer>();
	
	/**
	 * Creates the connection handler.
	 * @param engine
	 */
	public ConnectionHandler(GameEngine engine) {
		this.engine = engine;
	}

	@Override
	public void exceptionCaught(IoSession session, Throwable throwable) throws Exception {
		//logger.error("Exception caught: " + session + ": " + throwable.getMessage() + ".");
		//logger.stackTrace(throwable);
	}

	@Override
	public void messageReceived(IoSession session, Object data) throws Exception {
		Packet packet = (Packet) data;
		Player player = (Player) session.getAttachment();
		player.addPacketToQueue(packet);
	}

	@Override
	public void messageSent(IoSession session, Object data) throws Exception {
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		if(session.getAttachment() != null) {
			World.getInstance().unregister((Player) session.getAttachment());
		}
		logger.debug("Session has been closed: " + session.getRemoteAddress().toString());
		synchronized(connections) {
			InetSocketAddress addr = (InetSocketAddress) session.getRemoteAddress();
			if(connections.containsKey(addr.getAddress().getHostAddress())) {
				int num = connections.get(addr.getAddress().getHostAddress());
				num--;
				if(num <= 0) {
					connections.remove(addr.getAddress().getHostAddress());
				} else {
					connections.put(addr.getAddress().getHostAddress(), num);
				}
			}
		}
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
		logger.debug("Session is now idle: " + session.getRemoteAddress().toString());
		session.close();
	}
	
	@Override
	public void sessionOpened(IoSession session) throws Exception {
		logger.debug("New session from: " + session.getRemoteAddress().toString());
		synchronized(connections) {
			InetSocketAddress addr = (InetSocketAddress) session.getRemoteAddress();
			if(connections.containsKey(addr.getAddress().getHostAddress())) {
				int num = connections.get(addr.getAddress().getHostAddress());
				if(num >= Constants.MAX_PER_IP) {
					session.close();
					return;
				} else {
					num++;
					connections.put(addr.getAddress().getHostAddress(), num);
				}
			} else {
				connections.put(addr.getAddress().getHostAddress(), 1);
			}
		}
		session.setIdleTime(IdleStatus.BOTH_IDLE, Constants.SESSION_INITIAL_IDLE_TIME);
		session.getFilterChain().addLast("protocolFilter", new ProtocolCodecFilter(new CodecFactory(engine.getWorkerThread())));
	}

}
