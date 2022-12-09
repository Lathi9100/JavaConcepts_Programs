package ExamplePrograms;

public class ToString {

	String name;
	String rollno;
	ToString(String name, String rollno){
		this.name =name;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		 
		ToString str = new ToString("Hanuman","001");
		System.out.println(str);
	}
}
