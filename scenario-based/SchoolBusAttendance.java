package corejavapractice;
import java.util.*;
public class SchoolBusAttendance {
	
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		int totalPresent=0;
		String [] names={"Yashraj","Utkarsh","Raman",
		                  "Kundu" ,"Anuj","Nandu",
		                  "Lavesh","Goldy","Mansi",
		                  "Sahil"};
		for(String s: names) {
			System.out.println(s+" is Present or Absent ->");
			String status=sc.next().toLowerCase();
			if(status.equals("present")) {
				totalPresent++;
			}
		}
		System.out.println("Total Number Of Present Student is : "+ totalPresent+
							"\nTotal Number of absent Student is  : " +(10-totalPresent));		
	
	}

}
