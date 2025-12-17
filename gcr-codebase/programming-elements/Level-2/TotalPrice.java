import java.util.Scanner;

public class TotalPrice{
  public static void main(String args[]){
  
  // varible initialse and taking input from user
  Scanner sc=new Scanner(System.in);
  double unitPrice=sc.nextDouble();
  double quantity=sc.nextDouble();
  
  //calculate the total Price
  double totalPrice= unitPrice*quantity;
  
  System.out.println("The total purchase price is INR " + totalPrice
                     + " If the quantity" + quantity +" and unit price is INR" + unitPrice);
  }
}