package ExamplePrograms;

public class DefaultModifier {

	String name;
	void show() {
		System.out.println("This is Default Modifier: "+ name);
	}
	public static void main(String[] args) {
		DefaultModifier obj = new DefaultModifier();
		System.out.println("Name: "+obj.name);
		obj.show();
	}
}
