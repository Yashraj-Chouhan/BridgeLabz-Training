package parkease;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>(); // private records

    public void parkVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {

        if (!slot.isAvailable()) {
            System.out.println("Slot already occupied!");
            return;
        }

        slot.occupySlot();
        double charge = vehicle.calculateCharges(hours);

        bookingLogs.add("Vehicle parked in slot " + slot.getSlotId()
                + " | Charges: ₹" + charge);

        System.out.println("Vehicle parked successfully. Charges: ₹" + charge);
    }

    public void showLogs() {
        System.out.println("---- Parking Logs ----");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
