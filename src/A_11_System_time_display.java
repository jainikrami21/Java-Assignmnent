//import java.util.*;


//11.Write a Java program to display the system time

public class A_11_System_time_display {
	public static void main(String[] args) {
		
		
		
//		Date current_Date = new Date();
		
//		System.out.println(current_Date);
		
		System.out.format("\nCurrent Date Time: %tc%n\n", System.currentTimeMillis());
	}
}
