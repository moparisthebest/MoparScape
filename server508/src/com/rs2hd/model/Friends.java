package com.rs2hd.model;

import java.util.ArrayList;
import java.util.List;

import com.rs2hd.util.Misc;

/**
 * Manages friends and ignores.
 * @author Graham
 *
 */
public class Friends {
	
	private transient Player player;
	
	private List<Long> friends;
	private List<Long> ignores;
	
	private transient int messageCounter;
	
	public Friends() {
		friends = new ArrayList<Long>(200);
		ignores = new ArrayList<Long>(100);
	}
	
	public int getNextUniqueId() {
		if(messageCounter >= 16000000) {
			messageCounter = 0;
		}
		return messageCounter++;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
		this.messageCounter = 1;
	}

	public void refresh() {
		player.getActionSender().sendFriendsStatus(2);
		for(Long friend : friends) {
			player.getActionSender().sendFriend(friend, getWorld(friend));
		}
		long[] array = new long[ignores.size()];
		int i = 0;
		for(Long ignore : ignores) {
			if(ignore != null) {
				array[i++] = ignore;
			}
		}
		player.getActionSender().sendIgnores(array);
	}

	private int getWorld(Long friend) {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p != null) {
				if(p.getPlayerDetails().getUsernameAsLong() == friend) {
					return p.getWorld();
				}
			}
		}
		return 0;
	}

	public void addFriend(long name) {
		if(friends.size() >= 200) {
			player.getActionSender().sendMessage("Your friends list is full.");
			return;
		}
		if(friends.contains((Long) name)) {
			player.getActionSender().sendMessage(Misc.formatPlayerNameForDisplay(Misc.longToPlayerName(name)) + " is already on your friends list.");

			return;
		}
		friends.add((Long) name);
		player.getActionSender().sendFriend(name, getWorld(name));
		
	}

	public void addIgnore(long name) {
		if(ignores.size() >= 100) {
			player.getActionSender().sendMessage("Your ignore list is full.");
			return;
		}
		if(ignores.contains((Long) name)) {
			player.getActionSender().sendMessage(Misc.formatPlayerNameForDisplay(Misc.longToPlayerName(name)) + " is already on your ignore list.");
			return;
		}
		ignores.add((Long) name);
		
	}

	public void removeFriend(long name) {
		friends.remove((Long) name);
	}

	public void removeIgnore(long name) {
		ignores.remove((Long) name);
	}

	public void registered() {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p != null) {
				p.getFriends().registered(player);
			}
		}
	}

	private void registered(Player p) {
		long n = p.getPlayerDetails().getUsernameAsLong();
		if(friends.contains(n)) {
			player.getActionSender().sendFriend(n, getWorld(n));
		}
	}

	public void unregistered() {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p != null) {
				p.getFriends().unregistered(player);
			}
		}
	}

	private void unregistered(Player p) {
		long n = p.getPlayerDetails().getUsernameAsLong();
		if(friends.contains(n)) {
			player.getActionSender().sendFriend(n, 0);
		}
	}

	public void sendMessage(long name, String text) {
		for(Player p : World.getInstance().getPlayerList()) {
			if(p != null) {
				if(p.getPlayerDetails().getUsernameAsLong() == name) {
					p.getActionSender().sendReceivedPrivateMessage(player.getPlayerDetails().getUsernameAsLong(), player.getRights(), text);
					player.getActionSender().sendSentPrivateMessage(name, text);
					return;
				}
			}
		}
		player.getActionSender().sendMessage(Misc.formatPlayerNameForDisplay(Misc.longToPlayerName(name)) + " is currently unavailable.");
	}

}
