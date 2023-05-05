//01.Write a Java program to Take three numbers from the user and print the greatest
//number.

import java.util.Scanner;

public class A_1_the_greatest_number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Input the 1st number: ");
		int num1 = in.nextInt();
		
		System.out.println("Input the 2nd number: ");
		int num2 = in.nextInt();
		
		System.out.println("Input the 3rd number: ");
		int num3 = in.nextInt();
		
		if(num1 > num2)
			if(num1 > num3)
				System.out.println("The Greatest: " + num1);
		
		if(num2 > num1)
			if(num2 > num3)
				System.out.println("The Greatest: " + num1);

		if(num3 > num1)
			if(num3 > num2)
				System.out.println("The Greatest: " + num1);



	}

}
