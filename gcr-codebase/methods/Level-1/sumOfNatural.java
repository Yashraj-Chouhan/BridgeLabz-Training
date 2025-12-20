import java.util.Scanner;
public class SumOfNatural{
	public static int sumOfNatural(int number){
		int total=0;
		for(int i=0;i<number;i++){
			total+=i;
		}
		return total;
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<=0){
			System.err.println("Enter Valid Number");
		}
		else{
			System.out.println("The sum of the the Natural Number for "+ number +" is "+ sumOfNatural(number));
		}
		sc.close();
	}
}