package listinterface;
import java.util.*;

public class RotateList {

    public static List<Integer> rotate(List<Integer> list, int k) {

        int n = list.size();
        k = k % n;   // handle k > size

        List<Integer> result = new ArrayList<>();

        for (int i = k; i < n; i++) {
            result.add(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> input =
                Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(rotate(input, 2));
    }
}
