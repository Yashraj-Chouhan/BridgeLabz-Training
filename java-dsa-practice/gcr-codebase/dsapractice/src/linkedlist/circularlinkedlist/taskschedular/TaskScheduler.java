package linkedlist.circularLinkedList.taskschedular;

import java.util.Scanner;

public class TaskScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularTaskList list = new CircularTaskList();
        int choice;

        do {
            System.out.println("\n--- Task Scheduler (Circular Linked List) ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task & Move Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Due Date: ");
                    String date = sc.nextLine();

                    if (choice == 1)
                        list.addAtBeginning(id, name, priority, date);
                    else if (choice == 2)
                        list.addAtEnd(id, name, priority, date);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, id, name, priority, date);
                    }
                    break;

                case 4:
                    System.out.print("Enter Task ID: ");
                    list.removeByTaskId(sc.nextInt());
                    break;

                case 5:
                    list.viewNextTask();
                    break;

                case 6:
                    list.displayAllTasks();
                    break;

                case 7:
                    System.out.print("Enter Priority: ");
                    list.searchByPriority(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Exiting Task Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

