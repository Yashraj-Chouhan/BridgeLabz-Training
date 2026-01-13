package day2.callcentre;
import java.util.*;

public class CallCenter {

    // Normal customer queue (FIFO)
    Queue<Customer> normalQueue = new LinkedList<>();

    // VIP customer priority queue
    PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
        (c1, c2) -> Boolean.compare(c2.isVIP, c1.isVIP)
    );

    // HashMap to track number of calls per customer
    HashMap<String, Integer> callCountMap = new HashMap<>();

    // Add incoming call
    public void receiveCall(Customer customer) {

        // Update call count
        callCountMap.put(
            customer.name,
            callCountMap.getOrDefault(customer.name, 0) + 1
        );

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        System.out.println("Call received from: " + customer);
    }

    // Handle next call
    public void handleCall() {
        Customer current;

        if (!vipQueue.isEmpty()) {
            current = vipQueue.poll(); // VIP first
        } else if (!normalQueue.isEmpty()) {
            current = normalQueue.poll(); // FIFO
        } else {
            System.out.println("No calls to handle.");
            return;
        }

        System.out.println("Handling call of: " + current);
    }

    // Display call statistics
    public void showCallStats() {
        System.out.println("\nMonthly Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " calls");
        }
    }
}
