// Program to convert distance from feet to yards and miles
import java.util.Scanner;

public class DistanceConversion
{  
    public static void main(String[] args)
    {
        //declare variables
        double distanceInFeet;
        Scanner input = new Scanner(System.in); 
        distanceInFeet = input.nextDouble(); 
        
		//converting feet to yards
        double yards = distanceInFeet / 3;  
        //converting yards to miles		
        double miles = yards / 1760;             
        //Display the result 
        System.out.println("The distance in yards is " + yards +
                           " and in miles is " + miles); 
    }
}