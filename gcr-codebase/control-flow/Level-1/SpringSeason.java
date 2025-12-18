import java.util.Scanner;
public class SpringSeason {
	public static void main(String []args) {
		
		// enter the details from user
		int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
		
		boolean isSpring =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
		
		// print the statement and close the scanner object
		if(isSpring){
			System.out.println("Its a Spring Season);
		}
		else {
			System.out.println("Not a Spring Season");
		}	
		sc.close();
	}
}