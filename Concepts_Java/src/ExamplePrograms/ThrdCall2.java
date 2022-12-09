package ExamplePrograms;

public class ThrdCall2 extends Thread{

	public void run() {
		System.out.println("Thread Started");
	}
	public static void main(String[] args) {
		
		ThrdCall2 thread = new ThrdCall2();
		
		thread.start();
		// Throws Exception
		thread.start();
	}
}
