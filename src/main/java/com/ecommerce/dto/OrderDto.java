package com.ecommerce.dto;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecommerce.entities.Item;

public class OrderDto {
	private Date orderDate;
	private ArrayList<ItemDto> items;
	
	public ArrayList<ItemDto> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemDto> items) {
		this.items = items;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
