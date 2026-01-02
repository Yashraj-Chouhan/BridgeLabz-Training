package com.encapsulationpolymorphism.ecommerceplatform;

public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 12%";
    }
}

