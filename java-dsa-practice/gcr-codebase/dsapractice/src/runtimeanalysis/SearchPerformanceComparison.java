package runtimeanalysis;
import java.util.*;

public class SearchPerformanceComparison {

    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1000000};

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            // ---------- Array ----------
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = i;

            int target = size - 1;

            long start = System.currentTimeMillis();
            boolean found = false;
            for (int i : array) {
                if (i == target) {
                    found = true;
                    break;
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("Array Search Time: " + (end - start) + " ms");

            // ---------- HashSet ----------
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++)
                hashSet.add(i);

            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");

            // ---------- TreeSet ----------
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < size; i++)
                treeSet.add(i);

            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
        }
    }
}
