package com.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	@ManyToOne
	@JoinColumn(name="orderId", referencedColumnName = "orderId")
	private Order orders;
	private String itemName;
	private String itemUnitPrice;
	private long itemQuantity;
	
//	@ManyToOne
//    @JoinColumn(name="orderId", nullable=false)
//    private Order order;
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
//	public long getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(long orderId) {
//		this.orderId = orderId;
//	}
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
