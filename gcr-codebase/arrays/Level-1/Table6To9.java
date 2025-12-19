import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
		//Take the input from user
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>=6 && number<=9){
		
		int temp=0;
		int table[]=new int [10];
		
		for(int i=0;i<10;i++){
			table[i]=number+temp;
			temp+=number;
			System.out.println(number+" X "+ i+" = "+ table[i]);
		}
		}
		else{
			System.err.println("Enter Number Between 6-9");
		}
		
		sc.close();
	}
}