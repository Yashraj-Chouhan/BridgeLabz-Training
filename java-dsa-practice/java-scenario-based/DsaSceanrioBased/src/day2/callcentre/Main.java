package day2.callcentre;
public class Main {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall(new Customer("Aman", false));
        center.receiveCall(new Customer("Rahul", true));
        center.receiveCall(new Customer("Neha", false));
        center.receiveCall(new Customer("Rahul", true));
        center.receiveCall(new Customer("Aman", false));

        System.out.println("\n--- Handling Calls ---");
        center.handleCall();
        center.handleCall();
        center.handleCall();
        center.handleCall();

        center.showCallStats();
    }
}
