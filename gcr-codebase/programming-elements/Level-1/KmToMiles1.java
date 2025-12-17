//import a scanner class to take input from userr
import java.util.Scanner;

//Create a class KmToMiles to covert km into miles
public class KmToMiles1
{
	public static void main(String args[]){
//Created a Object of Scanner class to take input from the user.	
     Scanner sc=new Scanner(System.in);
	 
//created a variable km indicates total km.
	 double km=sc.nextDouble();
	 
//created a Variable Miles calculates the Converted Miles from KM.	 
	 double Miles=km/1.6;
	 
//Print the Miles From the Given KM.	 
	 System.out.println("The total Miles is "+ Miles + " mile for the given " + km + " KM");
	 
// close the input object
	sc.close();	 
}
}