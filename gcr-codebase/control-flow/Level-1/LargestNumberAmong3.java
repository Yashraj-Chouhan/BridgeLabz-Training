import java.util.Scanner;

public class LargestNumberAmong3{
	public static void main(String args[])
	{ 
        //create a Scanner object and take 3 inputs	
	    Scanner sc=new Scanner(System.in);
	    int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
        //Check largest Number
		if(number1>number2 && number1>number3){
			System.out.println("Is the first number the largest? YES ");
		}
		else{
			System.out.println("Is the first number the largest? NO ");
		}
		if(number2>number1 && number2>number3) {
			 System.out.println("Is the Second number the largest? YES" );
		}
		else{
			System.out.println("Is the Second number the largest? NO ");
		}
		if(number3>number1 && number3>number2){
			 System.out.println("Is the third number the largest? YES");
		}
		else {
			System.out.println("Is the third number the largest? NO ");
		}
			
         //closing the Scanner Stream
         sc.close();			
	}
	
}