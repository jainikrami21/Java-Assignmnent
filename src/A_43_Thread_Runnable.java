/*
 * W.A.J. P to create one thread by implementing Runnable interface in
Class. 
 */
public class A_43_Thread_Runnable implements Runnable {
	public static void main(String[] args) {
		A_43_Thread_Runnable obj = new A_43_Thread_Runnable();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This Code is running in a thread");
	}
}
