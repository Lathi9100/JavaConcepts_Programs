package ExamplePrograms;

public class DeadLock {

	
	public void run() {
		
	}
	public static void main(String[] args) {
		
		final String resource1 = "vishnu";
		final String resource2 = "sst";
		final String resource3 = "chandrika";
		
		Thread thread1 = new Thread() {
		public void run() {
			synchronized (resource1) {
					System.out.println("Thread1 Locked resource1: "+resource1);
				try {
					Thread.sleep(600);
				}catch(Exception e) {
					System.out.println(e);
				}
				synchronized(resource2) {
					System.out.println("Thread1 Locked resource2: "+resource1);
				}
				synchronized(resource3) {
					System.out.println("Thread1 Locked resource3: "+resource1);
				}
			}
		}
	};
		Thread thread2 = new Thread() {
			public void run() {
				synchronized(resource1) {
						System.out.println("Thread2 Locked resource1: "+resource1);
					try {
						Thread.sleep(600);
					}catch(Exception e) {
						System.out.println(e);
					}
					synchronized(resource2) {
						System.out.println("Thread2 Locked resource2: "+resource2);
					}
					synchronized(resource3) {
						System.out.println("Thread2 Locked resource3: "+resource3);
					}
				}
			}
		};
		Thread thread3 = new Thread() {
			public void run() {
				synchronized(resource1) {
						System.out.println("Thread3 Locked resource1: "+resource1);
					try {
						Thread.sleep(600);
					}catch(Exception e) {
						System.out.println(e);
					}
					synchronized(resource2) {
						System.out.println("Thread3 Locked resource2: "+resource2);
					}
					synchronized(resource3) {
						System.out.println("Thread3 Locked resource3: "+resource3);
					}
				}
			}
		};

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
