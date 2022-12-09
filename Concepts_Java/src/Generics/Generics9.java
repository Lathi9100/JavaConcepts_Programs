package Generics;

public class Generics9 {

	// Generic method type
	public <T, U> void display(T item,U item1) {
		System.out.println("Value: "+item);
		System.out.println("type of value: "+item.getClass().getName());
		System.out.println("Value: "+item1);
		System.out.println("type of value: "+item1.getClass().getName());
	}	
	public static void main(String[] args) {
		
		Generics9 obj = new Generics9();
		obj.display("String", "String");
		obj.display(100, 12.34);
		obj.display(2, 10.28f);
	}
}
