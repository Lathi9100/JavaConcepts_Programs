package ExamplePrograms;

//final class Example1{
//}
//// final class cannot be inherited
//class Example2 extends Example1{
//}
class Example3 {
	// final method can be inherited
	public final void m1() {
		System.out.println("final method can be inherited");
	}
}
class Example4 extends Example3{
	final int num1;
	public void m2() {
		m1();
	}
	Example4(int num1){
		
		//final variable cannot be changed
	//	num1= num1*2;
		this.num1=num1;
		System.out.println("Constructor calling: "+num1);
	}
	
}
public class FinalKeyWord {

	public static void main(String[] args) {
		Example4 obj = new Example4(91);
		obj.m2();
		obj.m1();
	}
}
