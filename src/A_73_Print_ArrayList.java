import java.util.ArrayList;

/*
 * Write a Java program to print all the elements of an Array List using the position of
the elements. 
 */


public class A_73_Print_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> c1 = new ArrayList<String>();
		
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		
		System.out.println("\n Original array list: "+ c1);
		
		System.out.println("\n Print using index of an element: ");
		
		int no_of_elements = c1.size();
		
		for(int index = 0; index < no_of_elements; index++)
			
			System.out.println(c1.get(index));
		
	}
}
