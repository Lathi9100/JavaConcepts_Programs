package ExamplePrograms;

class Details{
	public void show() {
		System.out.println("showing details...");
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// Details class obj in Aggregation class 
		// re-usability purposses
		Details obj = new Details();
		obj.show();
	}
}
