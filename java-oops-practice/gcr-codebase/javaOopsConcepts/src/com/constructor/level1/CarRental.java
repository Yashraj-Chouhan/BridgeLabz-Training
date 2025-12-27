package com.constructor.level1;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
    public CarRental() {
        customerName = "Customer";
        carModel = "Hatchback";
        rentalDays = 1;
        calculateTotalCost();
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    public void calculateTotalCost() {
        double pricePerDay;

        switch (carModel) {
            case "Sedan":
                pricePerDay = 2000;
                break;
            case "SUV":
                pricePerDay = 3000;
                break;
            default:
                pricePerDay = 1500; // Hatchback
        }

        totalCost = pricePerDay * rentalDays;
    }
    
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + totalCost);
        System.out.println("---------------------------");
    }
}
