/* 16.W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 
*/

public class A_16_String_End {
	public static void main(String[] args) {
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
		
		//The String to Check the above two Strings to see
		//if they end with this value (se).
		String end_str = "se";
		
		// Check First two Strings end with end_str
		boolean ends1 = str1.endsWith(end_str);
		boolean ends2 = str2.endsWith(end_str);
		
		//Display the results of the endswith calls.
		System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\"?" + ends1);
		System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"?" + ends2);
	}
}
