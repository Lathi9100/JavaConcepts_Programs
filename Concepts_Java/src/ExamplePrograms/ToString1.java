package ExamplePrograms;

public class ToString1 {

	String name;
	String rollno;
	
	ToString1(String name,String rollno){
		this.name=name;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return "Name: "+name+", RollNo: "+rollno;
	}
	
	public static void main(String[] args) {
		
		ToString1 str = new ToString1("Hanuman","001");
		System.out.println(str);
	}
	
	
}
