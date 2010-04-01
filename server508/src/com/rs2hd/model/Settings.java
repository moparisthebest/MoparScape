package com.rs2hd.model;

/**
 * Settings.
 * @author Graham
 *
 */
public class Settings {
	
	private boolean chat = true, split = false, mouse = true, aid = false;
	private boolean hideDeathInterface = false, autoRetaliate = true;
	private transient Player player;
	
	public void setDefaultSettings() {
		chat = true;
		split = false;
		mouse = true;
		aid = false;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void refresh() {
		player.getActionSender().sendConfig(171, !chat ? 1 : 0);
		player.getActionSender().sendConfig(287, split? 1 : 0);
		player.getActionSender().sendConfig(170, !mouse ? 1 : 0);
		player.getActionSender().sendConfig(427, aid ? 1 : 0);
		player.getActionSender().sendConfig(172, !autoRetaliate ? 1 : 0);
	}
	
	public boolean isHidingDeathInterface() {
		return hideDeathInterface;
	}
	
	public void setHideDeathInterface(boolean b) {
		this.hideDeathInterface = b;
	}
	
	public boolean isMouseTwoButtons() {
		return mouse;
	}
	
	public boolean isChatEffectsEnabled() {
		return chat;
	}
	
	public boolean isPrivateChatSplit() {
		return split;
	}
	
	public boolean isAcceptAidEnabled() {
		return aid;
	}
	
	public void setMouseTwoButtons(boolean mouse) {
		this.mouse = mouse;
	}
	
	public void setChatEffectsEnabled(boolean chat) {
		this.chat = chat;
	}
	
	public void setPrivateChatSplit(boolean split) {
		this.split = split;
	}
	
	public void setAcceptAidEnabled(boolean aid) {
		this.aid = aid;
	}

	public boolean isAutoRetaliate() {
		return this.autoRetaliate;
	}
	
	public void setAutoRetaliate(boolean retaliate) {
		this.autoRetaliate = retaliate;
	}

}
