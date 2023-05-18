/*
 * W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
 */
public class A_46_ThreadTwice extends Thread {
	public void run() {
		System.out.println("Running...");
	}
	public static void main(String[] args) {
		A_46_ThreadTwice t1 = new A_46_ThreadTwice();
		t1.start();
		t1.start();
	}
}
