package com.objectmodeling.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
        System.out.println();
    }
}

