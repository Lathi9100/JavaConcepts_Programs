package ExamplePrograms;

class BaseClass{
	String name = "Course";
	public void m1() {
		System.out.println("Parent class...");
	}
}
class SubClass extends BaseClass{
	@Override
	public void m1() {
		System.out.println("Child class..."+name);
	}
}
//code reusability
public class Inheritance {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.m1();
	}
}
