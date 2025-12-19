import java.util.Scanner;
public class CheckNumber{
	public static void main(String args[]){
		
		// user input in the form of array
		Scanner sc=new Scanner(System.in);
		int number []=new int [5];
		for(int i=0;i<5;i++){
			number[i]=sc.nextInt();
		}
		
		//Check the number and perform operations
		for(int i=0;i<5;i++){ 
			if(number[i]>0){
				if(number[i]%2==0){
					System.out.println("Even Number");
				}
				else{
					System.out.println("Odd Number");
				}
			}
			else if(number[i]==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Negative  Number");
			}
		}
		if(number[0]>number[4]){
			System.out.println("First Number is Greater");
		}
		else if(number[0]<number[4]){
			System.out.println("First Number is less");
		}
		else{
			System.out.println("They Are Equal");
		}
	}
}