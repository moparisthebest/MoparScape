package com.rs2hd.net.codec;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import com.rs2hd.net.Packet;
import com.rs2hd.util.log.Logger;

public class RS2ProtocolEncoder implements ProtocolEncoder {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	/**
	 * Only CodecFactory can create us.
	 */
	protected RS2ProtocolEncoder() {}

	@Override
	/**
	 * Encodes a message.
	 * @param session
	 * @param message
	 * @param out
	 */
	public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception {
		try {
			Packet p = (Packet) message;
			byte[] data = p.getData();
			int dataLength = p.getLength();
			ByteBuffer buffer;
			if (!p.isBare()) {
				buffer = ByteBuffer.allocate(dataLength + 3);
				int id = p.getId();
				buffer.put((byte)id);
				if(p.getSize() != Packet.Size.Fixed) { //variable length
					//Logger.log("variable length: id="+id+",dataLength="+dataLength);
					if(p.getSize() == Packet.Size.VariableByte) {
						if(dataLength > 255) //trying to send more data then we can represent with 8 bits!
							throw new IllegalArgumentException("Tried to send packet length "+dataLength+" in 8 bits [pid="+p.getId()+"]");
						buffer.put((byte)dataLength);
					} else if(p.getSize() == Packet.Size.VariableShort) {
						if(dataLength > 65535) //trying to send more data then we can represent with 16 bits!
							throw new IllegalArgumentException("Tried to send packet length "+dataLength+" in 16 bits [pid="+p.getId()+"]");
						buffer.put((byte)(dataLength >> 8));
						buffer.put((byte)dataLength);
					}
				}
			} else {
				buffer = ByteBuffer.allocate(dataLength);
			}
			buffer.put(data, 0, dataLength);
			buffer.flip();
			out.write(buffer);
		} catch(Exception err) {
			logger.stackTrace(err);
		}
	}
	
	@Override
	/**
	 * Releases resources used by this encoder.
	 * @param session
	 */
	public void dispose(IoSession session) throws Exception {
	}

}
