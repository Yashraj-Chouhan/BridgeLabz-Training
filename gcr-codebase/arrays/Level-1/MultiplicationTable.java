import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
		//Take the input from user
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=0;
		int table[]=new int [10];
		
		for(int i=0;i<10;i++){
			table[i]=number+temp;
			temp+=number;
			System.out.println(number+" X "+ i+" = "+ table[i]);
		}
		
		sc.close();
	}
}