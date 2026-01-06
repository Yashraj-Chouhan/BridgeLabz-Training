package hashmap;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Store all elements
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Find longest sequence
        for (int num : arr) {

            // Check if num is start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(arr);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
