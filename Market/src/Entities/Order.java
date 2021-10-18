package Entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long orderID;
	private Long userID;
	private List<OrderLine> orderLines = new ArrayList<>();
	private String orderType;
	private String orderState;

	public Order() {
		this.orderID = 0L;
		orderLines.add(new OrderLine());
	}

	public void setUserID(Long ID) {
		this.userID = ID;
	}

	public Long getUserID() {
		return this.userID;
	}

	public void setOrderID(Long ID) {
		this.orderID = ID;
	}

	public Long getOrderID() {
		return this.orderID;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public void setOrderState(String state) {
		this.orderState = state;
	}

	public String getOrderState() {
		return this.orderState;
	}
}