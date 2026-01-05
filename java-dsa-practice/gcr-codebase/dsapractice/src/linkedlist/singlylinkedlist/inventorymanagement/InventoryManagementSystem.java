package linkedlist.singlylinkedlist.inventorymanagement;

import java.util.Scanner;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by Item ID");
            System.out.println("7. Search by Item Name");
            System.out.println("8. Display Inventory");
            System.out.println("9. Calculate Total Value");
            System.out.println("10. Sort by Name (Asc/Desc)");
            System.out.println("11. Sort by Price (Asc/Desc)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        inventory.addAtBeginning(id, name, qty, price);
                    else if (choice == 2)
                        inventory.addAtEnd(id, name, qty, price);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        inventory.addAtPosition(pos, id, name, qty, price);
                    }
                    break;

                case 4:
                    System.out.print("Item ID: ");
                    inventory.removeByItemId(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Item ID: ");
                    int i = sc.nextInt();
                    System.out.print("New Quantity: ");
                    inventory.updateQuantity(i, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Item ID: ");
                    inventory.searchByItemId(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Item Name: ");
                    inventory.searchByItemName(sc.nextLine());
                    break;

                case 8:
                    inventory.display();
                    break;

                case 9:
                    inventory.calculateTotalValue();
                    break;

                case 10:
                    System.out.print("Ascending? (true/false): ");
                    inventory.sortByName(sc.nextBoolean());
                    break;

                case 11:
                    System.out.print("Ascending? (true/false): ");
                    inventory.sortByPrice(sc.nextBoolean());
                    break;

                case 0:
                    System.out.println("Exiting Inventory System...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

