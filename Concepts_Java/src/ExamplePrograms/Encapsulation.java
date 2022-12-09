package ExamplePrograms;

public class Encapsulation {

	private String carColor;
	private int carSpeed;
	
	public void setColor(String carColor) {
		this.carColor=carColor;
	}
	public void setSpeed(int carSpeed) {
		this.carSpeed=carSpeed;
	}
	public String getColor() {
		return carColor;
	}
	public int getSpeed() {
		return carSpeed;
	}
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setColor("white");
		obj.setSpeed(100);
		System.out.println(obj.getColor());
		System.out.println(obj.getSpeed());
	}
}
