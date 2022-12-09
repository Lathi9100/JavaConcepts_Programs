package ExamplePrograms;

// Using Runnable interface
public class ThreadConcept implements Runnable {

	public void run() {
		System.out.println("Thread Started");
	}
	
	public static void main(String[] args) {
		
		ThreadConcept threadObj = new ThreadConcept();
		Thread thread = new Thread(threadObj);
		thread.start();
	}
}
