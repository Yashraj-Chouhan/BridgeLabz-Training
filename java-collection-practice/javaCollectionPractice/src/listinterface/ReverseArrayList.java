package listinterface;
import java.util.*;

public class ReverseArrayList {

    public static void reverseArrayList(List<Integer> list) {

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        reverseArrayList(arrayList);

        System.out.println(arrayList);
    }
}
