package ExamplePrograms;

interface AGradeCollege{
	
}
class College1 implements AGradeCollege{
	
}
class College2{
	
}
public class MarkerInterface {

	public static void tester(Object obj) {
		if(obj instanceof AGradeCollege) {
			System.out.println("A Grade College....");
		}
	}
	public static void main(String[] args) {
		
		College1 obj1 = new College1();
		College2 obj2 = new College2();
		tester(obj1);
		tester(obj2);
	}
}
