package cabbygo;

public abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;

    protected double ratePerKm; // used by subclasses

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateFare(double distance);
}
