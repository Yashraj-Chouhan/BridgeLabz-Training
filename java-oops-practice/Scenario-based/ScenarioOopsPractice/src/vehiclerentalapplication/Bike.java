package vehiclerentalapplication;

public class Bike extends Vehicle implements Rentable {
	Bike(String vehicle,String brand,String color,int days,int baseRate){
		super(vehicle,brand,color,days);
		this.baseRate=baseRate;
		
	}
	
	@Override
	public int calculateRent(int days) {
		return (500*days+100);
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Total Rent : "+ calculateRent(days));
		System.out.println("-------------------------");
	}
	

}
