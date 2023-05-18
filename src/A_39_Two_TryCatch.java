/*
 * W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero
 * */
public class A_39_Two_TryCatch {
	
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0;    
  
        }  
              
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
}
