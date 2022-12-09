package ExamplePrograms;

public class ThisKeyWord1 {

	int a,b;
	ThisKeyWord1(){
		this(10);
		System.out.println("Default Constructor...");
	}
	ThisKeyWord1(int num1){
		this(num1,20);
		System.out.println("Constructor with 1 parameter ccalled...");
	}
	ThisKeyWord1(int num1,int num2){
		this.a=num1;
		this.b=num2;
		System.out.println("Constructor with 2 paramters called...");
	}
	public void display() {
		System.out.println("a value: "+a);
		System.out.println("a value: "+b);
	}
	public static void main(String[] args) {
		ThisKeyWord1 obj = new ThisKeyWord1();
		obj.display();
		ThisKeyWord1 obj1 = new ThisKeyWord1(22);
		obj1.display();
		ThisKeyWord1 obj3 = new ThisKeyWord1(10,20);
		obj3.display();
	}
}
