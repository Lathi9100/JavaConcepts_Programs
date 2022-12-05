package BasicPrograms;

import java.util.Random;

//6) How to Generate Random Number in Java
public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		// Printing 10 Random Numbers Between 1 to 1000
		for(int i=0;i<10;i++) {			
			System.out.println(random.nextInt(1000) +" ");
		}
	}
}
