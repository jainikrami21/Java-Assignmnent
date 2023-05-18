/*
 * W.A.J. P to create one thread by extending Thread class in another Class.
 */
public class A_44_Thread_AnotherClass extends Thread {
		
	String s[]= {"Welcome","to","Java","Programming","Language"};
	public static void main(String[] args) {
		
		A_44_Thread_AnotherClass t = new A_44_Thread_AnotherClass("Extending Thread Class");
		
	}
	public A_44_Thread_AnotherClass(String n)
	{
		super(n);
		start();
	}
	
	public void run() {
		String name = getName();
		for(int i=0;i<s.length;i++)
		{
			try
			{
				sleep(500);
			}
			catch (Exception e)
			{
				
			}
			System.out.println(name+":"+s[i]);
		}
	}
	
	
}
