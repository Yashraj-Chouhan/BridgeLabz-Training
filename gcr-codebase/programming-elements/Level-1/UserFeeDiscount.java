//Import a Scanner Package to take input from user 
import java.util.Scanner;

//Created a Clasd UserFeeDiscount to calculate fee discount
public class UserFeeDiscount
{  
    public static void main(String[] args)
    {
        //declare variables fee & discountPercent
        double fee;
        double discountPercent;
        
		//Scanner object to take input from user
        Scanner input = new Scanner(System.in); 
		
        //taking fee input
        fee = input.nextDouble();

	    //taking discount percentage input
        discountPercent = input.nextDouble(); 
        
        double discount = fee * discountPercent / 100; //calculating discount
        double finalFee = fee - discount;               //calculating final fee
        
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee); //Display the result
    }
}