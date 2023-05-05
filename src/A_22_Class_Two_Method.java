/*22.Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square.
 */

public class A_22_Class_Two_Method 
{
			
		public static void main(String[] args) 
		{
			Rectangle obj = new Rectangle();
			// Calling Function
			obj.Area(30,20);
			obj.Area(12.5, 4.5);
			
			Circle obj1 = new Circle();
			//Calling Function
			obj1.Area(3);
			obj1.Area(5.5);
			
			Square obj2 = new Square();
			//Calling Function
			obj2.Area(20);
			obj2.Area(5.2);
		}
}
	class Square 
	{
		//overloaded function to
		//calculate the area of the square
		// It takes one double parameter
		void Area(double side)
		{
			System.out.println("Area of the Square: "+ side * side);
		}
		//overloaded function to
		//calculate the area of the square
		// It takes one float parameter
		void Area(float side)
		{
			System.out.println("Area of the Square: "+ side * side);
		}
	}
	class Circle
	{
		static final double PI = Math.PI; 
				//overloaded function to
				//calculate the area of the circle
				// It takes one double parameter
				void Area(double r)
				{
					double A = PI * r * r;
					System.out.println("The area of the Circle is : "+ A);
				}
				//overloaded function to
				//calculate the area of the square
				// It takes one float parameter
				void Area(float r)
				{	
					double A = PI *r * r;
					System.out.println("The area of the Circle is : "+ A);
				}
	}
			class Rectangle
			{
				//overloaded function to
				//calculate the area of the rectangle
				// It takes one double parameter
				void Area(double l, double b)
				{
					System.out.println("Area of the rectangle : "+ l * b);
				}
				
				//overloaded function to
				//calculate the area of the rectangle
				// It takes one Float parameter
				void Area (int l , int b)
				{
					System.out.println("Area of the reactangle : "+ l * b);
				}
			}
	

