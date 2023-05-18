/*
 * W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution. 
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class A_45_Thread_Multi {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i+=2) {
					System.out.println("Hello This Is Thread One");
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException ex) {
						Logger.getLogger(A_45_Thread_Multi.class.getName()).log(Level.SEVERE,null,ex);
						
					}
				}
			}
		};
		
		Thread threadTwo = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i+=2) {
					System.out.println("Hello This Is Thread TwO");
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException ex) {
						Logger.getLogger(A_45_Thread_Multi.class.getName()).log(Level.SEVERE,null,ex);
						
					}
				}
			}
		};
		
		thread.start();
		threadTwo.start();
	}
}
