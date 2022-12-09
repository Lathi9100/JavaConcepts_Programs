package Collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector vector = new Vector();	
		
		System.out.println(vector.capacity());//10
		for(int i=0;i<=10;i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());//20
		System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		vector.addElement('A');
		System.out.println(vector.capacity());//20
		
	}
}
