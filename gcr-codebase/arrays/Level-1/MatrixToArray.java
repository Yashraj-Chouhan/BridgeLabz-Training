import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for rows and columns
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        // Validate input
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input. Rows and columns must be positive.");
            sc.close();
            return;
        }

        // Create 2D array
        int matrix[][] = new int[rows][columns];

        // Take input for 2D array
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array
        int array[] = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
