package ExamplePrograms;

//multithreading example without synchronization.

 class PrintTable{
	
	 public void prntTable(int n) {
		 System.out.println("Table: "+n);
		 for(int i=1;i<=10;i++) {
			 System.out.println(n * i);
			 try {
				 Thread.sleep(600);
			 }catch(Exception e){
				 System.out.println(e);
			 }
		 }
	 }
}
 class Thread1 extends Thread{
	 PrintTable pt;
	 Thread1(PrintTable pt){
		 this.pt=pt;
	 }
	 public void run() {
		 pt.prntTable(2);
	 }
 }
 class Thread2 extends Thread{
	 PrintTable pt;
	 Thread2(PrintTable pt){
		 this.pt=pt;
	 }
	 public void run() {
		 pt.prntTable(5);
	 }
 }
public class Synchronization {

	public static void main(String[] args) {
		
		PrintTable obj = new PrintTable();
		Thread1 thrd1 = new Thread1(obj);
		Thread2 thrd2 = new Thread2(obj);
		
		thrd1.start();
		thrd2.start();
	}
	
}
