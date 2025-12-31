/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seats = 5;
        int choice;

        while (true) {

            if (seats == 0) {
                System.out.println(" All seats are booked. Booking closed.");
                break;
            }

            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Ticket booked successfully.");
                    seats--;
                    System.out.println("Remaining seats: " + seats);
                    break;

                case 2:
                    System.out.println(" Exiting booking system.");
                    return;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
