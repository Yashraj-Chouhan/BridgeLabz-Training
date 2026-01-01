package com.Inheritance.multipleinheritance.onlineretailorder;

public class Order {
	 String orderId;
	    String orderDate;

	    Order(String orderId, String orderDate) {
	        this.orderId = orderId;
	        this.orderDate = orderDate;
	    }

	    String getOrderStatus() {
	        return "Order Placed";
	    }
}
