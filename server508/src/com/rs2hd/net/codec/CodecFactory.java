package com.rs2hd.net.codec;

import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

import com.rs2hd.WorkerThread;

/**
 * Provides access to the encoders and decoders for the 508 protocol.
 * @author Graham
 *
 */
public class CodecFactory implements ProtocolCodecFactory {
	
	public CodecFactory(WorkerThread workerThread) {
		this.decoder = new RS2LoginProtocolDecoder(workerThread);
	}
	
	public CodecFactory() {
		this.decoder = new RS2ProtocolDecoder();
	}
	
	/**
	 * The encoder.
	 */
	private ProtocolEncoder encoder = new RS2ProtocolEncoder();
	
	/**
	 * The decoder.
	 */
	private ProtocolDecoder decoder;
	
	@Override
	/**
	 * Get the encoder.
	 */
	public ProtocolEncoder getEncoder() throws Exception {
		return encoder;
	}

	@Override
	/**
	 * Get the decoder.
	 */
	public ProtocolDecoder getDecoder() throws Exception {
		return decoder;
	}

}
