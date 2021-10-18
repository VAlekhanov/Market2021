package Entities;

public class OrderLine {
	private int quantity;
	private String itemName;

	public OrderLine() {
		this.itemName = "";
		this.quantity = 0;
	}

	public OrderLine(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public String getItem() {
		return this.itemName;
	}

	public void addItem(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public void removeItem(String itemName, int quantity) {
		this.itemName = "";
		this.quantity = 0;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}

}
