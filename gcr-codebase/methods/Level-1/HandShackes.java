import java.util.Scanner;
public class HandShackes{
	public static int  handShacks(int numberOfStudents ){
		int totalHandShackes=(numberOfStudents*(numberOfStudents-1))/2;
		return totalHandShackes;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		System.out.println("The Possible Handshackes are "+ handShacks( numberOfStudents ));
		sc.close();
	}
}