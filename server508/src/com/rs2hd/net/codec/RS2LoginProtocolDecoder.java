package com.rs2hd.net.codec;

//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.Queue;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IdleStatus;
import org.apache.mina.common.IoFuture;
import org.apache.mina.common.IoFutureListener;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

//import com.grahamedgecombe.rs2.cache.Cache;
import com.rs2hd.Constants;
import com.rs2hd.WorkerThread;
import com.rs2hd.model.PlayerDetails;
import com.rs2hd.net.Packet;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.util.Misc;
import com.rs2hd.util.log.Logger;

/**
 * Login protocol decoder.
 * @author Graham
 *
 */
public class RS2LoginProtocolDecoder extends CumulativeProtocolDecoder {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	private WorkerThread workerThread;
	
	public RS2LoginProtocolDecoder(WorkerThread workerThread) {
		this.workerThread = workerThread;
	}
	
//	public static Cache CACHE;
//	static {
//		try {
//			CACHE = new Cache(com.rs2hd.Main.workingDir+"data/cache/");
//		} catch (FileNotFoundException e) {
//			CACHE = null;
//		}
//	}
	
//	private Queue<int[]> requests = new LinkedList<int[]>();
	
	/**
	 * Parses the data in the provided byte buffer and writes it to
	 * <code>out</code> as a <code>Packet</code>.
	 *
	 * @param session The IoSession the data was read from
	 * @param in	  The buffer
	 * @param out	 The decoder output stream to which to write the <code>Packet</code>
	 * @return Whether enough data was available to create a packet
	 */
	@Override
	public boolean doDecode(IoSession session, ByteBuffer in, ProtocolDecoderOutput out) {
		try {
			Object loginStageObj = session.getAttribute("LOGIN_STAGE");
			int loginStage = 0;
			if(loginStageObj != null) {
				loginStage = (Integer)loginStageObj;
			}
			//Logger.log("recv login packet, stage: "+loginStage);
			switch(loginStage) {
			case -2:
//				if(CACHE != null) {
//					while(session.isConnected() && in.remaining() >= 4) {
//						int requestType  = in.get()      & 0xFF;
//						int requestCache = in.get()      & 0xFF;
//						int requestId    = in.getShort() & 0xFFFF;
//						switch(requestType) {
//						case 0:
//							/*
//							 * Get.
//							 */
//							requests.add(new int[] { requestType, requestCache, requestId });
//							break;
//						case 1:
//							/*
//							 * Get now.
//							 */
//							session.write(getFile(requestCache, requestId));
//							break;
//						case 3:
//							/*
//							 * Clear equests.
//							 */
//							requests.clear();
//							break;
//						}
//						return true;
//					}
//					return false;
//				} else {
					if(8 <= in.remaining()) {
						for(int i = 0; i < 8; i++) {
							in.get();
						}
						StaticPacketBuilder ukeys = new StaticPacketBuilder();
						ukeys.setBare(true);
						for(int key : Constants.UPDATE_KEYS) {
							ukeys.addByte((byte) key);
						}
						session.write(ukeys.toPacket()).addListener(new IoFutureListener() {
							@Override
							public void operationComplete(IoFuture arg0) {
								arg0.getSession().close();
							}
						});
						return true;
					}
					in.rewind();
					return false;
//				}
			case -1:
				if(3 <= in.remaining()) {
					in.get();
				    int clientVersion = in.getShort();
				    if(clientVersion == 508) {
				    	StaticPacketBuilder u1Response = new StaticPacketBuilder();
	        			u1Response.setBare(true).addByte((byte) 0);
	        			session.write(u1Response.toPacket());
	        			session.setAttribute("LOGIN_STAGE", -2);
				    } else {
				    	StaticPacketBuilder u1Response = new StaticPacketBuilder();
	        			u1Response.setBare(true).addByte((byte) 6);
	        			session.write(u1Response.toPacket()).addListener(new IoFutureListener() {
							@Override
							public void operationComplete(IoFuture arg0) {
								arg0.getSession().close();
							}
	        			});
	        			session.removeAttribute("LOGIN_STAGE");
				    }
				    return true;
				}
				in.rewind();
				return false;
			case 0: //first login packets
				if(2 <= in.remaining()) {
					int protocolId = in.get() & 0xff;
					int nameHash = in.get() & 0xff;
					if(protocolId == 15) {
					    session.setAttribute("LOGIN_STAGE", -1);
					} else {
					    long serverSessionKey = ((long) (java.lang.Math.random() * 99999999D) << 32) + (long) (java.lang.Math.random() * 99999999D);
					    StaticPacketBuilder s1Response = new StaticPacketBuilder();
					    s1Response.setBare(true).addByte((byte) 0).addLong(serverSessionKey);
					    session.setAttribute("SERVER_SESSION_KEY", serverSessionKey);
					    session.write(s1Response.toPacket());
					    session.setAttribute("LOGIN_STAGE", 1);
					    session.setAttribute("NAME_HASH", nameHash);
					    //Logger.log("protocolId="+protocolId+"; namePart="+namePart);
					}
					return true;
				} else {
					in.rewind();
					return false;
				}
			case 1: //here's where we get the username and password
				@SuppressWarnings("unused")
				int loginType = -1, loginPacketSize = -1;
				if(3 <= in.remaining()) {
					loginType = in.get() & 0xff; //should be 16 or 18
					loginPacketSize = in.getUnsignedShort();
					//Logger.log("loginType="+loginType);
				} else {
					in.rewind();
					return false;
				}
				if(loginPacketSize <= in.remaining()) {
					byte[] payload = new byte[loginPacketSize];
					in.get(payload);
					Packet p = new Packet(session, -1, payload);
					@SuppressWarnings("unused")
					int loginEncryptPacketSize = loginPacketSize - (36 + 1 + 1 + 2); // can't be negative
					int clientVersion = p.readInt();
					if(clientVersion != 508) {
						Logger.getInstance().error("Invalid ver : " + clientVersion);
						session.close();
						return true;
					}
					@SuppressWarnings("unused")
					int lowMemoryVersion = p.readByte() & 0xff; // is this still low mem ver?
					p.readInt();
					for(int n=0; n<24; n++) {
						int cacheIDX = p.readByte(); //i don't care personally
						if(cacheIDX == 0) {
							// possibly a bot
							session.close();
							return true;
						}
					}
					p.readRS2String(); // settings string?
					for(int n=0; n<29; n++) {
						int junk = p.readInt();
						if(junk == 0 && n != 0) {
							// possibly a bot
							session.close();
							return true;
						}
					}
					int tmpEncryptPacketSize = p.readByte() & 0xff; //hopefully same as (--loginEncryptPacketSize)
					boolean hd = true;
					if(tmpEncryptPacketSize != 10) {
						@SuppressWarnings("unused")
						int encryptPacketId = p.readByte() & 0xff; //hopefully 10
						hd = false;
					}
					long clientSessionKey = p.readLong();
					long serverSessionKey = p.readLong();
					//int uid = p.readInt(); //unique identifier for this session i think ?
					long l = p.readLong();
					int hash = (int) (31 & l >> 16);
					if(hash != (Integer) session.getAttribute("NAME_HASH")) {
						// invalid name hash (possibly a bot attacking)
						session.close();
						return true;
					}
					String	user = Misc.longToPlayerName(l), //given username
							pass = p.readRS2String(); //given password
					
					int sessionKey[] = new int[4];
					sessionKey[0] = (int)(clientSessionKey >> 32);
					sessionKey[1] = (int)clientSessionKey;
					sessionKey[2] = (int)(serverSessionKey >> 32);
					sessionKey[3] = (int)serverSessionKey;
					
					// set in ISAAC
					for(int i = 0; i < 4; i++) sessionKey[i] += 50;
					// set out ISAAC
					
					session.removeAttribute("LOGIN_STAGE");
					session.removeAttribute("NAME_HASH");
					
					/** 
					 * Here's where we add the user to the login queue, and if the login is 
					 * accepted, we change their session filter to a standard RS2ProtocolCodec.
					 */
					logger.debug("Login request: [username="+user+",password="+pass+"].");
					
					PlayerDetails d = new PlayerDetails(user, pass, session, hd);
					workerThread.loadPlayer(d);
					
					session.setIdleTime(IdleStatus.BOTH_IDLE, Constants.SESSION_IDLE_TIME);
					
					session.getFilterChain().remove("protocolFilter");
					session.getFilterChain().addLast("protocolFilter", new ProtocolCodecFilter(new CodecFactory()));
					
					return true;
				} else {
					in.rewind();
					return false;
				}
			}
		} catch(Exception e) {
			//logger.stackTrace(e);
		}
		return false;
	}
	
	
	
//	private ByteBuffer getFile(int requestCache, int requestId) throws IOException {
//		ByteBuffer buffer = ByteBuffer.allocate(520);
//		buffer.put((byte) requestCache);
//		buffer.putShort((short) requestId);
//		byte[] cache = CACHE.read(CACHE.index(requestCache, requestId));
//		int len = (((cache[1] & 0xff) << 24)+((cache[2] & 0xff) << 16)+((cache[3] & 0xff) << 8)+(cache[4] & 0xff)) + 9;
//		if(cache[0] == 0) {
//			len -= 4;
//		}
//		int c = 3;
//		for(int i = 0; i < len; i++) {
//			if(c == 512) {
//				buffer.put((byte) 0xFF);
//				c = 1;
//			}
//			buffer.put(cache[i]);
//		}
//		return buffer.flip();
//	}



	/**
	 * Releases the buffer used by the given session.
	 *
	 * @param session The session for which to release the buffer
	 * @throws Exception if failed to dispose all resources
	 */
	@Override
	public void dispose(IoSession session) throws Exception {
		super.dispose(session);
	}

}
