package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort1 {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("T");
		arraylist.add("K");
		arraylist.add("E");
		arraylist.add("A");
		arraylist.add("J");
		System.out.println(arraylist);//[T, K, E, A, J]
		Collections.sort(arraylist);
		System.out.println(arraylist);//[A, E, J, K, T]
	}
}
