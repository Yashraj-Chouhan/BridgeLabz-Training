import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }

            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println(replaceWord(sentence, oldWord, newWord));
    }
}
