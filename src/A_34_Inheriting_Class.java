/*
 * Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class. 
 */
import java.util.*;

	public class shape{
		public void print_shape(){
			System.out.println("This is shape");
	}
}
	
	class rectangle extends shape{
		public void print_rect(){
			System.out.println("This is rectangular shape");
	}
}
	
	class circle extends shape {
		public void print_circle(){
			System.out.println("This is circular shape");
	}
}
	
	class square extends rectangle{
		public void print_square(){
			System.out.println("Square is a rectangle");
	}
}
	
public class A_34_Inheriting_Class {
	public static void main(String[] args) {
		square sq = new square();
		sq.print_rect();
		sq.print_shape();
		sq.print_square();
	}
}
