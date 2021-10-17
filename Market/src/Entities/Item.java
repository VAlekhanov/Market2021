package Entities;

public class Item {
	private String itemName;
	private Long ID;
	private String category;
	private String description;
	private double price;

	public Item() {
	}

	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public String getName() {
		return this.itemName;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}
	
	public Long getID() {
		return this.ID;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
	
}