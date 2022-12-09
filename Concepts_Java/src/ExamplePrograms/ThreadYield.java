package ExamplePrograms;

public class ThreadYield extends Thread{

	public void run() {
	
		for(int i=1;i<=5;i++) {
		try {
			Thread.yield();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
	}
	public static void main(String[] args) {
		ThreadYield thread1 = new ThreadYield();
		ThreadYield thread2 = new ThreadYield();
		ThreadYield thread3 = new ThreadYield();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
