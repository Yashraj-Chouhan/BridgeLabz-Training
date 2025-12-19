import java.util.Scanner;
public class VoteEligible{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int studentAge []=new int [10];
		
		//Take the input from user
		for(int i=0;i<10;i++){
			System.out.println("Enter the Age of Student" + i);
			studentAge[i]=sc.nextInt();
		}
		
		//check Vote eligiblity
		for(int i=0;i<10;i++){
			if(studentAge[i]<0){
				System.err.println("Invalid Age");
			}	
			else if(studentAge[i]>=18){
				System.out.println("The Student with the age " +studentAge[i]+ " Can Vote");				
			}
			else {
				System.out.println("The Student with the age " +studentAge[i]+ " Can not Vote");	
			}
		}
		
		sc.close();
	}
}