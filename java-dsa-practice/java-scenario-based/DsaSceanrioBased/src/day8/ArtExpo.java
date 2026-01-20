package day8;
import java.util.Arrays;

public class ArtExpo {

    // Insertion Sort based on registration time
    static void insertionSort(long[] regTime) {

        for (int i = 1; i < regTime.length; i++) {
            long currentArtist = regTime[i];
            int j = i - 1;

            // Shift later registrations to the right
            while (j >= 0 && regTime[j] > currentArtist) {
                regTime[j + 1] = regTime[j];
                j--;
            }

            // Insert artist at correct position
            regTime[j + 1] = currentArtist;
        }
    }

    // Display sorted registration times
    static void display(long[] regTime) {
        System.out.println("\nArtists Sorted by Registration Time:");
        for (long time : regTime) {
            System.out.print(time + " ");
        }
    }

    public static void main(String[] args) {

        // Registration times (timestamps)
        long[] registrationTimes = {
                1698923456123L,
                1698923401456L,
                1698923509999L,
                1698923422222L,
                1698923388888L
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(registrationTimes));

        insertionSort(registrationTimes);

        display(registrationTimes);
    }
}
