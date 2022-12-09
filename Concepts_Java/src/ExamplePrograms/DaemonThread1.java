package ExamplePrograms;

public class DaemonThread1 extends Thread{

	public void run() {
		System.out.println("Started " + Thread.currentThread().getName() + " " + Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		
		DaemonThread1 thread1 = new DaemonThread1();
		DaemonThread1 thread2 = new DaemonThread1();
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread1.start();
		thread1.setDaemon(true);
		thread2.start();
	}
}
