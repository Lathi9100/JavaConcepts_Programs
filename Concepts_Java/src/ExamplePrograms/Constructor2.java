package ExamplePrograms;

class ConstructorExample2{
	boolean val;
	String name;
	int age;
	ConstructorExample2(){
		System.out.println("Constructor called without any arguments");
	}
	ConstructorExample2(boolean val){
		System.out.println("Constructor called with one arguments");
		this.val=val;
	}
	ConstructorExample2(String name, int age){
		System.out.println("Constructor called with two arguments");
		this.name=name;
		this.age=age;
	}
}
public class Constructor2 {
	
	public static void main(String[] args) {
		
		ConstructorExample2 obj = new ConstructorExample2();
		System.out.println(obj);
		ConstructorExample2 obj1 = new ConstructorExample2(true);
		System.out.println(obj1.val);
		ConstructorExample2 obj2 = new ConstructorExample2("Heive",112);
		System.out.println(obj2.name+"\n"+obj2.age);
	}

}
