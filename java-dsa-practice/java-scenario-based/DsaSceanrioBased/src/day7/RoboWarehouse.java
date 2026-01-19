package day7;
import java.util.Arrays;

public class RoboWarehouse {

    // Insertion Sort method
    public static void insertionSort(int[] weights) {

        for (int i = 1; i < weights.length; i++) {
            int currentPackage = weights[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && weights[j] > currentPackage) {
                weights[j + 1] = weights[j];
                j--;
            }

            // Insert current package at correct position
            weights[j + 1] = currentPackage;
        }
    }

    // Simulate adding packages one by one
    public static void loadPackages(int[] packages) {

        System.out.println("Initial Package Weights:");
        System.out.println(Arrays.toString(packages));

        insertionSort(packages);

        System.out.println("\nShelves After Loading (Ascending Order):");
        System.out.println(Arrays.toString(packages));
    }

    // Main method
    public static void main(String[] args) {

        int[] packageWeights = { 30, 10, 25, 5, 40, 20 };

        loadPackages(packageWeights);
    }
}
