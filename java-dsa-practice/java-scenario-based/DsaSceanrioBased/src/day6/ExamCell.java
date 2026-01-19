package day6;
import java.util.Arrays;

public class ExamCell {

    // Merge Sort method
    public static void mergeSort(int[] scores, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left and right halves
            mergeSort(scores, left, mid);
            mergeSort(scores, mid + 1, right);

            // Merge sorted halves
            merge(scores, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    private static void merge(int[] scores, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            leftArr[i] = scores[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = scores[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] >= rightArr[j]) { // Descending order for ranks
                scores[k] = leftArr[i];
                i++;
            } else {
                scores[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            scores[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            scores[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Display rank list
    public static void displayRanks(int[] scores) {
        System.out.println("\nState-Level Rank List:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Rank " + (i + 1) + " : " + scores[i]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Scores collected from different centers
        int[] studentScores = { 78, 92, 85, 69, 88, 95, 73, 90, 81 };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(studentScores));

        mergeSort(studentScores, 0, studentScores.length - 1);

        System.out.println("\nAfter Sorting (Descending Order):");
        System.out.println(Arrays.toString(studentScores));

        displayRanks(studentScores);
    }
}
