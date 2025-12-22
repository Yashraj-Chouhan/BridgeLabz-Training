import java.util.Scanner;

public class CustomTrim {

    // Method to find start and end index (without spaces)
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces:");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrim = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println("\nCustom Trim Result: \"" + customTrim + "\"");
        System.out.println("Built-in Trim Result: \"" + builtInTrim + "\"");
        System.out.println("Both are same: " + result);
    }
}
