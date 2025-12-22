public class NullPointerExceptionDemo {
	
  	// method to generate the nullpointer exception
	public static void generatedException(String text){
		System.out.println(text.length());
	}

    // Method to handle NullPointerException
   public static void handledException(String text){
		try{
			generatedException(text);
		}
		catch(NullPointerException e){
           System.out.println("This "+ e.getMessage());
		}
	} 

  	public static void main(String []args){
		String text = null;
		
		//handle exceptions
		System.out.println("Handled Exception: ");
		handledException(text);
	}
}
