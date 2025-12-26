// Program to check if two texts are anagram
import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {

    // method to check anagram
    public static boolean isAnagram(String text1, String text2) {
		
		
		
		char[]ch1=text1.toCharArray();
		char[]ch2=text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
     	return Arrays.equals(ch1,ch2);

       
   }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = input.next();

        System.out.print("Enter second text: ");
        String text2 = input.next();

        if (isAnagram(text1, text2)) {
            System.out.println("Texts are anagrams");
        } else {
            System.out.println("Texts are not anagrams");
        }

        input.close();
    }
}