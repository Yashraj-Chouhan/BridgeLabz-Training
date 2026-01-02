package vehiclerentalapplication;

public class Vehicle {
	protected String vehicle;
	protected String brand;
	private String color;
	protected int days;
	protected int  baseRate;
	
	Vehicle(String vehicle,String brand,String color,int days){
		this.vehicle=vehicle;
		this.brand=brand;
		this.color=color;
		this.days=days;
	}
	
	public String getVehicle() {
		return vehicle;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getDays() {
		return days;
	}
	public void displayInfo() {
		System.out.println("Vehicle Rented : "+ getVehicle()+"\nBrand Name "+ getBrand()+
							"\nColor : "+getColor()+"\n Rented Days"+getDays());
		
	}
	

}
