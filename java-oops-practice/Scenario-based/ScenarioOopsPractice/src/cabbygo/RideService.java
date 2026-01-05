package cabbygo;

public class RideService implements IRideService {

    private double fare; // sensitive data

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        fare = vehicle.calculateFare(distance);

        System.out.println("Ride Booked ");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended. Thank you for riding with CabbyGo!");
    }

    public double getFare() {
        return fare;
    }
}
