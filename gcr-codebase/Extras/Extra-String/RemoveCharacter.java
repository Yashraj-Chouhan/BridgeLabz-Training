import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char remove = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != remove) {
                result += s.charAt(i);
            }
        }

        System.out.println("Modified String: \"" + result + "\"");
    }
}
