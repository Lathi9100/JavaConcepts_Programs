package ExamplePrograms;

public class ThreadPriority extends Thread{

	public void run() {
		System.out.println("Priority of current Thread: " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
	
		ThreadPriority thread1 = new ThreadPriority();
		ThreadPriority thread2 = new ThreadPriority();
		ThreadPriority thread3 = new ThreadPriority();
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
			
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
