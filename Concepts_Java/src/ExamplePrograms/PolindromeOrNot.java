package ExamplePrograms;

public class PolindromeOrNot {

	public void polidromeOrNot(int num) {
		int rev = 0;
		int n =num;
		while(num != 0) {
			int rem = num % 10;
			rev = rem + 10 * rev;
			num = num/10;
		}
		System.out.println(rev);
		System.out.println(n);
		if(n == rev) {
			System.out.println("Is Polindrome: "+ rev);
		}else {
			System.out.println("Not Polindrome: "+rev);
		}
	}
	public static void main(String[] args) {
		PolindromeOrNot obj = new PolindromeOrNot();
		obj.polidromeOrNot(121);
	}
}
