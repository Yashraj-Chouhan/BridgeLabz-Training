package corejavapractice;
import java.util.*;
public class NumberGuessing {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int correctNumber=(int)(Math.random()*100)+1;
		int number=0;
	    int count=0;
	    do {
	    System.out.println("Enter Your Number Guess [1-100] : ");
	    number=sc.nextInt();
	    count++;
    	if(number>correctNumber) {
    		System.out.println("You Guessed \" Too high\"");
    	}
    	else if(number<correctNumber) {
    		System.out.println("You Guesses \" Too low\"");
    	}
    	else {
    		System.out.println("Great You Guessed ! Correct Number");
    	}
	    }
	    while(number!=correctNumber && count!=5);
	    
	    System.out.println("You Guessed Wrong Number five Times.");
	    
		
		
	}

}
