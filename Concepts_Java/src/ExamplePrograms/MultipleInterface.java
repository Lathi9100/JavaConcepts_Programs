package ExamplePrograms;

interface Employee1{
	void employee();
}
interface EmployeeName{
	void name(String name);
}
interface EmployeeId{
	void id(int id);
}
public class MultipleInterface implements Employee1, EmployeeName, EmployeeId{

	public void employee() {
		System.out.println("Employee Details- ");
	}
	public void name(String name) {
		System.out.println("Employee Name: "+name);
	}
	public void id(int id) {
		System.out.println("Employee ID: "+id);
	}
	
	public static void main(String[] args) {
		Employee1 obj = new MultipleInterface();
		obj.employee();
		EmployeeName obj1 = new MultipleInterface();
		obj1.name("Hanuman");
		EmployeeId obj2 = new MultipleInterface();
		obj2.id(001);
	}
}
