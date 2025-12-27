package com.constructor.level1;

public class VehicleDriver {
	public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Yashraj", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
