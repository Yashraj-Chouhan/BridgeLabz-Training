package junit.stringutility;

public class StringUtils {

    // Reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check if string is palindrome
    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    // Convert string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
