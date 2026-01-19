package day7;
import java.util.Arrays;

public class CropMonitor {

    // Quick Sort method
    public static void quickSort(long[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);

            // Recursively sort left and right partitions
            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }

    // Partition logic based on timestamp
    private static int partition(long[] timestamps, int low, int high) {
        long pivot = timestamps[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] <= pivot) {
                i++;
                // Swap
                long temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        // Place pivot at correct position
        long temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    // Display ordered sensor data
    public static void displayData(long[] timestamps) {
        System.out.println("\nOrdered Sensor Timestamps:");
        for (long time : timestamps) {
            System.out.print(time + " ");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Random drone sensor timestamps (milliseconds)
        long[] sensorTimestamps = {
                1698923456123L,
                1698923401456L,
                1698923509999L,
                1698923422222L,
                1698923388888L
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(sensorTimestamps));

        quickSort(sensorTimestamps, 0, sensorTimestamps.length - 1);

        displayData(sensorTimestamps);
    }
}
