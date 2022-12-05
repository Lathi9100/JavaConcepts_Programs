package BasicPrograms;

import java.util.Scanner;

//4) Factorial Program in Java


public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		factorial(number);
	}
	public static void factorial(int num) {
		
		int sum =1;
		for(int i=0;i<num;i++) {
			sum += sum * i;
		}
		System.out.println(sum);
	}
}
