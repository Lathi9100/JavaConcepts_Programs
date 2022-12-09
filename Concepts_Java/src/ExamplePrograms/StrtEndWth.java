package ExamplePrograms;

public class StrtEndWth {

	String str = "hello world";
	
	public void startWith() {
		System.out.println(str.startsWith("h"));
		// false
		System.out.println(str.startsWith("g"));
	}
	public void endWith() {
		System.out.println(str.endsWith("d"));
		// false
		System.out.println(str.endsWith("e"));
	}
	public static void main(String[] args) {
		
		StrtEndWth obj = new StrtEndWth();
		obj.startWith();
		obj.endWith();
	}
}
