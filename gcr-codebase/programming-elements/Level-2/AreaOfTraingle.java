import java.util.Scanner;

// Calculate Area of Triangle
public class AreaOfTriangle {
    public static void main(String[] args) {
     
	 //create varibles base and height and take input from the user
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base of triangle (in inches): ");
        base = input.nextDouble();
        System.out.print("Enter height of triangle (in inches): ");
        height = input.nextDouble(); 

     // area in square inches
        double areaSquareInches = 0.5 * base * height;
     // convert to square centimeters		
        double areaSquareCm = areaSquareInches * 6.4516; 
        System.out.println(
            "The area of the triangle is " + areaSquareInches + " sq in and "
            + areaSquareCm + " sq cm"
        );
    }
}
