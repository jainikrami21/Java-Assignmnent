/*14.W.A.J.P to concatenate a given string to the end of another string. 
 */

public class A_14_Concatenate_String {
	public static void main(String[] args) {
		
		String str1 = "Java is a Popular Programming language And ";
		String str2 = "Created in 1995";
		
		System.out.println("String 1 : "+ str1);
		System.out.println("String 2 : "+ str2);
		
		//Concatenate the two strings together.
		
		String str3 = str1.concat(str2);
		
		//Display the new String.
		System.out.println("The Concatenated String: "+ str3);
	}
}
