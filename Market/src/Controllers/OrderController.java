package Controllers;

import java.util.List;

import Entities.Cart;
import Entities.Order;
import Enums.OrderActionTypeEnum;
import Enums.OrderStateTypeEnum;
import History.History;
import Service.IDGenerator;

public class OrderController {

	private static IDGenerator idGenerator = new IDGenerator();
	private static History history = new History();
	private static Cart cart = new Cart();

	public Order executeOrderAction(Order order, String actionName) {
		Long orderId = order.getOrderID();
		List<Order> orders = history.getOrders();

		switch (actionName) {
		case OrderActionTypeEnum.CREATE: {
			order.setOrderID(idGenerator.generateNewOrderID());
			order.setOrderState(OrderStateTypeEnum.DRAFT);
			history.saveOrder(order);
			return order;
		}
		case OrderActionTypeEnum.DELETE: {
			order.setOrderState(OrderStateTypeEnum.DELETED);
			cart.removeOrder(order);
			order = getOrderFromListByOrderID(orders, orderId);
			history.saveOrder(order);
			return order;
		}
		case OrderActionTypeEnum.SAVE: {
			order.setOrderState(OrderStateTypeEnum.SAVED);
			cart.addOrder(order);
			orders = history.getOrders();
			order = getOrderFromListByOrderID(orders, orderId);
			history.saveOrder(order);
			return order;
		}
		case OrderActionTypeEnum.BUY: {
			order.setOrderState(OrderStateTypeEnum.PAID);
			cart.removeOrder(order);
			order = getOrderFromListByOrderID(orders, orderId);
			history.saveOrder(order);
			return order;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + actionName);
		}
	}

	public Order getOrderFromListByOrderID(List<Order> orders, Long Id) {
		int i = 0;
		for (Order order : orders) {
			if (Id == orders.get(i).getOrderID()) {
				return order;
			}
		}
		throw new IllegalArgumentException("This order not exist.");
	}
	
	public Order getOrderFromListByrID(List<Order> orders, Long Id) {
		int i = 0;
		for (Order order : orders) {
			if (Id == orders.get(i).getUserID()) {
				return order;
			}
		}
		throw new IllegalArgumentException("This order not exist.");
	}
}
