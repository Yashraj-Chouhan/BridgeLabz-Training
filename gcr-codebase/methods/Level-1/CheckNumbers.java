import java.util.Scanner;
public class CheckNumbers{
	//check Number for Positive, Negative or zero.
	public static int checkNumbers(int number){
		if(number>1)
			return 1;
		else if(number<1)
			return -1;
		else 
			return 0;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(checkNumbers(number));
		
	}
}
