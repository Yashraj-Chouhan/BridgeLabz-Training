import java.util.Scanner;
public class SubString{
	public static String subStringMethod(String s1,int start,int last){
		String result="";
		for(int i=start;i<last;i++){
			result+=s1.charAt(i);
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int start=sc.nextInt();
		int last=sc.nextInt();
		System.out.println(s1.substring(start,last));
		System.out.println(subStringMethod(s1,start,last));
		
	}
}