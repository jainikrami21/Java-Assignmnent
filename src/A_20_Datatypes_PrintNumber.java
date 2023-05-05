/*20.Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type. 
 */

public class A_20_Datatypes_PrintNumber {

		static void printn(boolean a) {
			System.out.println(a);
		}
		static void printn(String b) {
			System.out.println(b);
		}
		static void printn(int c) {
			System.out.println(c);
		}
		static void printn(long d) {
			System.out.println(d);
		}
		static void printn(float e) {
			System.out.println(e);
		}
		static void printn(char f) {
			System.out.println(f);
		}
		static void printn(double g) {
			System.out.println(g);
		}
		
		public static void main(String[]args) {
			printn(10);
			printn(27.2f);
			printn(151);
			printn(55.2);
			printn("Hello");
			printn(true);
			printn('A');
		}
}
