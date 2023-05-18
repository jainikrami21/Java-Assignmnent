/*
 * Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero
 */
import java.util.Scanner;

public class A_36_Arithmetic_Exception {
	
		public static void main(String arg[])
	    {  
			try
			{
				
				int a,b,c;
				Scanner KB=new Scanner(System.in);
				
				
				System.out.print("Enter first number : ");
				a=KB.nextInt();
	       
				System.out.print("Enter second number : ");
				b=KB.nextInt();
	       
				
				c=a/b;
				System.out.println("Result:"+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error:"+e.getMessage());
				System.out.println("Error:"+e);
			}
		
			System.out.println("End of Program...");
		}
	}

