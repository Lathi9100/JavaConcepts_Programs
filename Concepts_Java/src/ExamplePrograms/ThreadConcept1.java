package ExamplePrograms;

public class ThreadConcept1 extends Thread{

	public void run() {
		System.out.println("Thread Started");
	}
	
	public static void main(String[] args) {
	
		ThreadConcept1 thread = new ThreadConcept1();
		thread.start();
	}
}
