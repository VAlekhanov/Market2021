package History;

import java.util.ArrayList;
import java.util.List;

import Entities.Order;

public class History {
	
	private List<Order> savedOrders = new ArrayList<Order>();

	public void saveOrder(Order currentOrder) {
		savedOrders.add(currentOrder);
	}
	
	public List<Order> getOrders() {
		return savedOrders;
	}
}