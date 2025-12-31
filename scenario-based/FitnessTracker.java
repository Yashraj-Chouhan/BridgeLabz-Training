/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/
 import java.util.Scanner;
 public class FitnessTracker{
	public static final int days=7;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int activeDays=0;
		int pushUpPerDay=0;
		int totalPushUp=0;
		for(int i=1;i<=days;i++){
			System.out.println("Enter the number of Sandeep's push-up on  Day :"+ i);
			pushUpPerDay=sc.nextInt();
			totalPushUp+=pushUpPerDay;
			if(pushUpPerDay>0){
				activeDays++;
			}
					
		}
		int pushUpAverage=totalPushUp/activeDays;
		System.out.println("Total PushUp : " + totalPushUp + " Average Push Up : " + pushUpAverage);
	}
 }