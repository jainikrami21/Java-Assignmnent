/*
 *
Write a Java program to search an element in an array list.
 */

import java.util.ArrayList;
import java.util.*;

		

public class A_54_Search {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		if(list_Strings.contains("Red")) {
			System.out.println("Found the element");
		}
		else
		{
			System.out.println("There is no such element");
		}
		
	}
}
