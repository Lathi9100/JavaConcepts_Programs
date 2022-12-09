package ExamplePrograms;

class Static{
	static int a;
	int b;
	// It will call when the object creation was successful
	{
		System.out.println("Non static Anonymous block");
	}
	// It will call when the object creation was successful
	static {
		System.out.println("Static Anonymous block");
	}
	Static(){
		a = a+10;
		b = b+10;
		System.out.println("In Constructor calling...");
	}
	public void m1() {
		System.out.println("Non static method calling...");
	}
	public static void m2() {
		System.out.println("Static method calling...");
	}
	public void display() {
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
	}
}
public class StaticKeyWord {

	public static void main(String[] args) {
		Static obj = new Static();
		// non static method calling
		obj.m1();
		// static method calling
		Static.m2();
		//calling values
		obj.display();
	}
}
