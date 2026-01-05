package cabbygo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle vehicle = new SUV("MP09AB1234"); // Polymorphism
        Driver driver = new Driver("Rahul", "LIC12345", 4.8);
        
        IRideService rideService = new RideService();
        rideService.bookRide(vehicle, driver, 12.5);
        rideService.endRide();
    }
}

