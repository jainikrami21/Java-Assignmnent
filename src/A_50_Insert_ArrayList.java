/*
 * Write a Java program to insert an element into the array list at the first position.
 */

import java.util.ArrayList;
import java.util.*;

public class A_50_Insert_ArrayList {
			
			public static void main(String[] args) {
				List<String> list_Strings = new ArrayList<String>();
				list_Strings.add("Red");
				list_Strings.add("Green");
				list_Strings.add("Orange");
				list_Strings.add("White");
				list_Strings.add("Black");
				
				System.out.println(list_Strings);
				
				list_Strings.add(0,"Pink");
				list_Strings.add(5,"Yellow");
				
				System.out.println(list_Strings);
			}
		}


