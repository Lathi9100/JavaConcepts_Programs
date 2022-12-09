package ExamplePrograms;

public class ObjectNClass {

	String carColor;
	int carSpeed;
	public void carDetails(String color, int speed) {
		carColor = color;
		carSpeed = speed;
	}
	public void showDetails() {
		System.out.println("Color: "+carColor+ " , Speed: "+ carSpeed);
	}
	public static void main(String[] args) {
		ObjectNClass obj = new ObjectNClass();
		obj.carDetails("Red", 100);
		obj.showDetails();
	}
}
