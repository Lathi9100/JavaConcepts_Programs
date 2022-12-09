package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		
		SortedSet sortedset = new TreeSet();
		sortedset.add("D");
		sortedset.add("E");
		sortedset.add("C");
		sortedset.add("A");
		sortedset.add("B");
		sortedset.add("C");
		sortedset.add("F");
		System.out.println(sortedset);//[A, B, C, D, E, F]
	}
}
