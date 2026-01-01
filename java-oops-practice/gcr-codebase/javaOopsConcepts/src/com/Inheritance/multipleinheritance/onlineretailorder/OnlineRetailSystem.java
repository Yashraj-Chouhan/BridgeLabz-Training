package com.Inheritance.multipleinheritance.onlineretailorder;

public class OnlineRetailSystem {
    public static void main(String[] args) {

        Order order = new Order("ORD101", "01-01-2026");
        System.out.println(order.getOrderStatus());

        ShippedOrder shipped = new ShippedOrder(
                "ORD102", "02-01-2026", "TRK789"
        );
        System.out.println(shipped.getOrderStatus());

        DeliveredOrder delivered = new DeliveredOrder(
                "ORD103", "03-01-2026", "TRK999", "05-01-2026"
        );
        System.out.println(delivered.getOrderStatus());
    }
}

