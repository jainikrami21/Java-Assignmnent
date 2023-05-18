import java.util.Scanner;

/*
 * I3. Write a program which will ask the user to enter his/her
marks (out of 100). Define a method that will display grades according to the marks
entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
40 Fail 
 */


public class A_33_Calculate_Stu_Grades {
	public static void main(String[] args) {
		
		int marks[] = new int[6];
		int i;
		float total=0,avg;
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0;i<6;i++) {
			System.out.println("Enter Marks of Subject" + (i+1)+":");
			
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		sc.close();
		
		avg = total/6;
		
		System.out.println("The Student Grade is: ");
		
		if(avg >=91 && avg <100 ) {
			
			System.out.println("AA");
		}
		else if(avg >=81 && avg <90 ) {
					
			System.out.println("AB");
				}
		else if(avg >=71 && avg <80 ) {
			
			System.out.println("BB");
		}
		else if(avg >=61 && avg <70 ) {
			
			System.out.println("BC");
		}
		else if(avg >=51 && avg <60 ) {
			
			System.out.println("CD");
		}
		else if(avg >=41 && avg <50 ) {
			
			System.out.println("DD");
		}
		else if(avg >=10 && avg<40){
			
			System.out.println("Fail");
		}
		else {
			System.out.println("Please Enter valid Number");
		}
	}
}
