// Program to find side of a square using perimeter
import java.util.Scanner;

public class SquareSide
{  
    public static void main(String[] args)
    {
        //declare variables
        double perimeter;
        Scanner input = new Scanner(System.in); 
        perimeter = input.nextDouble(); 
        
		//Calculating the Perimeter
        double side = perimeter / 4; 
        
		//print the Length of side and perimeter
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter); //Display the result
    }
}

