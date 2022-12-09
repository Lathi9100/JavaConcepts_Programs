package ExamplePrograms;

public class ThrdCall21 {

	public void run() {
		System.out.println("Thread Started");
	}
	public static void main(String[] args) {
		ThrdCall21 thread = new ThrdCall21();
		// Thread won't create new Thread Call Stack
		thread.run();
	}
}
