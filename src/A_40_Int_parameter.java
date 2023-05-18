/*
 * W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid
 */
public class A_40_Int_parameter {
	 public static void validate(int age) {  
	        if(age<18) {  
	            
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	    public static void main(String args[]){    
	        validate(13);  
	        System.out.println("rest of the code...");    
	  }    
}
