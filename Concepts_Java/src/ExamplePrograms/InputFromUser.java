package ExamplePrograms;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("your name: "+name);
		System.out.println("your age: "+age);
	}
}
