import java.util.Scanner;
public class Palindrome{
	public static boolean palindrome(String s){
		String result="";
		int start=0;
		int last=s.length()-1;
		while(start<last){
			if(s.charAt(start)!=s.charAt(last)){
				return false;
			}
			start++;
			last--;
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		System.out.println(palindrome(s));
	}
}