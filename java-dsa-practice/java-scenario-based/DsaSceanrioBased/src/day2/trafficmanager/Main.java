package day2.trafficmanager;
public class Main {
    public static void main(String[] args) {

        TrafficManager manager = new TrafficManager(3);

        manager.enterVehicle("CAR-101");
        manager.enterVehicle("CAR-102");
        manager.enterVehicle("CAR-103");
        manager.enterVehicle("CAR-104"); // goes to queue

        manager.printRoundabout();
        manager.printWaitingQueue();

        System.out.println("\nVehicle exits:");
        manager.exitVehicle();

        manager.printRoundabout();
        manager.printWaitingQueue();

        manager.exitVehicle();
        manager.printRoundabout();
    }
}
