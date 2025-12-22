import java.util.Scanner;

public class LowerCaseCompare {

    // Method to convert text to lowercase using ASCII logic
    public static String convertToLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII conversion
            }

            result = result + ch;
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
        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // User-defined lowercase conversion
        String manualLower = convertToLower(text);

        // Built-in lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean result = compareStrings(manualLower, builtInLower);

        System.out.println("Manual Lowercase  : " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal? " + result);
    }
}
