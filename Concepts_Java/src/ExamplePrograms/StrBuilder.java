package ExamplePrograms;

public class StrBuilder {

StringBuilder sb = new StringBuilder("Hello");
	
	public void append() {
		System.out.println(sb.append(" Mr"));
	}
	public void insert() {
		System.out.println(sb.insert(0,"com."));
	}
	public void replace() {
		System.out.println(sb.replace(0, 4, "Hey"));
	}
	
	public static void main(String[] args) {
		StrBuilder obj = new StrBuilder();
		obj.append();
		obj.insert();
		obj.replace();
		
  }
}
