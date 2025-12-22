import java.util.Scanner;
public class StringLength{
	public static int stringLength(String s){
		int count=0;
		while(true){
			try{
				s.charAt(i);
				count++;
				i++;
			}catch(RuntimeException e){
				return count;
			}
		}
		return count;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("the Length of String is " + stringLength(s));
	}
}