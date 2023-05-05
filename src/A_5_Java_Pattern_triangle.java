//05.Write a program in Java to display the pattern like right angle triangle with a number.
//1
//12
//123
//1234
//12345 

import java.util.Scanner;

public class A_5_Java_Pattern_triangle {

	public static void main(String[] args) {
		
		int i,j,n;
		System.out.println("Input Number of rows : ");
		Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			for(i=1;i<=n;i++)
				
			{
				for(j=1;j<=i;j++)
					
				
					System.out.print(j);
				
					System.out.println("");
					
				
			}

	}

}
