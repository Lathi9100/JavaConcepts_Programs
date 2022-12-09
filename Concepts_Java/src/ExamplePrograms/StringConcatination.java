package ExamplePrograms;

public class StringConcatination {

	public void concatinationOperator() {
		String str1 = "WWW.";
		String str2 = "thisisplus";
		String str3 = "com";
		System.out.println(str1+str2+str3);
		String str = (new StringBuilder()).append(str1).append(str2).toString();
		System.out.println(str);
	}
	public void appendMethod() {
		String str1 = "WWW.";
		String str2 = "thisIsAppend.";
		String str3 = "com";
		String str = (new StringBuilder()).append(str1).append(str2).append(str3).toString();
		System.out.println(str);
	}
	public void strNum() {
		int num1 = 20;
		int num2 = 30;		
		String str1 = "Hello";
		String str2 = "World";
		int num3 =50;
		System.out.println(num1+num2+str1+str2+num3);
	}
	public static void main(String[] args) {
		
		StringConcatination obj = new StringConcatination();
		System.out.println("Using + operator:");
		obj.concatinationOperator();
		System.out.println("Using append:");
		obj.appendMethod();
		System.out.println("Using + operator and combining Integer values:");
		obj.strNum();
		
		
	}
}
