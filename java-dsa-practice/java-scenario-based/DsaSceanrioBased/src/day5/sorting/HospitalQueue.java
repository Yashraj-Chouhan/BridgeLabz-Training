package day5.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class HospitalQueue {
	public static  int[] bubbleSort(int [] beds) {
		for(int i=0;i<beds.length-1;i++) {
			for(int j=0;j<beds.length-i-1;j++) {
				if(beds[j]>beds[j+1]) {
					int temp=beds[j];
					beds[j]=beds[j+1];
					beds[j+1]=temp;
				}
			}
		}
		return beds;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Numbers of Patient");
		int numberOfPatient=sc.nextInt();
		int  [] beds=new int[numberOfPatient];
		
		for(int i=0;i<numberOfPatient;i++) {
			System.out.println("Enter Number of Criticality Level ");
			beds[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(bubbleSort(beds)));
		
		
		
		
	}

}
