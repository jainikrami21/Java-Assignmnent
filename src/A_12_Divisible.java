//12.Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both. 

public class A_12_Divisible {
	public static void main(String[] args) {
		System.out.println("\n Divided by 3: ");
		for (int i=1; i<100;i++)
		{
			if(i%3==0)
				System.out.print(i +", ");
		}
		
		System.out.println("\n\n Divided by 5: ");
		for (int i=1;i<100;i++) 
		{
			if(i%5==0)
				System.out.print(i +", ");
		}
		
		System.out.println("\n\nDivided by 3 & 5: ");
		for (int i=1;i<100;i++) 
		{
			if (i%3==0 && i%5==0)
				System.out.print(i +", ");
		}
		System.out.println("\n");
	}
}
