import java.util.*;
class Restaurant { 
	public static void main( String args[] ) { 
		int choice;
		String order;
		Scanner sc = new Scanner (System.in);
		System.out.println("*****************************************************************************************************************");
		System.out.println("                  SPICY FOOD RESTAURANT" );
		
		System.out.println("                      SPICY PIZZA       ");
                System.out.println("______________________________________________");
		System.out.println("\n  FLAVOURS");
                System.out.println("______________________________________________");
		System.out.println(" 1-CHIKEN TIKKA      ");		
		System.out.println(" 2-CHIKEN FAJITA     ");		
		System.out.println(" 3-CHIKEN SUPREME    ");
		System.out.println(" 4-CHIKEN HOT & SPICY");
		System.out.println(" 5-CHIKEN SCILIAN    ");
		System.out.println(" 6-CHIKEN AFGHANI    ");
		System.out.println(" 7-CHIKEN MALAI BOTI ");
		System.out.println(" 8-CHEESE LOVER      ");
		System.out.println(" 9-VEGETARIAN PIZZA  ");
                System.out.println("______________________________________________");
		System.out.print("\nEnter your order number please  :    ");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				order =" CHIKEN TIKKA ";
				break;

			case 2:
				order =" CHIKEN FAJITA ";
				break;
			case 3:
				order =" CHIKEN SUPREME ";
				break;

			case 4:
				order =" CHIKEN HOT & SPICY ";
				break;

			case 5:
				order =" CHIKEN SCILIAN ";
				break;

			case 6:
				order =" CHIKEN AFGHANI ";
				break;            

			case 7:
				order =" CHIKEN MALAI BOTI ";
				break;
		
			case 8:
				order =" CHEESE LOVER ";
				break;

			case 9:
				order =" VEGETARIAN PIZZA ";
				break;
			default:
				order = " not in menu ";
			}
			System.out.println("______________________________________________");

			System.out.println("  Your order is : " + order);
			System.out.println("----------------------------------------------");
			System.out.println("                    Please Wait !!"); 
			System.out.println("   Your order will be on your table in just 30 Minutes ..");
			System.out.println("                    Thank you ...");    





		
	}
}      