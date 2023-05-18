/*
 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods
 */

import java.util.Scanner;
import static java.lang.Math.*;


		
		
		 abstract class Shape{
		    public abstract void RectangleArea(double lenght, double width);
		    public abstract void SquareArea(double side);
		    public abstract void CircleArea(double radius);
		}

		

		class Area extends Shape{

		    @Override
		    public void RectangleArea(double lenght, double width) {
		        System.out.printf("Rectangle area = %.2f", lenght*width);
		        System.out.println("");
		    }

		    @Override
		    public void SquareArea(double side) {
		        System.out.printf("Square area = %.2f", pow(side,2));
		        System.out.println("");
		    }

		    @Override
		    public void CircleArea(double radius) {
		        System.out.printf("Circle area = %.2f", PI*pow(radius, 2));
		        System.out.println("");
		    }
		}

		
		
public class A_32_Calculate_AreaDemo {
	
	public static void main(String[] args) {
		
		Area area = new Area();
        Scanner in = new Scanner(System.in);

        System.out.print("Entrer length for rectangle: ");
        double len = in.nextDouble();
        
        System.out.print("Entrer breadth for rectangle: ");
        double bre = in.nextDouble();
        area.RectangleArea(len, bre);

        System.out.print("Entrer breadth for square: ");
        double sid = in.nextDouble();
        area.SquareArea(sid);

        System.out.print("Entrer breadth for circle: ");
        double rad = in.nextDouble();
        area.CircleArea(rad);
		
	}
}
