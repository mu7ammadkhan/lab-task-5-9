import java.util.*;
class Fibonacci {
	public static void main(String [] args ) {

		int n,i,t1 = 0,t2 = 1,t3 = 1;
		System.out.print(" Enter number od terms :  ");
		Scanner a = new Scanner(System.in);
		n = a.nextInt();
			for(i=1; i<=n; i++)

			{
				System.out.print( + t3 );
				System.out.print(",");
				t3 = t1 + t2;
				t1 = t2;
				t2 = t3;
			}
	}
}