package BasicPrograms;

import java.util.Scanner;

//8) How to Compare Two Objects in Java

public class CompareObjects {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num_one = sc.nextInt();
		System.out.println("Enter Second Number");
		int num_two = sc.nextInt();
		
		if(num_one == num_two) {
			System.out.println("First Number and Second Number both are same");
		}else if(num_one > num_two) {
			System.out.println("First Number Greater than the Second Number");
		}else {
			System.out.println("Second Number Greater than the First Number");
		}
	}
}
