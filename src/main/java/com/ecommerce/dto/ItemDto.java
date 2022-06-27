package com.ecommerce.dto;




public class ItemDto {
	
	private String itemName;
	private String itemUnitPrice;
	private long itemQuantity;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public long getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
