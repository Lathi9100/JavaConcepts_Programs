package ExamplePrograms;

public class EvenOdd {

	public void evenOdd(int num) {
		if(num % 2 ==0) {
			System.out.println("Even Number: " +num);
		}else {
			System.out.println("Odd Number: " +num);
		}
	}
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		obj.evenOdd(9);
	}
}
