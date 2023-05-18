/*
 * Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user
 */

class Complex{
	
	//declaring variables
	
	int real , imaginary;
	
	//Empty Constructor
	Complex()
	{
		
	}
	
	//Contructor to accept
	//real and imaginary part
	
	Complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}
	
	//Defining addcomp() method
	//for adding two complex number
	Complex addComp(Complex c1 , Complex c2)
	{
		//creating temporary variable
		Complex temp = new Complex();
		
		//adding real part of complex numbers
		temp.real = c1.real + c2.real;
		
		//adding Imaginary part of complex numbers
		temp.imaginary = c1.imaginary + c2.imaginary;
		
		//returning the sum
		return temp;
	}
	
		//Defining subtractcomp() method
		//for subtracting two complex number
		Complex subtractComp(Complex c1 , Complex c2)
		{
			//creating temporary variable
			Complex temp = new Complex();
			
			//subtracting real part of complex numbers
			temp.real = c1.real - c2.real;
			
			//subtracting Imaginary part of complex numbers
			temp.imaginary = c1.imaginary - c2.imaginary;
			
			//returning the difference
			return temp;
		}
		
		//Function for printing complex number
		void printcomplexNumber()
		{
			System.out.println("Complex number: "+ real +" + "+ imaginary + "i");
		}
}

public class A_27_Complex_Number {
	
	public static void main(String[] args) {
		
	}
}
