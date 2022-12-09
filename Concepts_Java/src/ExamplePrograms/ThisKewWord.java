package ExamplePrograms;

public class ThisKewWord {

	String name;
	int age;
	// this keyWord represents instance of class
	ThisKewWord(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+ age);
	}
	public static void main(String[] args) {
		
		ThisKewWord obj = new ThisKewWord("Hanuman", 99);
		obj.show();
	}
}
