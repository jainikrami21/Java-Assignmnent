import java.util.Scanner;

//10.Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555 

public class A_10_Integer_N {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input N Number: ");
		
		num = sc.nextInt();
		
		System.out.printf("%d + %d%d + %d%d%d\n", num,num,num,num,num,num);
	}
}
	