package ExamplePrograms;

abstract class States{
	
	abstract void cities();
	public void show() {
		System.out.println("Non abstract Method in abstract class......");
	}
}
class Andhra extends States{
	
	public void cities() {
		System.out.println("Andhra having diferrent cities");
	}
}
class Telangana extends States{
	public void cities() {
		System.out.println("Telangana having different cities");
	}
}
class Karnataka extends States{
	public void cities() {
		System.out.println("Karnataka having different cities");
	}
}
class TamilNadu extends States{
	public void cities() {
		System.out.println("Tamil Nadu having different cities");
	}
}

 class AbstractClass {

	public static void main(String[] args) {
		
		// calling each class that extends abstract States
		States obj1 = new Andhra();
		obj1.cities();
		States obj2 = new Telangana();
		obj2.cities();
		States obj3 = new Karnataka();
		obj3.cities();
		States obj4 = new TamilNadu();
		obj4.cities();
		System.out.println("\nNon abstract method");
		obj2.show();
	}
}

