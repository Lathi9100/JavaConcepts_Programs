package ExamplePrograms;

//This program is used to show the multithreading example with synchronization
class PrintTable1{
	
	public synchronized void prntTable(int n) {
		System.out.println("Table: " +n);
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
class Thrd1 extends Thread{
	PrintTable1 pt;
	Thrd1(PrintTable1 pt){
		this.pt=pt;
	}
	public void run() {
		pt.prntTable(8);
	}
}
class Thrd2 extends Thread{
	PrintTable1 pt;
	Thrd2(PrintTable1 pt){
		this.pt=pt;
	}
	public void run() {
		pt.prntTable(2);
	}
}
public class Synchronization1 {

	public static void main(String[] args) {
		
		PrintTable1 obj = new PrintTable1();
		Thrd1 thrd1 = new Thrd1(obj);
		Thrd2 thrd2 = new Thrd2(obj);
		
		thrd1.start();
		thrd2.start();
	}
}




