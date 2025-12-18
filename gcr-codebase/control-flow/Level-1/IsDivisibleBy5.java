import java.util.Scanner;

public class IsDivisibleBy5{
  public static void main(String args[])
  {
  //create an object Scanner and take input
       Scanner sc=new Scanner(System.in);
	   int number=sc.nextInt();
	   
  //check for the number is divisible by 5 or not
       if(number%5==0){
		System.out.println("Is the number " + number + " divisible by 5 ? YES " );   
		}
		else{
		System.out.println("Is the number" + number + " divisible by 5 ? NO ");
		}
		sc.close();
}
}
