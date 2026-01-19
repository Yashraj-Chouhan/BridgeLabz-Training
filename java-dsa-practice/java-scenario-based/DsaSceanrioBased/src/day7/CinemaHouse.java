package day7;
import java.util.Arrays;

public class CinemaHouse {

    // Bubble Sort method
    public static void bubbleSort(int[] showTimes) {

        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent show times
                if (showTimes[j] > showTimes[j + 1]) {

                    // Swap
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Display movie schedule
    public static void displaySchedule(int[] showTimes) {
        System.out.println("\nSorted Movie Show Times:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Movie show times in 24-hour format (HHMM)
        int[] showTimes = { 1800, 1400, 2100, 1100, 1600, 2000 };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(showTimes));

        bubbleSort(showTimes);

        displaySchedule(showTimes);
    }
}
