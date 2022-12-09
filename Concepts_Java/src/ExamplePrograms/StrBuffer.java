package ExamplePrograms;

public class StrBuffer {

	String str = "www.abc.com";
	StringBuffer sb = new StringBuffer("Hello");
	
	public void append() {
		System.out.println(sb.append(" Mr"));
	}
	public void insert() {
		System.out.println(sb.insert(0,"com."));
	}
	public void replace() {
		System.out.println(sb.replace(0, 4, "Hey"));
	}
	public void reverse() {
		System.out.println(sb.reverse());
	}
	public void delete() {
		System.out.println(sb.delete(0, 3));
	}
	public static void main(String[] args) {
		StrBuffer obj = new StrBuffer();
		obj.append();
		obj.insert();
		obj.replace();
		obj.reverse();
		obj.delete();
	}
}
