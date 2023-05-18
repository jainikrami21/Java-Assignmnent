/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor. 
 */

class Triangle
{
	int a,b,c;
	
	public double Area()
	{
		double p = (a+b+c)/2.0;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public double Perimeter()
	{
		return (a+b+c)/2.0;
	}
	
}

public class A_26_Triangle_Area_perimeter {
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		t.a=3;
		t.b=4;
		t.c=5;
		
		System.out.println("Area of Triangle is : "+t.Area());
		
		System.out.println("Perimeter of Traingle is : "+t.Perimeter());
	}
}
