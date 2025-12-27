package com.constructor.level1;

public class CarRentalDriver {
	public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Yashraj", "SUV", 4);

        r1.displayRentalDetails();
        r2.displayRentalDetails();
    }

}
