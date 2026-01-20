package M1Practice;
import java.util.Scanner;
public class StringEncoding {

	
	public static String cleanseAndInvert(String input) {
		int length=input.length();
		StringBuilder sb=new StringBuilder(input);
		
		String output;
		if(length <6 || input==null ) {
			output="Length of input is less than 6";
			return output;
		}
		
		for (int i = 0; i < input.length(); i++) {
		    if (input.charAt(i) == ' ') {
		        output="Input contains Space";
		        return output;
		    }
		}
		
		if (input.matches(".*[^a-zA-Z ].*")) {
		    output="Contains special character";
		    return output;
		}
		
		
		for(int i=0;i<input.length();i++) {
			String password=sb.reverse().toString();
		}
		String encode="";
		for(int i=0;i<input.length();i++) {
			
			int ch=input.charAt(i);
			if(ch%2==0) {
				continue;
			}
			else {
				encode+=(char)ch;
			}
			
		}
		StringBuilder encodeResult=new StringBuilder();
		for(int i=0;i<encode.length();i++) {
			char ch=encode.charAt(i);
			if(i%2==0) {
				encodeResult.append(Character.toUpperCase(ch));
				
			}
			else {
				encodeResult.append(Character.toLowerCase(ch));
			}
		
        
        }
		
		return encodeResult.reverse().toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String input =sc.nextLine();
		
		System.out.println(cleanseAndInvert(input));
		
	}
}
