package ExamplePrograms;

public class SubstringConcept {

	public void substringEx1() {
		String str = "Hello World";
		System.out.println(str.substring(6));
	}
	public void substringEx2() {
		String str = "Hello World";
		System.out.println(str.substring(2,5));
	}
	public static void main(String[] args) {
		
		SubstringConcept obj = new SubstringConcept();
		obj.substringEx1();
		obj.substringEx2();
	}
}
