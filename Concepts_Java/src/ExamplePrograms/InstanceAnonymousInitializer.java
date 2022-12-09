package ExamplePrograms;

public class InstanceAnonymousInitializer {

	static int a;
	int b;
	int c;
	
	static {
		System.out.println("Static Anonymous block");
		 a=10;
	}
	{
		System.out.println("Anonymous block 1st");
	}
	{
		System.out.println("Anonymous block 2nd");
		b = 20;
	}
	// default constructor
	InstanceAnonymousInitializer(){
		System.out.println("Default constructor called");
	}
	InstanceAnonymousInitializer(int num){
		System.out.println("1 Parameter consrtuctor called");
	}
	public void display() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
	
	public static void main(String[] args) {
		InstanceAnonymousInitializer obj = new InstanceAnonymousInitializer();
		obj.display();
		InstanceAnonymousInitializer obj1 = new InstanceAnonymousInitializer(22);
		obj1.display();
	}
}


