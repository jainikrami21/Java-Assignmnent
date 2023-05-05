//06.Write a program in Java to make such a pattern like right angle triangle with number
//increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10 

import java.util.Scanner;

public class A_6_Java_Pattern_Inc_1 {
		
	public static void main(String[] args) {
		
				
				int i,j,n,k=1;
				System.out.println("Input Number of rows : ");
				Scanner sc = new Scanner(System.in);
					n = sc.nextInt();
					
					for(i=1;i<=n;i++)
						
					{
						for(j=1;j<=i;j++)
							
						
							System.out.print(k++);
						
							System.out.println("");
							
						
					}

	
	}
}
