/*13.W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is
o*/
// Tops Technologies!
//0-T, 10-O
//The Character at position 0 is T
//The Character at position 10 is O
public class A_13_String_Char {	
		public static void main(String[] args) {
		
			String str = "Tops Technologies!";
			System.out.println("Original String = " + str);
			
			//Get the character at position 0 and 10.
			int index1 = str.charAt(0);
			int index2 = str.charAt(10);
			
			//Print out the result.
			System.out.println("The character at position 0 is "+(char)index1);
			System.out.println("The character at position 10 is "+(char)index2);
		}
}
