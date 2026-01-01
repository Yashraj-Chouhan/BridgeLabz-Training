package com.objectmodeling.ecommerceplatform;

public class Customer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Order order) {
        System.out.println(customerName + " placed an order.");
        order.displayOrder(); // communication
    }
}
