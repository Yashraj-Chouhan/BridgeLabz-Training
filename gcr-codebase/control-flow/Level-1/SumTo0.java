import java.util.Scanner;
public class SumTo0{
	public void main(String args[]){
		//Create a scanner object and take input 
		 Scanner sc=new Scanner(System.in);
		 double total=0.0;
		 double number=sc.nextDouble();
		 
		 //add number till user did't give input as 0.
		 while(number!=0){
		    total+=number;
			System.out.println("Input is not zero give another input");
			number=sc.nextDouble();
		 }
		 //print the total Sum till the user give input as 0.
		 System.out.println("Total Sum till user hit to 0 is: " + total);
		 
		 sc.close();
	}
}
