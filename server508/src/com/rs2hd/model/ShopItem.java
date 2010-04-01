package com.rs2hd.model;

/**
 * A shop item.
 * @author Graham
 *
 */
public class ShopItem extends Item {
	
	private int standardAmount = 0;

	public ShopItem(int id, int amount) {
		super(id, amount);
		this.standardAmount = amount;
	}
	
	public int getStandardAmount() {
		return standardAmount;
	}

	public boolean updateAmount() {
		if(getAmount() > standardAmount) {
			setAmount(getAmount()-1);
			return true;
		} else if(getAmount() < standardAmount) {
			setAmount(getAmount()+1);
			return true;
		}
		return false;
	}

}
