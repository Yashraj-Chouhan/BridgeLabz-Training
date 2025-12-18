import java.util.Scanner;
public class Table{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number to Print the  Number: ");
	int number=sc.nextInt();
	if(number>=6 && number<=9){
	     for(int i=1;i<10;i++){
			System.out.println(number + " * "+ i +" = " +number*i);
		 }
	}
	else{
	System.out.println("Invalid Number choose Number Between 6-9");
	}
	}
}