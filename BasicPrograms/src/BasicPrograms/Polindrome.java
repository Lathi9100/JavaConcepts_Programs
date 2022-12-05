package BasicPrograms;

import java.util.Scanner;

//3) Palindrome Program in Java

public class Polindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number =sc.nextInt();
		polindrome(number);
	}
	public static void polindrome(int num) {
		
		int rev =0;
		int number = num;
		int remainder;
		while(num != 0) {
			 remainder = num % 10;
			rev = 10 * rev + remainder;
			num = num / 10;
		}
		if(number == rev) {
			System.out.println("Yes it is a polindrome Number: " + number);
		}else {
			System.out.println("No it is not a polindrome Number: " + number);
		}
	}
}
