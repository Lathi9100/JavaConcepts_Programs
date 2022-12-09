package ExamplePrograms;
import ExamplePrograms1.Package;
public class PackageCreation {

	public static void main(String[] args) {
		System.out.println("Importing another class method in another package");
		System.out.println("Static method import also");
		Package obj = new Package();
		obj.show3();
	}
	
}
