import java.util.Scanner;
import java.util.Arrays;

public class SimpleSplit {

    // Find length without using length()
    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    // Split string without using split()
    public static String[] manualSplit(String s) {
        int len = findLength(s);

        // Count words
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];
        int index = 0;
        String temp = "";

        // Create words
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index] = temp;

        return result;
    }

    // Compare two arrays
    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual Split: " + Arrays.toString(manual));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));

        System.out.println("Result matched: " + compare(manual, builtin));
    }
}
