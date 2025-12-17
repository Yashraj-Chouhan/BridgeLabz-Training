// Program to perform basic arithmetic operations
import java.util.Scanner;

public class Calculator
{  
    public static void main(String[] args)
    {
        //declare variables
        double number1;
        double number2;
        
		//Created a Variable number1 and number2, take the input from user
        Scanner input = new Scanner(System.in); 
        number1 = input.nextDouble(); 
        number2 = input.nextDouble(); 
        
        double addition = number1 + number2;       
        double subtraction = number1 - number2;     
        double multiplication = number1 * number2;  
        double division = number1 / number2;        
        
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division); //Display the result
    }
}
