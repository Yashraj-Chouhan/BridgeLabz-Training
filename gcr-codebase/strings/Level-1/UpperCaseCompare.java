import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert text to uppercase using ASCII logic
    public static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
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

        // User-defined uppercase conversion
        String manualUpper = convertToUpper(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean result = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Uppercase : " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both equal? " + result);
    }
}
