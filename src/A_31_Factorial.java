/*
 * Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0 
 */
import java.util.Scanner;

public class A_31_Factorial {
	public static void main(String[] args) {
		int i,
		factorial=1,
		number;
		
		System.out.println("Enter the number to which you need to find the factorail: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(i=1;i<=number;i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorail of the given number is: "+factorial);
	}
}
