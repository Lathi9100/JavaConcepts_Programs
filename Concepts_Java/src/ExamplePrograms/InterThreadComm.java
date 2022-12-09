package ExamplePrograms;


class Buffer {
	int a;
	boolean produced = false;
	
	public synchronized void produce(int x) {
		if(produced) {
			System.out.println("Producer is waiting...");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		a=x;
		System.out.println("Product "+a+" is Produced");
		produced = true;
		notify();
	}
	public synchronized void consume() {
		if(!produced) {
			System.out.println("Consumer is Waiting......");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Product "+a+" is Consumed");
		produced = false;
		notify();
	}
}
class Producer extends Thread{
	
	Buffer b;
	Producer(Buffer b){
		this.b=b;
	}
	public void run() {
		System.out.println("Producer start Producing....");
		for(int i=1;i<=10;i++) {
			b.produce(i);
		}
	}
}
class Consume extends Thread{
	Buffer b;
	Consume(Buffer b){
		this.b=b;
	}
	public void run() {
		System.out.println("Consumer start consuming.....");
		for(int i=1;i<=10;i++) {
			b.consume();
		}
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		
		Buffer buff = new Buffer();
		Producer prod = new Producer(buff);
		Consume cons = new Consume(buff);
		prod.start();
		cons.start();
	}
}
