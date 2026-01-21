package listinterface;
import java.util.*;

public class NthFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext())
                fast.next();
            else
                return null; // n > size
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println(findNthFromEnd(list, 2));
    }
}
