import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
         
		 //counter Starts
         for(int i=counter;i<0;i++){
		    System.out.println(counter);
			counter--;
		 }
        System.out.println("Launch!");
    }
}
