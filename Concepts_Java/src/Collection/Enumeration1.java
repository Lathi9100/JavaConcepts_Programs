package Collection;

import java.util.Vector;
import java.util.Enumeration;

public class Enumeration1 {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		for(int i=0;i<=10;i++) {
			vector.add(i);
		}
		System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			Integer i = (Integer) enumeration.nextElement();
			if(i % 2 ==0) {
				System.out.println(i);//0 2 4 6 8 10
			}
		}
		for(Object obj : vector) {
			int i = (int)obj;
		   if(i % 2 != 0) {			   
			   System.out.println(i);//1 3 5 7 9
		   }
		}
		System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}
