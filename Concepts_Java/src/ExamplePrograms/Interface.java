package ExamplePrograms;

interface Employee{
	void details(String name, int id);
}
public class Interface implements Employee{

	public void details(String name, int id) {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+id);
	}
	
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.details("King Nagurjuna", 111);
	}
}
