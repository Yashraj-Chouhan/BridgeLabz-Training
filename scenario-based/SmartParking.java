package corejavapractice;
import java.util.Scanner;

public class SmartParking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 5;     // total parking slots
        int occupied = 0;     // currently parked vehicles
        int choice;

        while (true) {

            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("Parking Lot is FULL!");
                        return;
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking Lot is EMPTY!");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("Exiting Parking System...");
                    return;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}
