package com.rs2hd;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.rs2hd.io.MapDataLoader;
import com.rs2hd.io.MapDataPacker;
import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.model.ItemDefinition;
import com.rs2hd.model.NPCDefinition;
import com.rs2hd.model.World;
import com.rs2hd.packethandler.PacketHandlers;
import com.rs2hd.util.Scripts;
import com.rs2hd.util.log.Logger;

/**
 * A varek has called it before, the 'central motor' of the game.
 * 
 * That means it handles periodic updating and packet handling/creation.
 * 
 * @author Graham
 *
 */
public class GameEngine {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	/**
	 * Running flag.
	 */
	private boolean isRunning;
	
	/**
	 * This makes you wish that Java supported typedefs.
	 */
	private Map<Integer, int[]> mapData;
	
	/**
	 * Our worker thread.
	 */
	private WorkerThread workerThread;
	
	/**
	 * Thread group.
	 */
	private ThreadGroup threads = new ThreadGroup("RuneShard");
	
	/**
	 * Creates other things vital to the game logic, like the world class.
	 * @throws Exception 
	 */
	public GameEngine() throws Exception {
		/*
		 * We are running.
		 */
		isRunning = true;
		/*
		 * Check if mapdata packed file exists, if not, then we pack it.
		 */
		File packedFile = new File(com.rs2hd.Main.workingDir+"data/mapdata/packed.dat");
		if(!packedFile.exists()) {
			MapDataPacker.pack(com.rs2hd.Main.workingDir+"data/mapdata/unpacked/", com.rs2hd.Main.workingDir+"data/mapdata/packed.dat");
		}
		/*
		 * Actually load the mapdata.
		 */
		mapData = new HashMap<Integer, int[]>();
		MapDataLoader.load(mapData);
		/*
		 * Load handlers.
		 */
		PacketHandlers.loadHandlers();
		/*
		 * Load item definitions.
		 */
		logger.info("Loading item definitions...");
		ItemDefinition.load();
		logger.info("Loading npc definitions...");
		NPCDefinition.load();
		/*
		 * Set up the world.
		 */
		logger.info("Setting up world...");
		World.getInstance().setEngine(this);
		/*
		 * Start the worker thread.
		 */
		logger.info("Launching worker thread...");
		workerThread = new WorkerThread(new XStreamPlayerLoader());
		newThread("WorkerThread", workerThread);
		/*
		 * Run scripts.
		 */
		Scripts.init();
	}
	
	public void newThread(String name, Runnable r) {
		new Thread(threads, r, name).start();
	}
	
	/**
	 * Handle a major update.
	 */
	public void majorUpdate() {
		World.getInstance().majorUpdate();
	}
	
	/**
	 * Handle a minor update.
	 */
	public void minorUpdate() {
		World.getInstance().minorUpdate();
	}
	
	/**
	 * Called every tick.
	 */
	public void tick() {
		World.getInstance().tick();
	}
	
	/**
	 * Gets the is running flag.
	 * @return
	 */
	public boolean isRunning() {
		return isRunning;
	}
	
	/**
	 * Sets the is running flag.
	 * @param isRunning
	 */
	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	/**
	 * Gets the worker thread.
	 * @return
	 */
	public WorkerThread getWorkerThread() {
		return workerThread;
	}
	
	/**
	 * Stops threads, saves games, etc.
	 */
	public void cleanup() {
		threads.interrupt();
	}

	public int[] getMapData(int region) {
		return mapData.get(region);
	}

}
