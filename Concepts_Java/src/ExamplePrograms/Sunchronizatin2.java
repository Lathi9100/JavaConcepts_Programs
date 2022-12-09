package ExamplePrograms;

//This program is used to show the multithreading example with synchronization
// using static synchronized method.
class PrintTable2{
	public synchronized static void prntTable(int n) {
		System.out.println("Table: "+n);
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(600);
			}catch(Exception e) {
				System.out.println(e);	
			}
		}
	}
}
class Thd1 extends Thread{
	public void run() {
		PrintTable2.prntTable(4);
	}
}
class Thd2 extends Thread{
	 
		public void run() {
			PrintTable2.prntTable(3);
	}
}
public class Sunchronizatin2 {

	public static void main(String[] args) {
		
	
	Thd1 thread1 = new Thd1();
	Thd2 thread2 = new Thd2();
	
	thread1.start();
	thread2.start();
	}
}
