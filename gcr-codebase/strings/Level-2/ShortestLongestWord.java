import java.util.Scanner;

public class ShortestLongestWord {

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

        int count = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];
        String temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;

        return words;
    }

    // Method to create 2D array of word and length
    public static String[][] wordLength2D(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestLongest(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;

        int min = Integer.parseInt(data[0][1]);
        int max = min;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[] { minIndex, maxIndex };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] data = wordLength2D(words);
        int[] result = findShortestLongest(data);

        System.out.println("\nShortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);
    }
}
