import java.util.Scanner;
public class SimpleInterest{
	public static double simpleInterest(int principal,double rate,double time ){
		double simpleInterest = (double) principal* time/100;
		return simpleInterest;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		
		System.out.println("The Simple Interest is"+ simpleInterest(principal,rate,time)+" for Principal "+principal+
		                    " Rate of Interest "+ rate + " and Time ");
							
	}
}