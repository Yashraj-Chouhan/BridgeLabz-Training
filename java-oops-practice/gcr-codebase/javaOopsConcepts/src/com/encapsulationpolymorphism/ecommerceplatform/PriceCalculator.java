package com.encapsulationpolymorphism.ecommerceplatform;

import java.util.List;

class PriceCalculator {

    public static void printFinalPrice(List<Product> products) {

        for (Product product : products) {
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}

