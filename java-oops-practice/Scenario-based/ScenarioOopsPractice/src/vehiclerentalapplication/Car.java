package vehiclerentalapplication;

public class Car extends Vehicle implements Rentable {
	
	Car(String vehicle,String brand,String color,int days,int baseRate){
		super(vehicle,brand,color,days);
		this.baseRate=baseRate;
	}
	
	@Override
	public int calculateRent(int days) {
		return (1000*days+200);
	}
	
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Total Rent : " + calculateRent(days) );
		System.out.println("-------------------------");
	}
}
