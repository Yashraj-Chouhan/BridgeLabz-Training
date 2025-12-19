import java.util.Scanner;
public class MeanCalculate{
	public static void main(String args[]){
		//Take the input from user
		Scanner sc=new Scanner(System.in);
		double height[]=new double[11];
		double total=0.0;
		double count=0.0;
		//create a count varible indicates playesrs Height entered by user. 
		for(int i=0;i<11;i++){
			height[i]=sc.nextDouble();
			total+=height[i];
			count++;
		}
		
		double meanHeight=total/count;
		System.out.println("The mean Height is"+ meanHeight);
		sc.close();
	}
}
