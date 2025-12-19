import java.util.Scanner;
public class StoreNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double numbers[]=new double [10];
		double total=0.0;
		int index=0;
		
		while(true){
			System.out.println("Enter The Number");
			numbers[index]=sc.nextDouble();
			if(numbers[index]<=0){
				numbers[index]=0;
				System.out.println("You have entered O or negative Number");
				break;
			}	
			index++;
		}
		for(int i=0;i<10;i++){
			total+=numbers[i];
		}
		System.out.println("The sum of values is " + total);
		
		sc.close();
		
	}
}