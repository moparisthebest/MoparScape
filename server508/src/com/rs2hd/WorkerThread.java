package com.rs2hd;

import java.util.LinkedList;
import java.util.Queue;

import org.apache.mina.common.IoFuture;
import org.apache.mina.common.IoFutureListener;
import org.apache.mina.common.WriteFuture;

import com.rs2hd.io.PlayerLoadResult;
import com.rs2hd.io.PlayerLoader;
import com.rs2hd.model.Player;
import com.rs2hd.model.PlayerDetails;
import com.rs2hd.model.World;
import com.rs2hd.packetbuilder.StaticPacketBuilder;
import com.rs2hd.util.log.Logger;

/**
 * Does blocking 'work'.
 * @author Graham
 *
 */
public class WorkerThread implements Runnable {
	
	/**
	 * Logger instance.
	 */
	private Logger logger = Logger.getInstance();
	
	/**
	 * Constructor.
	 */
	public WorkerThread(PlayerLoader loader) {
		this.loader = loader;
		this.playersToLoad = new LinkedList<PlayerDetails>();
		this.playersToSave = new LinkedList<Player>();
	}
	
	/**
	 * Players to load.
	 */
	private Queue<PlayerDetails> playersToLoad;
	
	/**
	 * Players to save.
	 */
	private Queue<Player> playersToSave;
	
	/**
	 * The player loader.
	 */
	private PlayerLoader loader;

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				cleanup();
				break;
			}
			synchronized(playersToLoad) {
				if(!playersToLoad.isEmpty()) {
					PlayerDetails d = null;
					while((d = playersToLoad.poll()) != null) {
						PlayerLoadResult r = loader.load(d);
						StaticPacketBuilder spb = new StaticPacketBuilder().setBare(true);
						int slot = -1;
						if(r.returnCode == 2) {
							slot = World.getInstance().register(r.player);
							if(slot == -1) {
								r.returnCode = Constants.ReturnCodes.WORLD_FULL;
							}
						}
						spb.addByte((byte) r.returnCode);
						if(r.returnCode == 2) {
							spb.addByte((byte) r.player.getRights());
							spb.addByte((byte) 0);
							spb.addByte((byte) 0);
							spb.addByte((byte) 0);
							spb.addByte((byte) 1);
							spb.addShort(slot);
							spb.addByte((byte) 0);
							d.getSession().setAttachment(r.player);
						}
						WriteFuture f = d.getSession().write(spb.toPacket());
						if(r.returnCode != 2) {
							f.addListener(new IoFutureListener() {
								@Override
								public void operationComplete(IoFuture arg0) {
									arg0.getSession().close();
								}
							});
						} else {
							r.player.getActionSender().sendLogin();
						}
						logger.debug("Loaded " + d.getDisplayName() + "'s game: returncode=" + r.returnCode + ".");
					}
					playersToLoad.clear();
				}
			}
			synchronized(playersToSave) {
				if(!playersToSave.isEmpty()) {
					Player p = null;
					while((p = playersToSave.poll()) != null) {
						if(loader.save(p)) {
							logger.debug("Saved " + p.getPlayerDetails().getDisplayName() + "'s game.");
						} else {
							logger.warning("Could not save " + p.getPlayerDetails().getDisplayName() + "'s game.");
						}
					}
					playersToSave.clear();
				}
			}
		}
	}

	private void cleanup() {
		// save ALL games
		logger.info("Saving all games...");
		int saved = 0;
		int total = 0;
		for(Player p : World.getInstance().getPlayerList()) {
			total++;
			if(loader.save(p)) {
				logger.debug("Saved " + p.getPlayerDetails().getDisplayName() + "'s game.");
				saved++;
			} else {
				logger.warning("Could not save " + p.getPlayerDetails().getDisplayName() + "'s game.");
			}
		}
		if(total == 0) {
			logger.info("No games to save.");
		} else {
			logger.info("Saved " + (saved/total*100) + "% of games ("+saved+"/"+total+").");
		}
	}

	public void loadPlayer(PlayerDetails d) {
		synchronized(playersToLoad) {
			playersToLoad.add(d);
		}
	}
	
	public void savePlayer(Player p) {
		synchronized(playersToSave) {
			playersToSave.add(p);
		}
	}

}
