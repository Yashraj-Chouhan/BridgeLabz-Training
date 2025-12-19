import java.util.Scanner;

public class FizzBuzzUsingWhile {
	public static void main(String[] args) {

		//creating object of scanner class
		Scanner sc = new Scanner(System.in);

		// taking input from user
		System.out.println("Enter number");
		int number = sc.nextInt();

		//Checking for the inpu and perform operations
		int i = 1;
		if (number > 0) {
        while (i <= number) {
        if (i % 3 == 0 && i % 5 == 0)
          System.out.println("FizzBuzz");
        else if (i % 3 == 0)
          System.out.println("Fizz");
        else if (i % 5 == 0)
          System.out.println("Buzz");
        else
          System.out.println(i);
        i++;
      }
    }
		// closing scanner class stream
		sc.close();
  }
}