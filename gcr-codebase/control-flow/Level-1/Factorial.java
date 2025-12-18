import java.util.Scanner;
public class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factorial=0;
		//check for number is 0 or not and assign value based on it.
		if(number!=0){
		factorial=1;
		}
		
		//Find Factorial for number.
		while(number>0)
		{
		   factorial *=number;
		   number--;
		}
		
		System.out.println(factorial);
		
		sc.close();
		
	}
}