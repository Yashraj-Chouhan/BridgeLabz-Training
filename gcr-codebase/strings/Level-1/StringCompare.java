import java.util.Scanner;
public class StringCompare{
	public static boolean compareStrings(String s1,String s2){
		int size=Math.max(s1.length(),s2.length());
		for(int i=0;i<size;i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.equals(s2)==compareStrings(s1,s2)){
			System.out.println("Both the Methods are right string is equal");
		}
		else{
			System.out.println("Both Methods working differently");
		}
	}
}