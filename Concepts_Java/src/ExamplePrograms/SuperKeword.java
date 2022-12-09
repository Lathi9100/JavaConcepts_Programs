package ExamplePrograms;

class BaseClass1{
	
	BaseClass1(){
		System.out.println("This is BaseClass");
	}
	public void display() {
		System.out.println("BaseClass method");
	}
}
class SubClass1 extends BaseClass1{
	SubClass1(){
		//calling Baseclass constructor
		super();
		System.out.println("This is SubClass");
	}
	public void display() {
		System.out.println("Subclass method1");
	}
	public void display1() {
		System.out.println("SubClass method2");
		//calling same class method
		display();
		//calling different class method
		super.display();
	}
}
public class SuperKeword {

	public static void main(String[] args) {
		SubClass1 obj = new SubClass1();
		obj.display1();
		obj.display();
	}
	
}
