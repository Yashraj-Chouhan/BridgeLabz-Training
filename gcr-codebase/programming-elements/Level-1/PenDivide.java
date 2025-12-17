//Create a class PenDivide which calculates the Pen distrubuted to each student and remaining oens 
public class PenDivide{
public static void main(String args[])
{
//create a variable penQuantity indicates total Qualtity of Pens.
    int penQuantity=14;
	
//create a variable studentQuantity indicates total student quantity.	
	int studentQuantity=3;
	
// Create a variable penPerStudent indicates Total Number of pen each student got.	
	int penPerStudent=penQuantity/studentQuantity;
	
//Create a varible remainingPen indicates the remaining pens.	
	int remainingPen=penQuantity%studentQuantity;
	
//Print the Pen Per Student qualtity and Remaining pens Quantity.	
	System.out.println("The pen Per Student is " + penPerStudent + " and the remaining Pen not distributed is " + remainingPen);
	
}

}