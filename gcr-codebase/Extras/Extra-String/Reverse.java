import java.util.Scanner;
public class Reverse{
	public static String reverseString(String s){
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			result+=s.charAt(i);
		}
		return result;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(reverseString(s));
	}
}