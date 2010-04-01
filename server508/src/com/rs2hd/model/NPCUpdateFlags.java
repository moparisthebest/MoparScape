package com.rs2hd.model;

/**
 * NPC update flags.
 * @author Graham
 *
 */
public class NPCUpdateFlags {
	
	private boolean graphicsUpdateRequired = false, animationUpdateRequired = false, hit1UpdateRequired = false, hit2UpdateRequired = false, faceToUpdateRequired = false;
	private boolean clearFaceTo = false;
	
	public boolean isClearFaceTo() {
		return clearFaceTo;
	}
	
	public void setClearFaceTo(boolean b) {
		this.clearFaceTo = b;
	}

	private int faceTo = -1;
	
	public boolean isUpdateRequired() {
		return animationUpdateRequired || hit1UpdateRequired || hit2UpdateRequired || faceToUpdateRequired || graphicsUpdateRequired;
	}
	
	public void setAnimationUpdateRequired(boolean b) {
		this.animationUpdateRequired = b;
	}
	
	public boolean isAnimationUpdateRequired() {
		return animationUpdateRequired;
	}
	
	public void setHit1UpdateRequired(boolean b) {
		this.hit1UpdateRequired = b;
	}
	
	public boolean isHit1UpdateRequired() {
		return hit1UpdateRequired;
	}
	
	public void setHit2UpdateRequired(boolean b) {
		this.hit1UpdateRequired = b;
	}
	
	public boolean isHit2UpdateRequired() {
		return hit2UpdateRequired;
	}
	
	public boolean isFaceToUpdateRequired() {
		return faceToUpdateRequired;
	}
	
	public void setFaceToUpdateRequired(boolean b) {
		this.faceToUpdateRequired = b;
	}
	
	public void setFaceToUpdateRequired(boolean b, int i) {
		this.faceToUpdateRequired = b;
		this.faceTo = i;
	}
	
	public int getFaceTo() {
		return faceTo;
	}
	
	public void clear() {
		animationUpdateRequired = false;
		faceTo = -1;
		faceToUpdateRequired = false;
		hit1UpdateRequired = false;
		hit2UpdateRequired = false;
		graphicsUpdateRequired = false;
	}

	public void setGraphicsUpdateRequired(boolean b) {
		graphicsUpdateRequired = b;
	}

	public boolean isGraphicsUpdateRequired() {
		return graphicsUpdateRequired;
	}

}
