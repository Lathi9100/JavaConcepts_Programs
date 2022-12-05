package BasicPrograms;

import java.util.Scanner;

//5) Armstrong Number in Java
//153 = 1*3+5*3+3*3
public class Armstron {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		armstrongOrNot(number);
	}
	public static void armstrongOrNot(int number) {
		
		int tempNum =number;
		int digits =0;
		int total =0;
		while(tempNum != 0) {
			int rem = tempNum % 10;
			digits +=1;
			tempNum = tempNum /10;
		}
		tempNum = number;
		while(tempNum != 0) {
			int remainder = tempNum % 10;
			total += Math.pow(remainder, digits);
			tempNum = tempNum/10;
		}
		if(number == total) {
			System.out.println("It is an Armstrong Number: " + total);
		}else {
			System.out.println("It is not an Armstrong Number: " + total);
		}
	}
}
