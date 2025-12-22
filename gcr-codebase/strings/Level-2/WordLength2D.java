import java.util.Scanner;

public class WordLength2D {

    // Method to find length without using length()
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

    // Method to split text into words without split()
    public static String[] manualSplit(String text) {
        int len = findLength(text);

        int words = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];
        String temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index] = temp;

        return result;
    }

    // Method to create 2D array (word and length)
    public static String[][] wordLength2D(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] result = wordLength2D(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
