import java.util.Scanner;
public class BonusOfService{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int service=sc.nextInt();
		double bonus=0;
		
		//check the service year if more more than 5 year Increase salry by 5%.
		if(service>5){
		bonus = salary*0.05;
		}
		System.out.println("For The Service " + service + " The bonus amount is "+ bonus);
		sc.close();
	}
}	