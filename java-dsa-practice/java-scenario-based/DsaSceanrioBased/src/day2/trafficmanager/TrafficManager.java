package day2.trafficmanager;
import java.util.*;

class TrafficManager {

    private Vehicle head = null;
    private Vehicle tail = null;
    private int capacity;
    private int count = 0;

    private Queue<String> waitingQueue = new LinkedList<>();

    TrafficManager(int capacity) {
        this.capacity = capacity;
    }

    // Add vehicle to roundabout
    public void enterVehicle(String number) {

        if (count == capacity) {
            System.out.println("Roundabout full. Vehicle " + number + " added to waiting queue.");
            waitingQueue.offer(number);
            return;
        }

        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = tail = newVehicle;
            newVehicle.next = newVehicle; // circular
        } else {
            tail.next = newVehicle;
            newVehicle.next = head;
            tail = newVehicle;
        }

        count++;
        System.out.println("Vehicle entered roundabout: " + number);
    }

    // Remove vehicle from roundabout
    public void exitVehicle() {

        if (head == null) {
            System.out.println("Roundabout empty. No vehicle to exit.");
            return;
        }

        System.out.println("Vehicle exited roundabout: " + head.number);

        if (head == tail) {
            head = tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }

        count--;

        // Allow waiting vehicle to enter
        if (!waitingQueue.isEmpty()) {
            String nextVehicle = waitingQueue.poll();
            enterVehicle(nextVehicle);
        }
    }

    // Print roundabout state
    public void printRoundabout() {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout vehicles: ");
        Vehicle temp = head;

        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.number + ")");
    }

    // Print waiting queue
    public void printWaitingQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}
