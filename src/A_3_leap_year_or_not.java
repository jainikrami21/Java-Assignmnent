//03.Write a Java program that takes a year from user and print whether that year is a leap
//year or not. B19. Write a program in Java to display the first 10 natural numbers
//using while loop. 

import java.util.Scanner;

public class A_3_leap_year_or_not {
	
	public static void main(String[] args)
	
	{
	
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input the year: ");
		int year = in.nextInt();
		
		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		
		if (x && (y || z))
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	
	
	}
}
