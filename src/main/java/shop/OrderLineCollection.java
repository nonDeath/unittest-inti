package shop;

import java.util.ArrayList;

public class OrderLineCollection extends ArrayList<OrderLine>{
	
	private Order order;
	
	public OrderLineCollection(Order o) {
		this.order = o;
	}
	
	public void addOrderLine(int id, int quantity) {
		OrderLine ol = new OrderLine(order);
		ol.setId(id);
		ol.setQuantity(quantity);
		this.add(ol);
	}
}
