import java.time.*;
public class DateArithmetic{
	public static void main(String args[]){
		LocalDate now=LocalDate.now();
		LocalDate resultDate=now.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println(resultDate);
		System.out.println(resultDate.minusWeeks(3));
		
	}
}