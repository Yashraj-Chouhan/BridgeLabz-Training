package vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable{
	Truck(String vehicle,String brand,String color,int days,int baseRate){
		super(vehicle,brand,color,days);
		this.baseRate=baseRate;
	}
	
	
	@Override
	public int calculateRent(int days) {
		return (2000*days+300);
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Total Rent : "+calculateRent(days) );
		System.out.println("-------------------------");
	}
}
