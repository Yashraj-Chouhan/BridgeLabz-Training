package hashmap;
import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            int required = target - num;

            // Check if complement exists
            if (map.containsKey(required)) {
                System.out.println(
                    "Pair found: (" + required + ", " + num + ")"
                );
                return true;
            }

            // Store current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 1, 6};
        int target = 10;

        boolean result = hasPair(arr, target);
        System.out.println("Pair exists: " + result);
    }
}
