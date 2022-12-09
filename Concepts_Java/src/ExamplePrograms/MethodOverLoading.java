package ExamplePrograms;

public class MethodOverLoading {

	public void m1() {
		System.out.println("Method with no arguments");
	}
	public void m2(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	public void m3(int num1, double num2, float num3) {
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.m1();
		System.out.println("Adding two arguments");
		obj.m2(7, 6.4);
		System.out.println("Adding Three arguments");
		obj.m3(7, 89.43, 66.343232f);
		
	}
}
