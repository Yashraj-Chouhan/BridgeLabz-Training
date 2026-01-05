package linkedlist.circularLinkedList.roundrobin;

import java.util.Scanner;

public class RoundRobinScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularProcessList scheduler = new CircularProcessList();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Process ID: ");
            int pid = sc.nextInt();
            System.out.print("Burst Time: ");
            int burst = sc.nextInt();
            System.out.print("Priority: ");
            int priority = sc.nextInt();

            scheduler.addProcess(pid, burst, priority);
        }

        System.out.print("\nEnter Time Quantum: ");
        int tq = sc.nextInt();

        scheduler.displayProcesses();
        scheduler.roundRobinSchedule(tq);

        sc.close();
    }
}
