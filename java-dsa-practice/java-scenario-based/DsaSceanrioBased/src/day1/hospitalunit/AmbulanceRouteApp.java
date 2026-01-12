package day1.hospitalunit;

public class AmbulanceRouteApp {

    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayRoute();

        // Ambulance searching for available unit
        route.findAvailableUnit();

        // Unit goes under maintenance
        route.removeUnit("Surgery");

        route.displayRoute();

        // Search again
        route.findAvailableUnit();
    }
}
