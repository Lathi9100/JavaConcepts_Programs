package ExamplePrograms;

public class JoiningThread extends Thread{

	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoiningThread thread1 = new JoiningThread();
		JoiningThread thread2 = new JoiningThread();
		JoiningThread thread3 = new JoiningThread();
		thread1.start();
		try {
			thread1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();
	}
}
