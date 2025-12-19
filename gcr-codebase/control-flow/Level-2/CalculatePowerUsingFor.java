import java.util.Scanner;
public class CalculatePowerUsingFor {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		// take user input number and power
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		
		
		// check number and power is positive 
		if(number > 0 && power >0){
			int result = 1;
			for(int i = 1; i <= power; i++ ){
				result *= number;
			}
			System.out.println("The result is "+ result);
        }
		else{
		System.out.println("Invalid input");
		}
		
		//scanner object close
		sc.close();
	}	
			
}	