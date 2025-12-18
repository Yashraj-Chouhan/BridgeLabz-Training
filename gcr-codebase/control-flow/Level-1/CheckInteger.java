import java.util.Scanner;
public class CheckInteger{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		//check for the number is Postive,negative or Zero
		if(number>0){
			System.out.println("Postive");
		}
		else if(number<0){
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
		sc.close();
	}

}