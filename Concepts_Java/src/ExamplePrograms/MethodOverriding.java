package ExamplePrograms;

class Parent{
	public void m1() {
		System.out.println("Parent class...");
	}
}
class Child extends Parent{
	@Override
	public void m1() {
		System.out.println("Child class...");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.m1();
		Parent obj1 = new Parent();
		obj1.m1();
		Parent obj2 = new Child();
		obj2.m1();
	}
}
