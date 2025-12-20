import java.util.Scanner;
public class ChillTemperature{
	public static double calculateWindChill(double temperature, double windSpeed){
		double windchill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
		return windchill;
	}
 
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double temperature=sc.nextDouble();
		double windSpeed=sc.nextDouble();
		System.out.println("The Wind chill Temperature is "+ calculateWindChill(temperature, windSpeed));
		
	}
}