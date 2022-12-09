package ExamplePrograms;

public class PrimeOrNot {

	public boolean primeOrNot(int num) {
		if(num < 2) return false;
		for(int i=2;i<num;i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {

		PrimeOrNot obj = new PrimeOrNot();
		if(obj.primeOrNot(5)) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}

}
