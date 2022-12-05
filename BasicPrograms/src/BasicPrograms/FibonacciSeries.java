package BasicPrograms;

import java.util.Scanner;

//1) Fibonacci Series in Java

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num =sc.nextInt();
		fibonacciSeries(num);
	}
	public static void fibonacciSeries(int num) {
		
		int f1=0;
		int f2=1;
		System.out.print(f1 +" "+f2 +" ");
		for(int i=2;i<=num;i++) {
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3 +" ");
		}
	}
}
