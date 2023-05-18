/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
*/

class rectangle {

	int length, breadth;

	public rectangle(int l, int b) {
		length = 1;
		breadth = b;
	}

	void print_area() {
		System.out.println(length * breadth);
	}

	void print_perimeter() {
		System.out.println(2 * (length * breadth));
	}
}

class square extends rectangle {
	int s;
	public square(int l, int b) {
		super(l, b);
		// TODO Auto-generated constructor stub
	}
//	int s;
//	public square(int s) {
////		super(s, s);
//		this.s=s;
//	}

}

public class A_25_Rectangle1_Square1 {
	public static void main(String[] args) {

		rectangle r = new rectangle(4, 5);

		square s = new square(4);

		r.print_area();
		r.print_perimeter();
		s.print_area();
		s.print_perimeter();

		System.out.println(" ");

	}
}
