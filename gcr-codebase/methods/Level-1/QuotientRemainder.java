import java.util.Scanner;
public class QuotientReminder{
	public static int[] findRemainderAndQuotient(int number1,int number2){
		int [] answer=new int[2];
		if(number1>=number2){
			answer[0]= number1/number2;
			answer[1]=number1%number2;
		}
		else{
			answer[0]= number2/number1;
			answer[1]=number2%number1;
		}
		return answer;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int [] answer=findRemainderAndQuotient(number1,number2);
		System.out.println("The Quotient is "+ answer[0]);
		System.out.println("The Remainder is "+ answer[1]);
		sc.close();
	}
	
}