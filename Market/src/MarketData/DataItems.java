package MarketData;

import java.util.ArrayList;
import java.util.List;

import Entities.Item;

public class DataItems {
	private List<Item> items = new ArrayList<>();

	private void defaultItems() {
//		items.add(new Item("Orange Juice", 123456L, "Drink", "Fresh orange juice", 24));
//		items.add(new Item("Potato", 121212L, "Vegetable", "Fresh juice", 12));
//		items.add(new Item("Water", 111111L, "Drink", "Fresh water", 20));
//		items.add(new Item("Bread", 234567L, "Bakery", "From bake", 10));
//		items.add(new Item("Milk", 232323L, "Drink", "Fresh cow's milk", 23));
//		items.add(new Item("Tomato", 454545L, "Vegetable", "Fresh tomato", 7));
//		items.add(new Item("Fried Chicken", 100000L, "Meat", "Fresh meat", 28));
//		items.add(new Item("Apple Juice", 123456L, "Drink", "Fresh apple juice", 24));
	}

	public List<Item> allItems() {
		if (items.isEmpty()) {
			defaultItems();
		}
		return items;
	}
}
