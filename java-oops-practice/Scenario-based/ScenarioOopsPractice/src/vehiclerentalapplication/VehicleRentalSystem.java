package vehiclerentalapplication;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Bike("Sports","Royal Enfield","Balck",2,1000);
		Customer c1=new Customer("Yashraj",744885599);
		c1.customerInfo();
		v1.displayInfo();
		

	}

}
