package day8.sorting;
import java.util.Arrays;

public class IceCreamRush {

    // Bubble Sort based on sales count (ascending)
    static void bubbleSort(String[] flavors, int[] sales) {
        int n = sales.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent sales
                if (sales[j] > sales[j + 1]) {

                    // Swap sales
                    int tempSale = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSale;

                    // Swap corresponding flavors
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;

                    swapped = true;
                }
            }

            // Optimization for already sorted data
            if (!swapped)
                break;
        }
    }

    // Display sorted flavors
    static void display(String[] flavors, int[] sales) {
        System.out.println("\nFlavors Sorted by Popularity (Sales):");
        for (int i = 0; i < flavors.length; i++) {
            System.out.println(flavors[i] + " → " + sales[i]);
        }
    }

    public static void main(String[] args) {

        String[] flavors = {
                "Vanilla", "Chocolate", "Strawberry",
                "Mango", "Butterscotch", "Coffee",
                "Black Currant", "Pistachio"
        };

        int[] sales = { 120, 200, 90, 150, 180, 110, 95, 130 };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(sales));

        bubbleSort(flavors, sales);

        display(flavors, sales);
    }
}
