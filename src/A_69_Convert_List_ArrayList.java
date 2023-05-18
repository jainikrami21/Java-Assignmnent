import java.util.HashSet;
import java.util.*;
/*
 * Write a Java program to convert a hash set to a List/Array List
 */


public class A_69_Convert_List_ArrayList {
	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		
		System.out.println("Original Hash Set: "+ h_set);
		
		List<String> list = new ArrayList<String>(h_set);
		
		
		System.out.println("ArrayList Contains: "+ list);
	}
}
