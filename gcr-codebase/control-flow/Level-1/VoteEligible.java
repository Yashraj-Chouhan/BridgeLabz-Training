import java.util.Scanner;
public class VoteEligible{
	public static void main(String args[]){
		//create scanner object and take input
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		//check if Person is eligibal to vote or not 
		if(age>=18){
			System.out.println("The person's age is " + age + "and can vote");
		}
		else {
			System.out.println("The person's age is " + age + "and cannot vote");
		}
	}
}