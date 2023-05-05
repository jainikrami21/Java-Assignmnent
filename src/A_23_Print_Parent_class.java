/*23. Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class 
*/	


public class A_23_Print_Parent_class {
	public static void main(String[] args) {
		Yclass m = new Yclass();
		Zclass n = new Zclass();
		m.ymethod();;
		n.zmethod();
		n.ymethod();;
	}
}
class Yclass{
	public void ymethod(){
    System.out.println("This is parent class");
  }
}

class Zclass extends Yclass{
	 public void zmethod(){
	    System.out.println("This is child class");
	  }
	}

		  

		
		  
