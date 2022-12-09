package ExamplePrograms;

class Student{
	int rollNo = 100;
}
class SchoolStudent extends Student{
	int rollNo = 200;
}
class CollegeStudent extends SchoolStudent{
	int rollNo = 120;
}
public class DynamicDispatch {

	public static void main(String[] args) {
	
		Student obj = new SchoolStudent();
		Student obj1 = new CollegeStudent();
		System.out.println(obj.rollNo);
		System.out.println(obj1.rollNo);
	}
}
