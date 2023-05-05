/*15. W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
*/

public class A_15_Char_Sequence {
	public static void main(String[] args) {
		String str1 = "example.com" , str2 = "Example.com";
		CharSequence cs = "example.com";
		System.out.println("Comparing "+str1+" and "+cs+": "+str1.contentEquals(cs));
		System.out.println("Comparing "+str2+" and "+cs+": "+str2.contentEquals(cs));
	}
}
