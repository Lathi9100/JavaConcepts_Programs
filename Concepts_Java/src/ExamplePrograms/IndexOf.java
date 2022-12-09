package ExamplePrograms;

public class IndexOf {

	String str = "www.HelloWorld.com";
	public void indexOf() {
		System.out.println(str.indexOf('h'));
	}
	public void lastIndex() {
		System.out.println(str.lastIndexOf('o'));
	}
	public static void main(String[] args) {
		
		IndexOf obj = new IndexOf();
		obj.indexOf();
		obj.lastIndex();
	}
}
