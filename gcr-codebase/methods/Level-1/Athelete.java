import java.util.Scanner;
public class Athelete{
	public static double atheleteRounds(int side1,int side2, int side3){
		int perimeter= side1+side2+side3;
		int distance=5*1000;
		
		return (double)distance/perimeter; 
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		System.out.println("Athelete need to cover 5 km Distance in "+ atheleteRounds( side1,side2,side3)+" Rounds ");
		sc.close();
	}
}