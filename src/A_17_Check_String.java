/* 17. W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3. 
*/

public class A_17_Check_String {
	public static void main(String[] args) {
		String str1 = "Red is Favorite color.";
		String str2 = "Orange is also my Favorite color.";
		
		//The String to Check the above two Strings to see
		//if they start with this value (Red).
		String startStr = "Red";
		
		//Do either of the first two String start with startStr?
		boolean starts1 = str1.startsWith(startStr);
		boolean starts2 = str2.startsWith(startStr);
		
		//Display the results of the startswith calls.
		System.out.println(str1 + " starts with " + startStr + "? " + starts1);
		System.out.println(str2 + " starts with " + startStr + "? " + starts2);
		
	}
}
