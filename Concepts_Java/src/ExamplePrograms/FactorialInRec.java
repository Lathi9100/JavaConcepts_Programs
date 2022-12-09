package ExamplePrograms;

public class FactorialInRec {

public int factorial(int num) {
		
		if(num == 1) return num;
		
		return num * factorial(num-1);
	}
	public static void main(String[] args) {
		
		FactorialInRec obj = new FactorialInRec();
		System.out.println(obj.factorial(5));
  }
}
