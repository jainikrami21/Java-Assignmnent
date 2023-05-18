import java.util.List;
import java.util.*;


/*
 * Write a Java program to extract a portion of an array list. 
 */


public class A_64_Extract_ArrayList {
	public static void main(String[] args) {
		List<String>list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println("Original list: "+ list_Strings);
		
		List<String> sub_List = list_Strings.subList(0, 3);
		
		System.out.println("List of first three elements: "+ sub_List);
	}
}
