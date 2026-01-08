package parkease;
public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot1 =
                new ParkingSlot(101, "City Center", "Car");

        Vehicle car =
                new Car("MP09AB1234");

        ParkingManager manager = new ParkingManager();

        manager.parkVehicle(slot1, car, 6);
        manager.showLogs();
    }
}
