package ExamplePrograms;

public class DeamonThread extends Thread{

	public void run() {
		System.out.println("Started: "+ Thread.currentThread().getName()+ " " + Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) {
	
		DeamonThread thread1 = new DeamonThread();
		DeamonThread thread2 = new DeamonThread();
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		// Must be before Thread was started
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
	}
}
