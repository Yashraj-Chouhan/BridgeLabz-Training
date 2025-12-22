import java.util.Scanner;
public class CharArray{
	public static char[] charArray(String s){
		char[] charArray=new char[s.length()];
		for(int i=0;i<s.length();i++){
			charArray[i]=s.charAt(i);
		}
		return charArray;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char [] Array1=s.toCharArray();
		char [] Array2=charArray(s);
		for(int i=0;i<s.length();i++){
			System.out.print(Array1[i]+" ");
			
		}
		for(int i=0;i<s.length();i++){
			System.out.println(Array2[i]+" ");
			
		}
	}
}