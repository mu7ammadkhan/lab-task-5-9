import java.util.Scanner;
import java.io.*;
class Email {
	public static void main(String [] args )throws IOException {
		System.out.println(" Please Enter your Email ID  :");
		Scanner sc = new Scanner(System.in);
		String Email = sc.nextLine();
		System.out.print(" Please Enter your Password  :");
		//get the object od console class..
                Console con = System.console();
		char[] chars = con.readPassword();

		String Password=new String(chars);
		
                if(Email.equals("easy@gmail.com")&& Password.equals("muhammad345"))

                
		{	
                System.out.println(" login sucessfull");
		System.out.println("*****Wellcome Screen*****");
                }else
		{	System.out.println(" Invalid id or Password");
		
			return;
	}
}

}		 