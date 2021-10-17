package Entities;

import java.util.*;

public class Cart {
	List <Order> orders = new ArrayList<>();
	
	public void addOrder (Order order) {
		orders.add(order);
	}
	
	public void removeOrder (Order order) {
		orders.remove(order);
	}
}
