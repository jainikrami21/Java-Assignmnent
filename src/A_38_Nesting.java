/*
 * W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code} 
 */
public class A_38_Nesting {
	 public static void main(String args[]){
		 
	      try{
	    
	        try{     
	     
	            try{
	            	int arr[]= {1,2,3,4};
	            	/* I'm trying to display the value of
	            	 * an element which doesn't exist. The
	            	 * code should throw an exception
	            	 */
	            	System.out.println(arr[10]);
	            }catch(ArithmeticException e){
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3");
	            }
	        }
	        catch(ArithmeticException e){
	           System.out.print("Arithmetic Exception");
	           System.out.println(" handled in try-block2");
	        }
	    }
	    catch(ArithmeticException e3){
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(Exception e5){
	    	System.out.print("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	  }
}
