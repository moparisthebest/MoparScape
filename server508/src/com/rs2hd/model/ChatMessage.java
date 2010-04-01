package com.rs2hd.model;

public class ChatMessage {
	
	private int effects;
	private int numChars;
	private String chatText;
	
	public ChatMessage(int effects, int numChars, String chatText) {
		this.effects = effects;
		this.numChars = numChars;
		this.chatText = chatText;
	}
	
	public int getEffects() {
		return effects;
	}
	
	public int getNumChars() {
		return numChars;
	}
	
	public String getChatText() {
		return chatText;
	}

}
