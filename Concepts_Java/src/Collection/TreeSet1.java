package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet treeset = new TreeSet();
		
		treeset.add("D");
		treeset.add("E");
		treeset.add("C");
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		//treeset.add(new StringBuffer("Z"));// String cannot be cast to StringBuffer
		//treeset.add(10);// classCastException
		
		System.out.println(treeset);//[A, B, C, D, E]
		// Iterating treeset using iterator
		Iterator iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");//A B C D E 
		}
	}
}
