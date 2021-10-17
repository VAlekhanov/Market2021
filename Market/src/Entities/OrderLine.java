package Entities;

import java.util.*;

public class OrderLine {
	private int quantity;
	private String itemName;
	
	public OrderLine() {
	}

	public OrderLine(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
	}
	
	public void setItem (String itemName) {
		this.itemName = itemName;
	}
	
	public String getItem () {
		return this.itemName;
	}


	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity () {
		return this.quantity;
	}
	
	
}
