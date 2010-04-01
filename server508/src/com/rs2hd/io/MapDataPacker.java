package com.rs2hd.io;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import com.rs2hd.util.log.Logger;

/**
 * Packs map data
 * 
 * @author TeleNubby
 * @author Graham
 * 
 */
public class MapDataPacker {
	
	/**
	 * Logger instance.
	 */
	private static Logger logger = Logger.getInstance();

	/**
	 * Prevent an instance being made.
	 */
	private MapDataPacker() {
	}

	/**
	 * We actually pack the mapdata here.
	 */
	public static void pack(String from, String to) {
		logger.info("Packing mapdata...");
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(to));
			int i2 = 0;
			for (int i = 0; i < 16384; i++) {
				if (new File(from + i + ".txt").exists()) {
					BufferedReader in = new BufferedReader(new FileReader(from + i + ".txt"));
					out.writeInt(i);
					for (int j = 0; j < 4; j++) {
						out.writeInt(Integer.parseInt(in.readLine()));
					}
					in.close();
					i2++;
				}
			}
			out.flush();
			out.close();
			logger.info("Complete.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
