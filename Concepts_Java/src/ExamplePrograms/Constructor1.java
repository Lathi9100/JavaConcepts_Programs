package ExamplePrograms;

//Creating Constructor 
class ConstructorExample1{
	String name;
	int age;
	ConstructorExample1(String name,int age){
		System.out.println("Constructor Called");
		this.name=name;
		this.age=age;
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		ConstructorExample1 obj = new ConstructorExample1("Kve",101);
		// throws error for not defining any arguments
		//ConstructorExample1 obj1 = new ConstructorExample1();
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);
	}
}
