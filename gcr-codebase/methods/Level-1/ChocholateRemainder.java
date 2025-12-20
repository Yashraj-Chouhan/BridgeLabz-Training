import java.util.Scanner;
public class ChocholateRemainder{
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
		int chocolates=sc.nextInt();
		int childern=sc.nextInt();
		int [] answer=findRemainderAndQuotient(chocolates,childern);
		System.out.println("The Number of chocolates each student get is "+ answer[0]);
		System.out.println("The Remaining chocolates are"+ answer[1]);
		sc.close();
	}
	
}