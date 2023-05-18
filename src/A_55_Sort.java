/*
 * • Write a Java program to sort a given array list. 
 */

import java.util.ArrayList;
import java.util.*;

		

public class A_55_Sort {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
			System.out.println("List Before Sort: "+list_Strings);
		
			Collections.sort(list_Strings);
		
			System.out.println("List After Sort: "+list_Strings);
	
		
	}
}
