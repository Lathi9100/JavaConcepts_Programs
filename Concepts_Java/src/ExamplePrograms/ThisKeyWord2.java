package ExamplePrograms;

public class ThisKeyWord2 {

	public void display() {
		System.out.println("This is 1st method");
		this.display1();
	}
	public void display1() {
		System.out.println("This is 2nd method called from 1st method using this keyWord");
		this.display2();
	}
	public void display2() {
		System.out.println("This is 3rd method called from 2nd method using this keyWord");
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord2 obj = new ThisKeyWord2();
		obj.display();
	}
}
