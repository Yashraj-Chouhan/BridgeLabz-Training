import java.util.Scanner;

public class FactorsUsingFor {
	public static void main(String[] args) {

		//creating object of scanner class
		Scanner sc = new Scanner(System.in);

		//taking input from user
		System.out.println("Enter number");
		int number = sc.nextInt();


		if (number > 0) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0)
					System.out.println(i);
      }
    }

		// closing scanner class stream
		sc.close();
  }
}