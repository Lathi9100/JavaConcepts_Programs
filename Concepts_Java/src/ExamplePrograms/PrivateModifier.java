package ExamplePrograms;
import ExamplePrograms1.Package;
public class PrivateModifier {

	private String name;
	private int age;
	private void show() {
		System.out.println("This is Private Modifier where we can acces only within the class");
	}
	public static void main(String[] args) {
		PrivateModifier obj = new PrivateModifier();
		obj.show();
		System.out.println(obj.name+" "+obj.age);
		
		// accessing private method in anothee class makes an error
		Package obj1 = new Package();
		// obj1.show2();
	}
}
