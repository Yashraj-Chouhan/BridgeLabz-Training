package com.Inheritance.hybridinheritance.vehiclemangementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle(160, "Tesla Model 3", 75);
        Vehicle v2 = new PetrolVehicle(180, "Honda City", 40);

        v1.displayInfo();
        if (v1 instanceof ElectricVehicle) {
            ((ElectricVehicle) v1).charge();
        }

        System.out.println("------------------");

        v2.displayInfo();
        if (v2 instanceof Refuelable) {
            ((Refuelable) v2).refuel();
        }
    }
}
