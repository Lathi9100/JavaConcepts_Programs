package ExamplePrograms;

public class ThreadSleep extends Thread{

	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadSleep thread1 = new ThreadSleep();
		ThreadSleep thread2 = new ThreadSleep();
		ThreadSleep thread3 = new ThreadSleep();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
