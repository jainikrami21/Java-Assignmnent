/*
 * W.A.J. P to demonstrate try catch block, 
 */
public class A_35_Try_Catch_Block {
	public static void main(String[] args) {
		try {
			int divideByZero = 5/0;
			System.out.println("Rest of Code in try block");
		}
		
		catch (ArithmeticException e){
			System.out.println("ArithmeticException => " + e.getMessage());
		}
			
	}
}
