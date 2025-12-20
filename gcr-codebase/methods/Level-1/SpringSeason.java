import java.util.Scanner;
public class SpringSeason{
	//check Number for Spring Season
	public static boolean springSeason(int month, int date){
		if((month>3 && date>20) || (month<6 && date<20) || month>=4 || month<=5){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String[] args){
		// Taking input from command line 
		int month=Integer.parseInt(args[0]);
		int date=Integer.parseInt(args[1]);;
		if(springSeason(month,date)){
			System.out.println("Its a spring Season");
		}
		else{
			System.out.println("Not a spring Season");
		}

		
	}
}
