import java.util.*;
 
class Calculation {
	public static void main(String[] args ) {
		long x,y,addition,subtraction,multiplication,division;
		
		System.out.print("Enter the value for x  :  ");
		Scanner cr = new Scanner(System.in);
		x = cr.nextLong();
		System.out.print("Enter the value for y  :  ");
		Scanner gr = new Scanner(System.in);
		y = gr.nextLong();
		addition = x+y;
		subtraction = x-y;
		multiplication = x*y;
		division = x/y;
		System.out.println("Addition of x and y is       :  " + addition);
		System.out.println("subtracction of x and y is   :  " + subtraction);
		System.out.println("multiplication of x and y is :  " + multiplication);
		System.out.println("division of x and y is       :  " + division);
	}
}