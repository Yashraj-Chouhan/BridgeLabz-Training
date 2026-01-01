package com.objectmodeling.ecommerceplatform;

public class EcommerceDriver {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Headphones", 2000);
        Product p3 = new Product(103, "Mouse", 800);

        Order order1 = new Order(1);
        order1.addProduct(p1);
        order1.addProduct(p3);

        Customer customer = new Customer("Yashraj");

        customer.placeOrder(order1);

        Order order2 = new Order(2);
        order2.addProduct(p2);

        customer.placeOrder(order2);
    }
}

