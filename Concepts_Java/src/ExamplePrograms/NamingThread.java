package ExamplePrograms;

public class NamingThread extends Thread{

	public void run() {
		System.out.println("Thread ID: "+Thread.currentThread().getId() + 
						   " Thread Name: " + Thread.currentThread().getName());;
	}
	public static void main(String[] args) {
		
		NamingThread thread1 = new NamingThread();
		NamingThread thread2 = new NamingThread();
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread1.start();
		thread2.start();
	}
}
