package BasicPrograms;

import java.util.Scanner;

//2) Prime Number Program in Java

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =sc.nextInt();
		for(int i=0;i<num;i++) {
		if(primeNumbers(i)) {
			System.out.print(i + " ");
		}else {
			System.out.print("");
		}
		}
	}
	public static boolean primeNumbers(int num) {
		
		if(num < 2) return false;
		
		for(int i=2;i<num;i++) {
			if(num % i == 0) return false;
		}
		
		return true;
		
	}
}
