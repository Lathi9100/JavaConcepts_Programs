package ExamplePrograms;

public class Starvation implements Runnable{

	private final Object resource;
	private final String message;
	private final boolean fair;
	
	public Starvation(Object resource, String message, boolean fair) {
		this.resource=resource;
		this.message=message;
		this.fair=fair;
	}
	public void run() {
		synchronized(this) {
			for(;;) {
				synchronized(message) {
					print(message);
					try {
						(fair ? resource : this).wait(100);
					}catch(InterruptedException e) {	
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
		boolean fair = false;
		if(args != null && args.length >= 1 && args[0].equals("fair")) {
			fair = true;
		}
		
		final int cpus =Runtime.getRuntime().availableProcessors();
		System.out.println(cpus+" Available cpus found");
		final int runners = cpus * 2;
		System.out.println("Starting "+runners+ " runners");
		
		final Object resource = new Object();
		
		for(int i=1;i<=runners;i++) {
			(new Thread(new Starvation(resource,String.valueOf(i),fair))).start();
		}
		synchronized(Starvation.class) {
			try {
				Starvation.class.wait();
			}catch(Exception e) {
			}
		}
	}
	private static void print(String str) {
		synchronized(System.out) {
			System.out.print(str);
			System.out.flush();
		}
	}
}
