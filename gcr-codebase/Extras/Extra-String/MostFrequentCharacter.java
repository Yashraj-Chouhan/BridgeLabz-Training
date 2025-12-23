import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];
        int max = 0;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
