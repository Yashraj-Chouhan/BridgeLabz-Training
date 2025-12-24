import java.util.Scanner;
public class MaxOfThreeNumbers{
	public static int MaxNumber(int number1, int number2, int number3){
		if(number1>=number2 && number1>=number3){
			return number1;
		}else if(number2>=number1 && number2>=number3){
			return number2;
		}else if(number3>=number1 && number3>=number1){
			return number1;
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		System.out.println("The Max Number is " + MaxNumber(number1,number2,number3));
	}
}