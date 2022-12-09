package ExamplePrograms;

public class Alphabets {

	public void inSmall() {
		for(char i='a';i<='z';i++) {
			System.out.print(i +" ");
		}
	}
	public void inCaps() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Alphabets obj = new Alphabets();
		obj.inCaps();
		System.out.println();
		obj.inSmall();
	}
}
