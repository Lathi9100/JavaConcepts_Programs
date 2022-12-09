package Collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hashset =new HashSet();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		hashset.add(null);
		hashset.add(10);
		System.out.println(hashset);
		System.out.println(hashset.add("A"));
		System.out.println(hashset);
	}
}
