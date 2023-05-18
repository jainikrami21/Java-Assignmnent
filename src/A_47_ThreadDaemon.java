/*
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start(); 
 */
public class A_47_ThreadDaemon extends Thread {
		
	public void run() 
	{
		System.out.println("Thread name: "+ Thread.currentThread().getName());
		System.out.println("Check if its DaemonThread: "+ Thread.currentThread().isDaemon());
	}
	public static void main (String[] args)
	{
		A_47_ThreadDaemon t1 = new A_47_ThreadDaemon();
		A_47_ThreadDaemon t2 = new A_47_ThreadDaemon();
		
		t1.start();
		t1.setDaemon(true);
		t2.start();
		
	}
}
