package runtimeanalysis;
import java.util.Arrays;
import java.util.Random;

public class LinearBinaryTime{

    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Performance Test Method
    public static void testSearch(int size) {
        int[] data = new int[size];
        Random random = new Random();

        // Fill array with random numbers
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size * 10);
        }

        int target = data[size - 1]; // Worst case for linear search

        // -------- Linear Search Timing --------
        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();

        // -------- Binary Search Timing --------
        Arrays.sort(data); // Required for binary search
        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " +
                (endLinear - startLinear) / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " +
                (endBinary - startBinary) / 1_000_000.0 + " ms");
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        testSearch(1_000);
        testSearch(10_000);
        testSearch(1_000_000);
    }
}
