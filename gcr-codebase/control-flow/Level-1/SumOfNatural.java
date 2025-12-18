import java.util.Scanner;

public class SumOfNatural{
	public static void main(String args[])
	{ 
       //create a Scanner object and take input
	   Scanner sc=new Scanner(System.in);
	   int number=sc.nextInt();
	   int sum=0;
	   
       //check if Natural Number and Sum if it is natural	
       if(number>0){
          sum=n * (n+1) / 2 
		System.out.println("The sum of " + number + " Natural Number is "+sum);
		}
		else{
		 System.out.println("The number "+ number + " is not a natural number");
		}
		
		// Closing the Scanner Object
		sc.close();
	}
}	
	   
	   