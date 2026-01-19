package day6;
import java.util.Arrays;

public class EventManager {

    // Quick Sort method
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursively sort left and right subarrays
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];   // Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Display top cheapest and expensive tickets
    public static void displayTopTickets(int[] prices, int k) {
        System.out.println("Top " + k + " Cheapest Tickets:");
        for (int i = 0; i < k; i++) {
            System.out.print(prices[i] + " ");
        }

        System.out.println("\nTop " + k + " Most Expensive Tickets:");
        for (int i = prices.length - k; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] ticketPrices = { 1500, 3200, 800, 4500, 1200, 6000, 2000, 950, 7000, 3000 };

        int k = 3; // Top 3 cheapest & expensive tickets

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(ticketPrices));

        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(ticketPrices));

        displayTopTickets(ticketPrices, k);
    }
}
