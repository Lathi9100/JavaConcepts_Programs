package Generics;

// type of class representing as T
class Generic<T>{
	private T item;
	
	Generic(T item){
		this.item=item;
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item=item;
	}
	public void display() {
		System.out.println("Value of item: "+ item);
		System.out.println("Item type: "+item.getClass().getName());
	}
}

public class Generics7 {
	public static void main(String[] args) {
		
		Generic<String> obj = new Generic("String");
		obj.display();
		Generic<Integer> obj1 = new Generic(100);
		obj1.display();
	}
}








