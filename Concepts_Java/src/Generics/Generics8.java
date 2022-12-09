package Generics;

class Generic1<T,U>{
	private T item;
	private U item1;
	// Generic Constructor
	Generic1(T item, U item1){
		this.item=item;
		this.item1=item1;
	}
	public T getItem(){
		return item;
	}
	public void setItem(T item) {
		this.item=item;
	}
	public U getItem1() {
		return item1;
	}
	public void setItem1(U item1) {
		this.item1=item1;
	}
	public void display() {
		System.out.println("Values: "+item);
		System.out.println("type: "+item.getClass().getName());
		System.out.println("Values: "+item1);
		System.out.println("type: "+item1.getClass().getName());
	}
	
}

public class Generics8 {
	
	public static void main(String[] args) {
		// String and Integer type of values
		Generic1<String,Integer> obj = new Generic1<String, Integer>("String",100);
		obj.display();
		// 
		Generic1<Double,Integer> obj1 = new Generic1<Double, Integer>(19.393,100);
		obj1.display();
	}
}
