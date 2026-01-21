package queueinterface;
import java.util.*;

public class GenerateBinary {

    public static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {

            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        generateBinary(5);
    }
}
