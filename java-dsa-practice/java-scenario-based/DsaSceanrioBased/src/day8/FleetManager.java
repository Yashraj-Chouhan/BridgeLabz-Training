package day8;
import java.util.Arrays;

public class FleetManager {

    // Merge two sorted arrays
    static int[] mergeDepots(int[] depot1, int[] depot2) {

        int n1 = depot1.length;
        int n2 = depot2.length;

        int[] master = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (depot1[i] <= depot2[j]) {
                master[k++] = depot1[i++];
            } else {
                master[k++] = depot2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            master[k++] = depot1[i++];

        while (j < n2)
            master[k++] = depot2[j++];

        return master;
    }

    public static void main(String[] args) {

        // Sorted vehicle mileages from depots
        int[] depotA = { 12000, 25000, 40000 };
        int[] depotB = { 15000, 30000, 45000 };

        int[] masterSchedule = mergeDepots(depotA, depotB);

        System.out.println("Master Maintenance Schedule:");
        System.out.println(Arrays.toString(masterSchedule));
    }
}
