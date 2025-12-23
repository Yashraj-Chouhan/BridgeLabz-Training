import java.util.Scanner;
public class LongestWord {
    public static String longestWord(String s) {
		int max=0;
		String maxWord="";
        String[] word=s.split(" ");
		for(int i=0;i<word.length;i++){
		if(max<word[i].length()){
		      max=word[i].length();
			  maxWord=word[i];  
		}
		}
		return maxWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestWord(s));
    }
}
