package ExamplePrograms;

public class InternTrimLength {

	String str = "    Hello World";
	String str1 = "Hell";
	
	public void intern() {
		str1 =str.intern();
		System.out.println(str1);
	}
	public void length() {
		System.out.println(str.length());
	}
	public void trim() {
		System.out.println(str.trim());
	}
	public static void main(String[] args) {
		InternTrimLength obj = new InternTrimLength();
		obj.intern();
		obj.length();
		obj.trim();
	}
}
