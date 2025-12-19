import java.util.Scanner;

public class AgeHeight {
	public static void main(String[] args) {

		//creating object of scanner class
		Scanner sc = new Scanner(System.in);

        // taking Age and Height From Amar, Akbar and anthony.
	       System.out.println("Enter age of Amar");
            int amarAge = sc.nextInt();
	     	System.out.println("Enter age of  Akbar");
			int akbarAge = sc.nextInt();
		    System.out.println("Enter age of anthony "); 
            int anthonyAge = sc.nextInt();
			System.out.println("Enter height of Amar");
            double amarHeight = sc.nextDouble();
			System.out.println("Enter height of Akabr");
            double akbarHeight = sc.nextDouble();
			System.out.println("Enter height of Anthony");
            double anthonyHeight = sc.nextDouble();

		// Finding Minimum age and tallest Height
		int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
		double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

		// displaying result
		System.out.println("Youngest age is " + youngestAge);
		System.out.println("Tallest height is " + tallestHeight);

		// closing scanner class stream
        sc.close();
  }
}