package com.rs2hd.model;

public class ShopConfiguration {
	
	private Shop currentShop = null;
	private boolean isInMainStock = true;
	
	public Shop getCurrentShop() {
		return currentShop;
	}
	
	public boolean isShopping() {
		return currentShop != null;
	}
	
	public void setCurrentShop(Shop shop) {
		currentShop = shop;
	}
	
	public void resetCurrentShop() {
		currentShop = null;
	}
	
	public boolean isInMainStock() {
		return isInMainStock;
	}
	
	public void setIsInMainStock(boolean b) {
		isInMainStock = b;
	}

}
