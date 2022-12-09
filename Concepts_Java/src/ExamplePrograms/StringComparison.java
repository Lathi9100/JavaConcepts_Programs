package ExamplePrograms;

public class StringComparison {
	// This method is used to compare strings using == operator.
	public void doubleEqualsMethod() {
		System.out.println("By == operator Method");
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "World";
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
	}
	// This method is used to compare strings using equals operator.
	public void byEqualsMethod() {
		System.out.println("By equals Method");
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "World";
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str1));
		System.out.println(str1.equals(str4));
	}
	// This program is used to show the use of compareTo method.
	public void compareToMethod() {
		System.out.println("By comapreTo Method");
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "vin";
		String str4 = "Hello";
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str4));
	}
	public static void main(String[] args) {
		
		StringComparison obj = new StringComparison();
		System.out.println("String Comparison By different operations");
		obj.doubleEqualsMethod();
		obj.byEqualsMethod();
		obj.compareToMethod();
		
	}
}
