package com.rs2hd.model;

/**
 * Manages update flags.
 * @author Graham
 *
 */
public class PlayerUpdateFlags {
	
	private Location lastRegion;
	private boolean faceToUpdateRequired = false, appearanceUpdateRequired = true, chatTextUpdateRequired = false, animationUpdateRequired = false, graphicsUpdateRequired = false, hitUpdateRequired = false, hit2UpdateRequired = false;
	private boolean didTeleport = true, didMapRegionChange = false;
	private boolean clearFaceTo = false;
	
	private int faceTo = -1;
	
	public boolean isClearFaceTo() {
		return clearFaceTo;
	}
	
	public Location getLastRegion() {
		return lastRegion;
	}
	
	public void setLastRegion(Location lastRegion) {
		this.lastRegion = lastRegion;
	}
	
	public boolean isUpdateRequired() {
		return faceToUpdateRequired || appearanceUpdateRequired || chatTextUpdateRequired || animationUpdateRequired || graphicsUpdateRequired || hitUpdateRequired || hit2UpdateRequired;
	}
	
	public void setFaceToUpdateRequired(boolean b) {
		faceToUpdateRequired = b;
	}
	
	public void setFaceToUpdateRequired(boolean b, int i) {
		faceToUpdateRequired = b;
		faceTo = i;
	}
	
	public boolean isFaceToUpdateRequired() {
		return faceToUpdateRequired;
	}
	
	public int getFaceTo() {
		return faceTo;
	}
	
	public void clear() {
		faceTo = -1;
		faceToUpdateRequired = false;
		appearanceUpdateRequired = false;
		didTeleport = false;
		didMapRegionChange = false;
		chatTextUpdateRequired = false;
		animationUpdateRequired = false;
		graphicsUpdateRequired = false;
		hitUpdateRequired = false;
		hit2UpdateRequired = false;
	}
	
	public boolean isAppearanceUpdateRequired() {
		return appearanceUpdateRequired;
	}
	
	public boolean isGraphicsUpdateRequired() {
		return graphicsUpdateRequired;
	}
	
	public void setGraphicsUpdateRequired(boolean b) {
		this.graphicsUpdateRequired = b;
	}
	
	public boolean didTeleport() {
		return didTeleport;
	}
	
	public boolean didMapRegionChange() {
		return didMapRegionChange;
	}
	
	public void setDidMapRegionChange(boolean didMapRegionChange) {
		this.didMapRegionChange = didMapRegionChange;
	}

	public void setDidTeleport(boolean didTeleport) {
		this.didTeleport = didTeleport;
	}

	public void setAppearanceUpdateRequired(boolean b) {
		appearanceUpdateRequired = b;
	}
	
	public void setChatTextUpdateRequired(boolean b) {
		chatTextUpdateRequired = b;
	}

	public boolean isChatTextUpdateRequired() {
		return chatTextUpdateRequired;
	}

	public void setAnimationUpdateRequired(boolean b) {
		this.animationUpdateRequired = b;
	}
	
	public boolean isAnimationUpdateRequired() {
		return this.animationUpdateRequired;
	}
	
	public void setHitUpdateRequired(boolean b) {
		this.hitUpdateRequired = b;
	}
	
	public boolean isHitUpdateRequired() {
		return this.hitUpdateRequired;
	}
	
	public void setHit2UpdateRequired(boolean b) {
		this.hit2UpdateRequired = b;
	}
	
	public boolean isHit2UpdateRequired() {
		return this.hit2UpdateRequired;
	}

	public void setClearFaceTo(boolean b) {
		this.clearFaceTo = b;
	}

}
