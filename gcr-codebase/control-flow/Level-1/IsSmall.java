
import java.util.Scanner;

public class IsSmall{
	public static void main(String args[])
	{ 
	    //create a Scanner object and take 3 inputs	
	    Scanner sc=new Scanner(System.in);
	    int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		//Check if the First Number is Smallest 
		if(number1<number2 && number1<number3){
			System.out.println("Is the first number the smallest? YES");
		}
		else {
			System.out.println("Is the first number the smallest? No");
		}
		//closing the Scanner Stream
        sc.close();			
	}
	
}