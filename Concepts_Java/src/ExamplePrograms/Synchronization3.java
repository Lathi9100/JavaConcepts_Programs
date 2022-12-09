package ExamplePrograms;

//This program is used to show the multithreading example with synchronization
//using synchronized block.

class PrintTable3{
	
	public void prntTable(int n) {
		synchronized(this) {
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
}
class Thrd3 extends Thread{
	PrintTable3 pt;
	Thrd3(PrintTable3 pt){
		this.pt=pt;
	}
	public void run() {
		pt.prntTable(7);
	}
}
class Thrd4 extends Thread{
	PrintTable3 pt;
	Thrd4(PrintTable3 pt){
		this.pt=pt;
	}
	public void run() {
		pt.prntTable(9);
	}
}
public class Synchronization3 {

	public static void main(String[] args) {

		PrintTable3 obj = new PrintTable3();
		Thrd3 thread1 = new Thrd3(obj);
		Thrd4 thread2 = new Thrd4(obj);
		
		thread1.start();
		thread2.start();
	}

}
